package ua.bms.osop.test;

import ddt.ExcelFileConnector;
import ddt.SQLConnector;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.model.*;
import ua.bms.osop.utils.ConfigProperties;

import java.io.IOException;
import java.util.ArrayList;

/*
 * Basic class for all test classes.
 * There are some methods are performed in Test's classes Before and/or After Class/Suite.
 * Performs object's initialization of model's classes(ua.bms.osop.model) 
 */
public class BasicTestCase {

	protected ApplicationManager app;
	/* Set mode data to export data from determined source
	* -----default------
	* excel
	* db
	* */
	private String modeData = ConfigProperties.getProperty("data.modedata");

	
	/*Before Test Class creates new object of Application Manager*/
	@BeforeClass
	public void init() {
		app = new ApplicationManager();
	}
	
	/*Checks login in system before Test Class, in case logOut - performs loginIn*/
	@BeforeClass
	public void mayBeLogIn() throws IOException {
		if (app.getUserHelper().isLoggedIn()) {
			return;
		}
		app.getUserHelper().loginAs(userModel);
		//app.getUserHelper().loginAs(getUserModel(1));
	}
	
	/*Quits from WebDriver after performing Test Suite*/
	@AfterSuite
	public void stop() {
		app.stop();
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*Initialization of object "user"*/	
	protected UserModel userModel = new UserModel("vova", "bMS$2016");

	//Main function is calling readExcel function to read data from excel file
	protected UserModel getUserModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet0");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("user", 2);
                break;
            default:
                mas = new String[][]{{null, null},
                        {"vova", "bMS$2016"},
                        {"vova1", "failedPassword"},
                        {"failedLogin", "bMS$2016"}};
                break;
        }
         return new UserModel(mas[i][0], mas[i][1]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Review proceedings on a claim Card(Unit 1) except field with drop-down list*/
    //Main function is calling readExcel function to read data from excel file
    protected Unit1ProceedingCardModel getUnit1ProceedingCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet1");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit1_proceeding_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Відповідач(боржник)*/"Відповідач - боржник", null}};
                break;
        }
        return new Unit1ProceedingCardModel(mas[i][0]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from Review proceedings on a claim to Procuracy authorities Card(Unit 1) except field with drop-down list*/
    //Main function is calling readExcel function to read data from excel file
    protected Unit1ProceedingToPrcCardModel getUnit1ProceedingToPrcCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet2");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit1_proceeding_to_prc_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Відповідач*/"Відповідач(до прокуратури)", null}};
                break;
        }
        return new Unit1ProceedingToPrcCardModel(mas[i][0]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень") Card(Unit 1) except field with drop-down list*/
    //Main function is calling readExcel function to read data from excel file
    protected Unit1CriminalCardModel getUnit1CriminalCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet3");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit1_criminal_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Дата реєстрації*/"05.07.2016",
                                /*Статті КК України за ознаками яких розпочато кримінальне провадження*/"Стаття 562 пункт 45 ГШПмаентлот",
                                /*Фабула*/"Фабула 89758973548 :?%№!  -- Pvbcshgbcvghsacvgh"}};
                break;
        }
        return new Unit1CriminalCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 1 - "Acts of supervision over pre-trial investigation" Card("Акти нагляду за ДР")(Unit 2) except field with drop-down list*/
    protected Unit2ActPICardModel getUnit2ActPICardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet4");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_act_pi_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8897786675",
                                /*Дата  початку досудового розслідування:*/"04.12.2015",
                                /*Зміст(фабула)*/"Зміст   -- Pvbcshgbcvghsacvgh"}};
                break;
        }
        return new Unit2ActPICardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР")(Unit 2) except field with drop-down list*/
    protected Unit2AppealCardModel getUnit2AppealCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet5");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_appeal_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8ййййсуа86675",
                                /*ПІБ підозрюваного / обвинуваченого*/"Пупко Андрій",
                                /*Підстави для оскарження*/"Підстави --0 cvgh"},
                        {/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочи5348ййййсуа86675",
                                /*ПІБ підозрюваного / обвинуваченого*/"Пуп54ндрій",
                                /*Підстави для оскарження*/"Підста3gh"}};
                break;
        }
        return new Unit2AppealCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 3 - "The Preventive Action"("Запобіжні заходи");(Unit 2) except field with drop-down list*/
    protected Unit2PreventiveCardModel getUnit2PreventiveCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet6");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_preventive_card", 5);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8ййййсуа86675",
                                /*Дата  початку досудового розслідування:*/"11.02.2016",
                                /*Прізвище*/"Руні",
                                /*Ім'я*/"Вейн",
                                /*Дата народження*/"18.09.1988"},
                        {/*Кваліфікація правопорушення/злочину*/"Кваліфікаціre8ййййсуа86675",
                                /*Дата  початку досудового розслідування:*/"07.02.2017",
                                /*Прізвище*/"Руfdfdі",
                                /*Ім'я*/"Веffd",
                                /*Дата народження*/"18.09.1990"}};
                break;
        }
        return new Unit2PreventiveCardModel(mas[i][0], mas[i][1], mas[i][2], mas[i][3], mas[i][4]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 4 - "The release from custody"("Звільнення з-під варти")(Unit 2) except field with drop-down list*/
    protected Unit2ReleaseCardModel getUnit2ReleaseCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet7");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_release_card", 2);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Номер справи у суді*/"Справа №6742868тоіс",
                                /*Дата прийняття остаточного рішення у КП стосовно особи*/"25.11.2015"}};
                break;
        }
        return new Unit2ReleaseCardModel(mas[i][0], mas[i][1]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД")(Unit 2) except field with drop-down list*/
    protected Unit2ActOACardModel getUnit2ActOACardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet8");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_act_oa_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Дата прийняття рішення*/"11.09.2016", null}};
                break;
        }
        return new Unit2ActOACardModel(mas[i][0]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії")(Unit 2) except field with drop-down list*/
    protected Unit2CovertCardModel getUnit2CovertCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet9");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit2_covert_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Дата рішення суду*/"01.09.2016", null}};
                break;
        }
        return new Unit2CovertCardModel(mas[i][0]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 1 - "Criminal proceedings"("Кримінальні провадження"); Card(Unit 3) except field with drop-down list*/
    protected Unit3CriminalProceedingCardModel getUnit3CriminalProceedingCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet10");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit3_criminal_proceeding_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Дата початку досудового розслідування*/"12.06.2015",
                                /*Кваліфікація правопорушення*/"лргсроивморШГШР%:;8678456",
                                /*Дата надіслання до суду*/"12.06.2015"}};
                break;
        }
        return new Unit3CriminalProceedingCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
    protected Unit3OtherCriminalProceedingCardModel getUnit3OtherCriminalProceedingCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet11");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit3_other_criminal_proceeding_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Дата реєстрації*/"12.06.2015",
                                /*Коротка фабула*/"Коротка фабулаokicdhwvjhrwv76632324567%&%^&#@@%$^^8467^&$@#$%#",
                                /*Дата надіслання до суду*/"12.04.2015"}};
                break;
        }
        return new Unit3OtherCriminalProceedingCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 4 - "Criminal cases"("Кримінальні справи"); Card(Unit 3) except field with drop-down list*/
    protected Unit3CriminalCaseCardModel getUnit3CriminalCaseCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet12");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit3_criminal_case_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Дата початку досудового розслідування*/"15.07.2016",
                                /*Кваліфікація правопорушення*/"rdfksasrfwsz%:;8678456",
                                /*Дата надіслання до суду*/"09.09.2016"}};
                break;
        }
        return new Unit3CriminalCaseCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
    protected Unit3OtherCriminalCaseCardModel getUnit3OtherCriminalCaseCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet13");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit3_other_criminal_case_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Дата реєстрації*/"01.05.2016",
                                /*Коротка фабула*/"Коротка фабулаokicdh222rwv76632324567%&%^&#@@%$^^8467^&$@#$%#",
                                /*Дата надіслання до суду*/"30.09.2016"}};
                break;
        }
        return new Unit3OtherCriminalCaseCardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected Unit3AccusedModel accusedPerson = new Unit3AccusedModel(
			/*ПІБ*/"Особа");

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected ArrayList< Unit3AccusedModel > accusedPeople = new ArrayList< Unit3AccusedModel >();

	/*----------------------------------------------------------------------------------------------------------------*/
		
	/*Initialization of input fields from International Judicial Cooperation Card(Unit 4) except field with drop-down list*/
    protected Unit4CardModel getUnit4CardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet14");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit4_card", 2);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Дата надходження*/"11.09.2016",
                                /*Стислий зміст*/"HUIyugguswc1111111189ycgcvgas35421мкуп!№;%:*:*+w"}};
                break;
        }
        return new Unit4CardModel(mas[i][0], mas[i][1]);
    }

	/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Inspection Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
    protected Unit5InspectionCardModel getUnit5InspectionCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet15");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit5_inspection_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Дата проведення перевірки*/"08.09.2016", null}};
                break;
        }
        return new Unit5InspectionCardModel(mas[i][0]);
    }

	/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Response Document Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
	//protected static Unit5DocumentCardModel documentCard = new Unit5DocumentCardModel ();
	
	/*----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Charged Person Card Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
    protected Unit5ChargedCardModel getUnit5ChargedCardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet16");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit5_charged_card", 1);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Посада*/"Керівник відділу роботи з клієнтами", null}};
                break;
        }
        return new Unit5ChargedCardModel(mas[i][0]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Claim Card(Unit 6) except field with drop-down list*/
    protected Unit6CardModel getUnit6CardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet17");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit6_card", 3);
                break;
            default:
                mas = new String[][]{{null, null, null},
                        {/*Назва заявника*/"Petrov",
                                /*Стислий зміст*/"HUIyugguswcgygw",
                                /*Дата надходження до прокуратури*/"15.09.2016"}};
                break;
        }
        return new Unit6CardModel(mas[i][0], mas[i][1], mas[i][2]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Mass Media Card(Unit 7) except field with drop-down list*/
    protected Unit7CardModel getUnit7CardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet18");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit7_card", 4);
                break;
            default:
                mas = new String[][]{{null, null, null, null},
                        {/*Дата виступу*/"28.07.2016",
                                /*Назва ЗМІ*/"Назва ЗМІ 099089667545233",
                                /*Автор*/"Автор Author 56473657829*^&%#@@!",
                                /*Примітка*/"Примітка Remark*&^&$%$^@$@!"}};
                break;
        }
        return new Unit7CardModel(mas[i][0], mas[i][1], mas[i][2], mas[i][3]);
    }

	/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Request Card(Unit 8) except field with drop-down list*/
    protected Unit8CardModel getUnit8CardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet19");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit8_card", 2);
                break;
            default:
                mas = new String[][]{{null, null},
                        {/*Дата надходження*/"10.09.2016",
                                /*Стислий зміст*/"HUIyugguswcgy32435421мкуп!№;%:*:*+w"}};
                break;
        }
        return new Unit8CardModel(mas[i][0], mas[i][1]);
    }

	/*-----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Military Administrative Offenses Card(Unit 9) except field with drop-down list*/
    protected Unit9CardModel getUnit9CardModel(int i) throws Exception {
        String mas[][];
        switch (modeData) {
            case "excel":
                //Create a object of ExcelFileConnector class
                ExcelFileConnector objExcelFile = new ExcelFileConnector();
                //Call read file method of the class to read data
                mas = objExcelFile.readExcel("Sheet20");
                break;
            case "db":
                SQLConnector sqlConection = new SQLConnector();
                mas = sqlConection.readDB("unit9_card", 13);
                break;
            default:
                mas = new String[][]{{null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {/*Дата складання протоколу*/"01.07.2016",
                                /*Дата вчинення правопорушення*/"02.07.2016",
                                /*Фабула*/"Фабула_бот-english",
                                /*ПІБ правопорушника*/"правопорушник_bot",
                                /*Дата народження*/"03.01.1980",
                                /*Назва військової частини, установи*/"Військова частина №47707",
                                /*Посада*/"Перший заступник командира в/ч",
                                /*Дата первинного направлення до суду (для обліку у звіті)*/"04.07.2016",
                                /*Дата надходження рішення про повернення судом (для обліку у звіту)*/"05.07.2016",
                                /*Дата повторного направлення (для обліку у звіту)*/"06.07.2016",
                                /*Поле "Дата рішення"*/"07.07.2016",
                                /*Дата надходження рішення суду(для обліку у звіті)*/"08.07.2016",
                                /*Дата початку утримання на гаупвахті*/"09.07.2016"}};
                break;
        }
        return new Unit9CardModel(mas[i][0], mas[i][1], mas[i][2], mas[i][3], mas[i][4], mas[i][5], mas[i][6], mas[i][7], mas[i][8], mas[i][9], mas[i][10], mas[i][11], mas[i][12]);
    }

}

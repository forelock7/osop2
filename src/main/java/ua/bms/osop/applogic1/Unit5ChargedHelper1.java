package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5ChargedHelper;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - List of Charged Person(Перелік осіб, притягнутих до відповідальності)
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5ChargedCard model(ua.bms.osop.model.Unit5ChargedCard)
 * Uses methods from Unit5ChargedPage
 */
public class Unit5ChargedHelper1 extends DriverBasedHelper implements Unit5ChargedHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5ChargedHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Unit 5 Page "List of Charged Person"*/
	@Override
	public boolean isOnUnit5ChargedPage(){
		return pages.unit5ChargedPage.waitPageLoaded();
	}
	
	public String getChargedNameFromDocument() {
		pages.unit5DocumentsPage.clickButtonEditChargedGrid();
		return pages.unit5ChargedPage.getInputName();
	}
	
	public void quitCard() {
		pages.unit5ChargedPage.clickButtonExitFromCardForm();
	}
	
	
	public String getChargedNameFromGrid() {
		pages.unit5ChargedPage.doubleClickOnGridHeader();
		
		pages.unit5ChargedPage.doubleClickOnFirstRecordInGridOnMainTab();
		
		String nameVelue = pages.unit5ChargedPage.getInputName();
		pages.unit5ChargedPage.clickButtonExitFromCardForm();
		return nameVelue;	
	}

}

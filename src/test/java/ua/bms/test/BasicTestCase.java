// Basic class for all tests

package ua.bms.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import ua.bms.data.AdminViolCardData;
import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class BasicTestCase {
	
	//Keeping instance of WebDriver
	protected static WebDriver driver;

	//Initialization of object "user"	
	protected UserData user = new UserData("vova", "bMS$2016");
	
	//Initialization of input fields from Military Administrative Violation Card except field with drop-down list
	protected AdminViolCardData aVCard = new AdminViolCardData(
			/*����� ���������*/"102",
			/*���� ��������� ���������*/"01.07.2016", 
			/*���� �������� ��������������*/"02.07.2016", 
			/*������*/"������_���-english", 
			/*ϲ� ��������������*/"�������������_���", 
			/*���� ����������*/"03.01.1980", 
			/*����� �������� �������, ��������*/"²������� ������� �1", 
			/*������*/"��������� ��������� �������� ������� � ����������� ������(���)",
			/*���� ���������� ����������� �� ����(��� ����� � ���)*/"04.07.2016", 
			/*���� ����������� ������ ��� ���������� ����� (��� ����� � ���)*/"05.07.2016", 
			/*���� ���������� ����������� (��� ����� � ���)*/"06.07.2016", 
			/*���� "���� ������" ����� "��������� "��� ���������"*/"07.07.2016", 
			/*���� ����������� ������ ����(��� ����� � ���)*/"08.07.2016", 
			/*���� ������� ��������� �� ���������:*/"09.07.2016");

	protected WebDriver getWebDriver() {
		if (driver == null){
			//Creating a new instance of the Firefox driver
			driver = new FirefoxDriver();
			//Maximizing a browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		}
		return driver;
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}

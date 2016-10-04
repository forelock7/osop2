package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit2CovertHelper;

public class Unit2CovertHelper1 extends DriverBasedHelper implements Unit2CovertHelper {

	/*Constructor of object which is managed by object Application Manager.*/
	public Unit2CovertHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*--------------------------------Covert Page----------------------------------------------------*/
	
	public boolean isOnUnit2CovertPage() {
		return pages.unit2CovertPage.waitPageLoaded();
	}
	
	
	
}

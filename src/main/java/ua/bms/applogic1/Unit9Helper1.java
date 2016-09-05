package ua.bms.applogic1;

import ua.bms.applogic.Unit9Helper;

public class Unit9Helper1 extends DriverBasedHelper implements Unit9Helper  {
	
	public Unit9Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	@Override
	public boolean isOnUnit9Page(){
		return pages.unit9MilitaryPage.waitPageLoaded();
	}

}

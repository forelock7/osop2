package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit8Helper;

/*
 * Ancillary Class for tests on Requests Page Unit 8
 * Implements all methods are used in Unit8RequestsTest and related with Unit8Card model(ua.bms.osop.model.Unit8Card)
 * Uses methods from Unit8RequestsPage
 */
public class Unit8Helper1 extends DriverBasedHelper implements Unit8Helper  {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit8Helper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Unit 8 Page*/
	@Override
	public boolean isOnUnit8Page(){
		return pages.unit8RequestsPage.waitPageLoaded();
	}

}

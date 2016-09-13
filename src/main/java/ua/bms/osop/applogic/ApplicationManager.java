package ua.bms.osop.applogic;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.ApplicationManager1
 */
public interface ApplicationManager {
	
	UserHelper getUserHelper();
	NavigationTopHelper getNavigationTopHelper();
	NavigationUnit68Helper getNavigationUnit68Helper();
	Unit6Helper getUnit6Helper();
	Unit7Helper getUnit7Helper();
	Unit8Helper getUnit8Helper();
	Unit9Helper getUnit9Helper();

	void stop();
	
}

package ua.bms.applogic;

public interface ApplicationManager {
	
	UserHelper getUserHelper();
	NavigationHelper getNavigationHelper();
	Unit7Helper getUnit7Helper();
	Unit9Helper getUnit9Helper();

	void stop();

}

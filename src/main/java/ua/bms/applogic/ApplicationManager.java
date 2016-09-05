package ua.bms.applogic;



public interface ApplicationManager {
	
	UserHelper getUserHelper();
	NavigationHelper getNavigationHelper();
	Unit9Helper getUnit9Helper();


	void stop();

}

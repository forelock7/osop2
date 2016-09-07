package ua.bms.applogic;

public interface ApplicationManager {
	
	UserHelper getUserHelper();
	NavigationTopHelper getNavigationTopHelper();
	NavigationUnit68Helper getNavigationUnit68Helper();
	Unit7Helper getUnit7Helper();
	Unit9Helper getUnit9Helper();

	void stop();

}

package ua.bms.osop.applogic;

/*
 * Declares all methods implemented class ua.bms.osop.applogic1.ApplicationManager1
 */
public interface ApplicationManager {
	
	UserHelper getUserHelper();
	
	NavigationTopHelper getNavigationTopHelper();
	NavigationUnit1Helper getNavigationUnit1Helper();
	NavigationUnit23Helper getNavigationUnit23Helper();
	NavigationUnit5Helper getNavigationUnit5Helper();
	NavigationUnit68Helper getNavigationUnit68Helper();
	
	Unit1ReviewHelper getUnit1ReviewHelper();
	Unit1ReviewToPrcHelper getUnit1ReviewToPrcHelper();
	Unit1CrimeHelper getUnit1CrimeHelper();
	Unit1ClaimsHelper getUnit1ClaimsHelper();
	Unit1ClaimsToPrcHelper getUnit1ClaimsToPrcHelper();
	Unit2ActsOAHelper getUnit2ActsOAHelper();
	Unit2ActsPIHelper getUnit2ActsPIHelper();
	Unit2AppealsHelper getUnit2AppealsHelper();
	Unit2CovertHelper getUnit2CovertHelper();
	Unit2PreventiveHelper getUnit2PreventiveHelper();
	Unit2ReleaseHelper getUnit2ReleaseHelper();
	Unit3ParticipationProcHelper getUnit3ParticipationProcHelper();
	Unit3ParticipationCasesHelper getUnit3ParticipationCasesHelper();
	Unit3OtherCriminalProcHelper getUnit3OtherCriminalProcHelper();
	Unit3OtherCriminalCasesHelper getUnit3OtherCriminalCasesHelper();
	Unit3CriminalProcHelper getUnit3CriminalProcHelper();
	Unit3CriminalCasesHelper getUnit3CriminalCasesHelper();
	Unit4Helper getUnit4Helper();
	Unit5InspectionsHelper getUnit5InspectionsHelper();
	Unit5DocumentsHelper getUnit5DocumentsHelper();
	Unit5ChargedHelper getUnit5ChargedHelper();
	Unit6Helper getUnit6Helper();
	Unit7Helper getUnit7Helper();
	Unit8Helper getUnit8Helper();
	Unit9Helper getUnit9Helper();
	
	void stop();
	
}

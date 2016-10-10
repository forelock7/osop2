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
	
	Unit1ProceedingHelper getUnit1ProceedingsHelper();
	Unit1ProceedingToPrcHelper getUnit1ProceedingsToPrcHelper();
	Unit1CriminalHelper getUnit1CrimeHelper();
	Unit1ViewClaimHelper getUnit1ViewClaimsHelper();
	Unit1ViewClaimToPrcHelper getUnit1ViewClaimsToPrcHelper();
	Unit2ActOAHelper getUnit2ActsOAHelper();
	Unit2ActPIHelper getUnit2ActsPIHelper();
	Unit2AppealHelper getUnit2AppealsHelper();
	Unit2CovertHelper getUnit2CovertHelper();
	Unit2PreventiveHelper getUnit2PreventiveHelper();
	Unit2ReleaseHelper getUnit2ReleaseHelper();
	Unit3ParticipationProceedingHelper getUnit3ParticipationProceedingHelper();
	Unit3ParticipationCaseHelper getUnit3ParticipationCasesHelper();
	Unit3OtherCriminalProceedingHelper getUnit3OtherCriminalProceedingHelper();
	Unit3OtherCriminalCaseHelper getUnit3OtherCriminalCaseHelper();
	Unit3CriminalProceedingHelper getUnit3CriminalProceedingHelper();
	Unit3CriminalCaseHelper getUnit3CriminalCaseHelper();
	Unit4Helper getUnit4Helper();
	Unit5InspectionHelper getUnit5InspectionsHelper();
	Unit5DocumentHelper getUnit5DocumentsHelper();
	Unit5ChargedHelper getUnit5ChargedHelper();
	Unit6Helper getUnit6Helper();
	Unit7Helper getUnit7Helper();
	Unit8Helper getUnit8Helper();
	Unit9Helper getUnit9Helper();
	
	void stop();
	
}

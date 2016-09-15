package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.Unit5DocumentsHelper;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Implements all methods are used in Unit5SupervisionJugmentTest and related with Unit5DocumentCard model(ua.bms.osop.model.Unit5DocumentCard)
 * Uses methods from Unit5DocumentsPage
 */
public class Unit5DocumentsHelper1 extends DriverBasedHelper implements Unit5DocumentsHelper {
	
	/*Constructor of object which is managed by object Application Manager.*/
	public Unit5DocumentsHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	/*Checks if on Unit 5 Page "List of Response Documents"*/
	@Override
	public boolean isOnUnit5DocumentsPage(){
		return pages.unit5DocumentsPage.waitPageLoaded();
	}

}

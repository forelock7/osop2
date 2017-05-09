package ua.bms.osop.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.bms.osop.model.Unit3AccusedModel;
import ua.bms.osop.model.Unit3CriminalProceedingCardModel;


import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by ChubenkoV on 29.12.2016.
 */
public class U3CrearteProceedingCardWithNumberOfAccused extends BasicTestCase {

    private Unit3CriminalProceedingCardModel criminalProceedingCard = getUnit3CriminalProceedingCardModel(2);

    public U3CrearteProceedingCardWithNumberOfAccused() throws Exception {
    }

    @Test (groups = {"unit3_proceedings"})
    public void testJumpToUnit3CriminalProceedingPage() {
        assertTrue(app.getUserHelper().isLoggedIn());
        app.getNavigationUnit23Helper().goToUnit3CriminalProceedingPage();
        assertTrue(app.getUnit3CriminalProceedingHelper().isOnUnit3CriminalProceedingPage());
    }

    @Test(groups = {"unit3_proceedings"}, dependsOnMethods = {"testJumpToUnit3CriminalProceedingPage"})
    public void testCreateAndReviewCriminalProceedingCard() {
        app.getUnit3CriminalProceedingHelper().openCardToCreate();
        app.getUnit3CriminalProceedingHelper().createCard(criminalProceedingCard);
        app.getUnit3CriminalProceedingHelper().saveCard();
        app.getUnit3CriminalProceedingHelper().openCardToView();
        Assert.assertEquals(criminalProceedingCard.getCriminalProceedingNumber(), app.getUnit3CriminalProceedingHelper().getCriminalProceedingNumber());
        app.getUnit3CriminalProceedingHelper().quitCard();
    }

    @Test (groups = {"unit3_proceedings"}, dependsOnMethods = {"testCreateAndReviewCriminalProceedingCard"})
    public void testAddingAccusedIntoCriminalProceedingCard(){

        //temporary method
        //app.getUnit3CriminalProceedingHelper().sortDownMainGrid();

        app.getUnit3CriminalProceedingHelper().openCardToEdit();
        for(int i=0; i<2000; i++) {
            if (i%100==0) {
                app.getUnit3CriminalProceedingHelper().saveCard();
                app.getUnit3CriminalProceedingHelper().openCardToEdit();
            }
            accusedPeople.add(i, new Unit3AccusedModel(i));
            app.getUnit3CriminalProceedingHelper().createAccused(accusedPeople.get(i));
        }
        app.getUnit3CriminalProceedingHelper().saveCard();
        //app.getUnit3CriminalProceedingHelper().openCardToEdit();
        //Assert.assertEquals(criminalProceedingCard.getSomeNewText(), app.getUnit3CriminalProceedingHelper().getOffenseQualification());
        //app.getUnit3CriminalProceedingHelper().quitCard();
    }
}

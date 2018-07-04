package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigatioHelper().gotoHome();
        if (! app.getContactHelper().isThereaContact()) {
            app.getContactHelper().createContact(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "group1"), true);
        }
        app.getNavigatioHelper().gotoHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeAlert();
        app.getNavigatioHelper().gotoHome();
    }

}

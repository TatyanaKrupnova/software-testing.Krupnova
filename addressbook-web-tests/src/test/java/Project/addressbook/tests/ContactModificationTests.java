package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().gotoContactForm();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883488", "1985", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigatioHelper().gotoHome();
    }
}

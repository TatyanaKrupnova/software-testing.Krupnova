package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigatioHelper().gotoHome();
        if (! app.getContactHelper().isThereaContact()) {
            app.getContactHelper().createContact(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "group1"), true);
        }
        app.getNavigatioHelper().gotoHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883401", "1900", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigatioHelper().gotoHome();
    }
}

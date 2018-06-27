package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883488", "1985"));
        app.gotoHome();
    }

}

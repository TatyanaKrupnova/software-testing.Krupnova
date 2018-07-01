package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "test1"), true);
        app.gotoHome();
    }

}

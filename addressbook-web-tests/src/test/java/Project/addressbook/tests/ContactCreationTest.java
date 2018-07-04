package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.getNavigatioHelper().gotoHome();
        app.getContactHelper().createContact(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "group1"), true);
        app.getNavigatioHelper().gotoHome();
    }
}

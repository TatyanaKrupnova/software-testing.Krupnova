package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.getNavigatioHelper().gotoHome();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "group1"), true);
        app.getNavigatioHelper().gotoHome();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() + 1);
    }
}

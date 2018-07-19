package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.*;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigatioHelper().gotoHome();
        if (! app.getContactHelper().isThereaContact()) {
            app.getContactHelper().createContact(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883400", "198A", "group1"), true);
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigatioHelper().gotoHome();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeAlert();
        app.getNavigatioHelper().gotoHome();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }

}

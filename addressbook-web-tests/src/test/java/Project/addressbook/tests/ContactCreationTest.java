package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.goTo().home();
        List<ContactData> before = app.contact().list();
        app.contact().create(new ContactData().withName("Name1").withSurname("Surname1").withAddress("City1")
                .withPhonenumber("Phone1").withYear("Year1").withGroup("group1"), true);
        app.goTo().home();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(),before.size() + 1);
    }
}

package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().home();
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData().withName("Tatyana").withSurname("Krupnova").withAddress("Chelyabinsk")
                    .withPhonenumber("9030883400").withYear("198A").withGroup("group1"), true);
        }
    }

    @Test
    public void testContactModification() {
        List<ContactData> before = app.contact().list();
        int index  = before.size() - 1;
        app.goTo().home();
        // app.getContactHelper().selectContact(before.size() - 1);
        app.contact().init(index);
        ContactData contact = new ContactData().withId(before.get(index).getId()).withName("Vasili")
                .withSurname("Popov").withAddress("Chelyabinsk").withPhonenumber("9030883401").withYear("1900");
        app.contact().fill(contact, false);
        app.contact().submit();
        app.goTo().home();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(),before.size());

        before.remove(index);
        before.add(contact);
        //      Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);
    }
}

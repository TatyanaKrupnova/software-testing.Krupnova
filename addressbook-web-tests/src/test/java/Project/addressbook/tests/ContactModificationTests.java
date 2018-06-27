package Project.addressbook.tests;

import Project.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().click(By.linkText("home"));
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Tatyana", "Krupnova", "Chelyabinsk", "9030883488", "1985"));
        app.getContactHelper().submitContactModification();
        app.gotoHome();
    }
}

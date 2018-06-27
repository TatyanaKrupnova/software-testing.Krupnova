package Project.addressbook.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().click(By.linkText("home"));
        app.getContactHelper().selectContact();
        app.getContactHelper().click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().click(By.linkText("home"));
    }

}

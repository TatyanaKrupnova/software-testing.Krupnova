package Project.addressbook.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().gotoContactForm();
        app.getContactHelper().selectContact();
        app.getContactHelper().submitContactDeletion();
        app.getContactHelper().closeAlert();
        app.getContactHelper().gotoContactForm();
    }

}

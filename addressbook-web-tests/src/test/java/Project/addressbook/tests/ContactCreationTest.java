package Project.addressbook.tests;

import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        app.getContactHelper().addNewContact();
        app.getContactHelper().enterContact();
        app.gotoHome();
    }

}

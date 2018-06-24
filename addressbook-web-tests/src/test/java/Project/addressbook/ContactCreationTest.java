package Project.addressbook;

import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void contactCreation() {
        addNewContact();
        enterContact();
        gotoHome();
    }

}

package Project.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("group1", "logo1", "footer1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}

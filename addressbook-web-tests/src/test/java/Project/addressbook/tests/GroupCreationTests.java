package Project.addressbook.tests;

import Project.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigatioHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("group1", "logo1", "footer1"));
    }

}

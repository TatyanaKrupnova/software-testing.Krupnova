package Project.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatioHelper {
    FirefoxDriver wd;

    public NavigatioHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
       wd.findElement(By.linkText("groups")).click();
    }
}

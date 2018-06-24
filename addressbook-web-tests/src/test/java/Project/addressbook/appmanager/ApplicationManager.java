package Project.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private ContactHelper contactHelper;
    private NavigatioHelper navigatioHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionhelper;

    public ApplicationManager() {
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("X:/Soft/Firefox/firefox.exe"));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        navigatioHelper = new NavigatioHelper(wd);
        sessionhelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionhelper.login("admin", "secret");
    }

    public void stop() {
       wd.quit();
    }

    public void gotoHome() {
        wd.findElement(By.linkText("home page")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigatioHelper getNavigatioHelper() {
        return navigatioHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
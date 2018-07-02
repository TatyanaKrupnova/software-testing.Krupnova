package Project.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    private ContactHelper contactHelper;
    private NavigatioHelper navigatioHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private String browser;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
    if (browser.equals(BrowserType.FIREFOX)) {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("X:/Soft/Firefox/firefox.exe"));
    } else if (browser.equals(BrowserType.CHROME)) {
        wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)) {
        wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigatioHelper = new NavigatioHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
    }

    public void stop() {
       wd.quit();
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

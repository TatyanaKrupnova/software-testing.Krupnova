package Project.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
    FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void enterContact() {
        fillContactForm("Tatyana", "Krupnova", "Chelyabinsk", "9030883488", "1985");
    }

    public void fillContactForm(String name, String surname, String whereYouLive, String phonenumber, String Year) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(name);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(surname);
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(whereYouLive);
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(phonenumber);
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[21]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[21]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).click();
        }
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(Year);
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
     }

    public void addNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }
}

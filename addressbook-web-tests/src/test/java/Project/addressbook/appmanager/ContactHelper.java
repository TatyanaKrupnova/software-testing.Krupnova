package Project.addressbook.appmanager;

import Project.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type("firstname", contactData.getName());
        type("lastname", contactData.getSurname());
        type("address", contactData.getWhereYouLive());
        type("mobile", contactData.getPhonenumber());
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[21]")).isSelected()) {
            click(By.xpath("//div[@id='content']/form/select[1]//option[21]"));
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
            click(By.xpath("//div[@id='content']/form/select[2]//option[4]"));
        }
        type("byear", contactData.getYear());
        click(By.xpath("//div[@id='content']/form/input[21]"));
     }

    private void type(String firstname, String name) {
        click(By.name(firstname));
        wd.findElement(By.name(firstname)).clear();
        wd.findElement(By.name(firstname)).sendKeys(name);
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }

    //public void click(By add_new) {
    //    wd.findElement(add_new).click();
    //}

    public void deleteSelectedContact() {
        click(By.name("DeleteSel"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}

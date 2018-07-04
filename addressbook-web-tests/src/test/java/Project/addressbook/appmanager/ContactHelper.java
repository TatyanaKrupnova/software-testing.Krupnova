package Project.addressbook.appmanager;

import Project.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
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

    public void deleteSelectedContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void closeAlert () {
        wd.switchTo().alert().accept(); }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void createContact(ContactData contact, boolean creation) {
        addNewContact();
        fillContactForm(contact, creation);
    }

    public boolean isThereaContact() {
       return isElementPresent(By.name("selected[]"));
    }
}

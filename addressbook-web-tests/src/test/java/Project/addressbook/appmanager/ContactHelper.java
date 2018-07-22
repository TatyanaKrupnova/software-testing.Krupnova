package Project.addressbook.appmanager;

import Project.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fill(ContactData contactData, boolean creation) {
        type("firstname", contactData.getName());
        type("lastname", contactData.getSurname());
        type("address", contactData.getAddress());
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

    public void delete(int index) {
        selectContact(index);
        deleteSelectedContact();
        closeAlert();
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

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void closeAlert () {
        wd.switchTo().alert().accept(); }

    public void init(int index) {
        wd.findElements(By.xpath("//img[@title='Edit']")).get(index).click();
       // click(By.xpath("//table[@id='maintable']/tbody/tr/td[8]/a/img"));
        
    }

    public void submit() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void create(ContactData contact, boolean creation) {
        addNewContact();
        fill(contact, creation);
    }

    public boolean isThereaContact() {
       return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : elements) {
            int id = Integer.parseInt(element.findElement(By.xpath(".//td[@class='center']//input")).getAttribute("value"));
            String name = element.findElement(By.xpath(".//td[3]")).getText();
            String surname = element.findElement(By.xpath(".//td[2]")).getText();
            ContactData contact = (new ContactData().withId(id).withName(name).withSurname(surname));
            contacts.add(contact);
        }
        return contacts;
    }
}

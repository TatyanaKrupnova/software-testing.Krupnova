package Project.addressbook.model;

import java.util.Objects;

public class ContactData {
    private String name;
    private String surname;
    private String Address;
    private String phonenumber;
    private String year;
    private int id = Integer.MAX_VALUE;
    private String group;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", whereYouLive='" + Address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", year='" + year + '\'' +
                ", id=" + id +
                '}';
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public ContactData withName(String name) {
        this.name = name;
        return this;
    }

    public ContactData withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public ContactData withAddress(String address) {
        Address = address;
        return this;
    }

    public ContactData withPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public ContactData withYear(String year) {
        this.year = year;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

}

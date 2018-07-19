package Project.addressbook.model;

import java.util.Objects;

public class ContactData {
    private final String name;
    private final String surname;
    private final String whereYouLive;
    private final String phonenumber;
    private final String year;
    private int id;
    private String group;

    public ContactData(int id, String name, String surname, String whereYouLive, String phonenumber, String Year, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.whereYouLive = whereYouLive;
        this.phonenumber = phonenumber;
        this.group = group;
        this.year = Year;
    }

    public ContactData(String name, String surname, String whereYouLive, String phonenumber, String year, String group) {
        this.id = Integer.MAX_VALUE;
        this.name = name;
        this.surname = surname;
        this.whereYouLive = whereYouLive;
        this.phonenumber = phonenumber;
        this.year = year;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getWhereYouLive() {
        return whereYouLive;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", whereYouLive='" + whereYouLive + '\'' +
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

    public int setId(int id) {
       return id;
    }
}

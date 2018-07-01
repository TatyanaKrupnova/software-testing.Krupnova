package Project.addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;
    private final String whereYouLive;
    private final String phonenumber;
    private final String year;
    private String group;

    public ContactData(String name, String surname, String whereYouLive, String phonenumber, String Year, String group) {
        this.name = name;
        this.surname = surname;
        this.whereYouLive = whereYouLive;
        this.phonenumber = phonenumber;
        year = Year;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }
}

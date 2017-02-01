package project;

import project.Ext.Misc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Person {

    private String name;
    private String surname;
    private String patronymic;
    private Calendar dateOfBirth;
    private String gender;
    private String id;
    private ArrayList<Document> documents;
    private ArrayList<Address> addresses;

    public Person (){

    }

    public Person(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }

    public Person(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id,
                  ArrayList<Document> documents, ArrayList<Address> addresses) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.documents = documents;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + sdf.format(dateOfBirth.getTime()) +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(person.getSurname()) : person.getSurname() != null)
            return false;
        if (getPatronymic() != null ? !getPatronymic().equals(person.getPatronymic()) : person.getPatronymic() != null)
            return false;
        if (getDateOfBirth() != null ? !getDateOfBirth().equals(person.getDateOfBirth()) : person.getDateOfBirth() != null)
            return false;
        if (getGender() != null ? !getGender().equals(person.getGender()) : person.getGender() != null) return false;
        if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
        if (getDocuments() != null ? !getDocuments().equals(person.getDocuments()) : person.getDocuments() != null)
            return false;
        return getAddresses() != null ? getAddresses().equals(person.getAddresses()) : person.getAddresses() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getPatronymic() != null ? getPatronymic().hashCode() : 0);
        result = 31 * result + (getDateOfBirth() != null ? getDateOfBirth().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getDocuments() != null ? getDocuments().hashCode() : 0);
        result = 31 * result + (getAddresses() != null ? getAddresses().hashCode() : 0);
        return result;
    }
}

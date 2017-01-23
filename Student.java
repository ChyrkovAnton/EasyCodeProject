package project;

import project.Ext.Misc;
import java.util.Arrays;
import java.util.Calendar;

public class Student{

    private String name;
    private String surname;
    private String patronymic;
    private Calendar dateOfBirth;
    private String gender;
    private String id;
    private Mark [] marks;

    public Student(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }

    public Student(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id, Mark [] marks) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.marks = marks;
    }

    public Student() {
        this.name = "";
        this.surname = "";
        this.patronymic = "";
        this.dateOfBirth = null;
        this.gender = "";
        this.id = "";
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

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString (){
        return id + ", " + name + ", " + surname + ", " + patronymic + ", " + gender + ", "
                + dateOfBirth.get(Calendar.DAY_OF_MONTH) + "." + dateOfBirth.get(Calendar.MONTH) + "."
                + dateOfBirth.get(Calendar.YEAR);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (patronymic != null ? !patronymic.equals(student.patronymic) : student.patronymic != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(student.dateOfBirth) : student.dateOfBirth != null) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    public void studentMarks  (){

        System.out.println(getStudentShortNameAndId());
        System.out.println(Misc.stringRepeat("=", 67));
        System.out.println("| Number " + "|" + "               Topic               " + "|" +
                "    Date    " + "|" + "  Mark |");
        System.out.println(Misc.stringRepeat("=", 67));
        for (Mark mark : marks) {
            System.out.println("|    " + mark.getHomeWork().getNumber() + "   |"
                                 + " " + mark.getHomeWork().getTopic() +
                                Misc.stringRepeat(" ", 33 - mark.getHomeWork().getTopic().length()) +" | " +
                                Misc.calendarToString(mark.getDate()) + " |   " + mark.getMark() + "   |");
        }
        System.out.println(Misc.stringRepeat("-", 67));
        System.out.println();
    }

    public double averageMark (){
        int sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMark();
        }
        return Misc.round((double)sum / marks.length, 1);
    }

    public double averageMark (HomeWork homeWork){
        int sum = 0;
        int counter = 0;
        for (Mark mark : marks) {
            if (mark.getHomeWork().getTopic() == homeWork.getTopic()){
                sum += mark.getMark();
                counter ++;
            }
        }
        return Misc.round((double)sum / counter, 1);
    }

    public double averageMark (String topic){
        int sum = 0;
        int counter = 0;
        for (Mark mark : marks) {
            String topic1 = mark.getHomeWork().getTopic();
            topic = topic;
            if (mark.getHomeWork().getTopic() == topic){
                sum += mark.getMark();
                counter ++;
            }
        }
        return Misc.round((double)sum / counter, 1);
    }

    public String getStudentShortName (){
        return surname + " " + name.substring(0,1) + "." + patronymic.substring(0, 1) + ".";
    }

    public String getStudentShortNameAndId (){
        return surname + " " + name.substring(0,1) + "." + patronymic.substring(0, 1) + ". (" +
                id + ")";
    }
}


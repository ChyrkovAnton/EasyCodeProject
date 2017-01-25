package project;


import java.util.Arrays;
import java.util.Calendar;

public class Group {
    private String name;
    private String faculty;
    private String startYear;
    private Student [] students;
    private HomeWork [] homeWorks;

    public Group(String name, String faculty, String startYear) {
        this.name = name;
        this.faculty = faculty;
        this.startYear = startYear;
    }
    public Group() {
        this.name = "";
        this.faculty = "";
        this.startYear = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }
    @Override
    public String toString (){
        return name + ":" + faculty + ":" + startYear;
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public HomeWork[] getHomeWorks() {
        return homeWorks;
    }

    public void setHomeWorks(HomeWork[] homeWorks) {
        this.homeWorks = homeWorks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        if (name != null ? !name.equals(group.name) : group.name != null) return false;
        if (faculty != null ? !faculty.equals(group.faculty) : group.faculty != null) return false;
        if (startYear != null ? !startYear.equals(group.startYear) : group.startYear != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(students, group.students)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(homeWorks, group.homeWorks);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (startYear != null ? startYear.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(students);
        result = 31 * result + Arrays.hashCode(homeWorks);
        return result;
    }

    public void studentsMarks (){
        for (Student student : students) {
            student.studentMarks();
        }
    }

    public void studentsAverageMarks (){
        for (Student student : students) {
            System.out.println(student.getStudentShortNameAndId() + " - " + student.averageMark());
        }
    }

    public Student getBestStudent (){
        int bestStudent = 0;
        double bestAverage = students[0].averageMark();
        for (int index = 1; index < students.length; index ++) {
            if (bestAverage < students[index].averageMark()){
                bestStudent = index;
                bestAverage = students[index].averageMark();
            }
        }
        return students[bestStudent];
    }
    public Student getWorstStudent (){
        int worstStudent = 0;
        double worstAverage = students[0].averageMark();
        for (int index = 1; index < students.length; index ++) {
            if (worstAverage > students[index].averageMark()){
                worstStudent = index;
                worstAverage = students[index].averageMark();
            }
        }
        return students[worstStudent];
    }

    public Student [] studentsListWithAverageMarkOverSpecified (Student [] studentsIn, Student [] studentsOut, double averageMark) {

        int counter = 0;

        for (Student student : studentsIn) {
            if (student.averageMark() > averageMark){
                studentsOut[counter] = student;
                counter ++;
            }
        }
        return studentsOut;
    }
    public Student [] studentsListWithAverageMarkOverSpecified (Student [] studentsIn, Student [] studentsOut, double averageMark, int counter) {

        if (studentsIn[counter].averageMark() > averageMark){
            studentsOut[counter] = studentsIn[counter];
        }

        if (counter == studentsIn.length - 1) {
            return studentsOut;
        }

        studentsListWithAverageMarkOverSpecified(studentsIn, studentsOut, averageMark, counter + 1);

        return studentsOut;
    }



}

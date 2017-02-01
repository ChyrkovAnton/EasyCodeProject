package project;


import java.util.Arrays;

public class Group {
    private String name;
    private String faculty;
    private int startYear;
    private Student [] students;
    private HomeWork [] homeWorks;

    public Group(String name, String faculty, int startYear) {
        this.name = name;
        this.faculty = faculty;
        this.startYear = startYear;
    }
    public Group() {

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

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
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

        if (getStartYear() != group.getStartYear()) return false;
        if (getName() != null ? !getName().equals(group.getName()) : group.getName() != null) return false;
        if (getFaculty() != null ? !getFaculty().equals(group.getFaculty()) : group.getFaculty() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getStudents(), group.getStudents())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getHomeWorks(), group.getHomeWorks());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getFaculty() != null ? getFaculty().hashCode() : 0);
        result = 31 * result + getStartYear();
        result = 31 * result + Arrays.hashCode(getStudents());
        result = 31 * result + Arrays.hashCode(getHomeWorks());
        return result;
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
    public double averageGroupMark (){
        double sumOfMarks = 0;
        double quantityOfMarks = 0;
        double result = 0;
        for (Student student : getStudents()) {
            for (Mark mark : student.getMarks()) {
                sumOfMarks += mark.getMark();
                quantityOfMarks ++;
            }
        }
        if (quantityOfMarks == 0){
            System.out.println("There is not any mark ");
        }else {
            result = sumOfMarks / quantityOfMarks;
        }
        return result;
    }
}

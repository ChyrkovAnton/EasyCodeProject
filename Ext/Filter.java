package project.Ext;

import project.Student;
import java.util.ArrayList;

public class Filter {

    private Student [] students;

    public static Student [] applyFilter (Student [] students, FilterCriterion filter){

        ArrayList<Student> studentsArray = new ArrayList<>();
        ArrayList <Student> studentsToRemove = new ArrayList <>();
        Student [] filteredStudents;

        //Copies input array into ArrayList
        for (Student student : students) {
            studentsArray.add(student);
        }

        //Fills studentsToRemove ArrayList with unnecessary students
        for (Student student : studentsArray) {
            if (!filter.isTrue(student)){
                studentsToRemove.add(student);
            }
        }

        //Removes unnecessary students from studentsArray ArrayList
        studentsArray.removeAll(studentsToRemove);

        //Copies students from studentsArray array list into filteredStudents array. I don't know what for, but still.
        filteredStudents = new Student[studentsArray.size()];
        filteredStudents = studentsArray.toArray(filteredStudents);
        return filteredStudents;
    }
    public Student [] chooseHappyFive (Student [] students, FilterCriterion filter){

        ArrayList<Student> studentsArray = new ArrayList<>();
        ArrayList <Student> happyStudents = new ArrayList <>();
        Student [] filteredStudents;

        //Copies input array into ArrayList
        for (Student student : students) {
            studentsArray.add(student);
        }

        //Fills happyStudents ArrayList with random students
        while (happyStudents.size() < 5){
            for (Student student : studentsArray) {
                if (filter.isTrue(student) && !happyStudents.contains(student)){
                    happyStudents.add(student);
                }
            }
        }

        //Copies students from studentsArray array list into filteredStudents array. I don't know what for, but still.
        filteredStudents = new Student[5];
        filteredStudents = happyStudents.toArray(filteredStudents);
        return filteredStudents;
    }
    public class IsActiveFilter implements FilterCriterion{

        @Override
        public boolean isTrue(Student student) {
            boolean isActive = false;
            if (student.getIsActive()){
                isActive = true;
            }
            return isActive;
        }
    }
    public class IsAverageOverFour implements FilterCriterion{

        @Override
        public boolean isTrue(Student student) {
            boolean isActive = false;
            if (student.averageMark() > 4){
                isActive = true;
            }
            return isActive;
        }
    }

    public class IsAverageLessFour implements FilterCriterion{

        @Override
        public boolean isTrue(Student student) {
            boolean isActive = false;
            if (student.averageMark() < 4){
                isActive = true;
            }
            return isActive;
        }
    }



}

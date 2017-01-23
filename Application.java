package project;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        int counter = 0;
        Random randomNumber = new Random();
        Group group  = new Group ();

        HomeWork [] homeWorks = new HomeWork[] {
                new HomeWork("1", "Java primitive types", "Primitive types", "foo",
                        new GregorianCalendar(2016, 11, 30)),
                new HomeWork("2", "Java primitive types", "Primitive types", "foo",
                        new GregorianCalendar(2016, 11, 30)),
                new HomeWork("3", "Java handling strings", "Handling strings", "foo",
                        new GregorianCalendar(2017, 1, 15)),
                new HomeWork("4", "Java handling strings", "Handling strings", "foo",
                        new GregorianCalendar(2017, 1, 15)),
                new HomeWork("5", "Java arrays", "Arrays", "foo",
                        new GregorianCalendar(2017, 1, 31)),
                new HomeWork("6", "Java arrays", "Arrays", "foo",
                        new GregorianCalendar(2017, 1, 31)),
                new HomeWork("7", "Java OOP", "Object oriented programming", "foo",
                        new GregorianCalendar(2017, 2, 15)),
                new HomeWork("8", "Java OOP", "Object oriented programming", "foo",
                        new GregorianCalendar(2017, 2, 15))
        };

        Student [] students = new Student[]{
                new Student("Ivan", "Ivanov", "Ivanovich",
                        new GregorianCalendar(1991, 11, 5), "m", "3357724883"),
                new Student("Pyotr", "Petrov", "Petrovich",
                        new GregorianCalendar(1989, 3, 17), "m", "3258487841"),
                new Student("Sydor", "Sydorov", "Sydorovich",
                        new GregorianCalendar(1983, 1, 5), "m", "3043778562")
        };

        group.setName("Java");
        group.setFaculty("EasyCode");
        group.setStartYear("2016");
        group.setStudents(students);
        group.setHomeWorks(homeWorks);

        //Filling marks arrays for every student with random marks between 3 and 5
        for (Student student : group.getStudents()) {

            Mark [] marks = new Mark [group.getHomeWorks().length];

            for (HomeWork homeWork : group.getHomeWorks()) {
                    marks[counter] = new Mark(new GregorianCalendar(2016,1,1), homeWork,
                                                    3 + Math.abs(randomNumber.nextInt() % 3));
                    counter ++;
            }
            counter = 0;
            student.setMarks(marks);
        }

        group.studentsAverageMarks();
        //System.out.println(group.getBestStudent().getStudentShortNameAndId());
        //System.out.println(group.getWorstStudent().getStudentShortNameAndId());
        //group.getStudents()[0].studentMarks();
        System.out.println(Arrays.deepToString(group.studentsListWithAverageMarkOverSpecified
                (group.getStudents(), new Student[group.getStudents().length], 3.7)));
        System.out.println(Arrays.deepToString(group.studentsListWithAverageMarkOverSpecified
                                                    (group.getStudents(), new Student[group.getStudents().length], 3.7, 0)));
        group.studentsMarks();
    }
}

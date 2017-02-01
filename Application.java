package project;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
                        new GregorianCalendar(1991, 11, 5), "m", "3357724883", true),
                new Student("Pyotr", "Petrov", "Petrovich",
                        new GregorianCalendar(1989, 3, 17), "m", "3258487841", true),
                new Student("Sydor", "Sydorov", "Sydorovich",
                        new GregorianCalendar(1983, 1, 5), "m", "3043778562", true),
                new Student("Viktor", "Yanukovich", "Fyodorovich",
                        new GregorianCalendar(1950, 9, 7), "m", "1845378942", true),
                new Student("Nikolay", "Azarov", "Yanovich",
                        new GregorianCalendar(1947, 12, 17), "m", "1751878921", false),
                new Student("Sergey", "Arbuzov", "Gennadievich",
                        new GregorianCalendar(1976, 3, 24), "m", "2784356842", false),
                new Student("Viktor", "Pshonka", "Pavlovich",
                        new GregorianCalendar(1954, 2, 6), "m", "1987745286", false)
        };

        group.setName("Java");
        group.setFaculty("EasyCode");
        group.setStartYear(2016);
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

        //group.studentsAverageMarks();
        //System.out.println(group.getBestStudent().getStudentShortNameAndId());
        //System.out.println(group.getWorstStudent().getStudentShortNameAndId());
        //group.getStudents()[0].studentMarks();
        //System.out.println(Arrays.deepToString(group.studentsListWithAverageMarkOverSpecified
        //        (group.getStudents(), new Student[group.getStudents().length], 3.7)));
        //System.out.println(Arrays.deepToString(group.studentsListWithAverageMarkOverSpecified
        //                                      (group.getStudents(), new Student[group.getStudents().length], 3.7, 0)));
        /*group.studentsMarks();

        Filter filter = new Filter();
        Filter.IsAverageOverFour fc = filter.new IsAverageOverFour();
        group.studentsAverageMarks();
        System.out.println(Misc.averageGroupMark(group));
        System.out.println(Arrays.deepToString(Filter.applyFilter(group.getStudents(), fc)));*/

        //five random students
        /*System.out.println(Arrays.deepToString(filter.chooseHappyFive(group.getStudents(), new FilterCriterion() {
                            @Override
                            public boolean isTrue(Student student) {
                                Random rnd = new Random();
                                boolean isTrue = false;
                                if (rnd.nextInt(2) == 1){
                                    isTrue = true;
                                }
                                return isTrue;
                            }
        })));*/


    }
}

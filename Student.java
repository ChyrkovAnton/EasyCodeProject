package project;

import project.Ext.Misc;

import java.util.Calendar;

public class Student extends Person{

    private boolean isActive;
    private Mark [] marks;

    public Student() {

    }

    public Student(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id) {
        super(name, surname, patronymic, dateOfBirth, gender, id);
    }

    public Student(String name, String surname, String patronymic, Calendar dateOfBirth, String gender,
                   String id, boolean isActive) {
        super(name, surname, patronymic, dateOfBirth, gender, id);
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    public double averageMark (){
        int counter = 0;
        int sumOfMarks = 0;
        double averageMark = 0;

        for (Mark mark : marks) {
            sumOfMarks += mark.getMark();
            counter ++;
        }

        if (counter != 0){
            averageMark = (double) sumOfMarks / counter;
        }

        return averageMark;

    }
    public double averageMark (HomeWork homeWork){
        int sum = 0;
        int counter = 0;
        for (Mark mark : marks) {
            if (mark.getHomeWork().getTopic().equals(homeWork.getTopic())) {
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
            if (mark.getHomeWork().getTopic().equals(topic)){
                sum += mark.getMark();
                counter ++;
            }
        }
        return Misc.round((double)sum / counter, 1);
    }
}

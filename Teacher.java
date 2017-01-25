package project;

import java.util.Calendar;


public class Teacher extends Person{

        int experience;

        public Teacher(String name, String surname, String patronymic, Calendar dateOfBirth, String gender, String id, int experience) {
            super(name, surname, patronymic, dateOfBirth, gender, id);
            this.experience = experience;

    }
}

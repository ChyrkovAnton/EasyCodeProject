package project;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mark {

    private Calendar dateOfMark;
    private HomeWork homeWork;
    private int mark;

    public Mark(Calendar date, HomeWork homeWork, int mark) {
        this.dateOfMark = date;
        this.homeWork = homeWork;
        if (mark > 0){
            this.mark = mark;
        }
    }
    public Mark() {

    }

    public Calendar getDate() {
        return dateOfMark;
    }

    public void setDate(Calendar date) {
        this.dateOfMark = date;
    }

    public HomeWork getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(HomeWork homeWork) {

        this.homeWork = homeWork;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark > 0) {
            this.mark = mark;
        }
    }

    @Override
    public String toString() {
        return "Mark{" + "date=" + dateOfMark.get(Calendar.DAY_OF_MONTH) + "." + dateOfMark.get(Calendar.MONTH) + "."
                + dateOfMark.get(Calendar.YEAR) + ", homeWork=" + homeWork + ", mark=" + mark + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark mark1 = (Mark) o;

        if (mark != mark1.mark) return false;
        if (!dateOfMark.equals(mark1.dateOfMark)) return false;
        return homeWork.equals(mark1.homeWork);
    }

    @Override
    public int hashCode() {
        int result = dateOfMark.hashCode();
        result = 31 * result + homeWork.hashCode();
        result = 31 * result + mark;
        return result;
    }
}

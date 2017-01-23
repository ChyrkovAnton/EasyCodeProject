package project;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mark {

    private GregorianCalendar date;
    private HomeWork homeWork;
    private int mark;

    public Mark(GregorianCalendar date, HomeWork homeWork, int mark) {
        this.date = date;
        this.homeWork = homeWork;
        this.mark = mark;
    }
    public Mark() {
        this.date = null;
        this.homeWork = null;
        this.mark = 0;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
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
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" + "date=" + date.get(Calendar.DAY_OF_MONTH) + "." + date.get(Calendar.MONTH) + "."
                + date.get(Calendar.YEAR) + ", homeWork=" + homeWork + ", mark=" + mark + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark mark1 = (Mark) o;

        if (mark != mark1.mark) return false;
        if (!date.equals(mark1.date)) return false;
        return homeWork.equals(mark1.homeWork);
    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + homeWork.hashCode();
        result = 31 * result + mark;
        return result;
    }
}

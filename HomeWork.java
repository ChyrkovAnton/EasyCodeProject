package project;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class HomeWork {

    private String number;
    private String topic;
    private String header;
    private String homeWorkText;
    private GregorianCalendar completionDate;


    public HomeWork(String number, String topic, String header, String homeWorkText, GregorianCalendar completionDate) {
        this.number = number;
        this.topic = topic;
        this.header = header;
        this.homeWorkText = homeWorkText;
        this.completionDate = completionDate;
    }

    public HomeWork() {
        this.number = "";
        this.topic = "";
        this.header = "";
        this.homeWorkText = "";
        this.completionDate = new GregorianCalendar(2017, 1, 30);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHomeWorkText() {
        return homeWorkText;
    }

    public void setHomeWorkText(String homeWorkText) {
        this.homeWorkText = homeWorkText;
    }

    public GregorianCalendar getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(GregorianCalendar completionDate) {
        this.completionDate = completionDate;
    }


    @Override
    public String toString() {
        return "HomeWork{" +
                "number='" + number + '\'' +
                ", topic='" + topic + '\'' +
                ", header='" + header + '\'' +
                ", homeWorkText='" + homeWorkText + '\'' +
                ", completionDate=" + completionDate.get(Calendar.DAY_OF_MONTH) + "."
                                    + completionDate.get(Calendar.MONTH) + "."
                                    + completionDate.get(Calendar.YEAR) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeWork)) return false;

        HomeWork homeWork = (HomeWork) o;

        if (number != null ? !number.equals(homeWork.number) : homeWork.number != null) return false;
        if (topic != null ? !topic.equals(homeWork.topic) : homeWork.topic != null) return false;
        if (header != null ? !header.equals(homeWork.header) : homeWork.header != null) return false;
        if (homeWorkText != null ? !homeWorkText.equals(homeWork.homeWorkText) : homeWork.homeWorkText != null)
            return false;
        return completionDate != null ? completionDate.equals(homeWork.completionDate) : homeWork.completionDate == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + (homeWorkText != null ? homeWorkText.hashCode() : 0);
        result = 31 * result + (completionDate != null ? completionDate.hashCode() : 0);
        return result;
    }
}

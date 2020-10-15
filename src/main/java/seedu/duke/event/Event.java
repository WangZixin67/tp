package seedu.duke.event;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
    protected String eventName;
    protected String eventTime;
    protected LocalDate date;


    public Event(String name, String date, String time) {
        this.eventName = name;
        this.eventTime = time;
        this.setEventDate(LocalDate.parse(date));
    }


    public void setEventDate(LocalDate date) {
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public LocalDate getEventDate() {
        return date;
    }

    /**
     * Returns the string format of the event.
     *
     * @return String format of event.
     */
    public String printEvent() {
        return "Event Name: " + this.eventName +  "\nDate: "
                + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + "\nTime: " + this.eventTime + "\n";
    }

}

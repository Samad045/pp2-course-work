package pp2.week3.datetime;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(Time time) {
        this(time.hour, time.minute, time.second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toStandardString() {
        return String.format("%d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : getHour() - 12,
                getMinute(),
                getSecond(),
                getHour() < 12 ? "AM" : "PM");
    }
}
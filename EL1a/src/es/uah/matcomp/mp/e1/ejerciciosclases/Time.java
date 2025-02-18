package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString() {
        if (hour<10) {
            if (minute<10) {
                if (second<10) {
                    return "0" + hour + ":0" + minute + ":0" + second;
                }
                else {
                    return "0" + hour + ":0" + minute + ":" + second;
                }
            }
            else {
                if (second<10) {
                    return "0" + hour + ":" + minute + ":0" + second;
                }
                else {
                    return "0" + hour + ":" + minute + ":" + second;
                }
            }
        }
        else {
            if (minute<10) {
                if (second<10) {
                    return hour + ":0" + minute + ":0" + second;
                }
                else {
                    return hour + ":0" + minute + ":" + second;
                }
            }
            else {
                if (second < 10) {
                    return hour + ":" + minute + ":0" + second;
                } else {
                    return hour + ":" + minute + ":" + second;
                }
            }
        }
    }
    public Time nextSecond() {
        int newSecond = second + 1;
        int newMinute = minute + 1;
        int newHour = hour + 1;
        if (newSecond >= 60) {
            if (newMinute >= 60) {
                if (newHour >= 24) {
                    setHour(0);
                    setMinute(0);
                    setSecond(0);
                }
                else {
                    setHour(newHour);
                    setMinute(0);
                    setSecond(0);
                }
            }
            else {
                setMinute(newMinute);
                setSecond(0);
            }

        }
        else {
            setSecond(newSecond);
        }
        return this;
    }
    public Time previousSecond() {
        int newSecond = second - 1;
        int newMinute = minute - 1;
        int newHour = hour - 1;
        if (newSecond < 0) {
            if (newMinute < 0) {
                if (newHour < 0) {
                    setHour(23);
                    setMinute(59);
                    setSecond(59);
                }
                else {
                    setHour(newHour);
                    setMinute(59);
                    setSecond(59);
                }
            }
            else {
                setMinute(newMinute);
                setSecond(59);
            }
        }
        else {
            setSecond(newSecond);
        }
        return this;
    }
}

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hour < 10)
            sb.append(0).append(hour);
        else
            sb.append(hour);
        sb.append(":");
        if (minute < 10)
            sb.append(0).append(minute);
        else
            sb.append(minute);
        sb.append(":");
        if (second < 10)
            sb.append(0).append(second);
        else
            sb.append(second);


        return sb.toString();
    }

    private Time nextHour(Time temp) {
        temp.setHour((temp.getHour() + 1) % 24);
        return temp;
    }

    private Time nextMinute(Time temp) {
        if (temp.getMinute() != 59) {
            temp.setMinute(temp.getMinute() + 1);
        } else {
            temp.setMinute(0);
            nextHour(temp);
        }
        return temp;
    }

    public Time nextSecond() {
        Time temp = new Time(getHour(), getMinute(), getSecond());
        if (getSecond() != 59) {
            temp.setSecond(getSecond() + 1);
        } else {
            temp.setSecond(0);
            nextMinute(temp);
        }
        return temp;
    }
    public Time previousSecond(){
        Time temp = new Time(getHour(), getMinute(), getSecond());
        if (getSecond() == 0 ){
            temp.setSecond(59);
            previousMinute(temp);
        }
        else
            temp.setSecond(getSecond() - 1);
        return temp;
    }
    private Time previousMinute(Time temp){
        if (getMinute() == 0 ){
            temp.setMinute(59);
            previousHour(temp);
        }
        else
            temp.setMinute(getMinute() - 1);
        return temp;
    }
    private Time previousHour(Time temp){
        if (getHour() == 0){
            temp.setHour(23);
            return temp;
        }
        else
            temp.setHour(getHour() - 1);
        return temp;
    }
}



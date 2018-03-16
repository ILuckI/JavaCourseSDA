public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
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
        if (hour < 0) {
            System.out.printf("You can`t set less than 0 hour into 24h Time format. You wanted set %d ", hour);
        } else if (hour > 23) {
            System.out.printf("You can`t set more than 23 hour into 24h Time format. You wanted set %d ", hour);
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0) {
            System.out.printf("You can`t set less than 0 minutes into 24h Time format. You wanted set %d ", minute);
        } else if (minute > 60) {
            System.out.printf("You can`t set more than 59 minutes into 24h Time format. You wanted set %d ", minute);
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second < 0) {
            System.out.printf("You can`t set less than 0 second into 24h Time format. You wanted set %d ", second);
        } else if (second > 60) {
            System.out.printf("You can`t set more than 59 second into 24h Time format. You wanted set %d ", second);
        } else {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        if (hour < 10)
            sb.append("0").append(hour);
        else
            sb.append(hour);
        sb.append(":");
        if (minute < 10)
            sb.append("0").append(minute);
        else
            sb.append(minute);
        sb.append(":");
        if (second < 10)
            sb.append("0").append(second);
        else
            sb.append(second);
        sb.append("'");

        return sb.toString();
    }

    private MyTime nextHour(MyTime temp) {
        temp.setHour((temp.getHour() + 1) % 24);
        return temp;
    }

    private MyTime nextMinute(MyTime temp) {
        if (temp.getMinute() != 59) {
            temp.setMinute(temp.getMinute() + 1);
        } else {
            temp.setMinute(0);
            nextHour(temp);
        }
        return temp;
    }

    public MyTime nextSecond() {
        MyTime temp = new MyTime(getHour(), getMinute(), getSecond());
        if (getSecond() != 59) {
            temp.setSecond(getSecond() + 1);
        } else {
            temp.setSecond(0);
            nextMinute(temp);
        }
        return temp;
    }

    public MyTime previousSecond() {
        MyTime temp = new MyTime(getHour(), getMinute(), getSecond());
        if (getSecond() == 0) {
            temp.setSecond(59);
            previousMinute(temp);
        } else
            temp.setSecond(getSecond() - 1);
        return temp;
    }

    private MyTime previousMinute(MyTime temp) {
        if (getMinute() == 0) {
            temp.setMinute(59);
            previousHour(temp);
        } else
            temp.setMinute(getMinute() - 1);
        return temp;
    }

    private MyTime previousHour(MyTime temp) {
        if (getHour() == 0) {
            temp.setHour(23);
            return temp;
        } else
            temp.setHour(getHour() - 1);
        return temp;
    }
}

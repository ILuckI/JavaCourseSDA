public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (day < 10)
            sb.append(0).append(day);
        else
            sb.append(day);
        sb.append("/");
        if (month < 10)
            sb.append(0).append(month);
        else
            sb.append(month);

       sb.append("/").append(year);

            return sb.toString();
    }
}


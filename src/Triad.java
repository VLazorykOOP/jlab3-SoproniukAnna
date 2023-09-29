abstract class Triad
{
    public abstract void increment();

    public abstract void printValue();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);
}

class Date extends Triad
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public void increment()
    {
        this.year++;
        System.out.println("На один рік більше: " + this.year);
    }
    @Override
    public void printValue()
    {
        System.out.println(day + "/" + month + "/" + year);
    }
    @Override
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Date other = (Date) obj;
        return day == other.day && month == other.month && year == other.year;
    }
}


class Time extends Triad
{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    @Override
    public void increment()
    {
        this.hours++;
        System.out.println("На одну годину більше: " + this.hours);
    }
    @Override
    public void printValue()
    {
        System.out.println(hours + "/" + minutes + "/" + seconds);
    }

    @Override
    public String toString()
    {
        return hours + "/" + minutes + "/" + seconds;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
    }
}
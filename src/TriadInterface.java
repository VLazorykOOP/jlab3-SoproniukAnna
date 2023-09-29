interface TriadInterface
{
    void increment();
    void printValue();

    @Override
    String toString();

    @Override
    boolean equals(Object obj);
}

class DateInterface implements TriadInterface
{
    private int dayInter;
    private int monthInter;
    private int yearInter;

    public DateInterface(int day, int month, int year)
    {
        this.dayInter = day;
        this.monthInter = month;
        this.yearInter = year;
    }
    @Override
    public void increment()
    {
        this.yearInter++;
        System.out.println("На один рік більше: " + this.yearInter);
    }
    @Override
    public void printValue()
    {
        System.out.println(dayInter + "/" + monthInter + "/" + yearInter);
    }
    @Override
    public String toString()
    {
        return dayInter + "/" + monthInter + "/" + yearInter;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        DateInterface other = (DateInterface) obj;
        return dayInter == other.dayInter && monthInter == other.monthInter && yearInter == other.yearInter;
    }
}

class TimeInterface implements TriadInterface
{
    private int hoursInter;
    private int minutesInter;
    private int secondsInter;

    public TimeInterface(int hours, int minutes, int seconds)
    {
        this.hoursInter = hours;
        this.minutesInter = minutes;
        this.secondsInter = seconds;
    }
    @Override
    public void increment()
    {
        this.hoursInter++;
        System.out.println("На одну годину більше: " + this.hoursInter);
    }
    @Override
    public void printValue()
    {
        System.out.println(hoursInter + "/" + minutesInter + "/" + secondsInter);
    }

    @Override
    public String toString()
    {
        return hoursInter + "/" + minutesInter + "/" + secondsInter;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        TimeInterface other = (TimeInterface) obj;
        return hoursInter == other.hoursInter && minutesInter == other.minutesInter && secondsInter == other.secondsInter;
    }
}

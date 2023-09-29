public class challenge
{
    private final String title;
    private final String difficult;

    public challenge(String tit, String dif)
    {
        this.title = tit;
        this.difficult = dif;
    }
    public void Show()
    {
        System.out.println("Назва випробування: " + title);
        System.out.println("Рівень складності: " + difficult);
    }

}

//----------------------------------------------------------------------------------------------------------------

class test extends challenge
{
    private final int duration;

    public test(String tit, String dif, int dur)
    {
        super(tit, dif);
        this.duration = dur;
    }
    @Override
    public void Show()
    {
        super.Show();
        System.out.println("Тривалість тесту: " + this.duration + " хвилин");
    }
}

//----------------------------------------------------------------------------------------------------------------

class exam extends challenge
{
    private final String subject;

    public exam(String tit, String dif, String sub)
    {
        super(tit, dif);
        this.subject = sub;
    }
    @Override
    public void Show()
    {
        super.Show();
        System.out.println("Предмет іспиту: " + this.subject);
    }
}

//----------------------------------------------------------------------------------------------------------------

class finalExam extends exam
{
    private final int year;

    public finalExam(String tit, String dif, String sub, int y)
    {
        super(tit, dif, sub);
        this.year = y;
    }

    @Override
    public void Show()
    {
        super.Show();
        System.out.println("Рік іспиту: " + this.year);
    }
}

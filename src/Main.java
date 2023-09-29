public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\t\t\t Task 1");
        challenge[] challenge = new challenge[4];
        challenge[0] = new challenge("Англійська мова", "Середній");
        challenge[1] = new test("Загальний тест", "Легкий", 30);
        challenge[2] = new exam("Математика", "Середній", "Алгебра");
        challenge[3] = new finalExam("Фізика", "Важкий", "Фізика", 2023);

        for (int i = 0; i < 4; i++)
        {
            challenge[i].Show();
            System.out.println();
        }
        System.out.println();
        System.out.println();



        System.out.println("\t\t\t Task 2");
        Date currentDate = new Date(26, 9, 2023);
        Time currentTime = new Time(15, 30, 0);

        System.out.print("Метод toString до збільшення на одиницю для дати: ");
        System.out.println(currentDate.toString());

        System.out.print("Метод toString до збільшення на одиницю для часу: ");
        System.out.println(currentTime.toString());

        System.out.println();

        currentDate.increment();
        System.out.print("Метод printValue після збільшення на одиницю для дати: ");
        currentDate.printValue();

        System.out.println();

        currentTime.increment();
        System.out.print("Метод printValue після збільшення на одиницю для часу: ");
        currentTime.printValue();
        System.out.println();

        System.out.println();

        System.out.println("Порівняння одинакових об'єктів");
        Date anotherDate = new Date(26, 9, 2024);
        System.out.println(currentDate.equals(anotherDate));

        System.out.println("Порівняння різних об'єктів");
        Time anotherTime = new Time(9, 25, 54);
        System.out.println(currentTime.equals(anotherTime));

        System.out.println();
        System.out.println();



        System.out.println("\t\t\t Task 3");
        DateInterface currentDateInter = new DateInterface(26, 9, 2023);
        TimeInterface currentTimeInter = new TimeInterface(15, 30, 0);

        System.out.print("Метод toString до збільшення на одиницю для дати: ");
        System.out.println(currentDateInter.toString());

        System.out.print("Метод toString до збільшення на одиницю для часу: ");
        System.out.println(currentTimeInter.toString());

        System.out.println();

        currentDateInter.increment();
        System.out.print("Метод printValue після збільшення на одиницю для дати: ");
        currentDateInter.printValue();

        System.out.println();

        currentTimeInter.increment();
        System.out.print("Метод printValue після збільшення на одиницю для часу: ");
        currentTimeInter.printValue();
        System.out.println();

        System.out.println();

        System.out.println("Порівняння одинакових об'єктів");
        DateInterface anotherDateInter = new DateInterface(26, 9, 2024);
        System.out.println(currentDateInter.equals(anotherDateInter));

        System.out.println("Порівняння різних об'єктів");
        TimeInterface anotherTimeInter = new TimeInterface(9, 25, 54);
        System.out.println(currentTimeInter.equals(anotherTimeInter));

    }
}

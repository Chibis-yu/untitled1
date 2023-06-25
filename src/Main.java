public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog += 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat -= 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println(boxerOne);
        var boxerTwo = 82.7;
        System.out.println(boxerTwo);
        var boxers = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров " + boxers + " кг");
        var sports = boxerTwo - boxerOne;
        System.out.println("Разница в весе " + sports + " кг");

        var sportsWeight = boxerTwo % boxerOne;
        System.out.println("Разница в весе " + sportsWeight + " кг");

        var clock = 640;
        System.out.println(clock);
        var clockWork = 8;
        System.out.println(clockWork);
        var employee = clock / clockWork;
        System.out.println("Всего работников в компании " + employee + " человек");

        var employeeMore = employee + 94;
        System.out.println("Если в компании работает " + employeeMore + " человек, ");
        var clockEmployeeMore = employeeMore * 8;
        System.out.println("то всего " + clockEmployeeMore + " часов работы может быть поделено между сотрудниками");


    }
}
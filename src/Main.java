//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Car car = new Car();
        car.name = "911 Carrera T Cabriolet";
        car.length = 4542;
        car.width = 1852;
        car.height = 1292;
        car.din = 1580;
        car.maxLoad = 405;
        car.permissibleGrossWeight = 1985;
        System.out.println("Car name: " + car.name);
        System.out.println("Length: " + car.length);
        System.out.println("Width: " + car.width);
        System.out.println("Height: " + car.height);
        System.out.println("DIN: " + car.din);
        System.out.println("Maximum load: " + car.maxLoad);
        System.out.println("Permissible gross weight: " + car.permissibleGrossWeight);*/

        Student student = new Student();
        student.name = "Имя: " + "Камилла";
        student.university = "Университет: " + "КГМА";
        student.faculty = "Факультет: " + "Офтальмология";
        student.course = 2;
        System.out.println(student.name);
        System.out.println(student.university);
        System.out.println(student.faculty);
        System.out.println("Курс: " + student.course);

        Student student2 = new Student();
        student.name = "Имя: " + "Mалика";
        student.university = "Университет: " + "КРСУ";
        student.faculty = "Факультет: " + "Естественно-технический";
        student.course = 1;
        System.out.println("");
        System.out.println(student.name);
        System.out.println(student.university);
        System.out.println(student.faculty);
        System.out.println("Курс: " + student.course);

        Student student3 = new Student();
        student.name = "Имя: " + "Чынгыз";
        student.university = "Университет: " + "Авиационный Институт";
        student.faculty = "Факультет: " + "Технология транспортных процессов";
        student.course = 4;
        System.out.println("");
        System.out.println(student.name);
        System.out.println(student.university);
        System.out.println(student.faculty);
        System.out.println("Курс: " + student.course);
    }
}
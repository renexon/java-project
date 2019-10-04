package Practice;

public class PracticeMethod {
    static String model = "ZenbookPro";
    String name = "Asus";
    int year;
    int ram = 16;

    public PracticeMethod() {

    }

    public PracticeMethod(int year) {
        this.year = year;

    }

    public static void printmodel() {
        System.out.println(model);
    }

    public static String getModel() {
        return model;
    }

    public void printYear() {
        System.out.println(year);
    }
}

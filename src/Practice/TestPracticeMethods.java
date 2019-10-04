package Practice;

public class TestPracticeMethods {

    public static void main(String[] args) {

        PracticeMethod practicemethod2 = new PracticeMethod(2019);
        System.out.println(practicemethod2.year);
        PracticeMethod practicemethod3 = new PracticeMethod(2029);
        practicemethod2.printYear();
        practicemethod3.printYear();
        practicemethod2.printYear();
    }
}
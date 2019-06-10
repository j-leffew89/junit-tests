public class App {
    public static void main(String[] args) {
        Kitchen myKitchen = new Kitchen();

        System.out.println("myKitchen.isEmpty() = " + myKitchen.isEmpty());

        myKitchen.add("blue corn");
        myKitchen.add("white corn");
        myKitchen.add("yellow corn");
        myKitchen.printAll();

        System.out.println("myKitchen.isEmpty() = " + myKitchen.isEmpty());

        System.out.println("myKitchen contains = " + myKitchen.contains("purple corn"));
        System.out.println("myKitchen contains = " + myKitchen.contains("white corn"));
        System.out.println("myKitchen contains = " + myKitchen.contains("yellow corn"));

        myKitchen.pop();
        myKitchen.printAll();

        Cohort andromeda = new Cohort();
        Student fer = new Student("fer");
        Student stacy = new Student("stacy");

        fer.addGrade(100);
        fer.addGrade(90);
        stacy.addGrade(50);
        stacy.addGrade(100);

        andromeda.addStudent(fer);
        andromeda.addStudent(stacy);

        System.out.println("andromeda.getCohortAverage() = " + andromeda.getCohortAverage());

    }
}
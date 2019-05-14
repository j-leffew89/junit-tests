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
    }
}
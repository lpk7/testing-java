package homeWork1;

public class Start {
    public static void main(String args[]) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        for (int i = 0; i < 10; i++) {
            appleBox.addFruit(new Apple());
        }

        for (int i = 0; i < 7; i++) {
            orangeBox.addFruit(new Orange());
        }

        for (int i = 0; i < 5; i++) {
            appleBox2.addFruit(new Apple());
        }

        System.out.println(appleBox.compare(orangeBox));

        System.out.println(appleBox.compare(appleBox2));

        appleBox.mergeBox(appleBox2);
    }
}

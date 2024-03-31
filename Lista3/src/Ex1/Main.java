package Ex1;

public class Main {
    public static void main(String[] args) {
            Person p1 = new Person(0, "Camilo", "ssdds");
            Person p2 = new Person(1, "Marina", "sss");

            Forum f1 = new Forum(0, "test", "www.text.com/test");

            f1.addMessage(0, "Testando", p1);
            System.out.println(f1.toString());
    }
}
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Random rand = new Random();
        for(int i = 0; i < 8; i++) {
            sll.addAtFirst(rand.nextInt(8)+2);
        }
        System.out.println("Size =>  "+ sll.size());
        sll.display();
        double number = sll.findVariance();
        System.out.println("Variance =>  "+ number);
    }
}
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()){
            int n = random.nextInt() % 1000;
            list.add(n);
        }
    }

    public static void main(String[] args) {
        OddArrayList oddListy = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        System.out.println(oddListy.size());
//        System.out.println(oddListy); Prints [7,1]

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        System.out.println(listy.size());
    }
}

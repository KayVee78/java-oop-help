import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt() % 1000;
        if (list instanceof ConditionArrayList) {
            ConditionArrayList conditionArrayList = (ConditionArrayList) list;
            while (!conditionArrayList.isEligible(n)) {
                n = random.nextInt(1000);
            }
        }
        list.add(n);
    }

    public static void main(String[] args) {
        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList divisibleByThreeListy = new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList divisibleByThreeListy2 = new ConditionArrayList(isDivisibleByThree, 1,2,3,4,5,6,9);

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList conditionArrayList3 = new ConditionArrayList(isDivisibleByThree, numsList);

        Predicate<Integer> isDivisibleBySix = n -> Math.abs(n) % 6 == 0;
        ConditionArrayList divisibleBySixListy = new ConditionArrayList(isDivisibleBySix, divisibleByThreeListy);
    }
}

public class Main {
    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(1)); //output > 10
        System.out.println(listy.getUsingMod(-2)); //output > 20
        System.out.println(listy.getUsingMod(40)); //output > 0 because 40 % 4 = 0 (40 % size of listy)
    }
}

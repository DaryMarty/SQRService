public class Main {
    public int numberOfSqrt ;{
        int mult = 50;
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i * j > mult) {
                    System.out.println(i + "и" + j);
                }
            }
        }
    }
}

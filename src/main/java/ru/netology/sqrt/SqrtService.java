package ru.netology.sqrt;

public class SqrtService {

    public int numberOfSqr(int minBorder, int maxBorder) {
        int counter =0;
        for (int i =10; i<=99; i++) {

            if (i * i >= minBorder && i * i <= maxBorder) {
                counter++;
            }
        }
        return counter;
    }
}

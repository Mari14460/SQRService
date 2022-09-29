package ru.netology.sqr;

public class SQRService {
    public int calculateSquareNumber(int limitMin, int limitMax){
        int squareNumber = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= limitMin && i*i <= limitMax){
                squareNumber++;
            }
        }
        return squareNumber;
    }
}

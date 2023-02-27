package school.mjc.stage0.loops.task3;

public class DigitsSum {
//    Write a program that will find the sum of digits of a given number passed as a method argument. There are some tips:
//        if you concatenate int with string you will be able to use string.length() and iterate till the end.
//    you shouldn't use other String methods, but length:
    public void printDigitsSum(int t){
        int sum = 0;
        int number = t;
        for (int i=0; i<(t+"").length(); i++){
            int num = number%10;
            sum+=num;
            number /= 10;
        }
        System.out.println(sum);
    }
}

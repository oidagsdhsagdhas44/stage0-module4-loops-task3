package school.mjc.stage0.loops.task3;

public class NinesSum {
//    Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ... n]. Where n is a number passed as a method argument,
//    n is the last number which consists of "9" n times:
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int prevNum = 0;
        for (int i=0; i<lengthOfLastNumber; i++){
            int num = (int)Math.pow(10,i)*9+prevNum;
            sum+=num;
            prevNum+=(int)Math.pow(10,i)*9;
//            System.out.println(num);
//            System.out.println(sum);
        }
        System.out.println(sum);
    }

}

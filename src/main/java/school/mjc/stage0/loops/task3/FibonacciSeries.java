package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
//    Write a program that will display the first n terms of Fibonacci series, each on new line:
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci<=0){
            //
        }
        else if (lastFibonacci==1){
            System.out.println(0);
        }
        else if (lastFibonacci==2){
            System.out.println(0);
            System.out.println(1);
        }
        else {
            int first = 0;
            int second = 1;
            System.out.println(0);
            System.out.println(1);
//        int sum = 0;
            for (int i = 0; i < lastFibonacci-2; i++) {
                System.out.println(first + second);
                int sum = first + second;
                first = second;
                second = sum;
            }
        }
    }

    public static void main(String args[]){
        FibonacciSeries a = new FibonacciSeries();
        a.printFibonacci(6);
    }
}

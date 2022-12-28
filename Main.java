import java.util.*;
class yay{
    public static int CalculateAverage(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String[] args){
        Scanner scr =new Scanner(System.in);
        int a =scr.nextInt();
        int b =scr.nextInt();
        int c =scr.nextInt();
        int average = CalculateAverage(a,b,c);
        System.out.println(average);





    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while (testcases-->0) {
            // int n1 = sc.nextInt();
            // int n2 = sc.nextInt();

           
        }

      
       sc.close();
    }


    public static void printNameNtimes(int i, int limit){

        if(i>limit) return;

        System.out.println("Ashik");

        printNameNtimes(i+1, limit);

    }


    public static void countDigit(int number) {

        int cnt =0;

        // while (number>0) {
        //     int lastdigit= number%10; //this is optional
        //     cnt++;
        //     number /=10;
        // }


        int res =(int) Math.log10(number);

        System.out.println(res+1);

    }


    public static void reverseNumber(int number) {

        int reversNum = 0;

        while (number>0) {
            
            int lastdigit = number%10;
            reversNum = (reversNum*10)+lastdigit;
            number /=10;
        }

        System.out.println(reversNum);
        
    }


     public static void palindromNumber(int number) {

        int reversNum = 0;
        int dupNumber=number;

        while (dupNumber>0) {
            
            int lastdigit = dupNumber%10;
            reversNum = (reversNum*10)+lastdigit;
            dupNumber /=10;
        }

        if(number == reversNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }


    public static void printAllDivisor(int number) {

        ArrayList<Integer>arr = new ArrayList<>();


        for(int i=1;i<= Math.sqrt(number);i++){

            if(number%i == 0){
                arr.add(i);

                if(number/i != i){
                    arr.add(number/i);
                }
            }

        }

        Collections.sort(arr);

        System.out.println(arr);
        
    }


    public static void Gcd(int a, int b) {

        while (a>0 && b>0) {

            if(a>b) a=a%b;
            else b = b%a;
            
        }

        if(a==0){
            System.out.println(b);
        }
        System.out.println(a);


        
    }
    
}

// public class Factorial {
//     public static void main(String[] args) {
//         int number = 5; // Example number to calculate factorial
//         long result = factorial(number);
//         System.out.println("Factorial of " + number + " is " + result);
//     }

//     public static long factorial(int n) {
//         if (n == 0) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }
// }

public class Factorial{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args){
        int number = 5;
        int result = factorial(number);
        System.out.println("Result : "+result);
    }
}

public class MathDemo {

    public static int min(int a, int b) {
        if(a < b){
            return a;
        } 
        else if (b < a){
            return b;
        }
        else{
            return a; // both of them are equal
        }
    }

    public static int max(int a, int b) {
        if(a > b){
            return a;
        } 
        else if (b > a){
            return b;
        }
        else{
            return a; // both of them are equal
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for(int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    public static float mean(int[] args) {
        if(args.length == 0){
            return 0;
        }
        float total = 0;
        for(int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total / args.length;
    }
    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int[] numbers = {2, 4, 6, 8};

        System.out.println(min(a, b));
        System.out.println(max(a, b));
        System.out.println(sum(numbers));
        System.out.println(mean(numbers));
        System.out.println(factorial(5));
    }
}
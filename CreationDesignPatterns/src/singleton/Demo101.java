package singleton;

public class Demo101 {
    public static void main(String[] args) {
     printNumber(30);
    }
    public static void printNumber(int n){
        if(n>1){
            printNumber(n-1);
        }
        System.out.println(n);


    }
}

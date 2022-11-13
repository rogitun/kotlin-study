package chap_4.sec3;



public class Main {
    static int[] arr = new int[10];

    static int fibo(int number){
        if(number <= 1) return number;
        if(arr[number]!=0) return arr[number];
        return arr[number] = fibo(number-1) + fibo(number-2);
    }
    public static void main(String[] args) {
        arr[1] = 1;
        arr[2] = 1;

        int res = fibo(8);
        System.out.print(res);


    }
}

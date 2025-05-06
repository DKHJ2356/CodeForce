import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr =new int[n];
        int point = 0;

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[k-1];


        for(int i = 0 ; i<n ; i++) {
            if(arr[i] > 0){
            if (arr[i] >= min) point++;
            }
        }

        System.out.println(point);

    }
}

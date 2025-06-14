import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int [] arr = new int[4];

        while(n/10!=0){
            arr[count] = n%10;
            count++;
            n/=10;
        }

        if(n/10==0){
            arr[count] = n%10;
        }

        int flag = 0;

        for(int i = 0 ; i<count-1; i++){
            for(int j = i+1; j<count; j++){
                if(arr[i]==arr[j]){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0) System.out.println("Ok");
        else System.out.println("Not ok");


    }
}

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]matrix = new int[5][5];
        int turn = 0;

        int x=0,y = 0;

        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length; j++){

                if(matrix[i][j] == 1){
                    x=i;
                    y=j;
                }

            }
        }

        if(x>2){
            while(x!=2){
                x--;
                turn++;
            }
        }else if(x<2){
            while(x!=2){
                x++;
                turn++;
            }
        }

        if(y>2){
            while(y!=2){
                y--;
                turn++;
            }
        }else if(y<2){
            while(y!=2){
                y++;
                turn++;
            }
        }

        System.out.println(turn);

    }
}

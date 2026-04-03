import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int policeRecruits = input.nextInt();
        int policeBackup = 0;
        int untreatedCrimes = 0;

        for (int i = 0; i < policeRecruits; i++) {
            int incidents = input.nextInt();

            if(incidents > 0){
                policeBackup += incidents;
                continue;
            }else if( policeBackup > 0 && incidents == -1){
                policeBackup +=incidents;
            }
            else untreatedCrimes ++;
        }

        System.out.println(untreatedCrimes);

    }
}

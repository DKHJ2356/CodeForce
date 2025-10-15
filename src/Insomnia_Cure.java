import java.util.Scanner;

public class Insomnia_Cure {
    static public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else return a * b / GCD(a, b);
    }

    static public int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }

    static public int lcm(int a, int b, int c, int d) {
        return lcm(lcm(a, b, c), d);
    }

    static public int GCD(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare Variables

        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int d = input.nextInt();
        int total = 0;

        //Step 2: Calculate physical and moral damage in an array

        int[] damagedDragon = new int[d];
//
//        for (int i = k; i <= d; i += k) {
//            damagedDragon[i-1] = 1;
//        }
//        for (int i = l; i <= d; i += l) {
//            damagedDragon[i-1] = 1;
//        }
//        for (int i = m; i <= d; i += m) {
//            damagedDragon[i-1] = 1;
//        }
//        for (int i = n; i <= d; i += n) {
//            damagedDragon[i-1] = 1;
//        }

        /// Another way to make the algorithm to O(1) by inclusion-exclusion

        int probabilityOfA = d / k;
        int probabilityOfB = d / l;
        int probabilityOfC = d / m;
        int probabilityOfD = d / n;

        int probabilityOfAB = d / lcm(k, l);
        int probabilityOfAC = d / lcm(k, m);
        int probabilityOfAD = d / lcm(k, n);
        int probabilityOfBC = d / lcm(l, m);
        int probabilityOfBD = d / lcm(l, n);
        int probabilityOfCD = d / lcm(m, n);

        int probabilityOfABC =d/ lcm(k,l,m);
        int probabilityOfABD =d/ lcm(k,l,n);
        int probabilityOfACD =d/ lcm(k,m,n);
        int probabilityOfBCD =d/ lcm(l,m,n);

        int probabilityOfABCD =d/ lcm(k,l,m,n);


        //Step 3: Sum up all the arrays

//        for (int sum : damagedDragon) {
//            total += sum;
//        }

        total = probabilityOfA+probabilityOfB+probabilityOfC+probabilityOfD-probabilityOfAB-probabilityOfAC-probabilityOfAD-probabilityOfBC
        -probabilityOfBD-probabilityOfCD+probabilityOfABC+probabilityOfABD+probabilityOfACD+probabilityOfBCD-probabilityOfABCD;


        //Step 4: Display value

        System.out.println(total);


    }
}

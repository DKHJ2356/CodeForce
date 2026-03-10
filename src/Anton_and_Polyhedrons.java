import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //The variable "n" indicates how many cubes he has
        int n = input.nextInt();

        //Now starts what cubes does he have
        String[] cubeCollection = new String[n];
        String flush = input.nextLine();

        //Store how many faces of a cube
        int total = 0;

        for (int i = 0; i < n; i++) {
            cubeCollection[i] = input.nextLine();   //takes input for each collection

            //Checks which condition is fulfilled

            switch (cubeCollection[i]) {
                case "Tetrahedron" -> total += 4;
                case "Cube" -> total += 6;
                case "Octahedron" -> total += 8;
                case "Dodecahedron" -> total += 12;
                case "Icosahedron" -> total += 20;
            }
        }
        System.out.println(total);
    }
}

/*

Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces.

 */
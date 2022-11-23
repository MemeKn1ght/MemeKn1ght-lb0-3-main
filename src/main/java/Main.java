import java.io.IOException;
import java.util.Scanner;

import org.lab3.controller.StudentCreate;
import org.lab3.models.university.Student;
import org.lab2.ArifMean;
import org.lab2.CreateMatrix;
import org.lab2.GeomMean;
import org.lab2.MinMaxSearch;
import org.lab0.LabaZero;

public class Main {
    public static void main(String[] args) throws IOException {

        LabaZero.helloWorld();
        int[] arguments = new int[3];
        System.out.println("\nPlease input matrix size(x and y), its should not be bigger than 20x20." +
                "\nThen choose whether you want to fill it with random numbers(1) or manually with your keyboard(2)");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
                arguments[i]=input.nextInt();
            }
        CreateMatrix matrix = new CreateMatrix(arguments[0],arguments[1],arguments[2]);
        int [][]array = matrix.getMatrix();
        System.out.println("Matrix:\n");
        matrix.printMatrix(array);
        MinMaxSearch number = new MinMaxSearch(arguments[0],arguments[1],arguments[2]);
        System.out.println("Minimum number:" + number.getMin(array));
        System.out.println("Maximum number:" + number.getMax(array));
        GeomMean ag = new GeomMean();
        ArifMean af = new ArifMean();
        System.out.println("Geometric mean:\t"+ag.geomMean(arguments[0], arguments[1],array));
        System.out.println("Arithmetical mean:\t"+af.arifMean(arguments[0], arguments[1],array));

    }
}

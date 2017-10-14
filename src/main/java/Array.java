import java.util.Scanner;

/**
 * Created by ASudarenko on 14.10.2017.
 */
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int size = scanner.nextInt();
        String[] anArr = new String[size];
        int i = 0;

        Scanner in = new Scanner(System.in);


        for (String element : anArr) {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            anArr[i] = in.next();

            i++;
        }

        for (String element : anArr)


            //System.out.print(element + " ");


          System.out.println(element.length());

            }

}

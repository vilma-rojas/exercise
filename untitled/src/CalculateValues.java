import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateValues {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int number = in.nextInt();

        while (true){

            numbers.add(number);

            if(number == -1){
                break;
            }

            number = in.nextInt();
        }

        calculate(numbers.stream().mapToInt( n -> n).toArray());

    }



    public static void calculate(int [] numbers ){

        int min = 0;
        int max = 0;
        int sum = 0;

        int count = 0;

        if(numbers.length > 0){
            min = numbers[0];
            max = numbers[0];
        }

        while(numbers.length > count && numbers[count] != -1){

            if(numbers[count] < min ){
                min = numbers[count];
            }

            if(numbers[count] > max ){
                max = numbers[count];
            }

            sum += numbers[count];

            count++;

        }

        System.out.println("El valor maximo es :" + max);

        System.out.println("El valor minimo es :" + min);

        System.out.println("El promedio es :" + (sum / (numbers.length -1)));


    }



}

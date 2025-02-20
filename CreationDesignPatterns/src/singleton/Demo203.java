package singleton;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo203 {
    public static void main(String[] args) {
        int[] i = { 4, 5, 13, 22, 9, 3,5,6,3,2,4,7,9 };
        int[] j = { 9, -3, -7, -12, 11,14,12,14,9};

        boolean negative = Arrays.stream(j).anyMatch(x -> x < 0);
        if (negative){
            System.out.println();
        }
        int[] negativeNumbers = Arrays.stream(j).filter(x -> x < 0).toArray();
        System.out.println("Negative numbers: "+Arrays.toString(negativeNumbers));

        Arrays.stream(Arrays.stream(Arrays.stream(j).sorted().toArray()).distinct().toArray()).forEach(System.out::println);
        int[] distinct = Arrays.stream(j).distinct().toArray();
        System.out.println(Arrays.toString(distinct));

        Arrays.stream(j).map(x->x*x).forEach(System.out::println);
        Arrays.stream(j).filter(x -> x % 2 == 0).forEach(x-> System.out.println("even number: "+x));
        int[] ints = Arrays.stream(i).distinct().toArray();
        System.out.println(Arrays.toString(ints));
//        System.out.println("distinct int: "+distinctInt);
        int[] array = IntStream.concat(Arrays.stream(i), Arrays.stream(j)).distinct().toArray();
        System.out.println(Arrays.toString(array));

        int sum = Arrays.stream(i).sum();
        System.out.println(sum);
        double asDouble = Arrays.stream(i).average().getAsDouble();

        System.out.println(asDouble);

        int asInt = Arrays.stream(i).max().getAsInt();

        System.out.println("Max is: "+asInt);

        int minNumber = Arrays.stream(j).min().getAsInt();
        System.out.println(minNumber);

    }
}

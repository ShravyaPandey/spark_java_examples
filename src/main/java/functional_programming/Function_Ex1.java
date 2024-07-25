package functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Function_Ex1 {
    public Function_Ex1() {

    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(12, 11, 14, 7, 8, 13, 4, 5, 19, 4, 11, 19);
        printFunc(integerList);
        System.out.println();
        printFuncEven(integerList);
        System.out.println();
        printFuncSquare(integerList);
        System.out.println();
        printFuncSumSquare(integerList);
        findMax(integerList);
        findMin(integerList);
        printDistinctSorted(integerList);
        System.out.println();
        printDistinctRevSorted(integerList);
        System.out.println();
    }

    private static void printDistinctRevSorted(List<Integer> mylist) {
        mylist.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.print(x + " "));
    }

    private static void printDistinctSorted(List<Integer> mylist) {
        mylist.stream()
                .distinct()
                .sorted()
                .forEach(x -> System.out.print(x + " "));
    }

    private static void findMin(List<Integer> integers) {
        System.out.println(integers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a));
    }

    private static void findMax(List<Integer> integers) {
        System.out.println(integers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
    }

    private static void printFuncSumSquare(List<Integer> integers) {
        System.out.println(integers.stream()
                .map(x -> x * x)
                .reduce(0, (a, b) -> (a + b)));
    }

    private static void printFuncSquare(List<Integer> integers) {
        integers.stream()
                .map(x -> x * x)
                .forEach(x -> System.out.print(x + " "));
    }

    private static void printFuncEven(List<Integer> integers) {
        integers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
    }

    private static void printFunc(List<Integer> integers) {
        integers.stream()
                .forEach(x -> System.out.print(x + " "));

    }


}

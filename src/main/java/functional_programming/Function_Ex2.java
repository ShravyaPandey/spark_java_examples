package functional_programming;

import java.util.Comparator;
import java.util.List;

public class Function_Ex2 {


    public static void main(String[] args) {
        List<String> stringList = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
                "PCF", "AZURE", "Docker", "Kubernetes");

        // print string containing "Spring"
        System.out.println("PRINT STRING CONTAINING 'Spring'");
        stringList.stream()
                .filter(str -> str.contains("Spring"))
                .forEach(System.out::println);

        // print stringList with length of each element
        System.out.println("PRINT stringList WITH LENGTH OF EACH ELEMENT");
        stringList.stream()
                .forEach(str -> System.out.print(str + " - " + str.length() + ", "));
        System.out.println();

        // print stringList with length =3
        System.out.println("PRINT stringList HAVING LENGTH =3");
        stringList.stream()
                .filter(str -> str.length() == 3)
                .forEach(str -> System.out.print(str + " "));

        // sort stringList in increasing order of its length
        System.out.println();
        System.out.println("SORT stringList IN INCREASING ORDER OF ITS LENGTH");
        stringList.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(str -> System.out.print(str + "  "));

        // sort stringList in decreasing order of its length
        System.out.println();
        System.out.println("SORT stringList IN DECREASING ORDER OF ITS LENGTH");
        stringList.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(str -> System.out.print(str + "  "));
    }
}

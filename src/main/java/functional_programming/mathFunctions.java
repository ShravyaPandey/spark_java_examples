package functional_programming;


import java.util.List;

public class mathFunctions {

    public static void main(String[] args) {

        List<Integer> list = List.of(-90, 90, 2, 34, 4, 12, 11, 1, -10, -99, 100, -88);
        int Min = findMin(list);
        int secondMin = findSecondMin(list);
        System.out.println("min :" + Min + ", secondMin:" + secondMin);

        int Max = findMax(list);
        int secondMax = findSecondMax(list);
        System.out.println("Max :" + Max + ", secondMax:" + secondMax);

    }

    private static int findSecondMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (secMax < list.get(i) && max > list.get(i))
                secMax = list.get(i);

            if (max < list.get(i))
                max = list.get(i);


        }
        return secMax;
    }

    private static int findMax(List<Integer> list) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i))
                max = list.get(i);
        }
        return max;
    }

    private static int findMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i))
                min = list.get(i);
        }
        return min;
    }

    private static int findSecondMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (min < list.get(i) && secMin > list.get(i)) {
                secMin = list.get(i);
            }
            if (min > list.get(i))
                min = list.get(i);
        }
        return secMin;
    }
}

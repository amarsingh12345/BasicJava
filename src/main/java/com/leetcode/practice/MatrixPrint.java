package com.leetcode.practice;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixPrint {
    public static void main(String[] args) {
        int[][] twoArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<String> namesList = Stream.of("amar", "singh")
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println(namesList);
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]);
            }
            System.out.println(" ");
        }
    }
}

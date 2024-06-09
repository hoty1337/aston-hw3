package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
//        Pattern pattern = Pattern.compile("^[аоэиуыеёюя].*");
//        Files.lines(Path.of("test.txt"))
//                .flatMap(s -> Stream.of(s.split(" ")))
//                .filter(s -> pattern.matcher(s).matches())
//                .forEach(System.out::println);
//
//        System.out.println("\n");
//
//
//        List<String[]> collect = Files.lines(Path.of("test.txt"))
//                .map(s -> s.split(" "))
//                .collect(Collectors.toList());
//        for(String[] strings : collect) {
//            for(int i = 0; i < strings.length - 1; i++) {
//                if(strings[i].charAt(strings[i].length()-1) == strings[i+1].charAt(0)) {
//                    System.out.println(strings[i]);
//                }
//            }
//        }
//
//        System.out.println("\n");
//
//        Pattern pattern2 = Pattern.compile("\\d");
//        Files.lines(Path.of("test.txt"))
//                .forEach(s -> {
//                    int k = 0, max = 0;
//                    boolean num = false;
//                    for(int i = 0; i < s.length(); i++) {
//                        if(pattern2.matcher(s.substring(i,i + 1)).matches()) {
//                            num = true;
//                            k++;
//                        } else {
//                            if(num) {
//                                max = Math.max(max, k);
//                                k = 0;
//                                num = false;
//                            }
//                        }
//                    }
//                    System.out.println(max);
//                });
//
//
//        Files.lines(Path.of("java.java"))
//                .forEach(s -> {
//                    try {
//                        Files.writeString(Path.of("java2.java"), s.replaceAll("public", "private") + "\n", StandardOpenOption.APPEND);
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });

        Files.lines(Path.of("java.java"))
                .forEach(s -> {
                    try {
                        Files.writeString(Path.of("java2.java"), new StringBuilder(s).reverse() + "\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
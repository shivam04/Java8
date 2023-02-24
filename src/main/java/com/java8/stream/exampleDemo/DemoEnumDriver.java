package com.java8.stream.exampleDemo;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoEnumDriver {
    public static void main(String[] args) {
        String demoEnumString = "ABC,DEF,GHI";
        String demoEnumString1 = "JKL,MNO,PQR";
        String demoEnumString2 = "STU,VWX,YZ";
        String demoEnumString3 = "ABC";
        String demoEnumString4 = "YZ";
        String demoEnumString5 = "";

        System.out.println(getList(demoEnumString));
        System.out.println(getList(demoEnumString1));
        System.out.println(getList(demoEnumString2));
        System.out.println(getList(demoEnumString3));
        System.out.println(getList(demoEnumString4));
        System.out.println(getList(demoEnumString5));


        List<String> ss = Arrays.stream(DemoEnum.values()).
                collect(Collectors.toList())
                        .stream()
                                .map(DemoEnum::toString)
                                        .collect(Collectors.toList());
        System.out.println(String.join(",", ss));
    }

    private static List<DemoEnum> getList(String demoEnumString) {
        if (demoEnumString == null || demoEnumString.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        return Stream.of(demoEnumString.split(","))
                .map(DemoEnum::valueOf)
                .collect(Collectors.toList());
    }
}

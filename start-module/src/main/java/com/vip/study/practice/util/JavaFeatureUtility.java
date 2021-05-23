package com.vip.study.practice.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaFeatureUtility {

    /**
     * Convert the provided objects into java list
     * @param data : data to be added in list
     * @param <T> : Type of data
     * @return : List of elements
     */
    public static <T> List<T> asList(T... data) {
        return data != null ? new ArrayList<>(Arrays.asList(data)) : new ArrayList<>();
    }
}

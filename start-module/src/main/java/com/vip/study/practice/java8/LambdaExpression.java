package com.vip.study.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LambdaExpression {

    public <T> T findFirst(List<T> data, T dataToFind) {
        return Optional.of(data).orElse(new ArrayList<>())
                .stream()
                .filter(dataToFilter -> Objects.equals(dataToFilter, dataToFind))
                .findFirst()
                .orElse(null);
    }
}

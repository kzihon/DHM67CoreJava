package oop.sorting;

import java.util.List;

public interface SortingAlgorithm<T> {
    List<T> sorted(List<T> list);
}

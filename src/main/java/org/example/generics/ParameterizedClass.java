package org.example.generics;

import java.util.List;

class ParameterizedClass <T>  {
    // Все элементы этого листа будут иметь тип T.
    private List<T> arr;

    public ParameterizedClass(List<T> arr) {
        this.arr = arr;
    }

    // Если параметризированный метод находится внутри параметризированного класса,
    // можно явно не указывать использование дженериков.
    public <T> T getValue(List<T> arr) {
        return arr.get(1);
    }
}

class ParameterizedClassWithTwoTypes <T1, T2>  {
    private List<T1> arrOfT1;
    private List<T2> arrOfT2;

    public ParameterizedClassWithTwoTypes(List<T1> arr1, List<T2> arr2) {
        this.arrOfT1 = arr1;
        this.arrOfT2 = arr2;
    }
}

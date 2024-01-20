package arrayPreparing;

interface PrepareArray<T> {
    Object[] removeArrayByIndex(T[] array, int index);

    Object[] removeArrayByElement(T[] array, T element);
}

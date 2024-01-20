package arrayPreparing;

public class ArrayOrganizing<T> implements PrepareArray<T> {
    private Object[] newArray;

    @Override
    public Object[] removeArrayByIndex(T[] array, int index) {
        array[index] = null;
        int arrayDynamicLength = 0;
        for (T element : array) {
            if (!(element == null)) {
                arrayDynamicLength++;
            }
        }
        //new array
        newArray = new Object[arrayDynamicLength];
        arrayDynamicLength = 0;
        //
        //copy
        for (T t : array) {
            if (!(t == null)) {
                newArray[arrayDynamicLength] = t;
                arrayDynamicLength++;
            }
        }
        return newArray;
    }

    @Override
    public Object[] removeArrayByElement(T[] array, T element) {
        //search array by element
        boolean isFound = false;
        int arrayDynamicLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = null;
                if (!(arrayDynamicLength == 0)) {
                    arrayDynamicLength--;
                }
            }
            arrayDynamicLength++;
        }
        //copy array
        newArray = new Object[arrayDynamicLength];
        arrayDynamicLength = 0;
        for (T t : array) {
            if (!(t == null)) {
                newArray[arrayDynamicLength] = t;
                arrayDynamicLength++;
            }
        }
//        System.out.println(newArray.length);
        return newArray;
    }
}

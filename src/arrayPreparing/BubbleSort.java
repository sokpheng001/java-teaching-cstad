package arrayPreparing;

public class BubbleSort {
    public static int[] bubbleSort(int [] data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
    public static int[] bubbleSortVol2(int [] data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length;j++){
                if(j>0){
                    if(data[j-1]>data[j]){
                        int temp = data[j-1];
                        data[j-1] = data[j];
                        data[j] = temp;
                    }
                }else {
                    if(data[j]>data[j+1]){
                        int temp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = temp;
                    }
                }
            }
        }
        return data;
    }
}

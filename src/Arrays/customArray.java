package Arrays;

public class customArray {
    private int length;
    private int count = -1;
    private int[] arr;

    public customArray(int length) {
        this.length = length;
        arr = new int[length];
    }

    public void print(){
       for(int i = 0 ; i <= count; i++){
           System.out.println(arr[i]);
       }
    }

    public void insert(int value) {
        if(count + 1 >= length){
            int[] newArray = new int[length * 2];
            for(int i = 0; i < arr.length; i++){
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        count++;
        arr[count] = value;
    }

    public void removeAt(int index){
        if(index < 0  || index >= length) {
            return;
        }
        // Some loop from index to length - 2
        for(int count = index; count < length - 2; count++){
            arr[count] = arr[count + 1];
        }
        count--;
    }

    public int indexOf(int value) {
        for(int i = 0; i < arr.length ; i++){
            if(value == arr[i])
                return i;
        }
        return -1;
    }

    public int max() {
        int min = 0;
        for (int i : arr) {
            if(i > min)
                min = i;
        }
        return min;
    }

    public int intersect(int[] source){
        int nCount = -1;
        int[] intersect = new int[count];
        for(int i : source)
            if(arr.indexOf(i) > 0) {
                nCount++;
                intersect[nCount] = i;
            }
    }

}

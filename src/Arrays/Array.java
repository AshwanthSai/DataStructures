package Arrays;

public class Array {
    int[] arr;
    int count = -1;
    int index = -1;
    int length;

    public Array(int length) {
        arr = new int[length];
        this.length = length;
    }

    // Sai, think of logic when writing down methods.
    public void insert(int item){
        if(index >= length){
            resizeIfRequired();
        }
        index++;
        arr[index] = item;
        count++;
    }

    // If array is at max length.
    // Increase to twice the size.
    // copy all elements
    // reassign array and insert item;
    public void resizeIfRequired(){
        int[] biggerarr = new int[length * 2];
        for(int i = 0; i < arr.length ; i++) {
            biggerarr[i] = arr[i];
        }
        arr = biggerarr;
    }

    public void print(){
        for(int i = 0; i < index ; i++){
            System.out.println(arr[i]);
        }
    }

    public int indexOf(int target) {
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    // Forgot End
    public void removeAt(int idx){
        while(idx < count - 1){
            arr[idx] = arr[idx + 1];
        }
        count --;
    }

    public void reverse(){
        int[] reverseArr = new int[length];
        int indexCount = 0;
        for(int i = count - 1; i >= 0; i--){
            reverseArr[indexCount] = arr[i];
            indexCount++;
        }
        arr = reverseArr;
    }

    public void insertAt(int idx, int num) {
        // Resize Array, if total elements is greater than length.
        int[] biggerArr = new int[length * 2];
        for(int i = 0; i < idx; i++)
            biggerArr[i] = arr[i];
        arr[idx] = num;
        for (int i = idx + 1; i < length; i++)
            biggerArr[i] = arr[i];

    }

    public int[] intersect(Array target){
        int[] intersectArr = new int[length * 2];
        count = -1;
        for(int i : arr){
            if(target.indexOf(i) != -1) {
                count++;
                intersectArr[count] = i;
            }
        }
        return intersectArr;
    }

}

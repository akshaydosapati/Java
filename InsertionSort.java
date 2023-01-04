// In this sorting, for every iteration an element moves from an unsortrd portion to sorted portion until all elements are sorted.
class InsertionSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        for(int i = 1;i < arr.length;i++){
            for(int j = i-1;j >= 0;j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

* It is an inplace algorithm (sorted items occupy the same storage as original one's)

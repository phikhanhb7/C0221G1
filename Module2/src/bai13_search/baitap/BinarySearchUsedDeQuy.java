package bai13_search.baitap;

public class BinarySearchUsedDeQuy {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list,int low , int high, int key) {
        low = 0;
        high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]){
                binarySearch(list , low , mid -1, key );
            }

            else if (key == list[mid]){
                return mid;
            }

            else{
                binarySearch(list , mid +1 , high , key);
            }

        }
        return -1; /* Now high < low, key not found */
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list,0,12,50));

    }
}

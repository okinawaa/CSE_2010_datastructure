package TextBook.Book_chapter5;

public class BinarySum {

    public static int binarySum(int[] data, int low, int high) {
        if (low > high) {
            return 0;
        } else if (low == high) {
            return data[low];
        }else{
            int mid = (low + high) / 2;
            return binarySum(data,low,mid0) + binarySum(data,mid+ 1 , high);
        }
    }
}

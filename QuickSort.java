// Implementation of Quicksort:
// Runtime: O(n^2)
// Best-Case Runtime: O(n*lg(n))
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    private static int partition(int[] arr, int low, int high)
    {
        int pi = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++)
        {
            if(arr[j] < pi)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args)
    {
        int nums[] = {5,6,2,3,1,8,4};
        quickSort(nums,0,nums.length-1);
        for(int num: nums)
        {
            System.out.print(num+" ");
        }
    }
}

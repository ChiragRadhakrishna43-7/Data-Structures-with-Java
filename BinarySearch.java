// Implementation of Binary Search:
// Runtime: O(lg n)
public class BinarySearch {
    // iterative function:
    public static int b_s(int[] arr, int target_value)
    {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] == target_value)
            {
                return mid;
            }
            else if(arr[mid] < target_value)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return -1;
    }
    // recursive function:
    public static int r_b_s(int[] arr, int target_value, int l, int r)
    {
        if(l<=r)
        {
            int mid = (l + r)/2;
            if(arr[mid] == target_value)
            {
                return mid;
            }
            else if(arr[mid] < target_value)
            {
                return r_b_s(arr,target_value,mid+1,r);
            }
            else
            {
                return r_b_s(arr,target_value,l,mid-1);
            }
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args)
    {
        //Iterative test case:
        int nums[] = {1,3,5,7,9,11,13};
        int key = 17;
        int result = b_s(nums,key);
        //Recursive test case:
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int result1 = r_b_s(numbers,target,0,numbers.length - 1);
        System.out.println(result);
        System.out.println(result1);
    }
}
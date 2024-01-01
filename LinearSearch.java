//implementing linear search:
// Runtime: O(n)
public class LinearSearch {
    
    public static int Linear_search(int arr[], int key)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(key == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int nums[] = {5,7,9,11,13};
        int target = 11;
        
        int result = Linear_search(nums,target);
        if(result != -1)
        {
            System.out.println("Element found at index position :" + result);
        }
    } 
}

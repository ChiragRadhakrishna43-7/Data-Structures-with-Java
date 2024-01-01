//Implementation of Bubble Sort Algorithm:
//Runtime: O(n^2)
public class BubbleSort {
    public static int[] bubble_sort(int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j <= arr.length-1; j++)
            {
                if(arr[i] > arr[j]) // To sort in descending order, condition: arr[j] > arr[i]
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] numbers = {10,9,8,6,5,2,3,1,4,7};
        int result[] = bubble_sort(numbers);
        /*for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }*/
        for(int num: result)
        {
            System.out.println(num);
        }
    }
}


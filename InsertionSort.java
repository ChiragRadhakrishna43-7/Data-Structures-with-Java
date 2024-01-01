//Implementation of Insertion Sort:
//Runtime: O(n^2)
public class InsertionSort {
    public static void main(String[] args)
    {
        int num[] = {5,6,2,3,1};
        for(int i = 1; i<num.length; i++)
        {
            int key = num[i];
            int j = i - 1;
            while(j>=0 && num[j] > key)
            {
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
        for(int i : num)
        {
            System.out.print(i+" ");
        }
    }
}

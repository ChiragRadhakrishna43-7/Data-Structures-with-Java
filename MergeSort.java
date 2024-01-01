// Implementation of Merge Sort:
// Runtime is O(n*lg(n))
public class MergeSort {
    public static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[],int l,int mid,int r)
    {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0;i<n1;i++)
        {
            left[i] = arr[l+i];
        }
        for(int i = 0;i<n2;i++)
        {
            right[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {3,5,1,4,6,2};
        for(int n: arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting");
        for(int n: arr)
        {
            System.out.print(n+" ");
        }
    }
}

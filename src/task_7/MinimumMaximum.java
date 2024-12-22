package task_7;

public class MinimumMaximum {
    public static void MinimumMaximum(int[] arr)
    {
        int i=0;
        int j=1;
        int max=arr[i];
        int min=arr[j];

        while(arr.length >i)
        {
                if( max > arr[j])
                {
                    max = arr[i];
                    min=arr[j];
                }
                else {
                    min = arr[j];
            }
            j++;
        }
    }
    public static void main(String[] args) {

    }
}

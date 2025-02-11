package task_7;

public class MargeSort {
    private static void marge(int[] arr,int[] leftArray,int[] rightArray,int left,int right)
    {
        int i=0;
        int j=0;
        int k=0;
        //Marge Array
        while (i<left && j<right)
        {
            if(leftArray[i]<=rightArray[j])
            {
                arr[k++]=leftArray[i++];
            }
            else{
                arr[k++]=rightArray[j++];
            }
        }
        //Marge remaining Array
        while (i<left)
        {
            arr[k++]=leftArray[i++];
        }
        while (j<right)
        {
            arr[k++]=rightArray[j++];
        }
    }
    public static void mergeSort(int[] arr,int numberOfElement)
    {
        if(numberOfElement<2)
        {
            return;
        }
        int mid=numberOfElement/2;
        int[] leftArray=new int[mid];
        int[] rightArray=new int[numberOfElement-mid];

        // Fill up the partitions
        for (int i = 0; i < mid ; i++) {
            leftArray[i]=arr[i];
        }
        for (int i = mid; i <numberOfElement; i++) {
            rightArray[i-mid]=arr[i];
        }
        // Apply marge sort on the left partition
        mergeSort(leftArray,mid);
        mergeSort(rightArray,numberOfElement-mid);
        marge(arr,leftArray,rightArray,mid,numberOfElement-mid);
    }

    public static void main(String[] args) {
        int[] arr={23,39,40,50,63,40,73,94};
        mergeSort(arr,arr.length);
        for (int num: arr) {
            System.out.print(num+" ");
        }
    }
}

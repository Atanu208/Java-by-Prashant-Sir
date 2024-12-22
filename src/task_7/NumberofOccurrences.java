package task_7;

public class NumberofOccurrences {
    public static void numberOfOccurrences(int[] arr,int item)
    {
        int count=0;
        int i=0;
        while(arr.length>i)
        {
            if(arr[i]==item) count++;
            i++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={12,45,15,12,13,19,18,21};
        numberOfOccurrences(arr,12);
    }
}

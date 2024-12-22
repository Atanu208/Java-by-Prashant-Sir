package task_7;

public class SumAverage {
    public static void sumAnsAvg(int[] arr)
    {
        int i=0;
        int sum=0;
        while (i<arr.length)
        {
            sum +=arr[i];
            i++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+sum/arr.length);
    }
    public static void main(String[] args) {
    int[] arr={12,23,34,45,56};
    sumAnsAvg(arr);
    }
}

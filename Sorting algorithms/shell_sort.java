// Shell Sort in Java
// Your file name should be shell_sort if you want to run this code.  

public class shell_sort {

    public static void main(String[] args) {

        int ar[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(ar);


        shellSort(ar);
        System.out.println("Array after Sorting");
        printArray(ar);

    }

    public static int shellSort(int arr[])
    {
        int len = arr.length;

        for (int gap = len/2; gap > 0; gap /= 2)
        {

            for (int i = gap; i < len; i += 1)
            {
                int temp = arr[i];

                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
        return 0;
    }

    //    Function to print the array
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
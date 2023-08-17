import javax.swing.JPanel;

public class SortingAlg extends JPanel
{
    public int[] SelectSort(int[] arr) 
    {
        int temp, pmin;
        for (int i = 0; i < arr.length; i++) 
        {
            pmin = i;
            for (int j = i+1; j < arr.length; j++) 
            {
                if(arr[j] < arr[pmin]) 
                {
                    pmin = j; 
                }
            }
            temp = arr[i];
            arr[i] = arr[pmin];
            arr[pmin] = temp;
        }
        return arr; 
    }



    public int[] BubbleSort(int[] arr) 
    {
        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1 && !isSorted; i++) 
        {
            isSorted = true;
            int temp;
            for (int j = 0 ; j < arr.length - 1 - i; j++) 
            {
                if(arr[j] > arr[j + 1]) 
                {
                    isSorted = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] InsertSort(int[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && temp < arr[j] ) 
            {   
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;   
    } 
   
    public int[] quickSort(int[] arr, int arrStart,  int arrEnd) 
    {
        if(arrStart >= arrEnd) return arr;

        int pivotPosition = quickSortPartition(arr, arrStart, arrEnd);
        quickSort(arr, arrStart, pivotPosition - 1); //left
        quickSort(arr,  pivotPosition + 1, arr.length - 1); //right
        return arr;
    }

    public int quickSortPartition(int[] arr, int arrStart,  int arrEnd) 
    {   
        int pivot = arr[arrEnd];
        int temp;
        int i = -1;
        for (int j = 0; j <= arrEnd; j++)  
        {
            if(arr[j] < pivot) 
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }
        temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[arrEnd] = temp;
        
        return i + 1; //return the position of the Pivot
    }


}

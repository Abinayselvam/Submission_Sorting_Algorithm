public class SelectionSort {
    public static void selectionSort(int[] scores)
    {
        int n=scores.length;
        for(int i=0;i<n-1;i++)
        {
            int mixIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(scores[j]<scores[mixIndex])
                {
                    mixIndex=j;
                }
            }
            //swap elements
            int temp=scores[mixIndex];
            scores[mixIndex]=scores[i];
            scores[i]=temp;

        }

    }
}

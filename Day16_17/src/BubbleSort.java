public class BubbleSort {
    public static void bubbleSort(Students[] students)
    {
      int size=students.length;
      for(int i=0;i<size-1;i++)
      {
          for(int j=0;j<size-i-1;j++)
          {
              if(students[j].marks<students[j+1].marks)
              {
                  Students temp = students[j];
                  students[j]=students[j+1];
                  students[j+1]=temp;


              }
          }

      }
    }
}

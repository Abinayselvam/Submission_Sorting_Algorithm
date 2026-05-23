public class InsertionSort {
    public static void insertionSort(Employee[] employees)
    {
        int size=employees.length;
        for(int  i=1;i<size;i++)
        {
            Employee key=employees[i];
            int j=i-1;
            while(j >=0 && employees[j].empId>key.empId)
            {
                 employees[j+1]=employees[j];
                 j--;
            }
            employees[j+1]=key;
        }

    }
}

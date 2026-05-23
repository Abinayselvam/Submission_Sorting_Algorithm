public class Students {
    int roleNo;
    String name;
    int marks;
    public Students(int roleNo,String name,int marks)
    {
        this.roleNo=roleNo;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString()
    {
        return roleNo+" "+name+" "+marks;
    }

}

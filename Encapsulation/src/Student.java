import javax.xml.stream.events.StartDocument;

class student {

    private int rollNo;
    private String name;

public void setrollNo(int rollNo)
{
    this.rollNo = rollNo;
}

public int getRollNo() 
{
        return rollNo;
    }
public void setname(String name)
{
    this.name = name;
}

public String getName()
{
    return name;
}


public static void main(String[]args)
{
    student s1 = new student();


    s1.setrollNo(2114);
    s1.setname("Tamilarasan");


System.out.println("RollNo :"+ s1.getRollNo());
System.out.println("Student Name :"+s1.getName());

    }

}
package CollectionFramework.GenericCollection;

public class Student {
    double marks;
    String name;
    int id;


    //constructor

    public Student(double marks,String name,int id){
        super();
        this.marks=marks;
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString(){
        return "Student [ "+"Name : "+name+" "+" Marks : "+marks+" "+" ID : "+id+"]";
    }


}

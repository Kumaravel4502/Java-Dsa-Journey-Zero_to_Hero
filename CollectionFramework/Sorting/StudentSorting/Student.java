package CollectionFramework.Sorting.StudentSorting;

public class Student implements Comparable<Student> {
    String name;
    int id;
    double marks;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name : " + name +" , "+ " ID : " + id +" , "+ " Marks : " + marks;
    }

    //     Sort based on id (ascending)
    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
//
    // sort based on names

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }


    // sort based on marks
//    @Override
//    public int compareTo(Student o) {
//        return (int) (o.marks - this.marks);
//    }

}

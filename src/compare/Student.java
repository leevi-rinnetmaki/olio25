package compare;

public class Student implements Compare<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

/*
        @Override
        public int compareTo(Student o){
            if(age == o.age)
                return 0;
        }*/
    }
}

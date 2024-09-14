public class Student {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student o = (Student) obj;
        return this.name.equalsIgnoreCase(o.name);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("name=").append(name)
              .append(", age=").append(age);
        return string.toString();
    }
}

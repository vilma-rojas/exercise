package school;

public class Student {
    private String Name;
    private Qualification qualification;

    public Student(String name, Qualification qualification) {
        Name = name;
        this.qualification = qualification;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}

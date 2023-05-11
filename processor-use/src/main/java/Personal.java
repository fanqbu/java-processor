import org.example.BuildProperty;

public class Personal {
    private String name;

    private String age;

    public String getName() {
        return name;
    }
    @BuildProperty
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    @BuildProperty
    public void setAge(String age) {
        this.age = age;
    }
}

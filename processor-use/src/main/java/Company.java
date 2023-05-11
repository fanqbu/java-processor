import org.example.BuildProperty;

public class Company {

    private String name;

    private String email ;

    public String getName() {
        return name;
    }
    @BuildProperty
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @BuildProperty
    public void setEmail(String email) {
        this.email = email;
    }
}

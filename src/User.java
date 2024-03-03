public class User {
    private String department;
    private int batch;
    private String email;
    private String name;
    private String password;
    private int roll;

    public User( String email, String name,String department, int batch, int roll, String password) {
        this.department = department;
        this.batch = batch;
        this.email = email;
        this.name = name;
        this.password = password;
        this.roll = roll;
    }

    // Getter methods for user properties
    public String getDepartment() {
        return department;
    }

    public int getBatch() {
        return batch;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getRoll() {
        return roll;
    }
}

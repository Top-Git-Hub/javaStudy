public class Demo5 {
    private int id;
    private String username;
    private String password;

    public Demo5() {
    }

    public Demo5(int id, String username, String password) {
        this.username = username;
        this.password = password;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

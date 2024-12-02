public class Log {
   private String username;
   private int password;
   private String id;
   private String phone;

    public Log() {
    }
    public Log(String username, int password, String id, String phone) {
        this.username = username;
        this.password = password;
        this.id =id;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

package musicstore;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
	private String name;
    private String email;
    private String password;
   
  
    
    

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public void printUserInfo(){
        System.out.println("Kullanıcı Adı: " + name);
        System.out.println("E-Postası: " + email);
        System.out.println();
    }
}

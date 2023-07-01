package com.BlueGopherApp.Backend.Users;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Getter
public class appUser {

   private Long id;
   @Getter
   private String firstName;
   @Getter
   private String lastName;
   @Getter
   private String email;
   @Getter
   private String password;
   public boolean isLoggedIn;

    public appUser(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @GetMapping()
    public List<appUser> getUsers(){
        return List.of(
                new appUser(
                        1L,
                        "Terence@aol.com",
                        "test123"
                ));
}
}

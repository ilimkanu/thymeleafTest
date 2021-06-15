package kg.megacom.thymeleaf;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    private Long id;
    @NotBlank
    @Size(min = 10, max = 50, message = "About Me must be between 10 and 50 characters")
    private String name;
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank
    @Size(min = 8, message = "Password should be at least 8 characters long")
    private String password;

    public User(Long id, @NotBlank @Size(min = 10, max = 50, message = "About Me must be between 10 and 50 characters") String name, @Email(message = "Email should be valid") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
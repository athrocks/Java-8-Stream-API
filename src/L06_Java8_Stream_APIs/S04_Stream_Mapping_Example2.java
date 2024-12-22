package L06_Java8_Stream_APIs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class S04_Stream_Mapping_Example2 {
    public static void main(String[] args) {
        // Mapping User to UsrDTO
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Ramesh", "secrete123", "ramesh@gmail.com"));
        users.add(new User(2, "Tony", "secrete456", "tony@gmail.com"));
        users.add(new User(3, "Tom", "secrete789", "tom@gmail:com"));

        // Traditionally

        List<UserDTO> userDTO = new ArrayList<UserDTO>();

        for (User user : users){
            userDTO.add(new UserDTO(user.getId(),user.getUsername(),user.getEmail()));
        }

        for (UserDTO userdto : userDTO){
            System.out.println(userdto);
        }

        System.out.println("------------------------------------------------");

        // Using Java 8 Map method
        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(),user.getUsername(),user.getEmail());
            }
        }).toList().forEach(System.out::println);

        System.out.println("------------------------------------------------");

        // Using Lambda expression instead
        users.stream()
                .map((User user) ->
                        new UserDTO(user.getId(), user.getUsername(),user.getEmail()))
                .toList()
                .forEach(System.out::println);


    }
}

class User{
    private int id;
    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class UserDTO{
    private int id;
    private String username;
    private String email;

    public UserDTO() {
    }

    public UserDTO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
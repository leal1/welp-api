package teamdanny.sideproject.welpapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WelpUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Email(message = "Email should be valid")
////    private String email;
   @NotNull(message="username cannot be null")
    private String username;
    @NotNull(message="password cannot be null")
    @Size(min =5, max = 20, message="password needs to be between 5 and 20 characters")
    private String password;

}

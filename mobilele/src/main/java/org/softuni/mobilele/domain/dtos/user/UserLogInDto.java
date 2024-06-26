package org.softuni.mobilele.domain.dtos.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.softuni.mobilele.validation.annotations.CorrectUser;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@CorrectUser
public class UserLogInDto {
    private String username;
    private String password;
}

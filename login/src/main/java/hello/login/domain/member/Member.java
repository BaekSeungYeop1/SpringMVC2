package hello.login.domain.member;

import lombok.Data;
import org.hibernate.validator.internal.constraintvalidators.bv.time.past.PastValidatorForReadableInstant;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private long id;
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
}

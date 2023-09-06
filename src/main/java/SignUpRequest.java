import java.util.Objects;
import lombok.*;

//@Getter
//@Setter
//@EqualsAndHashCode
@Data
@AllArgsConstructor
//@Builder

public class SignUpRequest {
    private String email;
    @ToString.Exclude
    private String password;
    private Address address;
}

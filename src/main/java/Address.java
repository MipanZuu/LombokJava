import java.util.Objects;
import lombok.*;

//@Getter
//@Setter
//@EqualsAndHashCode
@AllArgsConstructor
//@NoArgsConstructor
@Builder
//@ToString
@Data

public class Address {
    private String street;
    private String number;
    private String complement;
    private String postalCode;
    private String city;
    private String state;
}

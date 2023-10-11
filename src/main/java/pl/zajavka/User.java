package pl.zajavka;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
public class User {
    private final String name;
    private final String surname;
    private final String email;

}

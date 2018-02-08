package scenarios.pageobject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    public static final Contact CONTACT_NATA = new Contact("nata", "123 32 21", "nata@google.com");

    private String name;
    private String phone;
    private String email;
}

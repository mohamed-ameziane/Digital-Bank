package ma.enset.digital_banking.DTOs;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String nom;
    private String email;
}

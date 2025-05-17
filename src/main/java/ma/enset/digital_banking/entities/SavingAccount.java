package ma.enset.digital_banking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CS")
@Data @AllArgsConstructor
@NoArgsConstructor
public class SavingAccount extends BankAccount {
    private double interestRate;
}

package ma.enset.digital_banking.DTOs;

import lombok.Data;
import ma.enset.digital_banking.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date creationDate;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}

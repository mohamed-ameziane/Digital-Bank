package ma.enset.digital_banking.DTOs;

import jakarta.persistence.*;
import lombok.Data;
import ma.enset.digital_banking.entities.AccountOperation;
import ma.enset.digital_banking.entities.Customer;
import ma.enset.digital_banking.enums.AccountStatus;

import java.util.Date;
import java.util.List;

@Data
public class SavingBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date creationDate;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}

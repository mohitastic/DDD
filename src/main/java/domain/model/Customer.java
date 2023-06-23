package domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
    private final List<Account> accounts = new ArrayList<>();
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public void addAccount(String accountName) {
        this.accounts.add(new Account(accountName, address));
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach(account -> account.setAddress(address));
    }
}

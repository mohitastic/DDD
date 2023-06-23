package domain.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldUpdateAddressOfAllBankAccounts() {

        Customer customer = new Customer(new Address("Gurgaon"));

        customer.addAccount("account1");
        customer.addAccount("account2");

        customer.updateAddress(new Address("Bangalore"));

        assertEquals(customer.getAccounts().get(0).getAddress().getCity(), "Bangalore");
        assertEquals(customer.getAccounts().get(1).getAddress().getCity(), "Bangalore");
    }

    @Test
    public void shouldCreateAllBankAccountsWithUpdatedAddress() {

        Customer customer = new Customer(new Address("Gurgaon"));

        customer.updateAddress(new Address("Bangalore"));
        customer.addAccount("account1");
        customer.addAccount("account2");

        assertEquals(customer.getAccounts().get(0).getAddress().getCity(), "Bangalore");
        assertEquals(customer.getAccounts().get(1).getAddress().getCity(), "Bangalore");
    }
}

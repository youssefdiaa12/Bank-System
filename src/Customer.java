import accounts_details.account;

import java.util.List;

public class Customer {

    int id;
    String name;
    String email;
    String phone;
    String address;
    List<account> accounts;

    public Customer(int id, String name, String email, String phone, String address, List<account> accounts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.accounts = accounts;
    }

}

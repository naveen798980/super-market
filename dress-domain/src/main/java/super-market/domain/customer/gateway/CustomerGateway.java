package super-market.domain.customer.gateway;

import super-market.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}

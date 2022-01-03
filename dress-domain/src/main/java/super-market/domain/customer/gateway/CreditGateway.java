package super-market.domain.customer.gateway;

import super-market.domain.customer.Customer;
import super-market.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}

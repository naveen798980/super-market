package super-market.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import super-market.dto.CustomerAddCmd;
import super-market.dto.CustomerListByNameQry;
import super-market.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}

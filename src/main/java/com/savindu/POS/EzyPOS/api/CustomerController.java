package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    public String save(CustomerDto dto){}
    public String find(String id){}
    public String updateCustomer(CustomerDto dto,String id){}
    public String deleteCustomer(String id){}
    public String findAllCustomer(){}
}

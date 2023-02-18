package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    public String save(CustomerDto dto){
        return dto.toString();
    }
    public String find(String id){
        return id+" - Customer";
    }
    public String updateCustomer(CustomerDto dto,String id){
        return dto.toString()+" "+id+" -Updated";
    }
    public String deleteCustomer(String id){
        return id+ "-Deleted";
    }
    public String findAllCustomer(){
        return "All Customers";
    }
}

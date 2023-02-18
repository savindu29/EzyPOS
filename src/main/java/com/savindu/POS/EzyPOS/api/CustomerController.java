package com.savindu.POS.EzyPOS.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/customer")
public class CustomerController {

    public String save(Customer dto){}
    public String find(String id){}
    public String updateCustomer(Customer dto,String id){}
    public String deleteCustomer(String id){}
    public String findAllCustomer(){}
}

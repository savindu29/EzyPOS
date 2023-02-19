package com.savindu.POS.EzyPOS.service;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;

public interface CustomerService {

    public String saveCustomer(CustomerDto dto);
    public String findCustomer(String id);
    public String updateCustomer(CustomerDto dto ,String id);
    public String deleteCustomer(String id);
    public String findAllCustomer();

}

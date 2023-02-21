package com.savindu.POS.EzyPOS.service;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CustomerDto dto);
    public CustomerResponseDto findCustomer(String id);
    public String updateCustomer(CustomerDto dto ,String id);
    public String deleteCustomer(String id);
    public List<CustomerResponseDto> findAllCustomer();

}

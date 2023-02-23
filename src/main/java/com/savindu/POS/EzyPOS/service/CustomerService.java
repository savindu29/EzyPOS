package com.savindu.POS.EzyPOS.service;

import com.savindu.POS.EzyPOS.dto.request.CustomerRequestDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;

import java.util.List;

public interface CustomerService {

    public String saveCustomer(CustomerRequestDto dto);
    public CustomerResponseDto findCustomer(String id) throws ClassNotFoundException;
    public String updateCustomer(CustomerRequestDto dto , String id);
    public String deleteCustomer(String id);
    public List<CustomerResponseDto> findAllCustomer();

}

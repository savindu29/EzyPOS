package com.savindu.POS.EzyPOS.service.impl;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.entity.Customer;
import com.savindu.POS.EzyPOS.repo.CustomerRepo;
import com.savindu.POS.EzyPOS.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDto dto) {
        Customer c1 = new Customer(
                "D001",dto.getName(), dto.getAddress(), dto.getSalary()
        );
        customerRepo.save(c1);
        return null;
    }

    @Override
    public String findCustomer(String id) {

        return null;
    }

    @Override
    public String updateCustomer(CustomerDto dto, String id) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String findAllCustomer() {
        return null;
    }
}

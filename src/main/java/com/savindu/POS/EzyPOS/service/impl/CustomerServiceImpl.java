package com.savindu.POS.EzyPOS.service.impl;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.repo.CustomerRepo;
import com.savindu.POS.EzyPOS.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDto dto) {
        return null;
    }

    @Override
    public String findCustomer(String id) {
        customerRepo.save();
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

package com.savindu.POS.EzyPOS.service.impl;

import com.savindu.POS.EzyPOS.dto.CustomerDto;
import com.savindu.POS.EzyPOS.dto.request.CustomerRequestDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import com.savindu.POS.EzyPOS.dto.response.paginate.PaginatedCustomerResponseDto;
import com.savindu.POS.EzyPOS.entity.Customer;
import com.savindu.POS.EzyPOS.repo.CustomerRepo;
import com.savindu.POS.EzyPOS.service.CustomerService;
import com.savindu.POS.EzyPOS.util.IdGenerator;
import com.savindu.POS.EzyPOS.util.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private IdGenerator idGenerator;

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public String saveCustomer(CustomerRequestDto dto) {
        CustomerDto cDto  = new CustomerDto( idGenerator.generateId(10),dto.getName(), dto.getAddress(), dto.getSalary());

        return customerRepo.save(customerMapper.toCustomer(cDto)).getId()+" Saved!";

    }

    @Override
    public CustomerResponseDto findCustomer(String id) throws ClassNotFoundException {

        Optional<Customer> selectedCustomer = customerRepo.findById(id);
        if(selectedCustomer.isPresent()){
            return customerMapper.toCustomerResponseDto(selectedCustomer.get());
        }
        throw new ClassNotFoundException("Not Found");

    }

    @Override
    public String updateCustomer(CustomerRequestDto dto, String id) throws ClassNotFoundException {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()){
            customer.get().setName(dto.getName());
            customer.get().setAddress(dto.getAddress());
            customer.get().setSalary(dto.getSalary());
            customerRepo.save(customer.get());
            return customer.get().getName()+" was Saved";
        }
        throw new ClassNotFoundException("Not Found");
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return id+" was deleted!";
    }

    @Override
    public PaginatedCustomerResponseDto findAllCustomer(
            String searchText,int page, int size

    ) {
        //create method custom query =? (find data)
        //create method custom query =(count)
        return customerMapper.toCustomerResponseDtoList(customerRepo.findAll());

    }
}

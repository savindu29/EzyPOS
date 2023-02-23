package com.savindu.POS.EzyPOS.service.impl;

import com.savindu.POS.EzyPOS.dto.request.CustomerRequestDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import com.savindu.POS.EzyPOS.entity.Customer;
import com.savindu.POS.EzyPOS.repo.CustomerRepo;
import com.savindu.POS.EzyPOS.service.CustomerService;
import com.savindu.POS.EzyPOS.util.IdGenerator;
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
    @Override
    public String saveCustomer(CustomerRequestDto dto) {
        Customer c1 = new Customer(
                idGenerator.generateId(10),dto.getName(), dto.getAddress(), dto.getSalary()
        );
        customerRepo.save(c1);
        return c1.getId()+" Saved!";
    }

    @Override
    public CustomerResponseDto findCustomer(String id) throws ClassNotFoundException {
        Optional<Customer> selectedCustomer = customerRepo.findById(id);
//        if(selectedCustomer.isPresent()){
//            return selectedCustomer.get();
//        }
//        return null;
        // java 11+
        Customer c = customerRepo.findById(id).orElse(null);
        if(c==null){
            throw new ClassNotFoundException("Not Found");
        }
        return new CustomerResponseDto(
                c.getId(),c.getName(),c.getAddress(),c.getSalary()
        );
    }

    @Override
    public String updateCustomer(CustomerRequestDto dto, String id) {
        Customer c = customerRepo.findById(id).orElse(null);
        if (null==c) return "Not Found";
        c.setName(dto.getName());
        c.setAddress(dto.getAddress());
        c.setSalary(dto.getSalary());
        customerRepo.save(c);
        return c.getName()+" was Updated!";
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return id+" was deleted!";
    }

    @Override
    public List<CustomerResponseDto> findAllCustomer() {
        List<CustomerResponseDto> responseDtoList = new ArrayList<>();
        List<Customer> all = customerRepo.findAll();
        for (Customer c:all) {
            responseDtoList.add(new CustomerResponseDto(
                    c.getId(),
                    c.getAddress(),
                    c.getName(),
                    c.getSalary()
            ));
        }
        return responseDtoList;

    }
}

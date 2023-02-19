package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import com.savindu.POS.EzyPOS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create") // localhost:8000/api/v1/customer/create (POST)
    public String save(@RequestBody CustomerDto dto){
        return customerService.saveCustomer(dto);
    }
    @GetMapping("/{id}") // localhost:8000/api/v1/customer/15 (GET)
    public String find(@PathVariable String id){
        return customerService.findCustomer(id);
    }

    @PutMapping(value = "/modify",params = {"id"}) // localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public String updateCustomer(@RequestBody CustomerDto dto,@RequestParam String id){
        return customerService.updateCustomer(dto,id);
    }

    @DeleteMapping("/remove/{id}") // localhost:8000/api/v1/customer/remove/15 (DELETE)
    public String deleteCustomer(@PathVariable String id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/list") // localhost:8000/api/v1/customer/list (GET)
    public List<CustomerResponseDto> findAllCustomer(){
        return customerService.findAllCustomer();

    }
}

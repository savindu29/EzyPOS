package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.service.CustomerService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    @PostMapping("/create") // localhost:8000/api/v1/customer/create (POST)
    public String save(@PathVariable CustomerDto dto){
        return customerService.saveCustomer(dto);
    }
    @GetMapping("/{id}") // localhost:8000/api/v1/customer/15 (GET)
    public String find(@PathVariable String id){
        return id+" - Customer";
    }

    @PutMapping(value = "/modify",params = {"id"}) // localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public String updateCustomer(@RequestBody CustomerDto dto,@RequestParam String id){
        return dto.toString()+" "+id+" -Updated";
    }

    @DeleteMapping("/remove/{id}") // localhost:8000/api/v1/customer/remove/15 (DELETE)
    public String deleteCustomer(@PathVariable String id){
        return id+ "- Deleted";
    }

    @GetMapping("/list") // localhost:8000/api/v1/customer/list (GET)
    public String findAllCustomer(){
        return "All Customers";
    }
}

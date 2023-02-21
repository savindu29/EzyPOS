package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import com.savindu.POS.EzyPOS.service.CustomerService;
import com.savindu.POS.EzyPOS.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(
            value="/create",
            consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    ) // localhost:8000/api/v1/customer/create (POST)
    public ResponseEntity<StandardResponse> save(@RequestBody CustomerDto dto){
        return new ResponseEntity<>(
                new StandardResponse(
                        201 ,
                        customerService.saveCustomer(dto),
                        null

                ), HttpStatus.CREATED
        );
    }
    @GetMapping("/{id}") // localhost:8000/api/v1/customer/15 (GET)
    public ResponseEntity<StandardResponse> find(@PathVariable String id){
        return new ResponseEntity<>(
                new StandardResponse(
                        200 ,
                        id+" Details!",
                        customerService.findCustomer(id)

                ), HttpStatus.OK
        );
    }

    @PutMapping(value = "/modify",params = {"id"}) // localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDto dto,@RequestParam String id){
        return new ResponseEntity<>(
                new StandardResponse(
                        201 ,
                        customerService.updateCustomer(dto,id),
                        null

                ), HttpStatus.CREATED
        );
    }

    @DeleteMapping("/remove/{id}") // localhost:8000/api/v1/customer/remove/15 (DELETE)
    public ResponseEntity<StandardResponse> deleteCustomer(@PathVariable String id){
        return new ResponseEntity<>(
                new StandardResponse(
                        204 ,
                        customerService.deleteCustomer(id),
                        null

                ), HttpStatus.NO_CONTENT
        );
    }

    @GetMapping("/list") // localhost:8000/api/v1/customer/list (GET)
    public ResponseEntity<StandardResponse> findAllCustomer(){
        return new ResponseEntity<>(
                new StandardResponse(
                        200 ,
                       "Data list",
                        null

                ), HttpStatus.OK
        );

    }
}

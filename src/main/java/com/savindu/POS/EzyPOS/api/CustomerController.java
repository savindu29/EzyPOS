package com.savindu.POS.EzyPOS.api;

import com.savindu.POS.EzyPOS.dto.request.CustomerRequestDto;
import com.savindu.POS.EzyPOS.service.CustomerService;
import com.savindu.POS.EzyPOS.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value="/create" ) // localhost:8000/api/v1/customer/create (POST)
    public ResponseEntity<StandardResponse> save(@RequestBody CustomerRequestDto dto){
        return new ResponseEntity<>(
                new StandardResponse(
                        201 ,
                        customerService.saveCustomer(dto),
                        null

                ), HttpStatus.CREATED
        );
    }
    @GetMapping("/{id}") // localhost:8000/api/v1/customer/15 (GET)
    public ResponseEntity<StandardResponse> find(@PathVariable String id) throws ClassNotFoundException {
        return new ResponseEntity<>(
                new StandardResponse(
                        200 ,
                        id+" Details!",
                        customerService.findCustomer(id)

                ), HttpStatus.OK
        );
    }

    @PutMapping(value = "/modify",params = {"id"}) // localhost:8000/api/v1/customer/modify?id=15 (PUT)
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerRequestDto dto, @RequestParam String id) throws ClassNotFoundException {
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
    // api/v1/customer/list?searchText=sd&page=1&size=10
    @GetMapping(value = "/list", params = {"searchText","page","size"}) // localhost:8000/api/v1/customer/list (GET)
    public ResponseEntity<StandardResponse> findAllCustomer(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ){



        return new ResponseEntity<>(
                new StandardResponse(
                        200 ,
                       "Data list",
                        customerService.findAllCustomer()

                ), HttpStatus.OK
        );

    }
}

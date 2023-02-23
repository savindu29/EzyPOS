package com.savindu.POS.EzyPOS.util.mapper;

import com.savindu.POS.EzyPOS.dto.CustomerDto;
import com.savindu.POS.EzyPOS.dto.request.CustomerRequestDto;
import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import com.savindu.POS.EzyPOS.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toCustomer(CustomerDto dto);
    CustomerResponseDto toCustomerResponseDto(Customer customer);
    List<CustomerResponseDto> toCustomerResponseDtoList(List<Customer> list );
}

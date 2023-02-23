package com.savindu.POS.EzyPOS.dto.response.paginate;

import com.savindu.POS.EzyPOS.dto.response.CustomerResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedCustomerResponseDto {
    private long dataCount;
    private List<CustomerResponseDto> dataList;
}

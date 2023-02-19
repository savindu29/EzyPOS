package com.savindu.POS.EzyPOS.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // @Data ====> @Getter , @Setter , @Hashcode , @ToString, @Equals
public class CustomerResponseDto {
    private String id;
    private String name;
    private String address;
    private double salary;
}

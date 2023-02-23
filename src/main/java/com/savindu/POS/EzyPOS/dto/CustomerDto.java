package com.savindu.POS.EzyPOS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

@NoArgsConstructor
@Data // @Data ====> @Getter , @Setter , @Hashcode , @ToString, @Equals
public class CustomerDto {
    private String id;
    private String name;
    private String address;
    private double salary;
}

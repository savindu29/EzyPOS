package com.savindu.POS.EzyPOS.dto.request;

import lombok.*;

@AllArgsConstructor

@NoArgsConstructor
@Data // @Data ====> @Getter , @Setter , @Hashcode , @ToString, @Equals
public class CustomerDto {
    private String name;
    private String address;
    private double salary;
}

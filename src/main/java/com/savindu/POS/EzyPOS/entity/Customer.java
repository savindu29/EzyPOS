package com.savindu.POS.EzyPOS.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity () //@Entity (name="customer")
public class Customer  {

    @Id
    private String id;
    //@Column (name="Full Name") => change column name to Full name
    private String name;
    private String address;
    private double salary;

}

package com.savindu.POS.EzyPOS.repo;

import com.savindu.POS.EzyPOS.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer,String> {
}

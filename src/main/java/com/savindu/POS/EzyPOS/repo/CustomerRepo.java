package com.savindu.POS.EzyPOS.repo;

import com.savindu.POS.EzyPOS.entity.Customer;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
//
//@EnableJpaRepositories
//public interface CustomerRepo extends JpaRepository<Customer,String> {
//   @Query(value = "SELECT * FROM customer WHERE  name LIKE %?0% OR address LIKE %?00% ", nativeQuery = true)
//    public List<Customer> searchCustomer(String searchText , Pageable pageable);
//
//    @Query(value = "SELECT COUNT(id) FROM customer WHERE  name LIKE %?% OR address LIKE %?0% ", nativeQuery = true)
//    public int countCustomer(String searchText);
//}



@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, String> {

    @Query(value = "SELECT * FROM customer WHERE name LIKE %?1% || address LIKE %?1% ",nativeQuery = true)
    public List<Customer> searchCustomer(String searchText, Pageable pageable);
    /* */
    @Query(value = "SELECT COUNT(id) FROM customer WHERE name LIKE %?1% || address LIKE %?1%",
            nativeQuery = true)
    public long countCustomer(String searchText);
    /* */
}
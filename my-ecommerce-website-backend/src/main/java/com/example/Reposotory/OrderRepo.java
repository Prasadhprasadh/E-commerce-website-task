package com.example.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Order1;

@Repository
public interface OrderRepo extends JpaRepository<Order1, Long>{

}

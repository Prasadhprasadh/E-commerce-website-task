package com.example.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.CheckOut;

public interface CheckoutRepo extends JpaRepository<CheckOut, Long>{

}

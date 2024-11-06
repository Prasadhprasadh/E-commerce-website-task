package com.example.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Product1;

@Repository
public interface ProductRepo extends JpaRepository<Product1,Long> {

}

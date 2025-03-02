package com.flores.v1.repository;

import com.flores.v1.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}

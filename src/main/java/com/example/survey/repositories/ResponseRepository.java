package com.example.survey.repositories;

import com.example.survey.entities.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

    // Optional: custom methods if needed
    List<Response> findByUsername(String username);

}

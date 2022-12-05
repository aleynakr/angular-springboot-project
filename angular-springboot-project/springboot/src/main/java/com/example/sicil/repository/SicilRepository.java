package com.example.sicil.repository;

import com.example.sicil.entity.Sicil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SicilRepository extends JpaRepository<Sicil,Long> {

}

package com.example.sicil.repository;

import com.example.sicil.entity.Resim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResimRepository extends JpaRepository<Resim,Long> {
    Optional<Resim> findById(Long kisi_id);

}

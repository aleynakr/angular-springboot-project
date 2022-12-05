package com.example.sicil.service;

import com.example.sicil.entity.Resim;
import com.example.sicil.repository.ResimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ResimService {
@Autowired
    ResimRepository resimRepository;
//    public List<Resim> getAllActiveImages() {
//        return resimRepository.findAll();
//    }


    public Resim store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Resim Resim = new Resim(fileName, file.getBytes());
        return resimRepository.save(Resim);
    }

    public Resim getFile(Long kisi_id) {
        return resimRepository.findById(kisi_id).get();
    }

    public Stream<Resim> getAllFiles() {
        return resimRepository.findAll().stream();
    }







}
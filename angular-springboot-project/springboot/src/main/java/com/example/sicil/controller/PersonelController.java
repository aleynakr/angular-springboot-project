package com.example.sicil.controller;

import com.example.sicil.dto.SicilDto;
import com.example.sicil.entity.Sicil;
import com.example.sicil.repository.ResimRepository;
import com.example.sicil.repository.SicilRepository;
import com.example.sicil.service.ResimService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/personel")
public class PersonelController {
    @Autowired
    SicilRepository sicilRepository;

    @Autowired
    ResimRepository resimRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    ResimService resimService;


    @GetMapping("/sicil")
    public List<SicilDto> getAllClients() {

        List<Sicil> sicilList = sicilRepository.findAll(
             Sort.by(Sort.Direction.ASC, "adi")
        );
        List<SicilDto> sicilDtoList = sicilList
                .stream()
                .map(sicil-> modelMapper.map(sicil, SicilDto.class))
                .collect(Collectors.toList());
        return sicilDtoList;
    }



     @GetMapping("/sicil/{id}")
     public ResponseEntity<Sicil> getTutorialById(@PathVariable("id") long id) {
         Optional<Sicil> sicil = sicilRepository.findById(id);

         if (sicil.isPresent()) {
             return new ResponseEntity<>(sicil.get(), HttpStatus.OK);
         } else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
     }
     public SicilDto converter(Sicil sicil){
        SicilDto sicilDto = modelMapper.map(sicil,SicilDto.class);
        return sicilDto;
     }

//    @PostMapping("/sicil")
//    public ResponseEntity<Sicil> createPersonel(@RequestBody Sicil sicil) {
//    ...
//    }
//
//    @PutMapping("/sicil/{id}")
//    public ResponseEntity<Sicil> updatePersonel(@PathVariable("id") long id, @RequestBody Sicil sicil) {
//    ...
//    }
//
//    @DeleteMapping("/sicil/{id}")
//    public ResponseEntity<HttpStatus> deletePersonel(@PathVariable("id") long id) {
//    ...
//    }
//*/


//
//    private ResimDto convertResimToDto(Resim resim){
//        ResimDto resimDto =new ResimDto();
//        resimDto.setFotograf(resim.getFotograf());
//        resimDto.setKisi_id(resim.getKisi_id());
//        return resimDto;
//    }
//    public static byte[] decompressZLib(byte[] data) {
//        Inflater inflater = new Inflater();
//        inflater.setInput(data);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//        byte[] buffer = new byte[1024];
//        try {
//            while (!inflater.finished()) {
//                int count = inflater.inflate(buffer);
//                outputStream.write(buffer, 0, count);
//            }
//            outputStream.close();
//        } catch (IOException ioe) {
//        } catch (DataFormatException e) {
//        }
//        return outputStream.toByteArray();
//    }


}

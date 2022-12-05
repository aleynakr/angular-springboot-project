package com.example.sicil.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
@Data
public class ParametreDto {
    private long parametre_id;
    private String tablo_adi;
    private String kodu;
    private String aciklama;
    private int aktif;
    private int siralama;
    private String kategori1;
    private String kategori2;
    private String kategori3;
    private String kategori4;
    private String kategori5;
    private Long modul_id;
}

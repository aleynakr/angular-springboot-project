package com.example.sicil.dto;

import lombok.Data;

import java.sql.Blob;

@Data
public class ResimDto {
    private Long kisi_id;
    private byte[] fotograf;
}

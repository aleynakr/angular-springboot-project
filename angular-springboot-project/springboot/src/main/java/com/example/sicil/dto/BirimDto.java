package com.example.sicil.dto;

import lombok.Data;
@Data
public class BirimDto {

    private long birim_id;
    private String adi;
    private String kurulus;
    private String teskilat;
    private boolean aktif=true;
    private long ust_id;
    private long sira;
    private String saymanlik_no;
    private String kisa_add;
    private long il;
    private String birim_tur;
    private  String kamu_birimkod;
    private long ilce;
    private String yetkili;
    private String alt_dal;
    private long rapor_sira;
    private String banka_kod;
    private String iban_no;
    private long banka_sube_id;
    private long kamu_birimkod2;
    private long terfi_sira;
    private long kys_birim_id;
    private long kamu_birim_kod2;
    private String birim_tur_rapor;

}

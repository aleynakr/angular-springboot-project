package com.example.sicil.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SicilDto  {
    private long id;
    private String sicil_no;
    private String adi;
    private String soyadi;
    private Date baslama_trh;
    private Date bitis_trh;
    private Long birim;
    private Date dogum_trh;
    private String dogum_yeri;
    private String baba_adi;
    private String cinsiyet;
    private String medeni_drm;
    private String kan_grubu;
    private int  il;
    private int ilce;
    private String mah_koy;
    private String cilt_no;
    private String sayfa_no;
    private String ver_neden;
    private Date ver_trh;
    private String ver_nfs_id;
    private String kayit_no;
    private long kimlik_no;
    private String sgk_no;
    private String es_calisma_drm;
    private String asker_drm;
    private String ogr_drm;
    private long cocuk_sayisi;
    private Date evlilik_trh;
    private String ozur_durum;
    private String meslek_bilgisi;
    private long aylik_ucret;
    private String sosyal_haklar;
    private long izin_hak;
    private long izin_kullanilan;
    private String ev_adresi;
    private String telefon;
    private String acil_kisi;
    private String acil_adres;
    private String acil_telefon;
    private String kurum;
}

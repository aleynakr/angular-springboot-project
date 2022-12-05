package com.example.sicil.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "dis_sicil")
public class Sicil {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @NotNull
 @Column
 private Long id;

@Column
 private String sicil_no;

    @Column
    @NotNull
 private String adi;

    @Column
    @NotNull
 private String soyadi;
    @Column
    @NotNull
 private Date baslama_trh;
    @Column
 private Date ayrilis_trh;
    @Column
    private Long birim;
    @Column
    private Date dogum_trh;
    @Column
    private String dogum_yeri;
    @Column
    private String baba_adi;
    @Column
    private String cinsiyet;
    @Column
    private String medeni_drm;
    @Column
    private String kan_grubu;
    @Column
    private Integer  il;
    @Column
    private Integer ilce;
    @Column
    private String mah_koy;
    @Column
    private String cilt_no;
    @Column
    private String sayfa_no;
    @Column
    private String sira_no;
    @Column
    private String ver_neden;
    @Column
    private Date ver_trh;
    @Column
    private String ver_nfs_id;
    @Column
    private String kayit_no;
    @Column
    private Long kimlik_no;
    @Column
    private String sgk_no;
    @Column
    private String es_calisma_drm;
    @Column
    private String asker_drm;
    @Column
    private String ogr_drm;
    @Column
    private Long cocuk_sayisi;
    @Column
    private Date evlilik_trh;
    @Column
    private String ozur_durum;
    @Column
    private String meslek_bilgisi;
    @Column
    private Long aylik_ucret;
    @Column
    private String sosyal_haklar;
    @Column
    private Long izin_hak;
    @Column
    private Long izin_kullanilan;
    @Column
    private String ev_adresi;
    @Column
    private String telefon;
    @Column
    private String acil_kisi;
    @Column
    private String acil_adres;
    @Column
    private String acil_telefon;

    @Column
    @NotNull
    private String kurum;



}

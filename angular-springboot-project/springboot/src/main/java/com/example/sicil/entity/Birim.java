package com.example.sicil.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "per_birim")
public class Birim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private Long birim_id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "birim_id", referencedColumnName = "id")
    @JsonIgnore
    Sicil sicil;

    @NotNull
    @Column
    private String adi;

    @Column
    private String kurulus;


    @Column
    private String teskilat;

    @Column
    private boolean aktif=true;


    @Column
    private long ust_id;

    @NotNull
    @Column
    private long sira;

    @Column
    private String saymanlik_no;

    @Column
    private String kisa_ad;

    @Column
    private long il;

    @Column
    private String birim_tur;


    @Column
    private  String kamu_birimkod;

    @Column
    private long ilce;


    @Column
    private String yetkili;

    @Column
    private String alt_dal;


    @Column
    private long rapor_sira;


    @Column
    private String banka_kod;


    @Column
    private String iban_no;

    @Column
    private long banka_sube_id;

    @Column
    private long kamu_birimkod2;


    @Column
    private long terfi_sira;


    @Column
    private long kys_birim_id;

    @Column
    private long kamu_birim_kod2;

    @Column
    private String birim_tur_rapor;

}

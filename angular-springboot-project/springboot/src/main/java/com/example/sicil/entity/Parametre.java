package com.example.sicil.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="parametre")
public class Parametre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private long parametre_id;

    @NotNull
    @Column
    private String tablo_adi;

    @NotNull
    @Column
    private String kodu;

    @NotNull
    @Column
    private String aciklama;

    @NotNull
    @Column
    private int aktif;

    @Column
    private int siralama;
    @Column
    private String katagori1;
    @Column
    private String katagori2;
    @Column
    private String katagori4;
    @Column
    private String katagori5;

    @Column
    private Long modul_id;





}

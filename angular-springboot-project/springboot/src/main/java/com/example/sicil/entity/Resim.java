package com.example.sicil.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="dis_resim")
public class Resim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column
    private Long kisi_id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kisi_id", referencedColumnName = "id")
    @JsonIgnore
    Sicil sicil;

public Resim(String fileName, byte[] bytes){};
    @NotNull
    @Column( length = 1000)
    @Lob
    private  byte fotograf;

    public Resim() {

    }
}

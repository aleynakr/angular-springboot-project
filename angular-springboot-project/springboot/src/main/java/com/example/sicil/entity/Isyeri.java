package com.example.sicil.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "dis_sicil_isyeri")
public class Isyeri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="id")
    private long isyeri_id;

    @NotNull
    @Column
    private String isyeri_adi;

    @NotNull
    @Column
    private String isyeri_sicil;
}

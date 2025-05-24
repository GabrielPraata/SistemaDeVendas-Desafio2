package com.prata.SistemaDeEvento.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_participante")
public class Participante {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nome;
   private String email;




}

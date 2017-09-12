package com.algaworks.gestaofesta.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Getter @Setter private Long id;

    @Getter @Setter private String nome;

    @Getter @Setter private Integer quantidadeAcompanhantes;

}

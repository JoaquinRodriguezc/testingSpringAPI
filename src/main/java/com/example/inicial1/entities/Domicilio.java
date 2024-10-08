package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @OneToOne()
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}

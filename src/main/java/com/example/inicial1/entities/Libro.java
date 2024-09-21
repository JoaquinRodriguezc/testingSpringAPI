package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "libro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "genero")
    private String genero;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "paginas")
    private int paginas;
    @ManyToMany(cascade = CascadeType.ALL)
    private Autor autor;
}

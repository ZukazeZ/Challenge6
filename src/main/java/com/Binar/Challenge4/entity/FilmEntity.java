
package com.binar.challenge4.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name= "nt_Film")

public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nt_Code")
    private long ntCode;
    @Column(name = "Film_Code")
    private String filmCode;
    @Column(name = "Film_Name")
    private String filmName;
    @Column(name = "Film_Status")
    private String filmStatus;
    @Column(name = "Duration")
    private String filmDuration;
    @Column(name = "genre")
    private String genre;

}

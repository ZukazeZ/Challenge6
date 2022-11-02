//package com.Binar.Challenge4.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//
//@Getter
//@Setter
//@Entity
//@Table(name= "nt_film")
//
//public class FilmEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Film_Code")
//    private long nt_code;
//    @Column(name = "Film Name")
//    private String film_name;
//    @Column(name = "Film Status")
//    private String film_status;
//    @Column(name = "Duration")
//    private String film_duration;
//    @Column(name = "genre")
//    private String genre;
//}
package com.Binar.Challenge4.entity;
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
    private long nt_code;
    @Column(name = "Film_Code")
    private String film_code;
    @Column(name = "Film_Name")
    private String film_name;
    @Column(name = "Film_Status")
    private String film_status;
    @Column(name = "Duration")
    private String film_duration;
    @Column(name = "genre")
    private String genre;

}

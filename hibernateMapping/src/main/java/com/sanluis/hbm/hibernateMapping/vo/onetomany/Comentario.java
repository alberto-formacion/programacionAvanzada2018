package com.sanluis.hbm.hibernateMapping.vo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column
    private String comentario;
    
    @ManyToOne
	@JoinColumn(name="post_id")
    private Post post;

}

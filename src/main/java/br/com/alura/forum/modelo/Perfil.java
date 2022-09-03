package br.com.alura.forum.modelo;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements GrantedAuthority, Serializable {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

	@Override
	public String getAuthority() {
		return this.nome;
	}


}

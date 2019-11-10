package br.com.perfilcar.consumidor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log")
public class Log{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLog;
	private String chave;
	private String conteudo;
	
	public Long getIdLog() {
		return idLog;
	}
	public void setIdLog(Long idLog) {
		this.idLog = idLog;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
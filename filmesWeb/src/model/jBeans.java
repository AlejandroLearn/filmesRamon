package model;

public class jBeans {
	private String id;
	private String titulo;
	private String classificacao;
	private String genero;
	private String top_filmes;
	
	public jBeans() {
		super();
		
	}
	public jBeans(String id, String titulo, String classificacao, String genero, String top_filmes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.classificacao = classificacao;
		this.genero = genero;
		this.top_filmes = top_filmes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTop_filmes() {
		return top_filmes;
	}
	public void setTop_filmes(String top_filmes) {
		this.top_filmes = top_filmes;
	}
	
}

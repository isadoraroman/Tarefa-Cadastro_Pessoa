
public class Endereco {

private Integer numero;
private String rua;
private String bairro;

public Endereco() {
super();
	}

public Endereco(Integer numero, String rua, String bairro) {
super();
this.numero = numero;
this.rua = rua;
this.bairro = bairro;
	}

public Integer getNumero() {
return numero;
}
public void setNumero(Integer numero) {
this.numero = numero;
}
public String getRua() {
return rua;
}
public void setRua(String rua) {
this.rua = rua;
}
public String getBairro() {
return bairro;
}
public void setBairro(String bairro) {
this.bairro = bairro;
}
	}

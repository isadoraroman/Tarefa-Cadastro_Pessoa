
public class Main {
public static void main(String[] args) {

Pessoa pessoa1 = new Pessoa(5, "Amanda", 12);

Pessoa pessoa2 = new Pessoa(3, "Maria", 5);

Pessoa pessoa3 = new Pessoa(4, "Arthur", 40);

Endereco endereco1 = new Endereco(210, "Rua das Pedras", "Pedra Branca");

Endereco endereco2 = new Endereco(328, "Rua das Flores", "Campinas");

Endereco endereco3 = new Endereco(324, "Rua das �rvores","Jardim Eldorado");

System.out.println("O id da pessoa1 � " + pessoa1.getId() + "." + " O nome da pessoa1 � " + pessoa1.getNome() + "." + " A idade da pessoa1 � " + pessoa1.getIdade() + "." + " A rua da pessoa1 � " + endereco1.getRua() + "." + " O n�mero da casa da pessoa1 � " + endereco1.getNumero() + "." + " O bairro que a pessoa1 mora � " + endereco1.getBairro() + ".");
System.out.println("O id da pessoa2 � " + pessoa2.getId() + "." + " O nome da pessoa2 � " + pessoa2.getNome() + "." + " A idade da pessoa2 � " + pessoa2.getIdade() + "." + " A rua da pessoa2 � " + endereco2.getRua() + "." + " O n�mero da casa da pessoa2 � " + endereco2.getNumero() + "." + " O bairro que a pessoa2 mora � " + endereco2.getBairro() + ".");
System.out.println("O id da pessoa3 � " + pessoa1.getId() + "." + " O nome da pessoa3 � " + pessoa3.getNome() + "." + " A idade da pessoa3 � " + pessoa3.getIdade() + "." + " A rua da pessoa3 � " + endereco3.getRua() + "." + " O n�mero da casa da pessoa3 � " + endereco3.getNumero() + "." + " O bairro que a pessoa3 mora � " + endereco3.getBairro() + ".");

}
		}
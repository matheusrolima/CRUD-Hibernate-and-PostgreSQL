package Pessoa;
import javax.persistence.*;

@Entity
@Table(name="pessoa")

public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String name;
	
	@Column(name="ultimonome")
	private String lastName;
	
	@Column(name="cpf")
	private int cpf;
	
	public Person(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}

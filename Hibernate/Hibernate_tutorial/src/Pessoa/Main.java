package Pessoa;
import java.util.Scanner;

import org.hibernate.Session;

import conexao.HibernateUtil;
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		
		Scanner entrada = new Scanner(System.in);
		String linha;
		
		System.out.println("Digite seu nome:");
		linha=entrada.nextLine();
		person.setName(linha);
		
		System.out.println("Digite seu ultimo nome:");
		linha=entrada.nextLine();
		person.setLastName(linha);
		
		System.out.println("Digite seu cpf:");
		int cpf = entrada.nextInt();
		person.setCpf(cpf);
		
		
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		System.out.println("Teste");
		
	}
}


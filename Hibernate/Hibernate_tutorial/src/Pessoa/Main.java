package Pessoa;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import conexao.HibernateUtil;
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		
		Scanner entrada = new Scanner(System.in);
		String linha;
		
		/*System.out.println("Digite seu nome:");
		linha=entrada.nextLine();
		person.setName(linha);
		
		System.out.println("Digite seu ultimo nome:");
		linha=entrada.nextLine();
		person.setLastName(linha);
		
		System.out.println("Digite seu cpf:");
		int cpf = entrada.nextInt();
		person.setCpf(cpf);
		
		
		//Salva no banco
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();*/
		
		
		//Pega do banco
		/*Session sess = HibernateUtil.getSessionFactory().openSession();
		List<Object[]> pessoas = sess.createSQLQuery("select * from pessoa").list();
		
		for(Object[] qry:pessoas)
		{
			System.out.println("Nome = " + qry[1]);
		}
		sess.getTransaction().commit()
		sess.close();*/
		
		
		//Excluindo item
		/*Session sess = HibernateUtil.getSessionFactory().openSession();
		sess.beginTransaction();
		Query q = sess.createSQLQuery("delete from pessoa where id = 1");
		q.executeUpdate();
		sess.getTransaction().commit();
		
		sess.close();*/
		
		//Atualizando dado
		Session sess = HibernateUtil.getSessionFactory().openSession();
		sess.beginTransaction();
		Query q = sess.createSQLQuery("update pessoa set nome = 'Fernanda' where nome = 'Matheus'");
		q.executeUpdate();
		sess.getTransaction().commit();
		
		sess.close();
		
		
		
		
		
	}
}


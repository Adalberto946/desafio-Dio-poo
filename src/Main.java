import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Conteudo;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conteudo curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.calcularxp();
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);	
		bootcamp.getConteudos().add(mentoria1);		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conte�dos conclu�dos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudosInscritos());
	    System.out.println("Total XP: " + devCamila.calcularTotalXp());
		
		System.out.println("*------------------------------*");
		
		System.out.println("*------------------------------*");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudosInscritos());	
		devJoao.progredir();
		System.out.println("Conte�dos conclu�dos Jo�o: " + devJoao.getConteudosConcluidos());
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudosInscritos());	
	    System.out.println("Total XP: " + devJoao.calcularTotalXp());
	}

}

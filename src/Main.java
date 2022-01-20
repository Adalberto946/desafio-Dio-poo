import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(mentoria1);
	}

}

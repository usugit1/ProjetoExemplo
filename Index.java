package exemplo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Index {
	public static void main(String[] args) { // Método main
        String[] alunos = { "João", "Maria", "Pedro", "Ana", "Carlos" };
        try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt"));
			bw.write("LISTA DE NOMES:\n");
			for (int i = 0; i < 5; i++)
				bw.write(alunos[i] + "\n");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

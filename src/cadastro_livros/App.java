package cadastro_livros;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		while (true) {
			String nomedoLivro = JOptionPane.showInputDialog("Digite o título do livro");
			String nomedoAutor = JOptionPane.showInputDialog("Digite o nome do autor do livro");
			String anoDepublic = JOptionPane.showInputDialog("Digite o ano de publicação do livro");
			String[] valores = {"AVENTURA","FANTASIA","FICÇÃO","ROMANCE","TERROR"};
			String seletor = (String) JOptionPane.showInputDialog(null,"Escolha um gênero literário","O tipo de gênero",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
			Livros obecLivro = new Livros(nomedoLivro,nomedoAutor,anoDepublic,seletor);
			Acervo.adicionar(obecLivro);
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais livros?");
			if (escolha==1) {
				break;
			}
		}
		System.out.println(Acervo.listar());
		int buscar = JOptionPane.showConfirmDialog(null, "Buscar livro por gênero?");
		if(buscar==0) {
			String[] valores2 = {"AVENTURA","FANTASIA","FICÇÃO","ROMANCE","TERROR"};
			String seletor2 = (String) JOptionPane.showInputDialog(null,"Escolha um gênero literário","O tipo de gênero",JOptionPane.QUESTION_MESSAGE,null,valores2,valores2[0]);
			Acervo quant = new Acervo();
			System.out.println("Quantidade de livros encontrados por gênero " +seletor2+" = "+quant.buscar(seletor2));
		}
	}

}

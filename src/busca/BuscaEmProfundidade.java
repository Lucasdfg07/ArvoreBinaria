package busca;
import java.util.Stack;

import nos.No;

public class BuscaEmProfundidade {
	private Stack<No> pilhaNos;
	
	private int valorBusca;
	
	private String textoResposta;
	
	public BuscaEmProfundidade(int valorBusca) {
		this.pilhaNos = new Stack<>();
		this.valorBusca = valorBusca;
	}
	
	public boolean isResultadoBusca(No no) {
		return no.getValor() == valorBusca;
	}

	public boolean buscar(No no) {
		// Adiciona objetos da pilha
		this.pilhaNos.add(no);
		
		
		if(isResultadoBusca(no)) {
			// Exibe o caminho
			obterResultadoPai(no);
			return true;
			
		} else {
			// Expande os próximos nós
			if(no.getNoEsquerda() != null && this.buscar(no.getNoEsquerda())) {
				//Tem nó na esquerda
				return true;
			} 
			
			if (no.getNoDireita() != null && this.buscar(no.getNoDireita())) {
				//Tem nó na direita
				return true;	
			}
		}
		
		// Remove objetos da pilha
		this.pilhaNos.pop();
		return false;
	}
	
	private void obterResultadoPai(No no) {
		// Uso da Recursividade para iteração do nó pai
		String retorno = "";
		
		No noValor = no;
		
		retorno = retorno + noValor.getValor();
		
		while (noValor.getNoPai() != null) {
			noValor = noValor.getNoPai();
			
			retorno = noValor.getValor() + " " + retorno;
		}
		
		this.textoResposta = retorno;
		
		System.out.println("O caminho percorrido será: "+ this.textoResposta);
	}	
	
}

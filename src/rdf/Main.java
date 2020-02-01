package rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;

import busca.BuscaEmProfundidade;
import nos.No;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
		//		Model model = FileManager.get().loadModel("/home/ubuntu/eclipse-workspace/RDF-OO/src/data.rdf");
		//		model.write(System.out,"RDF/XML");
		
		No no0 = new No(0);
		No no1 = new No(1);
		No no2 = new No(2);
		No no3 = new No(3);
		No no4 = new No(4);
		No no5 = new No(5);
		No no6 = new No(6);
		
		no0.setNoEsquerda(no1);
		no0.setNoDireita(no2);
		
		no1.setNoEsquerda(no3);
		no1.setNoDireita(no4);
		
		no2.setNoEsquerda(no5);
		no2.setNoDireita(no6);
		
		BuscaEmProfundidade bep = new BuscaEmProfundidade(3);
		
		bep.buscar(no0);
	}

}

package codigo;
import java.util.ArrayList;
import java.util.LinkedList;
public class ConjuntoEspalhamento {
	private List<List<String>> tabela = new ArrayList<List<String>>();
	public ConjuntoEspalhamento() {
	for (int i = 0; i < 26; i++) {
		LinkedList<String> lista = new LinkedList<String>();
		tabela.add(lista);
		}
	}
}



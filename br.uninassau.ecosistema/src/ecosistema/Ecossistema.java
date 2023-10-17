package ecosistema;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {
	private List<SerVivo> seresVivos = new ArrayList<>();
	
	
	public void adicionarServivo(SerVivo serVivo) {
		seresVivos.add(serVivo);
	}

	public List<SerVivo> getSeresVivos() {
		return seresVivos;
	}
	

	
	
}











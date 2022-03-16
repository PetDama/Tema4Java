import java.util.Objects;

public class Carte {
	private int NumarPagini;

	public Carte(int numarPagini) {
		NumarPagini = numarPagini;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NumarPagini);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return NumarPagini == other.NumarPagini;
	}

	@Override
	public String toString() {
		return "Carte [NumarPagini=" + NumarPagini + "]";
	}
	
}
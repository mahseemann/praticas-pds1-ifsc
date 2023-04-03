package ex4;

public class Passaro extends Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Classe animal:" + this.getClasseAnimal() + "\n Ordem:" + this.getOrdem() + "\n Bioma:" + this.getBioma()
				+ "\n alimento:" + this.getAlimento();
	}
}
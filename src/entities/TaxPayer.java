package entities;


//Classe do Contribuinte
public abstract class TaxPayer {

	private String name; // Atributo nome do Contribuinte
	private Double anualIncome; // Atributo rendimento anual
	
	public TaxPayer() {//Construtor padrão
	}

	public TaxPayer(String name, Double anualIncome) {// construtor com argumentos
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//Métodos getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//Método abstrato 
	public abstract  double tax();
	
	
}

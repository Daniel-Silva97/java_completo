package secaoHerancaPolimorfismo.exercicios.exercicioTaxs.entities;

public class Individual extends TaxPayer {
    private Double healthExpendites;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpendites) {
        super(name, anualIncome);
        this.healthExpendites = healthExpendites;
    }

    public Double getHealthExpendites() {
        return healthExpendites;
    }

    public void setHealthExpendites(Double healthExpendites) {
        this.healthExpendites = healthExpendites;
    }

    @Override
    public Double tax() {
        double total;
        double percentual;
        if (anualIncome >= 20000) {
            percentual = 0.25;
            total = (anualIncome * percentual) - (healthExpendites * 0.5);
            return total;
        } else {
            percentual = 0.15;
            total = (anualIncome * percentual) - (healthExpendites * 0.5);
            return total;
        }
    }
}

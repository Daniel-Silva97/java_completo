package secaoHerancaPolimorfismo.exercicios.exercicioTaxs.entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double total;
        double percentual;

        if (numberOfEmployees > 10) {
            percentual = 0.14;
            total = anualIncome * percentual;
            return total;
        } else {
            percentual = 0.16;
            total = anualIncome * percentual;
            return total;
        }
    }
}

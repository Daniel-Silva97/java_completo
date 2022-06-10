package introducaoOrientadaObjeto.exercises.dolarConverter.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calculator(double dollar, double buyDollarQuant){
        return dollar * buyDollarQuant * (1.0 + IOF);
    }

}

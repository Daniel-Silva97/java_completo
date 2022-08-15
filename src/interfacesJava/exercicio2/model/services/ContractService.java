package interfacesJava.exercicio2.model.services;

import interfacesJava.exercicio2.model.entities.Contract;
import interfacesJava.exercicio2.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++){
            Date dueDate = addMonths(contract.getDate(), i);
            // Com base no mês ...
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            // Calculo o juros total
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

            contract.addInstallment(new Installment(dueDate, fullQuota));
        }

    }

    private Date addMonths(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();
    }
}

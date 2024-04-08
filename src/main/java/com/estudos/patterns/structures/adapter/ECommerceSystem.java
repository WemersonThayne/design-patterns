package com.estudos.patterns.structures.adapter;

import com.estudos.patterns.structures.adapter.services.PaymentGateway;

//Classe que interage com o interface de pagamento sem ter
// ligação com qual meio será usado na compra
public class ECommerceSystem {

    private PaymentGateway paymentGateway;

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(double totalAmount) {
        // Processar o pagamento usando o adaptador
        paymentGateway.processPayment(totalAmount);
    }
}

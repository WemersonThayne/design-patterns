package com.estudos.patterns.structures.adapter.adapters;

import com.estudos.patterns.structures.adapter.services.PayPalGateway;
import com.estudos.patterns.structures.adapter.services.PaymentGateway;

public class PayPalAdapter implements PaymentGateway {

    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adaptar a chamada para o método específico do PayPal
        payPalGateway.sendPayment(amount);
    }

}

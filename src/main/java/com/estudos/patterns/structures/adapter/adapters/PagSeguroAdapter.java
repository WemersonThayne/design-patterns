package com.estudos.patterns.structures.adapter.adapters;

import com.estudos.patterns.structures.adapter.services.PagSeguroGateway;
import com.estudos.patterns.structures.adapter.services.PaymentGateway;

public class PagSeguroAdapter implements PaymentGateway {

    private PagSeguroGateway pagSeguroGateway;

    public PagSeguroAdapter(PagSeguroGateway pagSeguroGateway) {
        this.pagSeguroGateway = pagSeguroGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adaptar a chamada para o método específico do Stripe
        pagSeguroGateway.sendPayment(amount);
    }

}

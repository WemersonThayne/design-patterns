package com.estudos.patterns.structures.adapter.adapters;

import com.estudos.patterns.structures.adapter.services.PaymentGateway;
import com.estudos.patterns.structures.adapter.services.StripeGateway;

public class StripeAdapter implements PaymentGateway {

    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Adaptar a chamada para o método específico do Stripe
        stripeGateway.sendPayment(amount);
    }

}

package com.estudos.patterns.structures.adapter;

import com.estudos.patterns.structures.adapter.adapters.PagSeguroAdapter;
import com.estudos.patterns.structures.adapter.adapters.PayPalAdapter;
import com.estudos.patterns.structures.adapter.adapters.StripeAdapter;
import com.estudos.patterns.structures.adapter.services.PagSeguroGateway;
import com.estudos.patterns.structures.adapter.services.PayPalGateway;
import com.estudos.patterns.structures.adapter.services.StripeGateway;

public class Main {

    public static void main(String[] args) {
        ECommerceSystem ecommerceSystem = new ECommerceSystem();

        // Configurar o sistema para usar o adaptador do PayPal
        PayPalAdapter payPalAdapter = new PayPalAdapter(new PayPalGateway());
        ecommerceSystem.setPaymentGateway(payPalAdapter);
        ecommerceSystem.processOrder(100.0);

        // Configurar o sistema para usar o adaptador do Stripe
        StripeAdapter stripeAdapter = new StripeAdapter(new StripeGateway());
        ecommerceSystem.setPaymentGateway(stripeAdapter);
        ecommerceSystem.processOrder(75.0);

        // Configurar o sistema para usar o adaptador do PagSeguro
        PagSeguroAdapter pagSeguroAdapter = new PagSeguroAdapter(new PagSeguroGateway());
        ecommerceSystem.setPaymentGateway(pagSeguroAdapter);
        ecommerceSystem.processOrder(50.0);
    }
}

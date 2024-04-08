package com.estudos.patterns.structures.adapter.services;

public class StripeGateway {

    //Classe que contém as regras de integração, autenticação e comunicação do Stripe
    public void sendPayment(double amount) {
        System.out.println("Processando o pagamento pelo Stripe no valor de: " + amount);
    }
}

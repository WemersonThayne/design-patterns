package com.estudos.patterns.structures.adapter.services;

public class PayPalGateway {

    //Classe que contém as regras de integração, autenticação e comunicação do payPal
    public void sendPayment(double amount) {
        System.out.println("Processando o pagamento pelo PayPal no valor de: " + amount);
    }
}

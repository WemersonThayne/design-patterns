package com.estudos.patterns.structures.adapter.services;

public class PagSeguroGateway {

    //Classe que contém as regras de integração, autenticação e comunicação do Pagseguro
    public void sendPayment(double amount) {
        System.out.println("Processando o pagamento pelo PagSeguro no valor de: " + amount);
    }

}

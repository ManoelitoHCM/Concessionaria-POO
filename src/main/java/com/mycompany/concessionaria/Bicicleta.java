package com.mycompany.concessionaria;

public class Bicicleta extends Veiculo implements ConcessionariaInterface{
    private String motor;

//    public String getMotor() {
//        return motor;
//    }

//    public void setMotor(String motor) {
//        this.motor = motor;
//    }
    
    public Bicicleta(String nome, String cor, int anoFabricacao, int qtd, double preco, String motor){
        super(nome, cor, anoFabricacao, qtd, preco);
        this.motor = motor;
    }


    public void calcularPreco(Veiculo transporte){
        if(this.motor == "Sim"){
            this.precoVenda = 1.2*this.preco;
        } else {
            this.precoVenda = 1.12*this.preco;
        }
        System.out.println("Preço de venda: R$"+Math.round(this.precoVenda*100.0)/100.0);
    }
}

package com.mycompany.concessionaria;

public class Carro extends Veiculo implements ConcessionariaInterface{
    private String tipoCarro;

//    public String getTipoCarro() {
//        return tipoCarro;
//    }

//    public void setTipoCarro(String tipoCarro) {
//        this.tipoCarro = tipoCarro;
//    }
    
    public Carro(String nome, String cor, int anoFabricacao, int qtd, double preco, String tipoCarro){
        super(nome, cor, anoFabricacao, qtd, preco);
        this.tipoCarro = tipoCarro;
    }
    
    public void calcularPreco(Veiculo transporte){
       if(this.anoFabricacao < 2018 && this.tipoCarro == "Sedan"){
            this.precoVenda = 1.3*this.preco;
        } else {
            this.precoVenda = 1.15*this.preco;
        }
        System.out.println("Preço de venda: R$"+Math.round(this.precoVenda*100.0)/100.0);
    }
}

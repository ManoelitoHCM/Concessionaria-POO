package com.mycompany.concessionaria;

public class Caminhao extends Veiculo implements ConcessionariaInterface{
    private String carga3t;

//    public String getCarga3t() {
//        return carga3t;
//    }

//    public void setCarga3t(String carga3t) {
//        this.carga3t = carga3t;
//    }
    
    public Caminhao(String nome, String cor, int anoFabricacao, int qtd, double preco, String carga3t){
        super(nome, cor, anoFabricacao, qtd, preco);
        this.carga3t = carga3t;
    }

    public void calcularPreco(Veiculo transporte){
        if(this.carga3t == "Sim"){
            this.precoVenda = 1.07*this.preco;
        } else {
            this.precoVenda = 1.05*this.preco;
        }
        System.out.println("Preço de venda: R$"+Math.round(this.precoVenda*100.0)/100.0);
    }    
}
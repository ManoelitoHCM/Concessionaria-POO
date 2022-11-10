package com.mycompany.concessionaria;

public class Moto extends Veiculo{
    private String tipoMoto;

//    public String getTipoMoto() {
//        return tipoMoto;
//    }

//    public void setTipoMoto(String tipoMoto) {
//        this.tipoMoto = tipoMoto;
//    }

    public Moto(String nome, String cor, int anoFabricacao, int qtd, double preco, String tipoMoto){
        super(nome, cor, anoFabricacao, qtd, preco);
        this.tipoMoto = tipoMoto;
    }
    
    public void calcularPreco(Veiculo transporte){
       if(this.tipoMoto == "Esportiva" && (this.cor == "Verde" || this.cor == "Vermelha")){
            this.precoVenda = 1.4*this.preco;
        } else {
            this.precoVenda = 1.1*this.preco;
        }
        System.out.println("Preço de venda: R$"+Math.round(this.precoVenda*100.0)/100.0);
    }
}
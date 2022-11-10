package com.mycompany.concessionaria;

public abstract class Veiculo implements ConcessionariaInterface{
    protected String nome;
    protected String cor;
    protected int anoFabricacao;
    protected int qtd;
    protected double preco;
    protected double precoVenda;

//    public String getNome() {
//        return nome;
//    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    //    public String getCor() {
//        return cor;
//    }

//    public void setCor(String cor) {
//        this.cor = cor;
//    }

//    public int getAnoFabricacao() {
//        return anoFabricacao;
//    }

//    public void setAnoFabricacao(int anoFabricacao) {
//        this.anoFabricacao = anoFabricacao;
//    }

//    public int getQtd() {
//        return qtd;
//    }

//    public void setQtd(int qtd) {
//        this.qtd = qtd;
//    }

//    public double getPreco() {
//        return preco;
//    }

//    public void setPreco(double preco) {
//        this.preco = preco;
//    }

//    public double getPrecoVenda() {
//        return precoVenda;
//    }

//    public void setPrecoVenda(double precoVenda) {
//        this.precoVenda = precoVenda;
//    }

    public Veiculo(String nome, String cor, int anoFabricacao, int qtd, double preco){
        this.nome = nome;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public void ImprimirDados(Veiculo transporte){
        System.out.println("Os dados do veículo são: \nNome: "+this.nome+";\nCor: "+this.cor+";");
        System.out.println("Ano de fabricação: "+this.anoFabricacao+"\nQuantidade: "+this.qtd+";");
        System.out.println("Preço de compra: R$"+Math.round(preco*100.0)/100.0);

        if(transporte instanceof Carro){
            ((Carro) transporte).calcularPreco(transporte);
        } else if (transporte instanceof Moto){
            ((Moto) transporte).calcularPreco(transporte);
        } else if (transporte instanceof Caminhao){
            ((Caminhao) transporte).calcularPreco(transporte);
        } else if (transporte instanceof Bicicleta){
            ((Bicicleta) transporte).calcularPreco(transporte);
        }
    }
}
package com.mycompany.concessionaria;

public class Seguro implements ConcessionariaInterface{
    private int tipoSeguro; //1 furto ou roubo, 2 acidente
    private double precoSeguro;

//    public int getTipoSeguro() {
//        return tipoSeguro;
//    }

//    public void setTipoSeguro(int tipoSeguro) {
//        this.tipoSeguro = tipoSeguro;
//    }

//    public double getPrecoSeguro() {
//        return precoSeguro;
//    }

//    public void setPrecoSeguro(double precoSeguro) {
//        this.precoSeguro = precoSeguro;
//    }

    public Seguro(int tipoSeguro){
        this.tipoSeguro = tipoSeguro;
    }
    
    public void calcularPreco(Veiculo transporte){
        if(tipoSeguro == 2 && ((transporte instanceof Carro ) || transporte instanceof Caminhao)){
            this.precoSeguro = 0.03*transporte.precoVenda;
        } else {
            this.precoSeguro = 0.02*transporte.precoVenda;
        }
        System.out.println("Valor do seguro do veículo "+transporte.getClass().getSimpleName()+": R$"+Math.round(precoSeguro*100.0)/100.0);
    }
}
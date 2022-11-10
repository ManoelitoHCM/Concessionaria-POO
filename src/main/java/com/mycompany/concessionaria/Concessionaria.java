package com.mycompany.concessionaria;

public class Concessionaria {

    public static void main(String[] args) {
        Seguro seguro1 = new Seguro(1);        
        
        Carro carro1 = new Carro("Carro 1", "Azul", 2016, 9, 32000, "Hatch");
        carro1.ImprimirDados(carro1);
        seguro1.calcularPreco(carro1);

        //COLOQUEI EM COMENTARIO PORQUE NÃO ACHEI NECESSARIO PELA FORMA QUE CRIEI O CONSTRUTOR, 
        //MAS CASO TIRE DE COMENTARIO O CODIGO FUNCIONA NORMALMENTE TAMBÉM
        
//        carro1.setNome("Fusquinha");
//        carro1.setCor("Azul");
//        carro1.setAnoFabricacao(2016);
//        carro1.setQtd(9);
//        carro1.setPreco(32000);
//        carro1.setTipoCarro("Hatch");
//        seguro1.setTipoSeguro(1);
        
        System.out.println("");
        
        Moto moto1 = new Moto("Moto 1", "Verde", 2015, 8, 13000, "Esportiva");
        moto1.ImprimirDados(moto1);
        seguro1.calcularPreco(moto1);
        
        System.out.println("");
        
        Caminhao caminhao1 = new Caminhao("Caminhão 1", "Cinza", 2022, 2, 120000, "Sim");
        caminhao1.ImprimirDados(caminhao1);
        seguro1.calcularPreco(caminhao1);
        
        System.out.println("");        
        
        Veiculo bicicleta1 = new Bicicleta("Bicicleta 1", "Rosa", 2022, 5, 750, "Sim");
        bicicleta1.ImprimirDados(bicicleta1);
        seguro1.calcularPreco(bicicleta1);        
    }
}
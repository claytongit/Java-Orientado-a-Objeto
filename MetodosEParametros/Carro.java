/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEParametros;

/**
 *
 * @author clayton
 */
public class Carro {
    String modelo;
    String marca;
    int numPassageiros; //Numero de passageiros
    double capCombustivel; //Capacidade de combustivel
    double conCombustivel; //Consumo de combustivel
    
    //Metodo sem Parametro 
    double exibirAutonomia(){
        System.out.print("A autonomia do veiculo é: ");
        
        return capCombustivel * conCombustivel;
    }
    
    //Metodo com Parametro
    double calculoDeCombustivel(double km){
        double qtdCombustivel = km/conCombustivel;
        return qtdCombustivel;
    }
    
}

// public class Carro {

//   String modelo;

//  public Carro(String modelo){
//   this.modelo = modelo;
//  } 

//   public String acelerar(){
//       System.out.println("Acelerando o carro " + modelo);
//       return "oi";
//   }
 
// }
public interface Carro {

    void acelerar();

    void freiar();

    void parar();
  
}

// TODO Interface 
// ! é um contrato onde é colocado funções sem uma logica determinada onde sera implentado em outra classe que terá sua propria logica.
public class rolagens{

      //atributos
      int dados = 5;
      String resultado;
      
      //métodos públicos 
      public void rolar(){
          do {
              System.out.println("Rolando dados!");
  
          }while (dados <= 2);
  
              double random = Math.random();
              int rolagem = (int)(1 + random *(6-1));
              if (rolagem > 3){
                  System.out.println("Sucesso!");
              }else{
                  System.out.println("Falha!");
              }
              System.out.println("Resultado da rolagem: " +rolagem);
         }
      public void habilidade() {
          System.out.println("Os dados são rolados!");    
          System.out.println("O herói rola "+ dados +" dados!");
      }     
      
  }
  
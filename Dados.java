public class Dados{
    public static void main(String[] args) {

    //atributos
    int dados = 4;
    String resultado;
    
    //métodos públicos 
    public void rolar(){
        do {
            System.out.println("Rolando dados!");

        }while (dados <= 1);

            double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            if (rolagem > 3){
                System.out.println("Sucesso!");
            }else{
                System.out.println("Falha!");
            }
            System.out.println("Resultado da rolagem: " +rolagem);
       }
    private int dados;
    public void habilidade() {
        System.out.println("Os dados são rolados!");    
        System.out.println("O herói rola "+ dados +" dados!");
    }     
    
}

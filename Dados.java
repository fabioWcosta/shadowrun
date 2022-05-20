public class Dados{
    public static void main(String[] args) {

        public void rolar(){
        double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            if (rolagem > 3){
                System.out.println("Sucesso!");
            }else{
                System.out.println("Falha!");
            }
            System.out.println(rolagem);
        }
            
    }

}
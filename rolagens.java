public class rolagens{
    int dados = 25;
    double random;
    
    //métodos públicos
    public void rolar(){
        do {
            System.out.println("Rolando dados!");

        }while (dados <= dados );

            random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            if (rolagem > 3){
                System.out.println("Sucesso!");
            }else{
                System.out.println("Falha!");
            }
            System.out.println(rolagem);
        }
        //news

    /*
        public int getRolar(int rolar){
            double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            return rolagem;
        }
        public void setRolar(int resultado) {
            this.resultado = resultado;
        }
    */    
}
public class rolagens{
    int dados = 3;
    double random;
    
    //métodos públicos
    public void rolar(){
        while (dados < dados ) do



        double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            if (rolagem > 3){
                System.out.println("Sucesso!");
            }else{
                System.out.println("Falha!");
            }
            System.out.println(rolagem);
        }

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
public class rolagens{
    int dados = 3;
    int resultado;

        public int getRolar(int rolar){
            double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            return rolagem;
        }
        public void setRolar(int resultado) {
            this.resultado = resultado;
        }

}
public class rolagens{
    int dado;
    int resultado;

        public int getRolar(int rolar){
            double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            //return rolagem;
        }
        public void setRolar() {
            this.resultado = resultado;
        }

}
public class Dados{
    public static void main(String[] args) {
        double random = Math.random();
            int rolagem = (int)(1 + random *(6-1));
            if (rolagem > 3){
                System.out.println();
            }
            System.out.println(rolagem);
    }

}
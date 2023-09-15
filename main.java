public class main {
    public static void main(String[] args) {
        pilhas p1 = new pilhas(10);
        p1.inserir(20); //Lembrando que não consigo retornar esses valores
        p1.inserir(30); // pois, o método inserir está com void e esse não
        p1.inserir(40); // não me retorna nada.
        p1.inserir(50);

        while(!p1.estaVazia()){ //Enquanto p1 não estiver vazia, remova e após imprima
            Object p = p1.remover();
            System.out.println(p);

        }


    }
}

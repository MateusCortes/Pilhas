public class pilhas {
    private int dados;
    private Object [] ArrayPilhas;
    private int PonteiroTopo;

    public pilhas(int p) { //construtor
        dados = p;
        ArrayPilhas = new Object[dados]; //Criei um vetor.
        PonteiroTopo = -1; //Não possuo nada dentro da pilha..
    }
    // A partir de agora eu vou criar os métodos,segue: Inserir, Remover e ver (espiar)

    public void inserir (Object pl) {
        ArrayPilhas[++PonteiroTopo] = pl; //estou inserindo um dado.
    } // Não realizei nenhuma verificação.

    public Object remover() { //Remove item do topo da pilha
        return ArrayPilhas[PonteiroTopo--];
    }

    public Object espiar () {
        return ArrayPilhas[PonteiroTopo]; // Aqui eu consigo verificar o topo da pilha
    }

    //A partir de agora eu irei criar as verificações:
    //Está cheia || Está vazia

        public boolean estaVazia() { //Verdadeiro se pilha estiver vazia
        return (PonteiroTopo == -1);
        }

        public boolean estaCheia() { //Verdadeiro se pilha estiver cheia
        return (PonteiroTopo == dados - 1);
        }

}


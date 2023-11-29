public class Hash { //COM RESERVA
    int tabela[];
    int m1, m2, m, reserva; //m1 é o tamanho da tabela, m2 é o tamanho da reserva
    //m é o tamanho das 2 juntas e reserva é a quantidade de elementos atual da reserva
    final int NULO = -1;

    public Hash(){
        this(13,7);
    }

    public Hash(int m1, int m2)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.m = m1 + m2;
        this.tabela = new int[this.m]
        for(int i = 0; i < m1; i++)
        {
            tabela[i] = NULO; //setando os elementos como nulo
        }
        reserva = 0; //setando a quantidade de elementos da reserva como 0
    }
    
    int h(int elemento)
    {
        return elemento % m1;
    }

    public boolean inserir(int elemento)
    {
        boolean resp = false;
        if (elemento != NULO)
        {
            int pos = h(elemento);
            if(tabela[pos] == NULO)
            {
                tabela[pos] = elemento;
                resp = true;
            }
            else if(reserva < m2) //se a reserva nao esta cheia
            {
                tabela[m1+reserva] = elemento; //insere o elemento na reserva
                reserva++;
                resp = true;
            }
        }
        return resp;
    }

    public boolean pesquisar(int elemento)
    {
        boolean resp = false;
        if (elemento != NULO)
        {
            int pos = h(elemento);
            if(tabela[pos] == elemento)
            {
                resp = true;
            }
            else if(tabela[pos] != NULO)
            {
                for(int i = 0; i < reserva; i++)
                {
                    if(tabela[m1+i] == elemento)
                    {
                        return true;
                        i = reserva; //para sair do for
                    }

                }
            }
            
        }
        return resp;
    }
    
    public boolean remover(int elemento)
    {
        boolean resp = false;
        if(elemento != NULO)
        {
            resp = false;
            
        }
        
    }
    public static void main(String[] args) {
        
    }
}

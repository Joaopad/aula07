package application.model; //nome da pasta que seria application

public class Tarefa extends AbstractAtividade { //o extend chama o que ta no abstractatividade 
 private boolean concluido; //boolean ele vai receber verdadeiro ou falso

    public void setConcluido(boolean concluido ) { //set vai receber paramentro com tipo dado interno e get vai sempre retorna dado interno
        this.concluido = concluido;

    }
    public boolean getConcluido(){
        return this.concluido;
    }
    //quando eu nao crio um contrutor o java cria um sozinho e ele esta vazio 
    public Tarefa(String descricao, boolean concluido) {
        this.setDescricao(descricao);
        this.setConcluido(concluido); 
    }
    public Tarefa() {} //esse aqui é  um construtor vazio ele nao recebe paramentro 
    public Tarefa(String descricao) { //esse construtor so vai recebe oq ta na descricao       
        this.setDescricao(descricao);
        this.setConcluido(false);
    }
    @Override 
    public String getDetalhes(){
        return "[T]" + this.getDescricao();
    }
}
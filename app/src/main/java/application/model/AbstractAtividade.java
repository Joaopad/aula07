package application.model;
// se ela tem um metodo abristato tem que declara que e abstrato 
public abstract class AbstractAtividade  implements Atividades { //ele vai implementar o arquivo atividade 
        private String descricao;

        public void setDescricao(String descricao){
            this.descricao = descricao; // descricao = descricao o que ta apos = esta no String descricao
        }
        public String getDescricao(){
            return this.descricao; 
        } 
}
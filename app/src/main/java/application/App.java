package application;

import application.model.Tarefa; //ele importa no tarefa

public class App {
    public static void main(String[] args) {
       Tarefa t = new Tarefa(); //cria um objeto tipo tarefa e guarda no t 
       t.setDescricao("teste da tarefa");
       t.setConcluido(false);

       System.out.println(t.getDescricao()); //ele  coloca oq ta escrito no getdescricao

        Tarefa t2 = new Tarefa("segunda Tarefa");
        System.out.println(t2.getDescricao());
    }
}
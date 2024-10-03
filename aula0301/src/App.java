public class App {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        Tarefa tarefa1 = new Tarefa("Finalizar relatório", "alta");
        Tarefa tarefa2 = new Tarefa("Lavar a louça", "baixa");

        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);

        gerenciador.listarTarefas();

        gerenciador.marcarConcluida(0);
        gerenciador.listarTarefas();

        gerenciador.listarTarefasPrioridade("baixa");
    }
}
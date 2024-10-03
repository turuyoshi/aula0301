class GerenciadorTarefas {
    private Tarefa[] tarefas;
    private int contador;

    public GerenciadorTarefas() {
        tarefas = new Tarefa[50]; // Vetor com capacidade para 50 tarefas
        contador = 0;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (contador < tarefas.length) {
            tarefas[contador++] = tarefa;
        } else {
            System.out.println("Limite de tarefas atingido.");
        }
    }

    public void removerTarefa(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[posicao] = tarefas[contador - 1]; // Substitui pela última tarefa
            tarefas[contador - 1] = null;
            contador--;
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void marcarConcluida(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[posicao].marcarConcluida();
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarTarefas() {
        if (contador == 0) {
            System.out.println("Nenhuma tarefa.");
            return;
        }
        System.out.println("Tarefas pendentes:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("pendente")) {
                System.out.println(tarefas[i].toString());
            }
        }
        System.out.println("\nTarefas concluídas:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("concluída")) {
                System.out.println(tarefas[i].toString());
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade) {
        System.out.println("Tarefas com prioridade " + prioridade + ":");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getPrioridade().equals(prioridade)) {
                System.out.println(tarefas[i].toString());
            }
        }
    }
}
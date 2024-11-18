import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        System.out.println("UNIFAN - ALFREDO NASSER");
        System.out.println("Andressa Souza Bastos");
        System.out.println("Nome do Professor: Breno Pimenta");
        System.out.println("Se prepare! Você responderá 15 perguntas de múltipla escolha sobre o Mundo dos Famosos.");
        System.out.println();

        // Criação das questões
        List<Questao> questoes = new ArrayList<>();
        criarQuestões(questoes);

        // contagem de acertos
        int acertos = 0;
        int total = questoes.size();

        // Início do Quiz
        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        // Resultados
        System.out.println("Você acertou: " + acertos + " de " + total + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", (acertos * 100.0 / total));
    }

    private static void criarQuestões(List<Questao> questoes) {

        questoes.add(criarQuestao("1-Qual foi o namoro mais polêmico de Selena Gomez?", "A) Justin Bieber", "B) The Weeknd", "C) Benny Blanco", "D) Nick Jonas", "E) Taylor Lautner", "A"));

        questoes.add(criarQuestao("2-Quantos Grammys Taylor Swift já ganhou?", "A) 10", "B) 14", "C) 15", "D) 13", "E) 20", "B"));

        questoes.add(criarQuestao("3-Qual o nome do filho de Justin Bieber", "A) Jack", "B) Ben", "C) Harry", "D) Justin", "E) Ed", "A"));

        questoes.add(criarQuestao("4-Qual a profissão de Billie Elish", "A) Atriz", "B) Cantora", "C) Influencer", "D) Produtora", "E) Roteirista", "B"));

        questoes.add(criarQuestao("5-Andressa Urach ficou conhecida por ficar em segundo lugar num famoso concurso. Qual o nome desse concurso?", "A) Miss Bumbum", "B) Miss Universo", "C) Miss Brasil", "D) Mr. Olympia", "E) Sistema", "A"));

        questoes.add(criarQuestao("6-Qual o nome de Guerra da vice miss bumbum Andressa Urach?", "A) Safira", "B) Ímola", "C) Atenas", "D) Sabrina", "E) Andressa", "B"));

        questoes.add(criarQuestao("7-Qual foi a atriz brasileira indicada ao Oscar?", "A) Fernanda Torres", "B) Fernanda Montenegro", "C) Fernanda Vasconcelos", "D) Maria Fernanda Candido", "E) Fernanda Alves", "B"));

        questoes.add(criarQuestao("8-A irmã do ex BBB Davi participou do reality show a Fazenda, qual o seu nome?", "A) Yotra", "B) Alicia", "C) Raquel Brito", "D) Juliana Bonde", "E) Chinesa", "C"));

        questoes.add(criarQuestao("9-Qual o nome do atual namorado da Taylor Swift", "A) Joe Jonas", "B) Joe Alwyn", "C) Jonh Mayer", "D) Travis Kelce", "E) Jonh Kenedy", "D"));

        questoes.add(criarQuestao("10-Nome da marca de maquiagem da cantora Selena Gomes?", "A) Rare Beauty", "B) Fenty Beauty", "C) Rhode", "D) Ruby Kisses", "E) Bauny", "A"));

        questoes.add(criarQuestao("11-Qual a decendência da cantora Selena Gomes?", "A) México", "B) Espanha", "C) Porto Rico", "D) Argentina", "E) Portugal", "A"));

        questoes.add(criarQuestao("12-Qual Jonas Brothers namorou a cantora Demi Lovato", "A) Nick Jonas", "B) Joe Jonas", "C) Kevin Jonas", "D) Todos", "E) Nenhum", "B"));

        questoes.add(criarQuestao("13-?", "A) Organismo que consome outros seres vivos", "B) Organismo que produz seu próprio alimento", "C) Organismo que não pode viver fora da água", "D) Organismo que vive em simbiose", "E) Organismo que se adapta ao ambiente", "B"));

        questoes.add(criarQuestao("14-Qual é o principal componente do sangue responsável pelo transporte de oxigênio?", "A) Plasma", "B) Glóbulos brancos", "C) Glóbulos vermelhos", "D) Plaquetas", "E) Fibrinogênio", "C"));

        questoes.add(criarQuestao("15-Qual é o ciclo da água?", "A) Processo de poluição da água", "B) Movimento contínuo da água na Terra", "C) Filtração da água", "D) Tratamento da água", "E) Aumento do nível do mar", "B"));
    }

    private static Questao criarQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        return questao;
    }
}
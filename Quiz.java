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

        questoes.add(criarQuestao("Quantos Grammys Taylor Swift já ganhou?", "A) 10", "B) 14", "C) 15", "D) 13", "E) 20", "B"));

        questoes.add(criarQuestao("Qual o nome do filho de Justin Bieber", "A) Jack", "B) Ben", "C) Harry", "D) Justin", "E) Ed", "A"));

        questoes.add(criarQuestao("Qual a profissão de Billie Elish", "A) Atriz", "B) Cantora", "C) Influencer", "D) Produtora", "E) Roteirista", "B"));

        questoes.add(criarQuestao("Andressa Urach ficou conhecida por ficar em segundo lugar num famoso concurso. Qual o nome desse concurso?", "A) Miss Bumbum", "B) Miss Universo", "C) Miss Brasil", "D) Mr. Olympia", "E) Sistema", "A"));

        questoes.add(criarQuestao("Qual é o elemento químico representado pela letra 'O'?", "A) Ouro", "B) Oxigênio", "C) Ósmio", "D) Oxido", "E) Ozone", "B"));

        questoes.add(criarQuestao("Qual é a principal fonte de energia para a Terra?", "A) Vento", "B) Sol", "C) Água", "D) Geotérmica", "E) Nuclear", "B"));

        questoes.add(criarQuestao("Qual é o gás mais abundante na atmosfera da Terra?", "A) Oxigênio", "B) Hidrogênio", "C) Nitrogênio", "D) Dióxido de carbono", "E) Metano", "C"));

        questoes.add(criarQuestao("O que é um ecossistema?", "A) Comunidade de organismos interagindo com seu ambiente", "B) Uma só espécie de planta", "C) Um habitat aquático", "D) Uma cadeia alimentar", "E) Um grupo de células", "A"));

        questoes.add(criarQuestao("Qual é o processo pelo qual as plantas liberam vapor de água?", "A) Transpiração", "B) Evaporação", "C) Condensação", "D) Precipitação", "E) Sublimação", "A"));

        questoes.add(criarQuestao("Quem propôs a teoria da evolução das espécies?", "A) Isaac Newton", "B) Albert Einstein", "C) Charles Darwin", "D) Nikola Tesla", "E) Galileo Galilei", "C"));

        questoes.add(criarQuestao("Qual é a camada mais externa da Terra?", "A) Núcleo", "B) Manto", "C) Crosta", "D) Atmosfera", "E) Hidrosfera", "C"));

        questoes.add(criarQuestao("O que é um organismo autotrófico?", "A) Organismo que consome outros seres vivos", "B) Organismo que produz seu próprio alimento", "C) Organismo que não pode viver fora da água", "D) Organismo que vive em simbiose", "E) Organismo que se adapta ao ambiente", "B"));

        questoes.add(criarQuestao("Qual é o principal componente do sangue responsável pelo transporte de oxigênio?", "A) Plasma", "B) Glóbulos brancos", "C) Glóbulos vermelhos", "D) Plaquetas", "E) Fibrinogênio", "C"));

        questoes.add(criarQuestao("Qual é o ciclo da água?", "A) Processo de poluição da água", "B) Movimento contínuo da água na Terra", "C) Filtração da água", "D) Tratamento da água", "E) Aumento do nível do mar", "B"));
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
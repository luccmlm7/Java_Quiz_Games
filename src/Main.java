
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //exibi o cabecalho na tarefa
        Cabecalho cabecalho = new Cabecalho();
        cabecalho.escreverCabecalho();

        //lista de questoes
        List<Questao> questoes = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            questoes.add(new Questao());
        }

        questoes.get(0).pergunta = "1. Qual foi o primeiro jogo de videogame a ter a funcionalidade de salvar o progresso (save na fita)?";
        questoes.get(0).opcaoA = "A) Super Mario Bros";
        questoes.get(0).opcaoB = "B) Metroid";
        questoes.get(0).opcaoC = "C) The Legend of Zelda";
        questoes.get(0).opcaoD = "D) Final Fantasy";
        questoes.get(0).opcaoE = "E) Dragon Quest";
        questoes.get(0).correta = "C";

        questoes.get(1).pergunta = "2. O famoso 'Konami Code' (Cima, Cima, Baixo, Baixo...) apareceu pela primeira vez em qual jogo?";
        questoes.get(1).opcaoA = "A) Gradius";
        questoes.get(1).opcaoB = "B) Contra";
        questoes.get(1).opcaoC = "C) Castlevania";
        questoes.get(1).opcaoD = "D) Metal Gear";
        questoes.get(1).opcaoE = "E) Street Fighter";
        questoes.get(1).correta = "A";

        questoes.get(2).pergunta = "3. Qual era o nome original do personagem Mario antes de ser batizado pela Nintendo?";
        questoes.get(2).opcaoA = "A) Plumber Man";
        questoes.get(2).opcaoB = "B) Jumpman";
        questoes.get(2).opcaoC = "C) Mr. Video";
        questoes.get(2).opcaoD = "D) Red Cap";
        questoes.get(2).opcaoE = "E) Luigi";
        questoes.get(2).correta = "B";

        questoes.get(3).pergunta = "4. Qual jogo de Atari e considerado o maior fracasso comercial e teve seus cartuchos enterrados no deserto?";
        questoes.get(3).opcaoA = "A) Pac-Man";
        questoes.get(3).opcaoB = "B) E.T. the Extra-Terrestrial";
        questoes.get(3).opcaoC = "C) Superman";
        questoes.get(3).opcaoD = "D) Indiana Jones";
        questoes.get(3).opcaoE = "E) Custer's Revenge";
        questoes.get(3).correta = "B";

        questoes.get(4).pergunta = "5. Em que ano o primeiro PlayStation foi lancado no Japao?";
        questoes.get(4).opcaoA = "A) 1993";
        questoes.get(4).opcaoB = "B) 1994";
        questoes.get(4).opcaoC = "C) 1995";
        questoes.get(4).opcaoD = "D) 1996";
        questoes.get(4).opcaoE = "E) 1997";
        questoes.get(4).correta = "B";

        questoes.get(5).pergunta = "6. Qual e o console de videogame mais vendido de todos os tempos?";
        questoes.get(5).opcaoA = "A) Nintendo DS";
        questoes.get(5).opcaoB = "B) PlayStation 4";
        questoes.get(5).opcaoC = "C) Nintendo Switch";
        questoes.get(5).opcaoD = "D) PlayStation 2";
        questoes.get(5).opcaoE = "E) Xbox 360";
        questoes.get(5).correta = "D";

        questoes.get(6).pergunta = "7. Quem foi o criador original do jogo Minecraft?";
        questoes.get(6).opcaoA = "A) Shigeru Miyamoto";
        questoes.get(6).opcaoB = "B) Hideo Kojima";
        questoes.get(6).opcaoC = "C) Markus Persson";
        questoes.get(6).opcaoD = "D) Gabe Newell";
        questoes.get(6).opcaoE = "E) Todd Howard";
        questoes.get(6).correta = "C";

        questoes.get(7).pergunta = "8. Qual jogo ajudou a popularizar o genero 'Battle Royale' antes do grande sucesso do Fortnite?";
        questoes.get(7).opcaoA = "A) Apex Legends";
        questoes.get(7).opcaoB = "B) H1Z1";
        questoes.get(7).opcaoC = "C) DayZ";
        questoes.get(7).opcaoD = "D) PUBG";
        questoes.get(7).opcaoE = "E) Call of Duty: Warzone";
        questoes.get(7).correta = "D";

        questoes.get(8).pergunta = "9. Qual foi o primeirissimo Pokemon criado pela desenvolvedora Game Freak?";
        questoes.get(8).opcaoA = "A) Pikachu";
        questoes.get(8).opcaoB = "B) Bulbasaur";
        questoes.get(8).opcaoC = "C) Rhydon";
        questoes.get(8).opcaoD = "D) Mew";
        questoes.get(8).opcaoE = "E) Charmander";
        questoes.get(8).correta = "C";

        questoes.get(9).pergunta = "10. No jogo Skyrim, qual frase dita por guardas se tornou um grande meme na internet?";
        questoes.get(9).opcaoA = "A) Fus Ro Dah!";
        questoes.get(9).opcaoB = "B) Pare ai mesmo, escoria criminosa!";
        questoes.get(9).opcaoC = "C) Eu costumava ser um aventureiro, ate que levei uma flechada no joelho.";
        questoes.get(9).opcaoD = "D) Voce vai muito ao Distrito das Nuvens?";
        questoes.get(9).opcaoE = "E) Deixe-me adivinhar, alguem roubou seu doce.";
        questoes.get(9).correta = "C";

        questoes.get(10).pergunta = "11. O personagem Master Chief e o protagonista principal de qual franquia famosa?";
        questoes.get(10).opcaoA = "A) Gears of War";
        questoes.get(10).opcaoB = "B) Destiny";
        questoes.get(10).opcaoC = "C) Halo";
        questoes.get(10).opcaoD = "D) Mass Effect";
        questoes.get(10).opcaoE = "E) Doom";
        questoes.get(10).correta = "C";

        questoes.get(11).pergunta = "12. Qual destas NAO e uma classe de personagem real no World of Warcraft original?";
        questoes.get(11).opcaoA = "A) Paladino";
        questoes.get(11).opcaoB = "B) Bruxo";
        questoes.get(11).opcaoC = "C) Bardo";
        questoes.get(11).opcaoD = "D) Cacador";
        questoes.get(11).opcaoE = "E) Sacerdote";
        questoes.get(11).correta = "C";

        questoes.get(12).pergunta = "13. O 'Creeper' de Minecraft foi criado por causa de um erro no codigo ao tentar fazer qual animal?";
        questoes.get(12).opcaoA = "A) Vaca";
        questoes.get(12).opcaoB = "B) Ovelha";
        questoes.get(12).opcaoC = "C) Cachorro";
        questoes.get(12).opcaoD = "D) Porco";
        questoes.get(12).opcaoE = "E) Galinha";
        questoes.get(12).correta = "D";

        questoes.get(13).pergunta = "14. Qual foi a principal inovacao de hardware trazida pelo controle do Nintendo 64?";
        questoes.get(13).opcaoA = "A) Conexao sem fio";
        questoes.get(13).opcaoB = "B) Microfone embutido";
        questoes.get(13).opcaoC = "C) Direcional analogico";
        questoes.get(13).opcaoD = "D) Sensor de movimento";
        questoes.get(13).opcaoE = "E) Botoes de ombro";
        questoes.get(13).correta = "C";

        questoes.get(14).pergunta = "15. Na franquia Mortal Kombat, o nome do lutador Ermac surgiu do que?";
        questoes.get(14).opcaoA = "A) Apelido de um desenvolvedor";
        questoes.get(14).opcaoB = "B) Um erro de digitacao";
        questoes.get(14).opcaoC = "C) Uma abreviacao para 'Error Macro'";
        questoes.get(14).opcaoD = "D) Traducao de uma palavra japonesa";
        questoes.get(14).opcaoE = "E) Um concurso de fas";
        questoes.get(14).correta = "C";

        //Variavel Para Armazenar a quantidade de acertos
        int acertos = 0;

        for (int i = 0; i < 15; i++) {
            Questao q = questoes.get(i);
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        //Calcula a media de acertos
        double media = ((double) acertos / 15.0) * 100.0;

        System.out.println("========================================");
        System.out.println("Resultados Finais:");
        System.out.println("Voce acertou " + acertos + " de 15 questoes.");
        System.out.printf("Sua media de acerto foi de %.2f%%\n", media);
        System.out.println("Muito obrigado por jogar nosso Quiz!");
        System.out.println("========================================");
    }
}

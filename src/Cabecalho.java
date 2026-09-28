public class Cabecalho {
    String faculdade = "Universidade ESN2";
    String aluno = "Lucca Milhomem Aureliano";
    String professor = "Brenno Pimenta";
    String tema = "História dos Videogames e Cultura Nerd";

    public void escreverCabecalho() {
        System.out.println("========================================");
        System.out.println("Faculdade: " + this.faculdade);
        System.out.println("Aluno: " + this.aluno);
        System.out.println("Professor: " + this.professor);
        System.out.println("Tema: " + this.tema);
        System.out.println("========================================");
        System.out.println();
    }
}

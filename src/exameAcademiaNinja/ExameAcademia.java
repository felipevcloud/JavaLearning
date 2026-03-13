package exameAcademiaNinja;

public class ExameAcademia {
    public static void main(String[] args) {

        Aluno naruto = new Aluno("Naruto", 10.0, 9.0, 8.0);
        Aluno tanjiro = new Aluno("Tanjiro", 7.0, 7.0, 7.0);
        Aluno deku = new Aluno("Deku", 6.0, 5.5, 6.0);
        Aluno gojo = new Aluno("Gojo", 9.5, 9.0, 10.0);
        Aluno sakura = new Aluno("Sakura", 7.0, 6.5, 7.0);
        Aluno estrela = naruto;

        Aluno[] alunos = new Aluno[5];
        alunos[0] = naruto; alunos[1] = tanjiro; alunos[2] = deku; alunos[3] = gojo;  alunos[4] = sakura;

        for (Aluno aluno : alunos) {
            double media;
            System.out.println("Aluno: " + aluno.nome);

            media = (aluno.nota1 + aluno.nota2 + aluno.nota3)/3;
            System.out.printf("Média: %.2f\n", media );

            if(media >= 7.0){
                System.out.println("Resultado: Aprovado\n");
            } else {
                System.out.println("Resultado: Reprovado\n");
            }

            if(media > (estrela.nota1 + estrela.nota2 + estrela.nota3)/3){
                estrela = aluno;
            }
        }
        System.out.println("Aluno com maior média: " + estrela.nome);
        System.out.printf("Média: %.2f\n", (estrela.nota1 + estrela.nota2 + estrela.nota3)/3 );
    }
}
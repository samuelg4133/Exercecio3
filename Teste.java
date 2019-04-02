public class Teste {
    public static void main(String [] args){
        Professor p1 = new Professor();
        Professor p2 = new Professor();
        Professor p3 = new Professor();
        
        p1.codigoProfessor=1;
        p1.cpf="171.256.899-00";
        p1.nome="Mauro Augusto Agnelli";
        
        p2.codigoProfessor=2;
        p2.cpf="357.659.143-13";
        p2.nome="João Marcos Rezende";
        
        p3.codigoProfessor=3;
        p3.cpf="113.225.876-01";
        p3.nome="Saulo Silva";
        
        //Criando objetos e atribuindo valores à classe Professor
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        
        a1.codigoAluno=1;
        a1.cpf="099.154.266-60";
        a1.nome="Samuel Gomes Vieira";
        
        a2.codigoAluno=2;
        a2.cpf="069.194.266-60";
        a2.nome="Alan José da Mota";
        
        a3.codigoAluno=3;
        a3.cpf="123.768.976-80";
        a3.nome="Marco Antônio Travaglini";
        
        //Criando objetos e atribuindo valores à classe Aluno
        
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
        
        d1.codigoDisciplina=1;
        d1.codigoProfessor=1;
        d1.nomeDisciplina="AED I";
        
         d2.codigoDisciplina=2;
        d2.codigoProfessor=2;
        d2.nomeDisciplina="AED II";
        
         d3.codigoDisciplina=3;
        d3.codigoProfessor=3;
        d3.nomeDisciplina="AED III";
        
        //Criando objetos e atribuindo valores à classe Aluno
        
        System.out.println( p1.nome+"\n"+p2.nome+"\n"+p3.nome+"\n");
        System.out.println( a1.nome+"\n"+a2.nome+"\n"+a3.nome+"\n");
        System.out.println( d1.nomeDisciplina+"\n"+d2.nomeDisciplina+"\n"+d3.nomeDisciplina+"\n");
    }
}

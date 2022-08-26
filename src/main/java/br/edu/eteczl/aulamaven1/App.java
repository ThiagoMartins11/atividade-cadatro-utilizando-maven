package br.edu.eteczl.aulamaven1;

import com.etec.util.DayTime;
import com.etec.util.IO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IO io = new IO();
        
        Aluno aluno = new Aluno();
        
        DayTime dayTime = new DayTime();
        
        io.setTexto("Programa de Cadastro");
        
        io.exibirTexto();
        
        aluno.setNome(io.digitarTexto("Digite seu nome: "));
        
        aluno.setIdade(Integer.parseInt(io.digitarTexto("Digite sua idade: ")));
        
        aluno.setFumante(Boolean.parseBoolean(io.digitarTexto("Digite true fumante e false para não fumante: ")));
        
        io.setTexto("Cadatrio Realizado: \n\n +" + 
        
        		"Nome: " + aluno.getNome() + "\n" + 
        		"Idade: " + aluno.getIdade() + "\n" +
        		"Fumante: " + aluno.isFumante() + "\n\n" + 
        		"Data: " + dayTime.getData() + "\n" + 
        		"Hora: " + dayTime.getHora()
        );
        		
        io.exibirTexto();
    }
}

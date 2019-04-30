package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * @author Seiji
 */
@SpringBootApplication
@Controller
public class Configuracao
{

    public static void main(String[] args)
    {
        SpringApplication.run(Configuracao.class, args);
    }
}

package br.com.alura.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Seiji
 */

@Entity(name = "convidado")
public class Convidado
{
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param pId
     *            the id to set
     */
    public void setId(Long pId)
    {
        id = pId;
    }

    /**
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * @param pNome
     *            the nome to set
     */
    public void setNome(String pNome)
    {
        nome = pNome;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param pEmail
     *            the email to set
     */
    public void setEmail(String pEmail)
    {
        email = pEmail;
    }

    /**
     * @return the telefone
     */
    public String getTelefone()
    {
        return telefone;
    }

    /**
     * @param pTelefone
     *            the telefone to set
     */
    public void setTelefone(String pTelefone)
    {
        telefone = pTelefone;
    }

}

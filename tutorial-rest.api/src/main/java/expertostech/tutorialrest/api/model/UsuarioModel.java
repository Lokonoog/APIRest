package expertostech.tutorialrest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//  Representação do meu usuario
@Entity(name = "usuario") // atribui o nome usuario
@Table(name = "usuario")
public class UsuarioModel {

    // Variaveis
    @Id
    private Integer codigo;

    @Column(nullable = false,length = 50)
    private String nome;

    //Construtor vazio
    @SuppressWarnings("unused")
    private UsuarioModel(){
    }

    //Metodos Getters e Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

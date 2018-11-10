
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Login {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty login = new SimpleStringProperty();
    private final StringProperty senha = new SimpleStringProperty();

    /**
     * <h1>Construtor Vazio</h1>
     * <p>Contrutor para instanciar objetos da classe {@link Login} sem parâmetros</p>
     */
    public Login() {
    }

    /**
     * <h1>Construtor com parâmetros</h1>
     * Contrutor com parâmentro todos os atributos da classe, um para cada atributo.
     * @param id seta um valor numérico para a atributo id do <b>Usuário</b>
     * @param login seta um valor textual para a atributo login do <b>Usuário</b>
     * @param senha seta um valor textual para a atributo senha do <b>Usuário</b>
     */
    public Login(int id, String login, String senha) {
        setId(id);
        setLogin(login);
        setSenha(senha);
    }
    /**
     * 
     * @return O valor numérico do atributo id do <b>Usuário</b>
     */
    public final int getId() {
        return id.get();
    }
    
    /**
     * 
     * @param id seta um valor numérico para o atributo id do <b>Usuário</b>
     */
    public final void setId(int id) {
        this.id.set(id);
    }
    
    /**
     * 
     * @return A propriedade FXML do atributo id do <b>Usuário</b>
     */
    public IntegerProperty idProperty() {
        return id;
    }
            
    /**
     * 
     * @return valor textual do atributo login do <b>Usuário</b>
     */
    public final String getLogin() {
        return login.get();
    }
    
    /**
     * 
     * @param login seta um valor textual para o atributo login do <b>Usuário</b>
     */
    public final void setLogin(String login) {
        this.login.set(login);
    }
    
    /**
     * 
     * @return A propriedade FXML do atributo login do <b>Usuário</b>
     */
    public StringProperty loginProperty() {
        return login;
    }
    
    /**
     * 
     * @return valor textual do atributo senha do <b>Usuário</b>
     */
    public final String getSenha() {
        return senha.get();
    }
    
    /**
     * 
     * @param senha seta um valor textual para o atributo senha do <b>Usuário</b>
     */
    public final void setSenha(String senha) {
        this.senha.set(senha);
    }
    
    /**
     * 
     * @return A propriedade FXML do atributo login do <b>Usuário</b>
     */
    public StringProperty senhaProperty() {
        return senha;
    }  
        
}

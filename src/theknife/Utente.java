//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package theknife;

public class Utente {
    public final String username;
    public String passwordHash;
    public String nome;
    public String cognome;
    public String dataNascita;
    public String domicilio;
    public Ruolo ruolo;

    public Utente(String username, String passwordHash, String nome, String cognome, String dataNascita, String domicilio, Ruolo ruolo) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.domicilio = domicilio;
        this.ruolo = ruolo;
    }
}

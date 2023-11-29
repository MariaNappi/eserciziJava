/*Scrivere un programma che contenga una classe che definisce uno Studente
        che abbia come proprietà nome, cognome ed identificativo
        Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
        Nel main dichiarare un oggetto di tipo Studente.*/

public class Studente {
    private String nome, cognome;
    private int codiceIdentificativo;

    public Studente(String nome, String cognome, int codiceIdentificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public void setCodiceIdentificativo(int codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceIdentificativo=" + codiceIdentificativo +
                '}';
    }
}

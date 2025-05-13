public class Persona {
    private String nome, cognome;
    private int eta, tel;

    public Persona(String nome, String cognome, int eta, int tel) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.tel = tel;
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
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
}

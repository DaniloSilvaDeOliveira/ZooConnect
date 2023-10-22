public abstract class Animal {
    private String nome,especie,dieta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspécie() {
        return especie;
    }

    public void setEspécie(String espécie) {
        especie = espécie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String ToString(){
        return "Nome: " + getNome() + "\n" +
                "Espécie: " + getEspécie() + "\n" +
                "Dieta: " + getDieta() + "\n";
    }

}

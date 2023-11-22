public abstract class Animal {
    private String nome,especie,dieta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String ToString(){
        return "Nome: " + getNome() + "\n" +
            "Espécie: " + getEspecie() + "\n" +
            "Dieta: " + getDieta() + "\n";   
    }

}

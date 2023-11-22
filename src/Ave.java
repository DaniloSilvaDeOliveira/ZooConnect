public class Ave extends Animal{

    private Double envergaduraDasAsas;


    public Ave(String nome, String especie, String dieta, Double asas) {
        
        setEnvergaduraDasAsas(asas);
        setNome(nome);
        setEspecie(especie);
        setDieta(dieta);
    }

    public void setEnvergaduraDasAsas(Double envergaduraDasAsas) {
        this.envergaduraDasAsas = envergaduraDasAsas;
    }

    public Double getEnvergaduraDasAsas(){
        return this.envergaduraDasAsas;
    }

    public String ToString(){
        return "Nome: " + getNome() + "\n" +
                "Espécie: " + getEspecie() + "\n" +
                "Dieta: " + getDieta() + "\n" +
                "Envergadura Das Asas:  " + getEnvergaduraDasAsas() + " cm"  + "\n";
    }



}

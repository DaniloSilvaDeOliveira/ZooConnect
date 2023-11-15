
public class Mamifero extends Animal{
    
    private String corPelagem;

    public Mamifero(String nome, String espécie, String dieta, String corPelagem) {
        setCorPelagem(corPelagem);
        setNome(nome);
        setEspécie(espécie);
        setDieta(dieta);        
    }
    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public String ToString(){
        return "Nome: " + getNome() + "\n" +
                "Espécie: " + getEspécie() + "\n" +
                "Dieta: " + getDieta() + "\n" +
                "Cor da Pelagem: " + getCorPelagem() + "\n";
    }


}

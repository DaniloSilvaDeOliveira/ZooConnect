/**
 * Classe Mamifero que estende a classe Animal.
 */
public class Mamifero extends Animal {
    
    private String corPelagem;

    /**
     * Construtor para a classe Mamifero.
     */
    public Mamifero(String nome, String especie, String dieta, String corPelagem) {
        this.setNome(nome);
        this.setEspecie(especie);
        this.setDieta(dieta);     
        this.corPelagem = corPelagem;   
    }
    /**
     * Getter para corPelagem.
     */
    public String getCorPelagem() {
        return corPelagem;
    }

    /**
     * Setter para corPelagem.
     */
    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    /**
     * Método para representar o objeto Mamifero como uma string.
     */
    @Override
    public String ToString() {
        return "Nome: " + getNome() + "\n" +
                "Espécie: " + getEspecie() + "\n" +
                "Dieta: " + getDieta() + "\n" +
                "Cor da Pelagem: " + getCorPelagem() + "\n";
    }
}
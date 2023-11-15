# ZooConnect
## Descrição do Projeto
O Sistema de Zoológico é uma aplicação desenvolvida para gerenciar animais em um ambiente zoológico. 
O projeto é estruturado em quatro classes principais: Animal, Mamífero, Ave, e Zoológico.

## 🦒 1. Classe Animal 

<details><summary>Atributos</summary>
  
- nome: nome do animal.
- espécie: espécie à qual o animal pertence.
- dieta: informações sobre a dieta do animal.

</details>

<br>

<details><summary>Metódos</summary>

- getters, setters: métodos para acessar e modificar os atributos.
- toString(): método para fornecer uma representação em string do objeto.
  </details>
<br>

## 🍼 2. Classe Mamífero 

<details><summary>Atributos</summary>

<br>

Herança:
- Herda da classe Animal.
  
- corPelagem: cor da pelagem do mamífero.
  
</details>

<br>

<details><summary>Metódos</summary>

- getters e setters específicos para o atributo adicional.
- Sobrescrita do método toString().
  </details>
<br>

## 🦆 3. Classe Ave
<details><summary>Atributos</summary>

<br>

Herança:
- Herda da classe Animal.
  
- envergaduraAsas: medida da envergadura das asas da ave.
  
</details>

<br>

<details><summary>Metódos</summary>

- getters e setters específicos para o atributo adicional.
- Sobrescrita do método toString().
  </details>
<br>

## 🌳🐒 4. Classe Zoológico 

<details><summary>Atributos</summary>
  
- listaAnimais: uma lista para armazenar os animais no zoológico.
  
</details>

<br>

<details><summary>Metódos</summary>

- adicionarAnimal(animal): adiciona um animal à lista.
- removerAnimal(animal): remove um animal da lista.
- listarAnimais(): exibe a lista de animais no zoológico.
  </details>
<br>

# :hammer: Funcionalidades do projeto

- `Funcionalidade 1`: Cadastrar Animais
- `Funcionalidade 2`: Editar Animais
- `Funcionalidade 2`: Listar Animais
- `Funcionalidade 3`: Excluir Animais

<br>

<p align="center">
<img loading="lazy" src="http://img.shields.io/static/v1?label=STATUS&message=%20FINALIZADO&color=GREEN&style=for-the-badge"/>
</p>

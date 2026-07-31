# Tabuada-Interface-JavaFX
Interface gráfica para uma tabuada usando JavaFX


# Estrutura usada de pastas para esse projeto

```
tabuada-javafx/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── br/
        │       └── com/
        │           └── supergeeks/
        │               └── tabuada/
        │                   └── App.java
        │
        └── resources/
```

Uma boa parte do código está em App.java


# Responsabilidade dos arquivos

`pom.xml`

É o arquivo de configuração do Maven. <br>

Ele define:

- Nome e versão do projeto.
- Versão do Java.
- Dependências do JavaFX.
- Plugin para executar o programa.
- Dependências de teste.

A configuração desse arquivo permite que seja possível executar o projeto com:

```bash
mvn javafx:run
```

`App.java`
Essa classe fica responsável pela parte estruturação da interface gráfica:
- Criar a janela.
- Criar os controles.
- Organizar o layout.
- Capturar o clique do botão.
- Mostrar o resultado.


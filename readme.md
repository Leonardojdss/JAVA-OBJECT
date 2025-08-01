# Sistema de Streaming - Projeto Java OOP

## 📝 Descrição do Projeto

Este projeto é um sistema de gerenciamento de conteúdo de streaming desenvolvido em Java, demonstrando conceitos fundamentais de Programação Orientada a Objetos (POO) como herança, polimorfismo, encapsulamento e interfaces.

## 🎯 Objetivo

O sistema simula uma plataforma de streaming onde é possível:
- Gerenciar filmes e séries
- Calcular avaliações e médias
- Calcular tempo total de conteúdo
- Filtrar recomendações baseadas em classificações
- Gerenciar episódios individuais

## 🏗️ Estrutura do Projeto

### Pacotes e Classes

#### 📦 `br.com.streaming.model`
Contém as classes de modelo do sistema:

- **`Title`** (Classe abstrata base)
  - Propriedades: nome, ano, disponibilidade, avaliações, duração
  - Métodos: exibir ficha técnica, calcular média de avaliações

- **`Film`** (Herda de Title, implementa Classification)
  - Propriedades adicionais: diretor
  - Implementa classificação baseada na média de avaliações

- **`Serie`** (Herda de Title)
  - Propriedades: temporadas, episódios por temporada, minutos por episódio
  - Calcula duração total considerando todos os episódios

- **`Episodes`** (Implementa Classification)
  - Propriedades: número, título, série associada, visualizações
  - Classificação baseada no número de visualizações

#### 📦 `br.com.streaming.calculator`
Contém as classes utilitárias:

- **`Classification`** (Interface)
  - Define o contrato para classificação de conteúdo

- **`CalculatorOfTime`**
  - Calcula o tempo total de múltiplos conteúdos
  - Utiliza polimorfismo para aceitar qualquer tipo de Title

- **`FilterRecomendation`**
  - Filtra recomendações baseadas na classificação
  - Utiliza a interface Classification

## 🔧 Funcionalidades Principais

### 1. Gerenciamento de Filmes
```java
Film myFilm = new Film();
myFilm.setName("Star Wars");
myFilm.setDuration(200);
myFilm.setYear(1977);
myFilm.rating(8); // Adicionar avaliações
```

### 2. Gerenciamento de Séries
```java
Serie supernatural = new Serie();
supernatural.setName("Supernatural");
supernatural.setSeasons(15);
supernatural.setEpisodesPerSeason(22);
supernatural.setMinutesPerEpisode(42);
```

### 3. Cálculo de Tempo Total
```java
CalculatorOfTime calculator = new CalculatorOfTime();
calculator.include(myFilm);
calculator.include(supernatural);
System.out.println(calculator.getTimeTotal() + " minutos");
```

### 4. Sistema de Recomendações
```java
FilterRecomendation filter = new FilterRecomendation();
filter.filter(myFilm); // Classifica baseado na avaliação
```

## 💡 Conceitos de POO Demonstrados

### 1. **Herança**
- `Film` e `Serie` herdam de `Title`
- Reutilização de código e especialização de comportamentos

### 2. **Polimorfismo**
- `CalculatorOfTime` aceita qualquer objeto do tipo `Title`
- `FilterRecomendation` trabalha com qualquer objeto que implemente `Classification`

### 3. **Interface**
- `Classification` define um contrato comum
- Implementada por `Film` e `Episodes` com lógicas diferentes

### 4. **Encapsulamento**
- Propriedades privadas com getters e setters
- Controle de acesso aos dados

### 5. **Sobrescrita de Métodos**
- `Serie` sobrescreve `getDurationInMinutes()` para cálculo específico
- Demonstra flexibilidade da herança

## 🚀 Como Executar

1. Compile o projeto:
```bash
javac -d bin src/Principal.java src/br/com/streaming/**/*.java
```

2. Execute a classe principal:
```bash
java -cp bin Principal
```

## 📊 Exemplo de Saída

O programa demonstra:
- Criação de filmes e séries
- Cálculo de avaliações médias
- Soma do tempo total de conteúdo
- Sistema de recomendações baseado em classificações

## 🎓 Aprendizados

Este projeto demonstra como aplicar conceitos fundamentais de POO em um cenário real, mostrando:
- Como estruturar hierarquias de classes
- Uso efetivo de interfaces
- Polimorfismo na prática
- Organização de código em pacotes
- Reutilização e extensibilidade de código

## 📁 Estrutura de Arquivos

```
JAVA-OBJECT/
├── src/
│   ├── Principal.java
│   ├── Knowledge.java
│   └── br/
│       └── com/
│           └── streaming/
│               ├── calculator/
│               │   ├── CalculatorOfTime.java
│               │   ├── Classification.java
│               │   └── FilterRecomendation.java
│               └── model/
│                   ├── Episodes.java
│                   ├── Film.java
│                   ├── Serie.java
│                   └── Title.java
└── readme.md
```

---

**Desenvolvido como projeto educacional para demonstrar conceitos de Programação Orientada a Objetos em Java.**
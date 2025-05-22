# Gerenciador de Lojas para Shopping Center 

Projeto desenvolvido para o desafio de Laboratório I, implementando um sistema de gerenciamento de lojas em um shopping center com Java.

## 📋 Funcionalidades

- **Cadastro de Lojas**
  - Tipos específicos: Cosméticos, Vestuário, Bijuteria, Alimentação e Informática
  - Atributos: Nome, funcionários, salário base, endereço, data de fundação
- **Gerenciamento de Produtos**
  - Controle de validade
  - Operações CRUD no estoque
- **Administração do Shopping**
  - Capacidade personalizada de lojas
  - Relatórios por tipo de loja

## 🏗️ Estrutura do Projeto
    src/
    ├── app/
    │ ├── Data.java
    │ ├── Endereco.java
    │ ├── Loja.java
    │ ├── Produto.java
    │ ├── Shopping.java
    │ ├── subclasses/
    │ ├── Alimentacao.java
    │ ├── Bijuteria.java
    │ ├── Cosmetico.java
    │ ├── Informatica.java
    │ └── Vestuario.java
    ├── model/
    │ └── Principal.java
    └── test/
    └── ValidadorEtapa*.java

## 🚀 Como Executar

1. **Pré-requisitos**:
   - JDK 11+
   - Maven (opcional)

2. **Compilação e Execução**:
   ```bash
   javac -d bin src/model/Principal.java
   java -cp bin model.Principal

3. **Menu Interativo**:
    1. Criar loja
    2. Criar produto
    3. Sair 

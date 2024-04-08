# Exemplos de implementações aplicando os padrões de projetos

# Padrões de Projeto

## O que é um padrão de projeto?

Cada padrão descreve um problema no nosso ambiente e o cerne da sua solução, de tal forma que você possa usar essa
solução mais de uma vez, para solucionar um problema.

Um padrão por não pode ser copiado e utilizado para resolver o seu problema em questão, mas pode ser utilizado como
modelo ou esboço para solucionar o problema.

> Em resumo, padrões de projeto são soluções típicas para problemas comuns em projeto de software. Eles são como plantas
> de obra pré fabricadas que você pode customizar para resolver um problema de projeto recorrente em seu código.

Em geral um padrão de projeto tem quatro elementos essenciais:

- O nome do padrão ou propósito: Usado para descrever um problema de projeto, suas soluções e consequências em uma ou
  duas palavras. Usado também para facilitar a convesa em alto nível sobre as soluções relacionadas ao problema.

- O problema: Descreve em que situação aplicar o padrão, ele explica o problema e seu contexto de aplicação. Alguns
  poderam ter lista de requisitos de condições que devem ser satisfeitas para que faça sentido aplicar o padrão.

- A solução: Descreve os elementos que compoẽm o padrão de projeto, seus relacionbamentos, suas responsabilidades e
  colaborações. Não descreve um projeto concreto ou uma implementação em particular porque um padrão é como um gabarito.

- As consequencias: São os resultados e análises das vantagens e desvantagens da aplicação do padrão.

## Classificação dos padrões de  projetos

> A classificação dos padrões se dão por dois critérios(para o GoF), finalidade e escopo. No qual finalidade está
> relacionado ao que o padrão faz e o escopo especifica se o padrão se aplica primariamente a classes ou a objetos.

O livro trata a divisão dos padrões em 3 categorias, os de criação, os estruturais e os comportamentais.

    Os padrões criacionais fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização de código.

    Os padrões estruturais explicam como montar objetos e classes em estruturas maiores, enquanto ainda mantém as estruturas flexíveis e eficientes.

    Os padrões comportamentais cuidam da comunicação eficiente e da assinalação de responsabilidades entre objetos.

Na tabela abaixo temos a relação dos padrões:

|  **Propósito**  	  | 	                 | 	                         |
|:------------------:|-------------------|---------------------------|
| **De Criação**   	 | **Estrutural** 	  | **Comportamental**     	  |
| Abstract Factory 	 | Adapter         	 | Interpreter             	 |
| Builder          	 | Bridge          	 | Template Method         	 |
| Prototype        	 | Composite       	 | Chain of Responsibility 	 |
| Singleton        	 | Decorator       	 | Command                 	 |
| Factory Method   	 | Façade          	 | Iterator                	 |
|         	          | Flyweight       	 | Memento                 	 |
|         	          | Proxy           	 | Observer                	 |
|         	          | 	                 | State                   	 |
|         	          | 	                 | Strategy                	 |
|         	          | 	                 | Visitor                 	 |

## Como selecionar um padrão de projeto

- Considere como padrões de projeto solucionam problemas de projeto;
- Examine as seções Intenção(página 24 do livro);
- Estude como os padrõe se interrelacionam(pagina 26);
- Estude padrões de finalidades semelhantes(paǵina 86);
- Examine uma causa de reformulação de projetos;
- Considere o que deveria ser variável no seu projeto;

## Como usar um padrão de projeto

1 - Leia o padrão por inteiro uma vez par obter sua visão geral, como atenção na seções de Aplicabilidade e
COnsequência;

2 - Volte e estude as seções de estrutura, participantes e colaborações

3 - Olhe a seção de exemplos de códigos

4 - Escolha nomes para os participantes do padrão que tenham sentindo no contexto

5 - Defina as classes;

6 - Defina nomes específicos da aplicação para as operaçõpes no padrão;

7 - Implemente as operações para suportar as responsabilidades e colaborações presentes no padrão;

- Link de Referência: https://refactoring.guru/pt-br/design-patterns/ 
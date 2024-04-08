# Factory Method

## Propósito:

Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar, O factory method
permite que as subclasses alterem o tipo de objetos que serão criados.

## Problema:

Imagine que você está criando uma aplicação de gerenciamento de logística. A primeira versão da sua aplicação pode
lidar apenas com o transporte de caminhões, portanto a maior parte do seu código fica dentro da classe Caminhão.

> Adicionar uma nova classe ao programa não é tão simples se o restante do código já estiver acoplado às classes
> existentes.

Se começarmos a oferecer serviços de logística maritima??, todo o código está acoplada à classe Caminhão. Adicionar
Navio à aplicação exigiria alterações em toda a base de código. Se quisermos adiocionar outro tipo de transporte?

## Solução:

O padrão Factory Method sugere que você substitua chamadas diretas de construção de objetos (as que usando o operador
new) por chamadas para um método fábrica especial. Objetos retornados por um método fábrica geralmente são chamados de
produtos.

À primeira vista, essa mudança pode parecer sem sentido: apenas mudamos a chamada do construtor de uma parte do
programa para outra. No entanto, agora você pode sobrescrever o método fábrica em uma subclasse e alterar a classe de
produtos que estão sendo criados pelo método.

O código que usa o método fábrica (geralmente chamado de código cliente) não vê diferença entre os produtos reais
retornados por várias subclasses.

O cliente trata todos os produtos como um objeto abstrato.

## Estrutura:

1 - O Produto declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas
subclasses.

2 - Produtos Concretos são implementações diferentes da interface do produto.

3 - A classe Criador declara o método fábrica que retorna novos objetos produto. É importante que o tipo de retorno
desse método corresponda à interface do produto.

> Observe que, apesar do nome, a criação de produtos não é a principal responsabilidade do criador.

4 - Criadores Concretos sobrescrevem o método fábrica base para retornar um tipo diferente de produto.

## Aplicabilidade:

Use o padrão Factory Method quando:
- uma classe não pode antecipar a classe de objetos que deve criar;
- uma classe quer que suas subclasses especifiquem os objetos que criam;
- classes delegam responsabilidades para uma dentre várias subclasses auxiliares e vovê quer localizar o
conhecimento de qual subclasse auxiliar que é a delegada.

## Implementação:

1 - Faça todos os produtos implementarem a mesma interface. Essa interface deve declarar métodos que fazem sentido em
todos os produtos.

2- Adicione um método fábrica vazio dentro da classe criadora. O tipo de retorno do método deve corresponder à
interface comum do produto.

3 - No código da classe criadora, encontre todas as referências aos construtores de produtos. Um por um, substitua-os
por chamadas ao método fábrica, enquanto extrai o código de criação do produto para o método fábrica.

4 - Agora, crie um conjunto de subclasses criadoras para cada tipo de produto listado no método fábrica. Sobrescreva o
método fábrica nas subclasses e extraia os pedaços apropriados do código de construção do método base.

5 - Se houver muitos tipos de produtos e não fizer sentido criar subclasses para todos eles, você poderá reutilizar o
parâmetro de controle da classe base nas subclasses.

6 -Se, após todas as extrações, o método fábrica base ficar vazio, você poderá torná-lo abstrato. Se sobrar algo, você
pode tornar isso em um comportamento padrão do método.

## Prós e Contras(Consequencias):

Você evita acoplamentos firmes entre o criador e os produtos concretos.

Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa,
facilitando a manutenção do código.

Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente
existente.

O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o
padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.

## Padrões Relacionados:

Abstract Factory, Prototype
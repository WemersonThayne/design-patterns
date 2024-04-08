# Padrões de Projeto

### Abstract Factory

- Propósito:
    - O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados
      sem ter que especificar suas classes concretas.

- Problema:
    - Imagine que você está criando um simulador de loja de mobílias. Seu código consiste de classes que representam:

    - Uma família de produtos relacionados, como: Cadeira + Sofá + MesaDeCentro.

    - Várias variantes dessa família. Por exemplo, produtos Cadeira + Sofá + MesaDeCentro estão disponíveis nessas
      variantes: Moderno, Vitoriano, ArtDeco.

    - Você precisa de um jeito de criar objetos de mobília individuais para que eles combinem com outros objetos da
      mesma família. Os clientes ficam muito bravos quando recebem mobília que não combina.

    - Solução
  > A primeira coisa que o padrão Abstract Factory sugere é declarar explicitamente interfaces para cada produto
  distinto da família de produtos (ex: cadeira, sofá ou mesa de centro). Então você pode fazer todas as variantes dos
  produtos seguirem essas interfaces. Por exemplo, todas as variantes de cadeira podem implementar a interface Cadeira;
  todas as variantes de mesa de centro podem implementar a interface MesaDeCentro, e assim por diante.

- Estrutura:
    - Produtos Abstratos: declaram interfaces para um conjunto de produtos distintos mas relacionados que fazem parte de
      uma família de produtos.

    - Produtos Concretos: são várias implementações de produtos abstratos, agrupados por variantes. Cada produto
      abstrato (cadeira/sofá) deve ser implementado em todas as variantes dadas (Vitoriano/Moderno).

    - A interface Fábrica Abstrata: declara um conjunto de métodos para criação de cada um dos produtos abstratos.

    - Fábricas Concretas:  implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma
      variante específica de produtos e cria apenas aquelas variantes de produto.

    - Cliente: Embora fábricas concretas instanciam produtos concretos, assinaturas dos seus métodos de criação devem
      retornar produtos abstratos correspondentes. Dessa forma o código cliente que usa uma fábrica não fica ligada a
      variante específica do produto que ele pegou de uma fábrica. O Cliente pode trabalhar com qualquer variante de
      produto/fábrica concreto, desde que ele se comunique com seus objetos via interfaces abstratas.


- Aplicabilidade:
    - um sistema deve ser independente de como seus produtos são criados, compostos ou representados;

    - um sistema deve ser configurado como um produtode uma família de múltiplos produtos;

    - uma família de objetos-produtos for projetada para ser usada em conjunto e você necessita garantir esta restrição;

    - você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas
      implementações;

- Implementação:

    - Mapeie uma matriz de tipos de produtos distintos versus as variantes desses produtos.

    - Declare interfaces de produto abstratas para todos os tipos de produto. Então, faça todas as classes concretas de
      produtos implementar essas interfaces.

    - Declare a interface da fábrica abstrata com um conjuntos de métodos de criação para todos os produtos abstratos.

    - Implemente um conjunto de classes fábricas concretas, uma para cada variante de produto.

    - Crie um código de inicialização da fábrica em algum lugar da aplicação. Ele deve instanciar uma das classes
      fábrica concretas, dependendo da configuração da aplicação ou do ambiente atual. Passe esse objeto fábrica para
      todas as classes que constroem produtos.

    - Escaneie o código e encontre todas as chamadas diretas para construtores de produtos. Substitua-as por chamadas
      para o método de criação apropriado no objeto fábrica.

- Prós e contras(Consequências)
    - Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.

    - Você evita um vínculo forte entre produtos concretos e o código cliente.

    - Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o
      código ser de fácil manutenção.

    - Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

    - O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são
      introduzidas junto com o padrão.

- Padrões Relacionados:
    - Factory Method, Prototype e Singleton;

### Builder

- Propósito:

  O uso desse pattern sever para a separar a construção de um objeto completo da sua representaçaõ de mode que o mesmo
  processo de construçção possa criar diferentes representações.
  Outra importante função desse padrão é criar objetos complexos utilizando um passo a passo.

  > O padrão Builder captura todos os estes relacionamentos, entre as classes builders(classes conversoras) e o leitor
  dessas classes chamado de diretor.

- Problema:

  Imagine um objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos
  agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com vários
  parâmetros. Ou pior: espalhado por todo o código cliente.

  Por exemplo, vamos pensar sobre como criar um objeto Casa. Para construir uma casa simples, você precisa construir
  quatro paredes e um piso, instalar uma porta, encaixar um par de janelas, e construir um teto. Mas e se você quiser
  uma casa maior e mais iluminada, com um jardim e outras miudezas (como um sistema de aquecimento, encanamento, e
  fiação elétrica)?

        - A solução mais simples é estender a classe base Casa e criar um conjunto de subclasses para cobrir todas as combinações de parâmetros. 

    - Quais soluções para esse problema?

        - Criar subclasses que representasse cada modelo;
        - Criar um construtor gigante diretamente na classe Casa base com todos os possíveis parâmetros;

    - Quais problemas essas abordagens podem trazer para o código?

        - um número considerável de subclasses;
        - Qualquer novo parâmetro, tal como o estilo do pórtico, irá forçá-lo a aumentar essa hierarquia cada vez mais.
        - Na maioria dos casos a maioria dos parâmetros não será usada, tornando as chamadas do construtor em algo feio
          de se ver.

- Solução:

  Para resolver o problemas encontrados na construção dos objetos complexos, o padrão Builder sugere que você extraia o
  código de construção do objeto para fora de sua própria classe e mova ele para objetos separados chamados builders.

  O padrão organiza a construção de objetos em uma série de etapas (construirParedes, construirPorta, etc.). Para criar
  um objeto você executa uma série de etapas em um objeto builder


- Estrutura:

  Dois componentes básico fazem parte do estrutura do padrão, as classes chamdas de s builders e o diretor.

  O diretor sabe quais etapas de construção executar para obter um produto que funciona.

  > Ter uma classe diretor em seu programa não é estritamente necessário. Você sempre pode chamar as etapas de
  construção em uma ordem específica diretamente do código cliente. Contudo, a classe diretor pode ser um bom lugar para
  colocar várias rotinas de construção para que você possa reutilizá-las em qualquer lugar do seu programa.

  1 - A interface Builder declara etapas de construção do produto que são comuns a todos os tipos de builders.

  2 - Builders Concretos provém diferentes implementações das etapas de construção. Builders concretos podem produzir
  produtos que não seguem a interface comum.

  3 - Produtos são os objetos resultantes. Produtos construídos por diferentes builders não precisam pertencer a mesma
  interface ou hierarquia da classe.

  4 - A classe Diretor define a ordem na qual as etapas de construção são chamadas, então você pode criar e reutilizar
  configurações específicas de produtos.

  5 - O Cliente deve associar um dos objetos builders com o diretor. Usualmente isso é feito apenas uma vez, através de
  parâmetros do construtor do diretor. O diretor então usa aquele objeto builder para todas as futuras construções.
  Contudo, há uma abordagem alternativa para quando o cliente passa o objeto builder ao método de produção do diretor.
  Nesse caso, você pode usar um builder diferente a cada vez que você produzir alguma coisa com o diretor.


- Aplicabilidade:

    - Use o padrão Builder quando:

        - O Algoritmo para criaçao de um objeto complexo deve ser independente das partes que compôem o objeto e de como
          elas são montadas;
        - O processo de construção DEVE PERMITIR DIFERENTES REPRESENTAÇÕES PARA O OBJETO QUE É CONSTRUÍDO;

        - Use o padrão Builder para se livrar de um “construtor telescópico”.

- Implementação:

  1 - Certifique-se que você pode definir claramente as etapas comuns de construção para construir todas as
  representações do produto disponíveis. Do contrário, você não será capaz de implementar o padrão.

  2 - Declare essas etapas na interface builder base.

  3 - Crie uma classe builder concreta para cada representação do produto e implemente suas etapas de construção.

  4 - Pense em criar uma classe diretor. Ela pode encapsular várias maneiras de construir um produto usando o mesmo
  objeto builder.

  5 - O código cliente cria tanto os objetos do builder como do diretor. Antes da construção começar, o cliente deve
  passar um objeto builder para o diretor.

  6 - O resultado da construção pode ser obtido diretamente do diretor apenas se todos os produtos seguirem a mesma
  interface. Do contrário o cliente deve obter o resultado do builder.

- Prós e Contras(Consequencias)

    - Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.

    - Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.

    - Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do
      produto.

    - A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.

- Padrões Relacionados

  Factory Method, Abstract Factory e Composite.

### Prototype

- Propósito:

  Especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse
  protótipo.

- Problema:

  Digamos que você tenha um objeto, e você quer criar uma cópia exata dele. Como você o faria? Primeiro, você tem que
  criar um novo objeto da mesma classe. Então você terá que ir por todos os campos do objeto original e copiar seus
  valores para o novo objeto.

  Nem todos os objetos podem ser copiados dessa forma porque alguns campos de objeto podem ser privados e não serão
  visíveis fora do próprio objeto.

  Há ainda mais um problema com a abordagem direta. Uma vez que você precisa saber a classe do objeto para criar uma
  cópia, seu código se torna dependente daquela classe.

- Solução:

  O padrão Prototype delega o processo de clonagem para o próprio objeto que está sendo clonado.

  O padrão declara um interface comum para todos os objetos que suportam clonagem. Essa interface permite que você clone
  um objeto sem acoplar seu código à classe daquele objeto. Geralmente, tal interface contém apenas um único método
  clonar.

  O método cria um objeto da classe atual e carrega todos os valores de campo para do antigo objeto para o novo.

  > Um objeto que suporta clonagem é chamado de um protótipo. Quando seus objetos têm dúzias de campos e centenas de
  possíveis configurações, cloná-los pode servir como uma alternativa à subclasses.

- Estrutura:

  1 - A interface Protótipo declara os métodos de clonagem. Na maioria dos casos é apenas um método clonar.

  2 - A classe Protótipo Concreta implementa o método de clonagem. Além de copiar os dados do objeto original para o
  clone, esse método também pode lidar com alguns casos específicos do processo de clonagem relacionados a clonar
  objetos ligados, desfazendo dependências recursivas, etc.

  3 - O Cliente pode produzir uma cópia de qualquer objeto que segue a interface do protótipo.


- Aplicabilidade:

    - Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa
      copiar.

    - Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam
      seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma
      configuração específica.

- Implementação:

  1 - Crie uma interface protótipo e declare o método clonar nela. Ou apenas adicione o método para todas as classes de
  uma hierarquia de classes existente, se você tiver uma.

  2 - Uma classe protótipo deve definir o construtor alternativo que aceita um objeto daquela classe como um argumento.
  O construtor deve copiar os valores de todos os campos definidos na classe do objeto passado para a nova instância
  recém criada.

  3 - Se a sua linguagem de programação não suporta sobrecarregamento de métodos, você pode definir um método especial
  para copiar os dados do objeto. O construtor é um local mais conveniente para se fazer isso porque ele entrega o
  objeto resultante logo depois que você chamar o operador new

  4 - Opcionalmente, crie um registro protótipo centralizado para armazenar um catálogo de protótipos usados com
  frequência.


- Prós e Contras(Consequencias)

    - Você pode clonar objetos sem acoplá-los a suas classes concretas.

    - Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.

    - Você pode produzir objetos complexos mais convenientemente.

    - Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

    - Clonar objetos complexos que têm referências circulares pode ser bem complicado.


- Padrões Relacionados:

  Abstract Factory, Compositor e Decoretor

### Singleton

- Propósito:

  Garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso para a mesma.


- Problema:

  O padrão Singleton resolve dois problemas de uma só vez, violando o princípio de responsabilidade única:

  1 - Garantir que uma classe tenha apenas uma única instância.

    - Por que alguém iria querer controlar quantas instâncias uma
      classe tem? A razão mais comum para isso é para controlar o acesso a algum recurso compartilhado—por exemplo, uma
      base de dados ou um arquivo.

  2 - Fornece um ponto de acesso global para aquela instância.

    - Assim como uma variável global, o padrão Singleton permite que você acesse algum objeto de qualquer lugar no
      programa. Contudo, ele também protege aquela instância de ser sobrescrita por outro código.

- Solução:

  Todas as implementações do Singleton tem esses dois passos em comum:

  Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.

  Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos
  panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o
  objeto em cache.


- Estrutura:

  A classe Singleton declara o método estático getInstance que retorna a mesma instância de sua própria classe.

  O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de
  obter o objeto singleton.

- Aplicabilidade:

    - For preciso haver apenas uma instância de uma classe, e essa instância tiver que dar acesso aos clientes atrávez
      de um ponto bem conhecido;

    - a única instância tiver de ser extensível através de subclasses, possibilidade aos cliente usar uma instância
      estendida sem alterar o seu código;

- Implementação:

  1 - Adicione um campo privado estático na classe para o armazenamento da instância singleton.

  2 - Declare um método de criação público estático para obter a instância singleton.

  3 - Implemente a “inicialização preguiçosa” dentro do método estático. Ela deve criar um novo objeto na sua primeira
  chamada e colocá-lo no campo estático. O método deve sempre retornar aquela instância em todas as chamadas
  subsequentes.

  4 - Faça o construtor da classe ser privado. O método estático da classe vai ainda ser capaz de chamar o construtor,
  mas não os demais objetos.

  5 - Vá para o código cliente e substitua todas as chamadas diretas para o construtor do singleton com chamadas para
  seu método de criação estático.


- Prós e Contras(Consequencias)

    - Você pode ter certeza que uma classe só terá uma única instância.

    - Você ganha um ponto de acesso global para aquela instância.

    - O objeto singleton é inicializado somente quando for pedido pela primeira vez.

    - Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.

    - O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre
      cada um.

    - O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um
      objeto singleton várias vezes.

    - Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste
      dependem de herança quando produzem objetos simulados.


- Padrões Relacionados

  Builder, Abstract Factory e Prototype

## Discussão sobre os padrões de criação

- Existem duas maneiras comuns de parametrizar um sistema pelas classes de objetos que ele criar:
    - Uma é criar subclassess da classe que cria objetos(Padrão Factory Method);

        - Desvantagem dessa abordagem é que requer a criação de uma nova subclasse somente para mudar a classe
          produto.Podendo gerar uma cascata de mudanças no sistema;

    - A outra forma de parametrizar um sistema baseia-se mais na composição de objetos, defina um objeto que seja
      responsável por conhecer a classe dos objetos-produtos e torne um parâmetro do sistema(Padrṍes Abstract Factory,
      Builder e Prototype):

        - Todos os padrões tem como objetivo criar um objeto-factory para criar um objeto-produto como resultado.
            - Abstract Factory: objeto-fábrica produz objetos de várias classes;

            - Builder: objeto-fábrica constroí incrementalmente um objeto complexo usando um protocolo igualmente
              complexo;

            - Prototype: faz objeto-fábrica construir um objeto-produto copiando um objeto protótipico, logo
              objeto-fábrica e o protótipo são o mesmo objeto;

    - Definir qual é o melhor padrão depende de muitos fatores;

    - Projetos que usam Abstract Factory Prototype ou Builder são ainda mais flẽxiveis do que aqueles que utilizam
      Factory Method, porém, eles também são mais complexos.

## Padrões Estruturais

Os padrões estuturais se preocupam com a forma como classes e objetos são compostos para formar estruturas maiores. Os
padrões estruturais de classes utilizam a herança para compor interfaces ou implementações.

> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas
> estruturas flexíveis e eficientes.

## Padrão Adapter

- Propósito:

  Convertrt a interface de uma classe em outra interface, esperada pelos clientes. Adapter permite que classes com
  interfaces incompativeis trabalhem em conjunto, o que, de outra forma seria impossível.

  O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

- Problema:

  Imagine que você está criando uma aplicação de monitoramento do mercado de ações da bolsa. A aplicação baixa os dados
  as ações de múltiplas fontes em formato XML e então mostra gráficos e diagramas maneiros para o usuário.

  Em algum ponto, você decide melhorar a aplicação ao integrar uma biblioteca de análise de terceiros. Mas aqui está a
  pegadinha: a biblioteca só trabalha com dados em formato JSON.

  > Você não pode usar a biblioteca “como ela está” porque ela espera os dados em um formato que é incompatível com sua
  aplicação.

- Solução:

  Você pode criar um adaptador. Ele é um objeto especial que converte a interface de um objeto para que outro objeto
  possa entendê-lo.

  Um adaptador encobre um dos objetos para esconder a complexidade da conversão acontecendo nos bastidores.

  Adaptadores podem não só converter dados em vários formatos, mas também podem ajudar objetos com diferentes interfaces
  a colaborar. Veja aqui como funciona:

    - O adaptador obtém uma interface, compatível com um dos objetos existentes.

    - Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.

    - Ao receber a chamada, o adaptador passa o pedido para o segundo objeto, mas em um formato e ordem que o segundo
      objeto espera.

        - Para resolver o dilema dos formatos incompatíveis, você pode criar adaptadores XML-para-JSON para cada classe
          da biblioteca de análise que seu código trabalha diretamente. Então você ajusta seu código para comunicar-se
          com a biblioteca através desses adaptadores.

- Estrutura:

    - Adaptador de objeto:

        - Essa implementação usa o princípio de composição do objeto: o adaptador implementa a interface de um objeto e
          encobre o outro. Ele pode ser implementado em todas as linguagens de programação populares.

      1 - O Cliente é uma classe que contém a lógica de negócio do programa existente.

      2 - A Interface do Cliente descreve um protocolo que outras classes devem seguir para ser capaz de colaborar com o
      código cliente.

      3 - O Serviço é alguma classe útil (geralmente de terceiros ou código legado). O cliente não pode usar essa classe
      diretamente porque ela tem uma interface incompatível.

      4 - O Adaptador é uma classe que é capaz de trabalhar tanto com o cliente quanto o serviço: ela implementa a
      interface do cliente enquanto encobre o objeto do serviço. O adaptador recebe chamadas do cliente através da
      interface do cliente e as traduz em chamadas para o objeto encobrido do serviço em um formato que ele possa
      entender.

      5 - O código cliente não é acoplado à classe concreta do adaptador desde que ele trabalhe com o adaptador através
      da interface do cliente. Graças a isso, você pode introduzir novos tipos de adaptadores no programa sem quebrar o
      código cliente existente. Isso pode ser útil quando a interface de uma classe de serviço é mudada ou substituída:
      você pode apenas criar uma nova classe adaptador sem mudar o código cliente.

    - Adapator de Classe:

        - Essa implementação utiliza herança: o adaptador herda interfaces de ambos os objetos ao mesmo tempo. Observe
          que essa abordagem só pode ser implementada em linguagens de programação que suportam herança múltipla, tais
          como C++.

      1 - A Classe Adaptador não precisa encobrir quaisquer objetos porque ela herda os comportamentos tanto do cliente
      como do serviço. A adaptação acontece dentro dos métodos sobrescritos. O adaptador resultante pode ser usado em
      lugar de uma classe cliente existente.


- Aplicabilidade:

    - Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o
      resto do seu código.

    - Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade
      comum que não pode ser adicionada a superclasse;

- Implementação:

  1 - Certifique-se que você tem ao menos duas classes com interfaces incompatíveis:

    - Uma classe serviço útil, que você não pode modificar (quase sempre de terceiros, antiga, ou com muitas
      dependências existentes).

    - Uma ou mais classes cliente que seriam beneficiadas com o uso da classe serviço.

  2 - Declare a interface cliente e descreva como o cliente se comunica com o serviço.

  3 - Cria a classe adaptadora e faça-a seguir a interface cliente. Deixe todos os métodos vazios por enquanto.

  4 - Adicione um campo para a classe do adaptador armazenar uma referência ao objeto do serviço. A prática comum é
  inicializar esse campo via o construtor, mas algumas vezes é mais conveniente passá-lo para o adaptador ao chamar seus
  métodos.

  5 - Um por um, implemente todos os métodos da interface cliente na classe adaptadora. O adaptador deve delegar a
  maioria do trabalho real para o objeto serviço, lidando apenas com a conversão da interface ou formato dos dados.

  6 - Os Clientes devem usar o adaptador através da interface cliente. Isso irá permitir que você mude ou estenda o
  adaptador sem afetar o código cliente.


- Prós e Contras(Consequencias)

    - Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do
      negócio do programa.

    - Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente
      existente, desde que eles trabalhem com os adaptadores através da interface cliente.

    - A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes.
      Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.

- Padrões Relacionados:

  Bridge, State, Strategy

## Padrão Brigde

- Propósito:

  Desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente.

  > Permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias
  separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outras.

- Problema:

  Digamos que você tem uma classe Forma geométrica com um par de subclasses: Círculo e Quadrado. Você quer estender essa
  hierarquia de classe para incorporar cores, então você planeja criar as subclasses de forma Vermelho e Azul. Contudo,
  já que você já tem duas subclasses, você precisa criar quatro combinações de classe tais como CírculoAzul e
  QuadradoVermelho.

  Adicionar novos tipos de forma e cores à hierarquia irá fazê-la crescer exponencialmente. Por exemplo, para adicionar
  uma forma de triângulo você vai precisar introduzir duas subclasses, uma para cada cor.

- Solução:

  O padrão Bridge tenta resolver esse problema ao trocar de herança para composição do objeto. Isso significa que você
  extrai uma das dimensões em uma hierarquia de classe separada, para que as classes originais referenciem um objeto da
  nova hierarquia, ao invés de ter todos os seus estados e comportamentos dentro de uma classe.

  > Você pode prevenir a explosão de uma hierarquia de classe ao transformá-la em diversas hierarquias relacionadas.

  Seguindo essa abordagem nós podemos extrair o código relacionado à cor em sua própria classe com duas subclasses:
  Vermelho e Azul. A classe Forma então ganha um campo de referência apontando para um dos objetos de cores;


- Estrutura:

  Abstração (também chamado de interface) é uma camada de controle de alto nível para alguma entidade. Essa camada não
  deve fazer nenhum tipo de trabalho por conta própria. Ela deve delegar o trabalho para a camada de implementação (
  também chamada de plataforma).

  1 - A Abstração fornece a lógica de controle de alto nível. Ela depende do objeto de implementação para fazer o
  verdadeiro trabalho de baixo nível.

  2 - A Implementação declara a interface que é comum para todas as implementações concretas. Um abstração só pode se
  comunicar com um objeto de implementação através de métodos que são declarados aqui.

  A abstração pode listar os mesmos métodos que a implementação, mas geralmente a abstração declara alguns
  comportamentos complexos que dependem de uma ampla variedade de operações primitivas declaradas pela implementação.

  3 - Implementações Concretas contém código plataforma-específicos.

  4 - Abstrações Refinadas fornecem variantes para controle da lógica. Como seu superior, trabalham com diferentes
  implementações através da interface geral de implementação.

  5 - Geralmente o Cliente está apenas interessado em trabalhar com a abstração. Contudo, é trabalho do cliente ligar o
  objeto de abstração com um dos objetos de implementação.

- Aplicabilidade:
    - Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da
      mesma funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).

    - Utilize o padrão quando você precisa estender uma classe em diversas dimensões ortogonais (independentes).

    - Utilize o Bridge se você precisar ser capaz de trocar implementações durante o momento de execução.


- Implementação:

  1 - Identifique as dimensões ortogonais em suas classes. Esses conceitos independentes podem ser:
  abstração/plataforma, domínio/infraestrutura, front-end/back-end, ou interface/implementação.

  2 - Veja quais operações o cliente precisa e defina-as na classe abstração base.

  3 - Determine as operações disponíveis em todas as plataformas. Declare aquelas que a abstração precisa na interface
  geral de implementação.

  4 - Crie classes concretas de implementação para todas as plataformas de seu domínio, mas certifique-se que todas elas
  sigam a interface de implementação.

  5 - Dentro da classe de abstração, adicione um campo de referência para o tipo de implementação. A abstração delega a
  maior parte do trabalho para o objeto de implementação que foi referenciado neste campo.

  6 - Se você tem diversas variantes de lógica de alto nível, crie abstrações refinadas para cada variante estendendo a
  classe de abstração básica.

  7 - O código cliente deve passar um objeto de implementação para o construtor da abstração para associar um com o
  outro. Após isso, o cliente pode esquecer sobre a implementação e trabalhar apenas com o objeto de abstração.


- Prós e Contras(Consequencias)

    - Você pode criar classes e aplicações independentes de plataforma.
    - O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
    - Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
    - Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de
      plataforma na implementação.

    - Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.

- Padrões Relacionados:

  O State, Strategy (e de certa forma o Adapter)

## Padrão Composite

- Propósito:

  Compor objetos em estruturas de árvore para representarem hieraquias partes-todos. Composite permite aos clietnes
  tratarem de maneira uniforme objetos individuais e composições de objetos

  > O Composite é um padrão de projeto estrutural que permite que você componha objetos em estruturas de árvores e então
  trabalhe com essas estruturas como se elas fossem objetos individuais.

  A chave para o padrão composite é uma classe abstrata que representa tanto as primitivas como os seus recipientes.

- Problema:

  Usar o padrão Composite faz sentido apenas quando o modelo central de sua aplicação pode ser representada como uma
  árvore.

  Por exemplo, imagine que você tem dois tipos de objetos: Produtos e Caixas. Uma Caixa pode conter diversos Produtos
  bem como um número de Caixas menores. Essas Caixas menores também podem ter alguns Produtos ou até mesmo Caixas
  menores que elas, e assim em diante.

  > Um pedido pode envolver vários produtos, embalados em caixas, que são embalados em caixas maiores e assim em diante.
  Toda a estrutura se parece com uma árvore de cabeça para baixo.

- Solução:

  O padrão Composite sugere que você trabalhe com Produtos e Caixas através de uma interface comum que declara um método
  para a contagem do preço total.

  Como esse método funcionaria? Para um produto, ele simplesmente retornaria o preço dele. Para uma caixa, ele teria que
  ver cada item que ela contém, perguntar seu preço e então retornar o total para essa caixa. Se um desses itens for uma
  caixa menor, aquela caixa também deve verificar seu conteúdo e assim em diante, até que o preço de todos os
  componentes internos sejam calculados.

- Estrutura:

  1 - A interface Componente descreve operações que são comuns tanto para elementos simples como para elementos
  complexos da árvore.

  2 - A Folha é um elemento básico de uma árvore que não tem sub-elementos. Geralmente, componentes folha acabam fazendo
  boa parte do verdadeiro trabalho, uma vez que não tem mais ninguém para delegá-lo

  3 - O Contêiner (ou composite) é o elemento que tem sub-elementos: folhas ou outros contêineres. Um contêiner não sabe
  a classe concreta de seus filhos. Ele trabalha com todos os sub-elementos apenas através da interface componente.

  Ao receber um pedido, um contêiner delega o trabalho para seus sub-elementos, processa os resultados intermediários, e
  então retorna o resultado final para o cliente.

  4 - O Cliente trabalha com todos os elementos através da interface componente. Como resultado, o cliente pode
  trabalhar da mesma forma tanto com elementos simples como elementos complexos da árvore.


- Aplicabilidade:

    - Utilize o padrão Composite quando você tem que implementar uma estrutura de objetos tipo árvore.

    - Utilize o padrão quando você quer que o código cliente trate tanto os objetos simples como os compostos de forma
      uniforme.

- Implementação:

  1 - Certifique-se que o modelo central de sua aplicação possa ser representada como uma estrutura de árvore. Tente
  quebrá-lo em elementos simples e contêineres. Lembre-se que contêineres devem ser capazes de conter tanto elementos
  simples como outros contêineres.

  2 - Declare a interface componente com uma lista de métodos que façam sentido para componentes complexos e simples.

  3 - Crie uma classe folha que represente elementos simples. Um programa pode ter múltiplas classes folha diferentes.

  4 - Crie uma classe contêiner para representar elementos complexos. Nessa classe crie um vetor para armazenar
  referências aos sub-elementos. O vetor deve ser capaz de armazenar tanto folhas como contêineres, então certifique-se
  que ele foi declarado com um tipo de interface componente.

  5 - Por fim, defina os métodos para adicionar e remover os elementos filhos no contêiner.

  Tenha em mente que essas operações podem ser declaradas dentro da interface componente. Isso violaria o princípio de
  segregação de interface porque os métodos estarão vazios na classe folha

- Prós e Contras(Consequencias)

  Você pode trabalhar com estruturas de árvore complexas mais convenientemente: utilize o polimorfismo e a recursão a
  seu favor.

  Princípio aberto/fechado. Você pode introduzir novos tipos de elemento na aplicação sem quebrar o código existente, o
  que agora funciona com a árvore de objetos.

  Pode ser difícil providenciar uma interface comum para classes cuja funcionalidade difere muito. Em certos cenários,
  você precisaria generalizar muito a interface componente, fazendo dela uma interface de difícil compreensão.


- Padrões Relacionados

  Chain of Responsability, Decorator

## Padrão Decoretor

- Propósito:

  Dinamicamente, agregar responsabilidades adicionais a um objeto. Os Decorators fornecem uma alternativa flexível ao
  uso de subclasses para extensão de funcionalidades.

  > O Decorator é um padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao
  colocá-los dentro de invólucros de objetos que contém os comportamentos.


- Problema:

  Imagine que você está trabalhando em um biblioteca de notificação que permite que outros programas notifiquem seus
  usuários sobre eventos importantes.

  A versão inicial da biblioteca foi baseada na classe Notificador que tinha apenas alguns poucos campos, um construtor,
  e um único método enviar.

  O método podia aceitar um argumento de mensagem de um cliente e enviar a mensagem para uma lista de emails que eram
  passadas para o notificador através de seu construtor.

  Uma aplicação de terceiros que agia como cliente deveria criar e configurar o objeto notificador uma vez, e então
  usá-lo a cada vez que algo importante acontecesse.

  Em algum momento você se dá conta que os usuários da biblioteca esperam mais que apenas notificações por email. Muitos
  deles gostariam de receber um SMS acerca de problemas críticos. Outros gostariam de ser notificados no Facebook, e, é
  claro, os usuários corporativos adorariam receber notificações do Slack.

  > Quão difícil isso seria? Você estende a classe Notificador e coloca os métodos de notificação adicionais nas novas
  subclasses


- Solução:

  Estender uma classe é a primeira coisa que vem à mente quando você precisa alterar o comportamento de um objeto.
  Contudo, a herança vem com algumas ressalvas sérias que você precisa estar ciente.

    - A herança é estática. Você não pode alterar o comportamento de um objeto existente durante o tempo de execução.
      Você só pode substituir todo o objeto por outro que foi criado de uma subclasse diferente.

    - As subclasses só podem ter uma classe pai. Na maioria das linguagens, a herança não permite que uma classe herde
      comportamentos de múltiplas classes ao mesmo tempo.

  Uma das maneiras de superar essas ressalvas é usando Agregação ou Composição ao invés de Herança. Ambas alternativas
  funcionam quase da mesma maneira: um objeto tem uma referência com outro e delega alguma funcionalidade, enquanto que
  na herança, o próprio objeto é capaz de fazer a função, herdando o comportamento da sua superclasse.

- Estrutura:

  1 - O Componente declara a interface comum tanto para os envoltórios como para os objetos envolvidos.

  2 - O Componente Concreto é uma classe de objetos sendo envolvidos. Ela define o comportamento básico, que pode ser
  alterado por decoradores.

  3 - A classe Decorador Base tem um campo para referenciar um objeto envolvido. O tipo do campo deve ser declarado
  assim como a interface do componente para que possa conter ambos os componentes concretos e os decoradores. O
  decorador base delega todas as operações para o objeto envolvido.

  4 - Os Decoradores Concretos definem os comportamentos adicionais que podem ser adicionados aos componentes
  dinamicamente. Os decoradores concretos sobrescrevem métodos do decorador base e executam seus comportamentos tanto
  antes como depois de chamarem o método pai.

  5 - O Cliente pode envolver componentes em múltiplas camadas de decoradors, desde que trabalhe com todos os objetos
  através da interface do componente.


- Aplicabilidade:

    - Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em
      tempo de execução sem quebrar o código que usa esses objetos.

    - Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.


- Implementação:

  1 - Certifique-se que seu domínio de negócio pode ser representado como um componente primário com múltiplas camadas
  opcionais sobre ele.

  2 - Descubra quais métodos são comuns tanto para o componente primário e para as camadas opcionais. Crie uma interface
  componente e declare aqueles métodos ali.

  3 - Crie uma classe componente concreta e defina o comportamento base nela.

  4 - Crie uma classe decorador base. Ela deve ter um campo para armazenar uma referência ao objeto envolvido. O campo
  deve ser declarado com o tipo da interface componente para permitir uma ligação entre os componentes concretos e
  decoradores. O decorador base deve delegar todo o trabalho para o objeto envolvido.

  5 - Certifique-se que todas as classes implementam a interface componente.

  6 - Crie decoradores concretos estendendo-os a partir do decorador base. Um decorador concreto deve executar seu
  comportamento antes ou depois da chamada para o método pai (que sempre delega para o objeto envolvido).

  7 - O código cliente deve ser responsável por criar decoradores e compô-los do jeito que o cliente precisa.


- Prós e Contras(Consequencias)

    - Você pode estender o comportamento de um objeto sem fazer um nova subclasse.
    - Você pode adicionar ou remover responsabilidades de um objeto no momento da execução.
    - Você pode combinar diversos comportamentos ao envolver o objeto com múltiplos decoradores.
    - Princípio de responsabilidade única. Você pode dividir uma classe monolítica que implementa muitas possíveis
      variantes de um comportamento em diversas classes menores.

    - É difícil remover um invólucro de uma pilha de invólucros.
    - É difícil implementar um decorador de tal maneira que seu comportamento não dependa da ordem do pilha de
      decoradores.
    - A configuração inicial do código de camadas pode ficar bastante feia.


- Padrões Relacionados

    - Adapter, Composite e Strategy

## Padrão Façade(FACEDE)

- Propósito:

  Fornecer uma interface unifica par um conjunto de interfaces em um subsistema. Façade define uma interface de nível
  mais alto torna o subsistema mais fácil de ser usado.

  > O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework,
  ou qualquer conjunto complexo de classes.


- Problema:

  Imagine que você precisa fazer seu código funcionar com um amplo conjunto de objetos que pertencem a uma sofisticada
  biblioteca ou framework. Normalmente, você precisaria inicializar todos aqueles objetos, rastrear as dependências,
  executar métodos na ordem correta, e assim por diante.

  Como resultado, a lógica de negócio de suas classes vai ficar firmemente acoplada aos detalhes de implementação das
  classes de terceiros, tornando difícil compreendê-lo e mantê-lo.

- Solução:

  Uma fachada é uma classe que fornece uma interface simples para um subsistema complexo que contém muitas partes que se
  movem. Uma fachada pode fornecer funcionalidades limitadas em comparação com trabalhar com os subsistemas diretamente.
  Contudo, ela inclui apenas aquelas funcionalidades que o cliente se importa.

  Exemplo do mundo real: Fazer pedidos por telefone.

- Estrutura:

  1 - A Fachada fornece um acesso conveniente para uma parte particular da funcionalidade do subsistema. Ela sabe onde
  direcionar o pedido do cliente e como operar todas as partes móveis.

  2 - Uma classe Fachada Adicional pode ser criada para prevenir a poluição de uma única fachada com funcionalidades não
  relevantes que podem torná-lo mais uma estrutura complexa. Fachadas adicionais podem ser usadas tanto por clientes
  como por outras fachadas.

  3 - O Subsistema Complexo consiste em dúzias de objetos variados. Para tornar todos eles em algo que signifique alguma
  coisa, você tem que mergulhar fundo nos detalhes de implementação do subsistema, tais como objetos de inicialização na
  ordem correta e suprí-los com dados no formato correto.

  4 - O Cliente usa a fachada ao invés de chamar os objetos do subsistema diretamente.


- Aplicabilidade:

    - Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.

    - Utilize o Facade quando você quer estruturar um subsistema em camadas.

- Implementação:

  1 - Verifique se é possível providenciar uma interface mais simples que a que o subsistema já fornece. Você está no
  caminho certo se essa interface faz o código cliente independente de muitas classes do subsistema.

  2 - Declare e implemente essa interface em uma nova classe fachada. A fachada deve redirecionar as chamadas do código
  cliente para os objetos apropriados do subsistema. A fachada deve ser responsável por inicializar o subsistema e
  gerenciar seu ciclo de vida a menos que o código cliente já faça isso.

  3 - Para obter o benefício pleno do padrão, faça todo o código cliente se comunicar com o subsistema apenas através da
  fachada. Agora o código cliente fica protegido de qualquer mudança no código do subsistema. Por exemplo, quando um
  subsistema recebe um upgrade para uma nova versão, você só precisa modificar o código na fachada.

  4 - Se a fachada ficar grande demais, considere extrair parte de seu comportamento para uma nova e refinada classe
  fachada.

- Prós e Contras(Consequencias)

  Você pode isolar seu código da complexidade de um subsistema.

  Uma fachada pode se tornar um objeto deus acoplado a todas as classes de uma aplicação.

- Padrões Relacionados

  Abstract Factory, Mediator e Singleton

## Padrão Flyweight

- Propósito:


- Problema:


- Solução:


- Estrutura:


- Aplicabilidade:


- Implementação:


- Prós e Contras(Consequencias)


- Padrões Relacionados

## Padrão XPTO

- Propósito:


- Problema:


- Solução:


- Estrutura:


- Aplicabilidade:


- Implementação:


- Prós e Contras(Consequencias)


- Padrões Relacionados 
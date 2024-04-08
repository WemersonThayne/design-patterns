## Decoradores de codificação e compactação

Este exemplo mostra como você pode ajustar o comportamento de um objeto sem alterar seu código.

Inicialmente, a classe de lógica de negócio só podia ler e gravar dados em texto sem formatação. Em seguida, criamos
várias pequenas classes de wrapper que adicionam novo comportamento após a execução de operações padrão em um objeto
empacotado.

O primeiro wrapper criptografa e descriptografa dados, e o segundo compacta e extrai dados.
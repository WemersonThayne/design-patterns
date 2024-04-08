## Produção de um automóvel passo a passo

Neste exemplo, o padrão Builder permite a construção passo a passo de diferentes modelos de carros.

O exemplo também mostra como o Builder produz produtos de diferentes tipos (manual do carro) usando as mesmas etapas de
construção.

O diretor controla a ordem da construção. Ele sabe quais etapas de construção chamar para produzir este ou aquele modelo
de carro. Ele funciona com builders apenas por meio de sua interface comum. Isso permite passar diferentes tipos de
builders para o diretor.

O resultado final é recuperado do objeto builder porque o diretor não pode saber o tipo de produto resultante. Somente o
objeto builder sabe o que exatamente ele cria.
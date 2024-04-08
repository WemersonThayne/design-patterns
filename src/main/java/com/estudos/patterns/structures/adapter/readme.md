## Problema: Integração de Sistemas de Pagamento

Imagine que você está desenvolvendo um sistema de comércio eletrônico que aceita pagamentos de clientes. Seu sistema foi
originalmente projetado para trabalhar com um único provedor de pagamento, mas agora você deseja expandir suas opções de
pagamento para incluir diversos provedores de pagamento, como PayPal, Stripe e um provedor de pagamento local.

O desafio é que cada provedor de pagamento tem uma interface de API diferente, métodos de autenticação distintos,
formatos de resposta diversos e até mesmo terminologias variadas. Integrar cada um desses provedores de pagamento
individualmente exigiria que você reescrevesse seu sistema inteiro para se adaptar a cada API específica, tornando o
código complicado e difícil de manter.

Para resolver esse problema, você pode aplicar o padrão Adapter. Crie adaptadores para cada provedor de pagamento que
implementem uma interface comum para seu sistema. Esses adaptadores traduziriam as chamadas do sistema para os métodos
específicos de cada provedor de pagamento, permitindo que seu sistema trabalhe de maneira uniforme com todos os
provedores, sem alterar seu código principal. O Adapter Pattern simplificaria a integração de novos provedores de
pagamento, garantindo que o código existente funcione sem problemas com as interfaces variadas dos provedores. Isso
economiza tempo e esforço de desenvolvimento e melhora a manutenibilidade do sistema.
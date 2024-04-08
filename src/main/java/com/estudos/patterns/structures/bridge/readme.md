# Bridge entre dispositivos e controles remotos

Este exemplo mostra a separação entre as classes de controles remotos e dispositivos que eles controlam.

Os controles remotos atuam como abstrações e os dispositivos são suas implementações. Graças às interfaces comuns, os
mesmos controles remotos podem funcionar com dispositivos diferentes e vice-versa.

O padrão Bridge permite alterar ou mesmo criar novas classes sem tocar no código da hierarquia oposta.
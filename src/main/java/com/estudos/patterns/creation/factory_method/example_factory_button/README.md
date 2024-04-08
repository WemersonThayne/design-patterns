# Produção de elementos da GUI de plataforma cruzada

Neste exemplo, os botões desempenham uma função de produto e os diálogos atuam como criadores.

Diferentes tipos de caixas de diálogo requerem seus próprios tipos de elementos. É por isso que criamos uma subclasse
para cada tipo de diálogo e substituímos seus métodos fábrica.

Agora, cada tipo de diálogo instanciará as classes de botão apropriadas. O diálogo base funciona com produtos usando sua
interface comum, é por isso que seu código permanece funcional após todas as alterações.
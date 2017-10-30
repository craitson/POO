# Encapsulamento

## Definições

- Consiste na separação dos aspectos internos e externos de um objeto;
- É utilizado para impedir o acesso direto ao estado de um objeto (seus atributos) disponibilizando apenas métodos para validar e efetivar suas alterações.
- Permite ignorar os detalhes de implementação (de como as coisas funcionam internamente) permitindo ao desenvolvedor idealizar seu trabalho em um nível mais alto de abstração;
- É o termo formal que descreve a junção de métodos e dados dentro de um objeto de maneira que acesso a estes dados só seja permitido por meio dos próprios métodos do objeto;

>Referência: Material didático utilizado na disciplina de POO do curso de Sistemas de Informações da UNIDAVI, elaborado por Lenilson Porath em 2015 


## Exemplos

Em um sistema que manipulará dados de algum banco de dados
temos como exemplo de encapsulamento a seguinte situação:

Temos classes responsáveis por manipular dados, com métodos de inserção,
exclusão e alteração, quem utilizar essas funcionalidades, não precisa saber
como ocorre o processo de inserção por exemplo, apenas precisa chamar o método
responsável por realizar determinada ação.


## Ferramenta
> checklist ou tabela

- Os atributos do objeto são protegidos pelo modificador private?
- O objeto possuí métodos que realizam todas as ações necessárias de 
responsabilidade do objeto sem a necessidade de manipulação externa dos dados 
da mesma para executar determinado cálculo ou ação?
- Os métotodos possuem parametros que não podem ser utilizados como atributo do objeto?

## Inspeção
> 5 classes devem ser inspecionadas com a ferramenta
> referenciar origem


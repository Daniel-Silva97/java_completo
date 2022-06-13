package secaoArraysListas.conceito;

public class Tipos {
    /* Aula 1
    Classes são do tipo referência

    Se crio dois objetos p1, p2 e fizer a seguinte operação
    p1 = new Product("TV", 900.00, 2)
    p2 = p1

    Acontecerá o seguinte em memória

    Stack               |            Heap

    p1 ---------------------------> ( 'TV', 900.00, 2 )
                                  /
    p2 _________________________/


     Ao criar o ponteiro, é alocado na Stack da memória o endereço do objeto criado no Heap da memória,
     Quando dizemos que um objeto é igual ao outro como fiz acima, na Stack p2 ficou com o mesmo endereço de memória que p1
     ou seja, ambos apontam para o mesmo objeto em memória no heap.

     Se eu não atribuir valores quando instanciar um novo objeto, será atribuido um valor padrão de acordo com o tipo.


     Já os tipos primitivos (double, int, etc) armazenam o valor da variável na stack da memória

     double x, y

     x=10
     y=x

         Stack               |            Heap

    x = 10

    y = 10


     Com a ação acima o valor de x foi COPIADO, sendo assim com dois lugares na memória alocando valores iguais na Stack
     Sem utilizar o heap.

    */

     /* Aula 2

      Desalocação do Garbage Collector

      É um sistema de monitoramento que observa objetos sem uso no Heap e desaloca para liberação de memória

      Desalocação por escopo

      É a desalocação de memória que limpa a memória quando o escopo em que a variável foi criada termina.
      Por exemplo:
      Uma variável declarada dentro do if é criada quando o programa entra no IF e automaticamente desalocada quando a
      condição termina.


     */




}

package lista_01.ex03;

// public class A {
//     ...
//     public A() {...}
//     public A( int x) {...}
//     public void m1() {...}
//     public void m1(int h) {...}
// }

// public class B extends A {
//     ...
//     public B() {...}
//     public void m1() {...}
//     public void m1 (double x, double Y) {...}
//     public void m2() { ... }
// }

/*
Na classe `A`:
1. Há dois construtores: `public A()` e `public A(int x)`. Isso é um exemplo de sobrecarga, pois ambos os métodos têm o mesmo nome (`A`), mas diferem no número e/ou tipo de parâmetros.
2. Há dois métodos `m1()`: `public void m1()` e `public void m1(int h)`. Isso também é um exemplo de sobrecarga, pois ambos os métodos têm o mesmo nome (`m1`), mas diferem no número e/ou tipo de parâmetros.

Na classe `B`:
1. Há um construtor `public B()`, mas não há construtores definidos explicitamente na classe `B` que correspondam aos construtores da classe `A`. Portanto, não há sobrecarga ou sobrescrita em relação aos construtores.
2. Há um método `m1()` na classe `B`, que tem o mesmo nome que o método `m1()` na classe `A`, mas não recebe nenhum parâmetro. Isso é uma sobrescrita do método `m1()` da classe `A`, pois a classe `B` está fornecendo uma implementação diferente do método com a mesma assinatura (mesmo nome e nenhum parâmetro).
3. Há um método `m1(double x, double y)`, que não tem correspondência com nenhum método na classe `A`, então não há sobrecarga ou sobrescrita em relação a este método.
4. Há um método `m2()`, que não tem correspondência com nenhum método na classe `A`, então não há sobrecarga ou sobrescrita em relação a este método.

- Na classe `A`, há sobrecarga nos construtores e no método `m1()`.
- Na classe `B`, há sobrescrita do método `m1()` da classe `A`, mas não há sobrecarga ou sobrescrita nos outros métodos.
 */

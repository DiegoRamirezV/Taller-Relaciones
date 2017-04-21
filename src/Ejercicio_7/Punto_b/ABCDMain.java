/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7.Punto_b;

/**
 *
 * @author Diego
 */
public class ABCDMain {

    public static void main(String[] args) {
        G[] elements = {new G(),new F(),new H(),new E()}; 
        
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i] );
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
        
        /*
        Ya sabemos que F hereda de G, E hereda de F, por lo tanto tambien de G, H hereda de E, por lo tanto tambien hereda de F,
        y asi mismo de G. G no hereda de nadie.
        Ahora explicaremos el ciclo for:
        
        1ra iteracion:
        - En la primera linea el for imprime el objeto que estan en la posición 0 del vector elements
          El elemento 0 es un new G(), es decir estamos creando un elemento de la clase G que nos retorna una cadena "G".
        - En la segunda linea el for invoca el method1() para el elemento. Como estamos sobre un objeto de la clase G
          el method1() nos arrojara "G 1".
        - En la tercera linea el for invoca el method2() para el elemento. Como estamos sobre un objeto de la clase G
          el method2() nos arrojara "G 2".
        
        2da iteracion:
        - En la primera linea el for imprime el objeto que estan en la posición 1 del vector elements
          El elemento 1 es un new F(), es decir estamos creando un elemento de la clase F, la cual hereda de G.
          El constructor de F retorna un "F"
        - En la segunda linea el for invoca el method1() para el elemento. Este method1() es el que hereda de G, por lo tanto
          el method1() nos arrojara "G 1".
        - En la tercera linea el for invoca el method2() para el elemento. Este method2() se sobreescribe para que retorne un "F 2 ",
          pero a su vez llame el method2() de quien hereda (usando la palabra super) que en este caso es G.
          Por lo tanto arrojara un "F 2" y un "G 2". 
        
        3ra iteracion:
        - En la primera linea el for imprime el objeto que estan en la posición 2 del vector elements
          El elemento 2 es un new H(), es decir estamos creando un elemento de la clase H, la cual hereda de E, y esta clase E 
          hereda de F, y F hereda de G.
          El constructor de H es el mismo contructor para E, ya que en la clase H no se define contructor, pero la clase E
          tampoco tiene constructor, entonces se ejecuta el constructor de F. Por lo tanto retorna "F".
        - En la segunda linea el for invoca el method1() para el elemento. Este method1() se sobreescribe y retorna "H 1 ".
        - En la tercera linea el for invoca el method2() para el elemento. La clase H no tiene definido method2(), por lo tanto
          se ejecuta el de la clase de la cual hereda que en este caso es la clase E, el cual arroja "E 2", pero a su vez 
          ejecuta el method1() de H (por lo que no usa super), y que arroja un "H 1".
          Al final obtendremos un "E 2" y un "H 1".
          
        4ta iteracion:
        - En la primera linea el for imprime el objeto que estan en la posición 3 del vector elements
          El elemento 3 es un new E(), es decir estamos creando un elemento de la clase E, la cual hereda de F.
          La clase E hereda el contructor de F ya que esta no lo tiene definido. Por lo tanto retorna un "F"
        - En la segunda linea el for invoca el method1() para el elemento. La clase E no tiene definido method1() por lo tanto se 
          ejecuta el de la clase que hereda, que en este caso es F, pero F tambien hereda este metodo de G, por lo tanto
          se retorna un "G 1"
        - En la tercera linea el for invoca el method2() para el elemento. Este method2() se sobreescribe para que retorne un "E 2 ",
          pero a su vez llama el method1() de la clase E (por no usar la palabra super) pero E hereda method1() como se explico en 
          la segunda linea para el for, por lo tanto arrojara un "G 1".
          Al final tendremos un "E 2" y un "G 1"
        */
    }
    
}

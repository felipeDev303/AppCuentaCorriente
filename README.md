# Documentación del Proyecto 

## Descripción general 
El proyecto `AppCuentaCorriente` implementa un sistema simple para gestionar cuentas corrientes 
con el fin de aprender los conceptos básicos de Programación Orientada a Objetos (POO) en Java.
El sistema permite crear cuentas, abonar o cargar dinero, y revisar el estado de las cuentas existentes. 

## Componentes del Proyecto
1. `CuentaCorriente`: Clase que representa una cuenta corriente con atributos y métodos para manejar el saldo y la información de la cuenta.
2. `Menu`: Clase que gestiona la interacción con el usuario, mostrando un menú de opciones y ejecutando las acciones correspondientes.
3. `Main`: Clase principal que inicia la aplicación.

## Conceptos aprendidos 

### Clases y Objetos

1. Clase: Corresponde a una plantilla que define la estructura y el comportamiento de los objetos. 
En este proyecto las clases son: `Main`, `CuentaCorriente` y `Menu`

2. Objeto: Una instancia de una clase. Por ejemplo `CuentaCorriente cuenta1 = new CuentaCorriente(1234, "Juan")`; crea un objeto `cuenta1` de la clase `CuentaCorriente`

### Atributos y Métodos 

1. Atributo: Una variable dentro de una clase que define sus propiedades.
  En `CuentaCorriente` los atributos son:
    `numeroCuenta` (obligatorio)
    `titular` (obligatorio)
    `saldo` (opcional, puede ser null)

2. Método constructor: Método especial para inicializar objetos de una clase, en este proyecto en la clase `CuentaCorriente` tenemos dos:
    Método constructor con saldo: `public CuentaCorriente(String titular, int saldo)` 
    Método constructor sin saldo: `public CuentaCorriente(String titular)`
   Estos métodos inicializan los atributos de una nueva cuenta corriente.

3. Método Getter: Es un método que devuelve el valor de un atributo.
    Ejemplo: `public String getTitular` devuelve el valor del atributo `titular`

4. Método Setter: Corresponde a un método que estable el valor de un atributo.
    Ejemplo: `public void setSaldo(int saldo)` establece el valor del atributo `saldo`

5. Método Especial: Métodos adicionales que realizan operaciones especificas.
    En `CuentaCorriente`, los métodos `abonar(int cantidad)` y `cargar(int cantidad)` modifican sumando y restando respectivamente al saldo de la cuenta.

6. Método toString: Un método especial que devuelve una representación en forma de cadena de un objeto.
     El método `toString` en `CuentaCorriente` proporciona una descripción legible de la cuenta.

### Encapsulamiento

Encapsulamiento: Un principio de POO que oculta los detalles internos de los objetos y solo expone lo necesario a traves de métodos públicos.
En `CuentaCorriente`, los atributos `numeroCuenta`, `titular` y `saldo` son privados (`private`) y se accede a ellos a través de los métodos Getter y Setter

### Polimorfismo 

Polimorfismo: El principio de que una única interfaz puede ser utilizada para distintos tipos de objetos. Por ahora no lo hemos aplicamos :)

## Glosario 

1. `package`: Especifica el paquete al que pertenece la clase (algo así como la carpeta), es el espacio en memoria. Agrupa las clases relacionadas en un espacio de nombres.
2. `public`: Un modificador de acceso que indica que la clase, método o atributo es accesible desde cualquier parte del código.
3. `private`: Un modificador de acceso que indica que el método o atributo solo e accesible desde la clase en la cuál está definido.
4. `static`: Un modificador que indica que el atributo o método pertenece a la clase en sí, no a una instancia individual de la clase.
5. `void`: Tipo de retorno que indica que el método no retorna ningún valor.
6. `int`: Tipo de dato primitivo que representa un entero.
7. `String`: Tipo de dato que representa una cadena de texto.
8. `Scanner`: Clase de la biblioteca estándar de Java que permite la lectura de la entrada del usuario desde la consola.
9. `this`: Referencia al objeto actual en un método o constructor, se utiliza para accecer a variables de instancia y métodos del objeto.
10. `constructor`: Método especial que se llama automáticamente cuando se crea una nueva instancia de una clase. Se utiliza para incicializar objetos.
11. `getter`: Método que se utiliza para recuperar el atributo privado de una clase.
12. `setter`: Método que sirve para establecer o modificar un el valor de un atributo privado de una clase.
13. `toString`: Método que se utiliza para devolver una representación en forma de cadena de un objeto. Se sobreescribe para devolver una salida persoanlizada.
14. `incremento`: Operación que aumenta el valor de una variable. En el contexto del código, `cuentaCounter++` incrementa el valor de `cuentaCounter` en 1.
15. `Math.max`: Método de la clase Math que devuelve el mayor de dos valores. Se utiliza para asegurarse de que el saldo no sea negativo después de una operación de carga.
16. `instancia`: Un objeto creado a partir de una clase. Cada instancia tiene sus propios valores para los atributos de la clase.
17. `abonar`: Método personalizado que agrega una cantidad al saldo de la cuenta, asegurando que la cantidad sea positiva.
18. `cargar`: Método personalizado que resta una cantidad del saldo de la cuenta, asegurando que el saldo no sea negativo.


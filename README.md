# LoopCommerce - E-Commerce Simulator (Consola en Java)

## Descripción del Proyecto

**LoopCommerce** es un simulador de carrito de compras en consola desarrollado en Java. Este proyecto fue creado como un desafío educativo para practicar el uso de estructuras de control de flujo (loops) en Java, implementando las funcionalidades básicas de un sistema de e-commerce.

El programa permite a los usuarios navegar por un catálogo de productos, agregar items a su carrito de compras, ver el total acumulado y realizar un proceso simulado de checkout con animaciones de espera.

## 🚀 Tecnologías Utilizadas

- **Java 21** - Versión del lenguaje de programación
- **Scanner** - Para la entrada de datos del usuario
- **Estructuras de control:**
  - `for` loop
  - `foreach` loop
  - `while` loop
  - `do-while` loop

## 📦 Cómo Ejecutar el Proyecto

### Requisitos previos:
- Tener Java Development Kit (JDK) 21 o superior instalado
- Terminal o línea de comandos

### Pasos de ejecución:

1. **Compilar el archivo Java:**
   ```bash
   javac LoopCommerce.java
   ```

2. **Ejecutar el programa:**
   ```bash
   java LoopCommerce
   ```

## 🛒 Funcionalidades del Programa

El programa presenta un menú interactivo con las siguientes opciones:

### **1. Listar productos**
Muestra todos los productos disponibles en el catálogo con sus precios correspondientes.

**Productos disponibles:**
- Arroz: $1400
- Fideos: $1000
- Huevos: $4000
- Leche: $1100
- Cereal: $3000

### **2. Agregar productos al carrito**
Permite seleccionar productos y especificar la cantidad a comprar. Características:
- Muestra la lista numerada de productos
- Solicita el número del producto deseado
- Pide la cantidad a agregar
- Permite agregar múltiples productos en una misma sesión
- Calcula y muestra el subtotal acumulado
- Opción para salir ingresando `0`

### **3. Mostrar monto del carrito**
Muestra el total acumulado de todos los productos agregados al carrito hasta el momento.

### **4. Checkout**
Simula el proceso de finalización de compra con las siguientes etapas:
1. **Validando stock...** (3 segundos de espera)
2. **Stock disponible ✅** (0.5 segundos de espera)
3. **Procesando pago...** (3 segundos de espera)
4. **Pago aceptado!. Se realizará el envío a su dirección**

### **0. Salir**
Finaliza la ejecución del programa.

## 💡 Características Técnicas Destacadas

- **Uso intensivo de loops:** Cada funcionalidad implementa diferentes tipos de bucles
- **Manejo de arrays:** Para almacenar productos, precios y mensajes
- **Validación básica:** Verificación de opciones del menú
- **Simulación de procesos:** Con `Thread.sleep()` para crear una experiencia realista
- **Interfaz amigable:** Menú claro y mensajes descriptivos

## 📁 Estructura del Código

- **Arrays estáticos:** Productos y precios predefinidos
- **Variable subtotal:** Acumula el valor total de la compra
- **Menú principal:** Implementado con `do-while` para garantizar al menos una ejecución
- **Control de flujo:** Múltiples `if-else` para manejar las opciones del usuario

## Reflexión
Siento que, gracias a esta actividad, he aprendido a usar los ciclos básicos de java, los cuales ya tenía conocimientos, pero en otros lenguajes vistos en el bootcamp. También me desafió a pensar una solución teniendo opciones limitadas, ya que no se permitía usar funciones ni POO, lo cual tiene sentido, debido a que aún no se nos ha enseñado dichos conceptos en java.
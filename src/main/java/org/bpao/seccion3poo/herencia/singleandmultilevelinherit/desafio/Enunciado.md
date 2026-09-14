# Desafio facil -  Herencia simple y multinivel

Construyamos una jerarquía de transporte que demuestre patrones de herencia tanto simple como multinivel. Crearás una cadena de clases en la que cada nivel añade nuevas capacidades, mostrando cómo se heredan los métodos a través de varios niveles.

Organizarás tu código en cuatro archivos:

- Vehicle.java: Crea la clase base en la parte superior de tu jerarquía. Todo vehículo debe tener:
  - Un campo privado para brand (String)
  - Un constructor que acepte la marca
  - Un método getBrand() que devuelva la marca
  - Un método move() que imprima: [brand] is moving
- LandVehicle.java: Crea una clase que extienda Vehicle, representando el nivel intermedio de tu cadena multinivel. Los vehículos terrestres añaden comportamientos específicos del suelo:
  - Un campo privado para wheels (int)
  - Un constructor que acepte brand y wheels, usando super(brand) para la parte correspondiente al padre
  - Un método getWheels() que devuelva el número de ruedas
  - Un método honk() que imprima: [brand] honks!
- Car.java: Crea una clase que extienda LandVehicle, completando tu cadena de herencia de tres niveles. Los automóviles añaden sus propias características especializadas:
  - Un campo privado para model (String)
  - Un constructor que acepte brand, wheels y model, usando super(brand, wheels)
  - Un método getModel() que devuelva el modelo
  - Un método displayInfo() que imprima: [brand] [model] with [wheels] wheels
- Main.java: Demuestra cómo un objeto Car tiene acceso a métodos de los tres niveles de la jerarquía. Recibirás tres entradas: brand (String), wheels (int) y model (String). Crea un Car y llama a estos métodos en orden:
  - move() - heredado de Vehicle (abuelo)
  - honk() - heredado de LandVehicle (padre)
  - displayInfo() - definido en la propia clase Car

Recibirás tres entradas: el nombre de la marca, el número de ruedas y el nombre del modelo.

Tu salida debe mostrar tres líneas que demuestren cómo el objeto Car puede utilizar métodos de cada nivel de su cadena de herencia, desde Vehicle, el nivel superior, hasta su propia clase.

FORMATO DE SALIDA REQUERIDO: [Tu contenido traducido aquí]
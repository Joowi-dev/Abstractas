# CocheHíbrido

Para implementar un coche híbrido partiría de la clase `CocheCombustion` y la extendería en una nueva clase llamada `CocheHibrido`. Además, crearía una interfaz `MotorElectrico` que definiría los métodos propios de la parte eléctrica, ya que Java no permite herencia múltiple pero sí implementar varias interfaces.

La interfaz `MotorElectrico` tendría estos métodos:

    public interface MotorElectrico {
        void cargarBateria(double kwh);
        void arrancarElectrico();
        void pararElectrico();
        double getNivelBateria();
    }

A la clase `CocheHibrido` le añadiría tres atributos nuevos: `motorElectricoEncendido` (boolean para saber si está activo), `nivelBateria` (double con la energía disponible en kWh) y `capacidadMaxBateria` (double con el límite máximo que admite la batería).

En cuanto a los métodos, `cargarBateria` aumentaría el nivel de batería sin pasarse del máximo, `arrancarElectrico` encendería el motor eléctrico si hay batería suficiente y `pararElectrico` simplemente lo apagaría. El método `getNivelBateria` devolvería el nivel actual.

El método `mover` lo sobreescribiría para que el coche use primero el motor eléctrico si tiene batería, y si se agota, pase automáticamente a usar el motor de combustión. Si ninguno de los dos tiene energía disponible, mostraría un mensaje y pararía ambos motores.

En cuanto al diagrama de clases, `Vehiculo` sería la clase abstracta de la que hereda `CocheCombustion`, y de esta hereda `CocheHibrido`, que además implementa la interfaz `MotorElectrico`. El diagrama lo haría con excalidraw.

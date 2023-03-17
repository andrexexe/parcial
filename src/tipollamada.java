
/*
PARCIAL ARQUITECTURA DE DATOS
Se quiere crear una aplicación para controlar los gastos telefónicos de una empresa.
La empresa cuenta con tres líneas telefónicas a través de las cuales se pueden realizar llamadas locales,
 de larga distancia y a celulares.
La empresa cuenta con planes telefónicos que establece las siguientes tarifas:
Minuto Llamada Local: $60 pesos
Minuto Llamada Larga Distancia: $1200 pesos
Minuto Llamada Celular: $850 pesos
La aplicación debe permitir:
1. Registrar una llamada en alguna de las líneas,
2. Mostrar la información detallada de cada línea (número de llamadas realizadas
, duración total de las llamadas en minutos y el costo total de las llamadas en pesos)
3. Mostrar un consolidado total de la información de todas las líneas (costo total en
pesos de las tres líneas, número total de llamadas realizadas, duración total de llamadas en minutos
y el cálculo del costo promedio por minuto según el costo total y el total de minutos).
Adicionalmente, la aplicación debe permitir
4. Reiniciar el uso las líneas telefónicas, dejando todos sus valores en cero.

 */




public class tipollamada {

    private int registrarllamada;
    private int precio;

    private String consolidado;


    public tipollamada() {
    }

    public tipollamada(int registrarllamada, int precio, String consolidado) {
        this.registrarllamada = registrarllamada;
        this.precio = precio;
        this.consolidado = consolidado;
    }

    public int getRegistrarllamada() {
        return registrarllamada;
    }

    public void setRegistrarllamada(int registrarllamada) {
        this.registrarllamada = registrarllamada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConsolidado() {
        return consolidado;
    }

    public void setConsolidado(String consolidado) {
        this.consolidado = consolidado;
    }

    @Override
    public String toString() {
        return "tipollamada{" +
                "registrarllamada=" + registrarllamada +
                ", precio=" + precio +
                ", consolidado='" + consolidado + '\'' +
                '}';
    }


}

public class celular extends tipollamada {

/*
Tarifa
registrar llamada
mostrar informacion
mostar consolidado
reiniciar

 */



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
    private int nllamadas;
    private int duracion;
    private double costototal;

    public celular() {
    }

    public celular(int registrarllamada, int precio, String consolidado, int nllamadas, int duracion, double costototal) {
        super(registrarllamada, precio, consolidado);
        this.nllamadas = nllamadas;
        this.duracion = duracion;
        this.costototal = costototal;
    }

    public int getNllamadas() {
        return nllamadas;
    }

    public void setNllamadas(int nllamadas) {
        this.nllamadas = nllamadas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }


    @Override
    public String toString() {
        return super.toString()+
                "celular{" +
                "nllamadas=" + nllamadas +
                ", duracion=" + duracion +
                ", costototal=" + costototal +
                '}';
    }

    //metodo numero de llamadas

    public void cantllamdas (int nllamadas, int tiempo){
         this.nllamadas=nllamadas;
         this.duracion= tiempo*nllamadas ;
         this.costototal= 850*this.duracion;





    }



}

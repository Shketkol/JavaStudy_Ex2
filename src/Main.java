public class Main {
    public static void main(String[] args) {

        Plant plant = new Plant();
        plant.name = "violet";
        plant.sort = "flowers";

        Well well = new Well();
        well.location = "Kiev";
        well.depth = 21;

        Weather weather = new Weather();
        weather.location = "Kiev";
        weather.type = "it is fine";
        weather.change();

        Reservoir reservoir = new Reservoir();
        reservoir.type = "fire";
        reservoir.volume = 100000;
        reservoir.length = 100;
        reservoir.width = 100;
        reservoir.status();

        Sensor TemperatureSensor = new Sensor();
        TemperatureSensor.name = "Temperature";
        TemperatureSensor.number = "�1254";

        Sensor MoistureSensor = new Sensor();
        MoistureSensor.name = "Moisture";
        MoistureSensor.number = "�215876";

        Sensor IlluminanceSensor = new Sensor();
        IlluminanceSensor.name = "Illuminance";
        IlluminanceSensor.number = "�151548";
        IlluminanceSensor.status();

        Sensor AciditySensor = new Sensor();
        AciditySensor.name = "Acidity";
        AciditySensor.number = "�13215648";

        Sensor ChargeSensor = new Sensor();
        ChargeSensor.name = "Charge";
        ChargeSensor.number = "�21354874385";
        ChargeSensor.status();

        PumpVent pump = new PumpVent();
        pump.name = "water";
        pump.type = "pool";

        PumpVent vent = new PumpVent();
        vent.name = "gas";
        vent.type = "boiler-room";
    }
}


package iceberg.model;

import java.time.LocalDate;

public class IcebergVolume implements IcebergEvent {
    private final LocalDate date;
    private final Iceberg iceberg;
    private final double volume;
    
    public IcebergVolume(LocalDate date, Iceberg iceberg, double volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.volume = volume;
    }
    @Override
    public LocalDate getDate() {
        return date;
    }
    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }
    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return "En la fecha : " + date + " el iceberg con id: " + iceberg.getId() +
                " tiene un volumen de " + volume;
    }
    
}

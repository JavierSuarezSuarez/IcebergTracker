
package iceberg.model;

import java.time.LocalDate;

public class IcebergLocation implements IcebergEvent {
    private final LocalDate date;
    private final Iceberg iceberg;
    private final double x;
    private final double y;
    
    public IcebergLocation (LocalDate date, Iceberg iceberg,double x, double y) {
        this.date = date;
        this.iceberg = iceberg;
        this.x = x;
        this.y = y;
    }
    @Override
    public LocalDate getDate() {
        return date;
    }
    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }
    public double getCoordinateX() {
        return x;
    }
    
    public double getCoordinateY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "En la fecha : " + date + " Las coordenadas del iceberg con id " + 
                iceberg.getId() + " son: "  + x + " , " + y;
    }
}

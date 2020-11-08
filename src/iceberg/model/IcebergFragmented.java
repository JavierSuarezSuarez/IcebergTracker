
package iceberg.model;

import java.time.LocalDate;

public class IcebergFragmented implements IcebergEvent {
    private final LocalDate date;
    private final Iceberg iceberg;
    
    public IcebergFragmented(LocalDate date, Iceberg iceberg) {
        this.date = date;
        this.iceberg = iceberg;
    }
    @Override
    public LocalDate getDate() {
        return date;
    }
    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }
}

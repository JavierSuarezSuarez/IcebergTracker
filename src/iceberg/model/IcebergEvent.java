
package iceberg.model;

import java.time.LocalDate;

public interface IcebergEvent {
    public LocalDate getDate();
    public Iceberg getIceberg();
}

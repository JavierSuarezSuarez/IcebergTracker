
package iceberg.persistence;

import iceberg.model.Iceberg;
import iceberg.model.IcebergLocation;
import iceberg.model.IcebergVolume;
import iceberg.model.Origin;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class IcebergRepository {
    private final List<Iceberg> icebergList;
    private final List<IcebergLocation> icebergLocList;
    private final List<IcebergVolume> icebergVolList;
    
    
    public IcebergRepository() {
        icebergList = new ArrayList<>();
        icebergLocList = new ArrayList<>();
        icebergVolList = new ArrayList<>();
    }
    
    
    public List<Iceberg> getIcebergList() {
        return icebergList;
    }
    
    
    public List<IcebergLocation> getLocationList() {
        return icebergLocList;
    }
    
    public List<IcebergVolume> getVolumeList() {
        return icebergVolList;
    }
    
    public void load() {
        icebergList.add(new Iceberg(1,Origin.ICEBERG,LocalDate.of(2020,Month.APRIL,1)));
        icebergList.add(new Iceberg(2,Origin.GLACIAR,LocalDate.of(2020,Month.FEBRUARY,10)));
        
        icebergLocList.add(new IcebergLocation(LocalDate.of(2020,Month.MAY,1),icebergList.get(0),80,22));
        icebergLocList.add(new IcebergLocation(LocalDate.of(2020,Month.MARCH,1),icebergList.get(1),65, 25));
        icebergLocList.add(new IcebergLocation(LocalDate.of(2020,Month.JUNE,1),icebergList.get(0),84, 25));
        icebergLocList.add(new IcebergLocation(LocalDate.of(2020,Month.APRIL,1),icebergList.get(1),70,26));
        
        icebergVolList.add(new IcebergVolume(LocalDate.of(2020,Month.MAY,1),icebergList.get(0),9e8));
        icebergVolList.add(new IcebergVolume(LocalDate.of(2020,Month.MARCH,1),icebergList.get(1),8e5));
        icebergVolList.add(new IcebergVolume(LocalDate.of(2020,Month.JUNE,1),icebergList.get(0),6e5));
        icebergVolList.add(new IcebergVolume(LocalDate.of(2020,Month.APRIL,1),icebergList.get(1),4e3));
    }
        
}
    

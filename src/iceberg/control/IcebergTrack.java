
package iceberg.control;

import iceberg.model.Iceberg;
import iceberg.model.IcebergLocation;
import iceberg.persistence.IcebergRepository;
import iceberg.model.IcebergVolume;



public class IcebergTrack {

    private final IcebergRepository repository;
    public static void main(String[] args) {
       IcebergTrack icebergTracker = new IcebergTrack();
       icebergTracker.getRepository().load();
       icebergTracker.show();
    }
    public IcebergTrack() {
        repository = new IcebergRepository();
    }
    
    public IcebergRepository getRepository() {
        return repository;
    }
    
    
    private void show() {
        for (Iceberg i : repository.getIcebergList()) {
            System.out.println(i.toString());
            for (IcebergLocation p : repository.getLocationList()) {
                if(p.getIceberg().equals(i)) System.out.println(p.toString());
                for (IcebergVolume v : repository.getVolumeList()) {
                    if(v.getIceberg().equals(i) && v.getDate().equals(p.getDate())) System.out.println(v.toString());
                }
            }
        }
    }
}

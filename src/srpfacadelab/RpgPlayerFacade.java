

public class RpgPlayerFacade {

    private InventoryManager invt;
    private DamageCalculator dmg;

    public RpgPlayerFacade(InventoryManager invt, DamageCalculator dmg) {
        this.invt = invt;
        this.dmg = dmg;
    }

    public void takeDamage(int amount) {
        dmg.takeDamage(amount);
    }

    // Didn't see anything in the client code that used any methods in the InventoryManager class

} 
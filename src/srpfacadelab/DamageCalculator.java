
public class DamageCalculator {

    private RpgPlayer player;
    private InventoryManager invt;

    public DamageCalculator(RpgPlayer player, InventoryManager invt) {
        this.player = player;
        this.invt = invt;
    }

    public void takeDamage(int damage) {
        if (damage < player.getArmour()) {
            player.gameEngine.playSpecialEffect("parry");
        }

        if (invt.calculateInventoryWeight() < (player.getCarryingCapacity() / 2)) {
            damage = Math.round((float)(damage - (damage * .25)));
        }

        int damageToDeal = damage - player.getArmour();
        player.setHealth(player.getHealth() - damageToDeal);

        player.gameEngine.playSpecialEffect("lots_of_gore");
    }
}
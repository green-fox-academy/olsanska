package AircraftCarrier;

public class Aircraft {

    String type;
    int maxAmmo;
    int remainingAmmo;
    int baseDamage;
    int damageDealt;

    public Aircraft(String type, int maxAmmo, int remainingAmmo, int baseDamage){
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.remainingAmmo = remainingAmmo;
        this. baseDamage = baseDamage;
    }

    public int fight() {
        damageDealt = baseDamage * remainingAmmo;
        remainingAmmo = 0;
        return damageDealt;
    }

    public int refill(int amount) {
        if (amount < maxAmmo - remainingAmmo) {
            remainingAmmo += amount;
            return 0;
        }
        amount -= (maxAmmo - remainingAmmo);
        remainingAmmo = maxAmmo;
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + remainingAmmo + ", Base damage: " + baseDamage + ", All Damage: " + maxAmmo * damageDealt;

    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}

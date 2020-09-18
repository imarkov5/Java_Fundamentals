public interface Attackable {
    //what kind of attributes does an object that is attackable have
    int getHealth();
    int takeDamage(int damageAmount);
    void setHealth(int health);
}

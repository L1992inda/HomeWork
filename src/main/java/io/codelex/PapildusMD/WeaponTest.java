package io.codelex.PapildusMD;

public class WeaponTest {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(3);
        weapon.loadBullet("bullet");
        weapon.loadBullet("bullet");
        System.out.println(weapon.isLoaded());
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.loadBullet("bullet");
        weapon.shot();
        weapon.shot();
        System.out.println(weapon.isLoaded());


    }
}


public class gameCharacter {

    //추상적 접근적을 만든다.
    private weapon weapon;

    //교환 가능
    public void setWeapon(weapon weapon){
        this.weapon = weapon;
    }

    public void  attack() {
        if (weapon == null) {
            System.out.println("맨손공격");
        } else {
            weapon.attack();  //delegate
        }
    }
}

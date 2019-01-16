public class main {
    public static void main(String[] args){
        gameCharacter character = new gameCharacter();

        character.attack();

        character.setWeapon(new knife());
        character.attack();

        character.setWeapon(new sword());
        character.attack();

        character.setWeapon(new ax());
        character.attack();
    }
}

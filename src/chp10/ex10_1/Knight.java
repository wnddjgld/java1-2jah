package chp10.ex10_1;

public class Knight extends Novice{

    int stamina = 70;
    void slash(){
        System.out.printf("%s(HP: %d, stamina: %d)의 베기\n", name, hp, stamina);
    }
}

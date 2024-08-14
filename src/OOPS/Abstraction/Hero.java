package OOPS.Abstraction;

abstract class Hero {
    int agility,muscles,misc,power;
    public Hero(int agi,int musc,int misc,int pow){
        this.agility = agi;
        this.muscles = musc;
        this.misc = misc;
        this.power = pow;
    }
    abstract String getSuperPower();
    abstract String getHeroName();
    public int getTotalPower(){
        return this.agility+this.muscles+this.misc+this.power;
    }


}

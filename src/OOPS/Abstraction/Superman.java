package OOPS.Abstraction;

public class Superman extends  Hero{
    String heroName,superPower;
    public Superman(String power,String heroName, int agi,int musc,int misc,int pow){
        super(agi,musc,misc,pow);
        this.superPower = power;
        this.heroName = heroName;
    }
     public String getSuperPower(){
        return this.superPower;
    }
    public String getHeroName(){
        return this.heroName;
    }

    @Override
    public int getTotalPower() {
        return super.getTotalPower()+1000;
    }
}

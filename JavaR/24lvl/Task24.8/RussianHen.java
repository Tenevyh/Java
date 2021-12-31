public class RussianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 12;
    }
    public String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}

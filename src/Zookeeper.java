public class Zookeeper implements Walk {
    @Override
    public void walking() {
        System.out.print("Иду выпускать животное погулять: ");
    }
    void MakeFood(AnimalAbstract animalAbstract){
        System.out.print("Иду кормить: ");
        animalAbstract.eat();
    }
    void HearVoice(AnimalAbstract animalAbstract){
        System.out.print("Слышу, как зовет животное: ");
        animalAbstract.voice();
    }
}

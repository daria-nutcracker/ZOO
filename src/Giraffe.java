public class Giraffe extends AnimalAbstract implements Walk{
    @Override
    void voice() {
        System.out.println("Жираф говорит х-ы-ы");
    }
    @Override
    public void walking(){
        System.out.println("Жираф в большом вольере");
    }
    @Override
    void eat() {
        super.eat();
        System.out.println("Жираф поест листья с деревьев");
    }
}

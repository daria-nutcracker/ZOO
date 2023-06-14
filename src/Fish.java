public class Fish extends AnimalAbstract implements Walk{
    @Override
    void voice() {
        System.out.println("Рыбка булькает");
    }

    @Override
    public void walking() {
        System.out.println("Рыбку выпускают в большой бассейн");
    }

    @Override
    void eat(){
        super.eat();
        System.out.println("Рыбке дать мальков");
    }
}

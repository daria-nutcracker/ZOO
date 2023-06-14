public class Penguin extends AnimalAbstract implements Walk{
    @Override
    void voice(){
        System.out.println("Пингвин кричит");
    }
    @Override
    void eat() {
        super.eat();
        System.out.println("Пингвину нужно дать рыбу");
    }
    @Override
    public void walking(){
        System.out.println("Пингвина выпустиили в вольер с бассейном");
    }
}

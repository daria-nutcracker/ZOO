public class Hippopotamus extends AnimalAbstract implements Walk{
    @Override
    void voice(){
        System.out.println("Бегемот хрюкает, фыркает и ревет");
    }
    @Override
    void eat() {
        super.eat();
        System.out.println("Бегемоту нужно дать рыбу");
    }
    @Override
    public void walking(){
        System.out.println("Бегемота выпустиили в большой бассейн");
    }
}

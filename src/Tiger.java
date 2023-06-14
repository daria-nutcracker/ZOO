public class Tiger extends AnimalAbstract implements Walk{
    @Override
    void voice() {
        System.out.println("Тигр рычит рррр");
    }
    @Override
    public void walking(){
        System.out.println("Тигра выпустили в большой вольер");
    }

    @Override
    void eat(){
        super.eat();
        System.out.println("Тигру нужно дать мясо");
    }

}

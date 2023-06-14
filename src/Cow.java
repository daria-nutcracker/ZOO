public class Cow extends AnimalAbstract implements Walk{
   @Override
   void voice(){
        System.out.println("Корова говорит муууу");
    }

    @Override
    void eat() {
       super.eat();
       System.out.println("Корове нужно дать сено");
    }

    @Override
    public void walking(){
       System.out.println("Корову выпустили в поле");
    }
}

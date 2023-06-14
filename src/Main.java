public class Main {
    public static void main(String[] args) {
       // BigWalking bigWalking = new BigWalking();
        Zookeeper zookeeper = new Zookeeper();

        Cow cow = new Cow();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        Giraffe giraffe = new Giraffe();
        Penguin penguin = new Penguin();
        Hippopotamus hippopotamus = new Hippopotamus();

        System.out.println("Пусть смотритель зоопарка проведет время с каждым животным: ");
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(giraffe);
        zookeeper.MakeFood(giraffe);
        BigWalking.bigWalking(giraffe, zookeeper);
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(penguin);
        zookeeper.MakeFood(penguin);
        BigWalking.bigWalking(penguin, zookeeper);
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(hippopotamus);
        zookeeper.MakeFood(hippopotamus);
        BigWalking.bigWalking(hippopotamus, zookeeper);
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(cow);
        zookeeper.MakeFood(cow);
        BigWalking.bigWalking(cow, zookeeper);
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(tiger);
        zookeeper.MakeFood(tiger);
        BigWalking.bigWalking(tiger, zookeeper);
        System.out.println("--------------------------------------------------------------");
        zookeeper.HearVoice(fish);
        zookeeper.MakeFood(fish);
        BigWalking.bigWalking(fish, zookeeper);


    }
}
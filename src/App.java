public class App {
    public static void main(String[] args) throws Exception {

        Fruit apple = new Fruit();
        Fruit orange = new Fruit();


        apple.fruitName = "apple";
        apple.grow(5);

        if(orange.fruitName == null && apple.fruitName == null){
            System.out.println("nameless fruit");
        }else if (orange.rotten()){
            System.out.println("named fruit");
        }else{
            System.out.println("how");
        }

        
        orange.fruitName = "orange";
        orange.grow(15);

    }
}
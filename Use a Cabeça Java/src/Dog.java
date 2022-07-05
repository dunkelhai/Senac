public class Dog {
    String name;

    public static void main (String[] args){
        //cria um objeto Dog e o acessa
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        //cria matriz
        Dog[] myDogs = new Dog[3];
        //colocar dogs nela
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //acessar os objetos dog
        //usando referencia da matriz
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //nome do mydogs2?
        System.out.println("O Nome do último cão é ");
        System.out.println(myDogs[2].name);
        //executar o loop pela matriz
        //pedir para todos os caes latirem
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }


   public void bark(){
        System.out.println(name + " diz Ruff!");
   }
   public void eat(){  }
   public void chatseCat(){  }
}

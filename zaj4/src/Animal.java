public class Animal {
    public String name;
    public Animal(){};
    public Animal(String name){
        this.name=name;
    }
@Override
    public  String toString(){
        return name;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Animal o){

            return this.name.equals(o.name);
        }
        else
            return false;
    }
    public  void animal_sound(){
        System.out.println("Sound");
    }

}
class  Cat extends Animal{
    public Cat(){

    }
    public Cat(String name){
        super(name);
    }
    @Override
    public  void animal_sound(){
        System.out.println("miau miau");
    }

}


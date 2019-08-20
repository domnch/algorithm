package cn.demo01;

/**
 * 猫狗队列
 * 2019/8/20
 * domnch
 */
public class Main {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Pet pet1 = new Cat();
        DogCatQueue dogCatQueue = new DogCatQueue();
        System.out.println(dogCatQueue.isEmpty());
        dogCatQueue.add(pet);
        System.out.println(dogCatQueue.isCatEmpty());
        System.out.println(dogCatQueue.isDogEmpty());
        System.out.println(dogCatQueue.isEmpty());
        dogCatQueue.pollAll();
        System.out.println(dogCatQueue.isDogEmpty());
    }
}

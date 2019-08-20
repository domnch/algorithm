package cn.demo01;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {

    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;

    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if(pet.getPetType().equals("dog")) {
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        } else if (pet.getPetType().equals("Cat")) {
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        }
    }

    public PetEnterQueue pollAll() {
        if(!this.catQ.isEmpty() && !this.dogQ.isEmpty()) {
            if(this.catQ.peek().getCount() < this.dogQ.peek().getCount()) {
                return this.catQ.poll();
            } else {
                return this.dogQ.poll();
            }
        } else if(!this.catQ.isEmpty()) {
            return this.catQ.poll();
        } else if(!this.dogQ.isEmpty()) {
            return this.dogQ.poll();
        } else {
            throw new RuntimeException("err, pet is empty");
        }
    }

    public PetEnterQueue pollDog() {
        if(!this.dogQ.isEmpty()) {
            return this.dogQ.poll();
        } else {
            throw new RuntimeException("err, dog is empty");
        }
    }

    public PetEnterQueue pollCat() {
        if(!this.catQ.isEmpty()) {
            return this.catQ.poll();
        } else {
            throw new RuntimeException("err, cat is empty");
        }
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return this.catQ.isEmpty() && this.catQ.isEmpty();
    }
}

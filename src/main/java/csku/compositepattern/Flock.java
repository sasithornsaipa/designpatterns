package csku.compositepattern;

import csku.models.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        for (int i = 0; i < quackers.size(); i++) {
            Quackable quacker = (Quackable)quackers.get(i);
            if (i==0){
                System.out.print("Leader:");
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }else {quacker.quack();}
        }

//        Iterator iterator = quackers.iterator();
//        Boolean isLeader =true;
//        while (iterator.hasNext()) {
//            Quackable quacker = (Quackable)iterator.next();
//            if (isLeader){
//                System.out.print("Leader:");
//                quacker.quack();
//                quacker.quack();
//                quacker.quack();
//                isLeader = false;
//            }else{
//                quacker.quack();
//            }

//        }
    }
}

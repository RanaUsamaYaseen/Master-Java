abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps on the ground");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps on trees");
    }
}

class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps on the ground");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}

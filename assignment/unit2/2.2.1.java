abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("soundA");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("soundB");
    }
}
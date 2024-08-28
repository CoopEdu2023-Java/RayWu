class animal {
    public void makesound() {
        System.out.println("makesound");
    }
}

class Cat extends animal{
    @Override
    public void makesound() {
        System.out.println("bark");
    }
}
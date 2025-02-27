package classes;

public final class Sword extends Item {
    @Override
    public void use(Person user) {
        System.out.println(user.getName() + " поклялся(ась) на мече.");
    }
}

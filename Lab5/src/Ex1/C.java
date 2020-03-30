package Ex1;

public class C implements Interface1, Interface2{

    //nu pot avea protected sau private, pentru ca in interfata este default publc
    @Override
    public void m1() {
        Interface1.super.m1();
    }

}

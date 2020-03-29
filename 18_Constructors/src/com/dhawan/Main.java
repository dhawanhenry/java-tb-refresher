package com.dhawan;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();
                //new Account("11111", 0.0, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//        bobsAccount.setNumber(212345);
//        bobsAccount.setBalance(0.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}

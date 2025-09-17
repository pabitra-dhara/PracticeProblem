/*3.Create a Person class with a copy constructor that clones another person's attributes. */
class Person {
    String name;
    int age;
    Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    Person(Person p){
        this.name=p.name;
        this.age=p.age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Pabitra",22);
        Person p2=new Person(p1);
        System.out.println(p1.name +","+p1.age);
        System.out.println(p2.name +","+p2.age);
    }
}

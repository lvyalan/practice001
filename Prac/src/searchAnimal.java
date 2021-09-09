public class searchAnimal {
    public static void typeJudgment(Animal firAn,Animal secAn){
        if(firAn.equals(secAn)){
            System.out.println(firAn.name+"和"+secAn.name+"是同一类型的动物。");
        }
        else
            System.out.println(firAn.name+"和"+secAn.name+"不是同一类型的动物。");

    }
    public static void main(String[] args) {
        Animal firstAnimal = new Animal("发财", 6);
        firstAnimal.setBark("汪汪汪");
        System.out.println("第一只动物名字是" + firstAnimal.name + ",年龄是" + firstAnimal.age + "岁,叫声是" + firstAnimal.bark);

        Animal secondAnimal = new Animal("富贵", 2, "喵喵喵");
        System.out.println("第二只动物名字是" + secondAnimal.name + ",年龄是" + secondAnimal.age + "岁,叫声是" + secondAnimal.bark);

        Dog firstDog = new Dog();
        firstDog.setName("小黑");
        firstDog.setAge(1);
        firstDog.setBark();
        System.out.println("第一只小狗的名字是" + firstDog.name + ",年龄是" + firstDog.age + "岁,叫声是" + firstDog.bark);

        typeJudgment(firstDog,firstAnimal);
        typeJudgment(firstDog,secondAnimal);
    }

}

public class Animal {
//     成员变量
     String name;
     int age;
     String bark;

     //     构造方法1
     public Animal(){
     }
//     构造方法2
     public Animal(String paraName,int paraAge){
         name = paraName;
         age = paraAge;
     }

//     构造方法3
     public Animal(String paraName,int paraAge,String paraBark){
          name = paraName;
          age = paraAge;
          bark = paraBark;
     }

//     获取名字
     public String getName(){
          return name;
     }

//     设置名字
     public void setName(String paraName){
          name = paraName;
     }

//     获取年龄
     public int getAge(){
          return age;
     }

//     设置年龄
     public void setAge(int paraAge){
          age = paraAge;
     }

//     获取叫声
     public String getBark(){
         return bark;
     }

//     设置叫声
     public void setBark(String paraBark){
          bark = paraBark;
     }

//     重写Animal类的equals方法,当bark一致时，则判断为同一小类动物
     public boolean equals(Object obj){
//          判断是否为空,是则返回为false
          if(obj == null)
               return false;
//          自反性，如果传进来的地址与当前地址一致，则为true
          if(obj == this)
               return true;
//          当为Animal类且bark一致，则返回为true
          if(obj instanceof Animal){
               Animal an = (Animal) obj;
               if(an.bark.equals(bark))
                    return true;
          }
          return false;
     }
}

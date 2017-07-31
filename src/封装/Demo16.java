package 封装;
//Demo16是 封装：在一个类中，公有方法和私有属性封装在一起。 
//public公有方法访问private私有属性
//把main方法中person.setName("李慧一")；注释掉，run as运行一下，这是通过new对象的时候通过构造方法访问(写入)私有属性，再通过get读取。
//然后把person.setName("李慧一");取消注释，运行一下，这是通过public公有方法get和set访问私有属性。
public class Demo16 {

	public static void main(String[] args) {
		//new对象的时候，调用person类中的构造方法person,通过类中的构造方法访问私有属性(写入曹操，后面通过get读取，再打印出来)
		Person person =new Person("曹操",30);
		//通过公有方法写入私有name属性，把前面写入的李慧一覆盖了
		person.setName("李慧一");       
		//通过公有方法读取私有name属性
		person.getName();
		//打印读取到的私有name属性
		System.out.println(person.getName());
	}

}
class Person{
	//私有属性
	private String name;
	private int age;
	//读取name属性的公有方法。批量添加公有方法：可以点鼠标右键，选择source,再选择generate getter and setter
	public String getName() {
		return name;
	}
	//写入name属性的公有方法
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//空构造方法
	Person(){}
	//调用构造方法时相对于写入，然后再用公有方法get读取
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
}



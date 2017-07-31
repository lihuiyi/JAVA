package static修饰;
//Demo24是static修饰的属性是静态属性，和类有关，和对象无关。要访问这个静态属性格式为：类名.属性名
public class Demo24 {

	public static void main(String[] args) {
		//类名大写，对象名小写
		User user=new User();
		//对象名.属性名  访问的是对象的属性
		user.name="李慧一";
		user.age=25;
		//类名.属性名   访问的是类的静态属性
		User.num=100;
		System.out.println(user.name+","+user.age+","+User.num);
	}

}
//类名大写
class User{
	String name;   //实例属性
	int age;       //实例属性
	//static修饰的属性是静态属性
	static int num;    //静态属性
}
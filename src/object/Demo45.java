package object;
//Demo45是toString方法、hashCode方法、equals方法综合运用
//重写toString方法，更改return后面的返回值，此处案例改为name+","+age+","+salary
//重写hashCode方法，更改return后面的返回值，此处案例改为age
//重写equals方法：
//对象1.equals(null);  意思是:对象1是否等于null   执行第一个if语句
//对象1.equals(对象1);  意思是：对象1是否等于对象1   执行第二个if语句
//对象1.equals(对象2);  意思是：对象1是否等于对象2   执行第三个if语句里面的那个if语句，在if语句里面可以按照我们自己的想法，更改2个对象是否相等的条件,此处案例改为对象1的名字等于对象2的名字并且对象1的年龄等于对象 2的年龄
public class Demo45 {

	public static void main(String[] args) {
		Abc abc1= new Abc("李慧一",25, 5000);
		Abc abc2 =new Abc("李慧一",25,8000);
		Abc abc3 =new Abc("李慧一",30,9000);
		//调用重写的toString()方法
		System.out.println("调用重写的toString方法："+abc1);
		//调用重写的hsahCode()方法
		System.out.print("重写后的hashCode返回值是age属性。           ");
		System.out.println("abc1返回:"+abc1.hashCode()+"  "+"abc2返回："+abc2.hashCode()+"  "+"abc3返回："+abc3.hashCode());
		//下面是调用重写的equals()方法
		//执行第一个if语句
		System.out.println("比较abc1和null是否相等："+abc1.equals(null));
		//执行第二个if语句
		System.out.println("比较abc1和他自己是否相等："+abc1.equals(abc1));
		//下面3行代码是：执行第三个if语句里面的那个if语句
		System.out.println("比较abc1和abc2是否相等："+abc1.equals(abc2));
		System.out.println("比较abc2和abc3是否相等："+abc2.equals(abc3));
		System.out.println("比较ab1c和abc3是否相等："+abc1.equals(abc3));
	}

}
class Abc{
	String name;
	int age;
	double salary;
	Abc(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void show(){
		System.out.println(name+","+age+","+salary);
	}
	public int hashCode() {
		return age;
	}
	public boolean equals(Object obj) {
		//下面代码中obj在main方法中代表的是new出来的对象
		//new出来的对象是否等于null。        在main方法中写：obj.equals(null)，意思是：new出来的对象是否等于null
		if(obj==null){
			return false;
		}
		//new出来的对象是否等于他自己。       在main方法中写：obj.equals(obj),意思是：new出来的对象是否等于他自己
		if(obj==this){
			return true;
		}
		//new出来的对象是否属于Abc这个类，如果属于的话，就执行new出来的对象强制转换类型：变为Abc类,再执行下面的if语句
		if(obj instanceof Abc){
			//new出来的对象强制类型转换：变成Abc类
			Abc abc= (Abc) obj;
			//if语句用于更改2个对象是否相等的条件，名字相等并且年龄相等，就返回true    
			//main方法中写：对象1.equals(对象2)，意思是：对象1的名字和年龄的对象2的名字和年龄，就返回true
			if(abc.name==this.name && this.age==abc.age){
				return true;
			}
		}
		//前面几种if语句都不满足就返回false
		return false;
	}
	public String toString() {
		return name+","+age+","+salary;
	}
	
}
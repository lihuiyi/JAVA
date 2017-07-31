package 集合框架;
//Demo47是HashMap的使用
import java.util.HashMap;
public class Demo47 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map =new HashMap();
		//使用put()方法往集合中添加元素
		map.put("k1", new Person("李慧一"));
		map.put("k2", new Person("张"));
		map.put("k3", "今天天气好");
		//输出map集合的信息，map中包含对象，输出时默认调用toString方法，所以要重写toString方法
		System.out.println(map);
		//使用get()方法获取集合中的元素，必须强制类型转换
		Person k1=(Person) map.get("k1");
		System.out.println("获取集合中k1的value:"+k1);
		
	}

}
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	//重写toString方法
	public String toString() {
		return name;
	}
	
}
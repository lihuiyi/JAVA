package 引用类型;
//Demo是基本类型和引用类型可以相互转换（自动转换）
import java.util.HashMap;
public class Demo49 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//引用类型自动转换为基本类型
		int num1 = new Integer(12);
		System.out.println("引用类型自动转换为基本类型："+num1);
		//基本类型自动转换为引用类型
		Integer num2 = 13;
		System.out.println("基本类型自动转换为引用类型："+num2);
		
		//字符串转化为数字
		@SuppressWarnings("unused")
		int a = Integer.parseInt("2");
		
//		基本类型的数据放入集合框架中时，会自动转换为引用类型，因为集合中只能保存对象
		HashMap map =new HashMap();
		map.put("k1",new Integer(13));
		map.put("k2", new Double(15.6));
		//28是基本数据类型，放到集合中时会自动转换为引用类型new Integer(28)
		map.put("k3", 28);
		int v= (Integer) map.get("k3");     //等号后面是从HashMap中取出k3，要强制类型转换。等号前面是引用类型自动转换为基本类型
		System.out.println("基本类型的数据放到集合中时，自动转换为引用类型："+v);
		
		
	}

}

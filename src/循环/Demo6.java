package Ñ­»·;

public class Demo6 {

	public static void main(String[] args) {
		int [] ary =new int[20];
		for(int i=0;i<ary.length;i++){
			if(i==1){
				continue;
			}
			if(i==15){
				break;
			}
			ary[i]=i+1;
			System.out.println(ary[i]);
		}
	}

}

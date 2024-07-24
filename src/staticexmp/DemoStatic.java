package staticexmp;

public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticExp sc = new StaticExp();
//		System.out.println(StaticExp.str);
		StaticExp sc1 = new StaticExp();
		System.out.println(StaticExp.count+" " + sc1);
		StaticExp sc2 = new StaticExp();
		System.out.println(StaticExp.count+" " + sc2);
		StaticExp sc3 = new StaticExp();
		sc3.getData();
		StaticExp.getData();

	}

}

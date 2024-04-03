package AutomationScripts;

public class OverLoadingExample {

	public static void main(String[] args) {
		class Foo {
			void print(String s) {
				System.out.println(s);
			}

			void print(String s, int count) {
				while (count > 0) {
					System.out.println(s);
					count--;
				}
			}
		}
		Foo fo = new Foo();
		fo.print("g");
		fo.print("K",5);
	}
}

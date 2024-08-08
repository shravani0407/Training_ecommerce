
public class helloWorld {

	public static void main(String[] args) {
		int result = test();
		System.out.println(result);

	}
	
	public static int test() {
		int a;
		int b[] = new int[10];
		try {
			a = 10/5;
			b[11] = 0;
			System.out.println("inside the try");
			return a;
		}
		catch(ArithmeticException e) {
			a = 10/2;
			System.out.println("inside the catch");
			return a ;
		}
		catch (Exception e) {
			// TODO: handle exception
			catch (Throwable e) {
				// TODO: handle exception
			}
		}
		
		
		finally {
			System.out.println("inside the finally");
		}
		return a;
	}

}

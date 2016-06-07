public class Android {
	
	private static int tag = 1;
	private String name;
	
	public Android() {
		name = "Bob" + tag;
		changeTag();
		}
	
	private static void changeTag() {
		for (int x = tag + 1; x <= 1000; x++) {
			if (isPrime(x)) {
				tag = x;
				break;
				}
			}
		}	
	private static String getName(Android y) {
		String justName = "";
		for (int x = 0; x < y.name.length(); x++) {
			if (((int)y.name.charAt(x) >= 65) && ((int)y.name.charAt(x) <= 122)) {
				justName += y.name.charAt(x);
				}
			}
		return justName;
		}	
	
	private static boolean isPrime(int n) {
		boolean prime = true;
		for (int x = 2; x < n; x++) {
			if (n % x == 0) {
				prime = false;
				}
			}
		return prime;	
		}		
		
	public static void main(String[] args) {
		System.out.println(tag);
		Android demo = new Android();		
		System.out.println(getName(demo));
		System.out.println(tag);
		Android demo2 = new Android();
		System.out.println(tag);
		Android demo3 = new Android();
		System.out.println(tag);
		}
	}

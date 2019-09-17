
public class House {

	public static void main(String[] args) {
		System.out.println("This is the house that Jack built.");
		malt();
		rat();
		cat();
		dog();
		cow();
		maiden();
	}
	public static void malt() {
		System.out.println("This is the malt");
		System.out.println("That lay in the house that Jack build.");
	}
	public static void rat() {
		System.out.println("This is the rat,");
		Jack();
	}

	public static void cat() {
		System.out.println("This is the cat,");
		System.out.println("That killed the rat,");
		Jack();
	}
	public static void dog() {
		System.out.println("This is the dog,");
		System.out.println("That worried the cat,");
		System.out.println("That killed the rat,");
		Jack();
	}
	public static void cow() {
		System.out.println("This is the cow with the crumpled horn,");
		System.out.println("That tossed the dog,");
		System.out.println("That worried the cat,");
		System.out.println("That killed the rat,");
		Jack();
	}
	public static void maiden() {
		System.out.println("This is the maiden all forlorn,");
		System.out.println("That milked the cow with the crumpled horn,");
		System.out.println("That tossed the dog,");
		System.out.println("That worried the cat,");
		System.out.println("That killed the rat,");
		Jack();
	}
	public static void Jack() {
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}

}

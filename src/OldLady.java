
public class OldLady {

	public static void main(String[] args) {
		System.out.println("There was an old lady that swallowed a fly.");
		IDK();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a spider,\nThat wriggled and iggled and jiggled inside her.");
		Spider();
		IDK();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a bird,\nHow absurd to swallow a bird.");
		Bird();
		Spider();
		IDK();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a cat,\nImagine that to swallow a cat.");
		Cat();
		Bird();
		Spider();
		IDK();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a dog,\nWhat a hog to swallow a dog.");
		Dog();
		Cat();
		Bird();
		Spider();
		IDK();
		System.out.println("");
		System.out.println("There was an old lady who swallowed a horse,\nShe died of course.");
		
		}
	public static void IDK() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die");
	}
	public static void Spider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void Bird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void Cat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void Dog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
}

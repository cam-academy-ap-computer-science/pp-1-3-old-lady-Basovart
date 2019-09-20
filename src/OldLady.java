/***
 * Grading comments:
 *  Very good work.  You used methods to reduce duplication.
 *  Compiles/runs: 15/15
 *  Desired output: 6/6
 *  Consistency: 2/2
 *  Efficiency:  1/2 - You could have 'nested' methods to
 *   be more efficient.  You could have also had a method containing
 *   System.out.print("There was an old lady that swallowed a");
 *   followed by 'fly', 'spider'.. etc.
 * Overall very good effort 24/25
 */
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

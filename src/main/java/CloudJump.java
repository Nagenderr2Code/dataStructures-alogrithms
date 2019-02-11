import java.io.IOException;

public class CloudJump {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {

		int numOfJumps = 0;
		if (c.length > 0) {
			int length = c.length - 1;
			for (int i = 0; i <= length - 1;) {
				if ((i >= length)) {
					break;
				}
				if (c[i] == 0) {
					if (!(i + 2 >length) && c[i + 2] == 0) {
						numOfJumps++;
						i = i + 2;
					} else if (!(i + 1 > length) && c[i + 1] == 0) {
						numOfJumps++;
						i = i + 1;
					} else {
						i = i + 3;
					}
				}
			}
		}
		return numOfJumps;
	}

	public static void main(String[] args) throws IOException {

		int[] c = { 0, 0, 1, 0, 0, 1, 0 };
		int result = jumpingOnClouds(c);
		System.out.println(result);
	}
}

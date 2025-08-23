package Arrays;

public class Sinle_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] per = {86.7f, 98.7f, 79.5f, 92.3f, 88.0f, 67.4f, 75.0f, 91.2f, 84.6f, 93.8f};
        float max = per[0];
        float secondMax = Float.MIN_VALUE;
        for (int i = 1; i < per.length; i++)
        {
            if (per[i] > max) {
                secondMax = max;
                max = per[i];
            } else if (per[i] > secondMax && per[i] != max) {
                secondMax = per[i];
            }
        }

        System.out.println("Highest percentage = " + max);
        System.out.println("Second highest percentage = " + secondMax);
    }

	}

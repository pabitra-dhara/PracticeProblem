/*1.Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
 */
public class HeightOfPlayers {
    static void generateHeights(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }
    }

    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    static void displayResults(int[] heights) {
        System.out.print("Player Heights (cms): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total height sum: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest player height: " + shortest + " cms");
        System.out.println("Tallest player height: " + tallest + " cms");
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        generateHeights(heights);
        displayResults(heights);
    }
}


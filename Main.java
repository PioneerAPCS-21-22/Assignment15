
public class Main
{
    public static void main(String[] args)
    {
        // generate random numbers for dimensions and weight
        

        // create Package object


        // check if it can be sent first class (if not, explain why)


    }


    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * Generates a random number between min and max, inclusive: [min, max].
     *
     * @param min - the minimum possible value that could be randomly generated.
     * @param max - the maximum possible value that could be randomly generated.
     * @return      a random number in the range [min, max].
     */
    private static int randNum(int min, int max)
    {
        return (int) ((max - min + 1) * Math.random() + min);
    }
}

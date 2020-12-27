import java.util.*;

class CheckDuplicate
{
    public static void main(String[] args)
    {
        System.out.print("Please enter any integer 10 times. \n");
        List<Integer> userSequence = getUsersInput();
        findDuplicates(userSequence);

    }

    public static List<Integer> getUsersInput() {
        List<Integer> sequence = new ArrayList<>();
        for (int i=1; i <= 10; i++) {
            System.out.print("Enter " + i +" integer: \n");
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            sequence.add(a);
        }
        return sequence;
    }

    public static void findDuplicates(List<Integer> sequence) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (Integer key : sequence) {
            if (hash.containsKey(key)) {
                hash.put(key, hash.get(key) + 1);
            } else hash.put(key, 1);
        }
        for (Map.Entry entry : hash.entrySet()) {
            int k = (Integer) entry.getKey();
            if ((Integer) entry.getValue() > 1) {
                System.out.print("Key: " + k + " : ");
                for (int i=0; i< sequence.size(); i++) {
                    if (k == sequence.get(i))
                        System.out.print(" " + i);
                }
                System.out.println();
            }
        }
    }
}

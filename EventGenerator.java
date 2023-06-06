import java.util.*;

public class EventGenerator {
    private final Map<Object, Integer> outcomes;
    private final Random random;

    public EventGenerator(Map<Object, Integer> outcomes) {
        this.outcomes = outcomes;
        this.random = new Random();
    }

    public Object generateOutcome() {
        int totalProbability = outcomes.values().stream().mapToInt(Integer::intValue).sum();
        int randomNumber = random.nextInt(totalProbability) + 1;
        int cumulativeProbability = 0;

        for (Map.Entry<Object, Integer> entry : outcomes.entrySet()) {
            cumulativeProbability += entry.getValue();
            if (randomNumber <= cumulativeProbability) {
                return entry.getKey();
            }
        }

        // In case the probabilities do not sum up to 100, return null as an error indicator
        return null;
    }

    public static void main(String[] args) {
        // Example usage: rolling a biased six-faced dice
        Map<Object, Integer> diceOutcomes = new LinkedHashMap<>();
        diceOutcomes.put(1, 10);
        diceOutcomes.put(2, 30);
        diceOutcomes.put(3, 15);
        diceOutcomes.put(4, 15);
        diceOutcomes.put(5, 30);
        diceOutcomes.put(6, 0);

        EventGenerator diceEvent = new EventGenerator(diceOutcomes);

        int numOfOccurrences = 1000;
        Map<Object, Integer> occurrenceCount = new HashMap<>();

        for (int i = 0; i < numOfOccurrences; i++) {
            Object outcome = diceEvent.generateOutcome();
            occurrenceCount.put(outcome, occurrenceCount.getOrDefault(outcome, 0) + 1);
        }

        System.out.println("Outcome\t\tCount");
        for (Map.Entry<Object, Integer> entry : occurrenceCount.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}

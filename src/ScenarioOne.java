public class ScenarioOne {

    public static void main(String[] args) {

        Runtime runTime = Runtime.getRuntime();

        int numCores;

        numCores = runTime.availableProcessors();

        System.out.println(numCores);

    }
}

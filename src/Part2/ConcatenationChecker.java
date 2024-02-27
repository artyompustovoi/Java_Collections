package Part2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenationChecker {
    public static boolean checkConcatenation(List<String> chunks, String key) {

        Set<String> chunkSet = new HashSet<>(chunks);

        for (String chunk : chunkSet) {
            String complementaryChunk = key.substring(chunk.length());
            if (chunkSet.contains(complementaryChunk)) {
                return true;
            }
        }
        return false;
    }
}


package ransom.note;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/ransom-note/
 class RansomNote {

     public boolean canConstruct(String ransomNote, String magazine) {
         if (ransomNote.length() > magazine.length()) return false;
         Map<Character, AtomicInteger> availableLetters = getAvailableLetters(magazine);
         for (char letter : ransomNote.toCharArray()) {
             AtomicInteger magazineLetters = availableLetters.get(letter);
             if (null == magazineLetters || magazineLetters.get() == 0) {
                 return false;
             }
             magazineLetters.decrementAndGet();
         }
         return true;
     }

     private Map<Character, AtomicInteger> getAvailableLetters(String magazine) {
         Map<Character, AtomicInteger> result = new HashMap<>();
         for (char letter : magazine.toCharArray()) {
             result.computeIfAbsent(letter, c -> new AtomicInteger(0)).incrementAndGet();
         }
         return result;
     }
}

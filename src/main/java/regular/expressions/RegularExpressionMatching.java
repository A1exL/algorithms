package regular.expressions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

// https://leetcode.com/problems/regular-expression-matching/description/
 class RegularExpressionMatching {

    public boolean isMatch(String string, String pattern) {
        Deque<PatternToken> regexTokens = tokenize(pattern);
        char[] matchSource = string.toCharArray();

        AtomicBoolean matchResult = new AtomicBoolean(false);
        startMatchingLoop(regexTokens, matchSource, 0, matchResult);
        return matchResult.get();
    }

    private void startMatchingLoop(Deque<PatternToken> regexTokens, char[] inputChars, int charIndex, AtomicBoolean totalMatchFound) {
        if (totalMatchFound.get()) {
            return; // fast return if match is found
        }
        PatternToken token = regexTokens.poll();

        if (token == null && charIndex == inputChars.length) {
            totalMatchFound.set(true);
            return;  // we both finished all tokens and chars.
        }
        if (token == null) {
            return; // no tokens but have some chars left
        }
        MatchResult matchResult = token.matches(inputChars, charIndex);
        if (!matchResult.matched) {
            return; // no match found, leaving this branch
        }
        if (token.isStar) {
            for (int i = matchResult.matchedCharsAmount; i >= 0; i--) {
                startMatchingLoop(new LinkedList<>(regexTokens), inputChars, charIndex + i, totalMatchFound);
            }
        } else {
            startMatchingLoop(new LinkedList<>(regexTokens), inputChars, charIndex + 1, totalMatchFound);
        }
    }

    private Deque<PatternToken> tokenize(String pattern) {
        Deque<PatternToken> tokens = new LinkedList<>();
        char[] patternChars = pattern.toCharArray();
        for (int i = 0; i < patternChars.length; i++) {
            char patternChar = patternChars[i];
            if ('*' == patternChar) {
                continue; // processed in previous iteration
            }
            PatternToken token = new PatternToken();
            token.matchChar = patternChar;
            if (isAStar(patternChars, i + 1)) {
                token.isStar = true;
            }
            tokens.add(token);
        }
        return tokens;
    }

    private boolean isAStar(char[] patternChars, int index) {
        return index < patternChars.length && patternChars[index] == '*';
    }

    static class PatternToken {
        boolean isStar;
        char matchChar;

        @Override
        public String toString() {
            return matchChar + (isStar ? "*" : "");
        }

        MatchResult matches(char[] inputChars, int index) {
            MatchResult result = new MatchResult();
            result.token = this;

            if (isStar) {
                result.matched = true;
                greedyMatch(inputChars, index, result);
            } else { // single char match
                result.matched = index < inputChars.length && ((matchChar == '.') || (inputChars[index] == matchChar));
                if (result.matched) {
                    result.matchedCharsAmount = 1;
                }
            }
            return result;
        }

        private void greedyMatch(char[] inputChars, int index, MatchResult result) {
            for (int i = index; i < inputChars.length; i++) {
                boolean charMatched = (matchChar == '.') || (inputChars[i] == matchChar);
                if (charMatched) {
                    result.matchedCharsAmount += 1;
                } else {
                    break;
                }
            }
        }
    }

    static class MatchResult {
        PatternToken token;
        boolean matched;
        int matchedCharsAmount;
    }
}

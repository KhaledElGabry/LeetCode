class Solution {
    public String interpret(String command) {
        if (command.isEmpty() || command.length() > 100 || !command.contains("()") || !command.contains("(al)")
                || !command.contains("G")) {
            System.out.println("invalid input");
        }

        String goalParser = command;
        goalParser = goalParser.replace("()", "o");
        goalParser = goalParser.replace("(al)", "al");
        return goalParser;
    }
}
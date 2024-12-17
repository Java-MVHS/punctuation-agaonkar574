//Anisha Gaonkar
//12/13/24
//Punctuation.java
// Description: This Java program extracts words from a given string that contain punctuation marks
// (such as semicolons, commas, colons, apostrophes, question marks, and periods).
// It identifies these words, collects them, and prints them as a single output.

public class Punctuation {

    public static void main(String[] args) {

        // Create an instance of the Punctuation class
        Punctuation pc = new Punctuation();
        
        // Call the method to search and extract words with punctuation
        pc.searchIt();
    }

    // This method is responsible for initiating the extraction process.
    // It contains the string input with a famous speech and calls other methods to process it.
    public void searchIt() {
        // Define a long string containing the speech text
        String str = "\"Blood, Sweat, and Tears by Winston Churchill \" +\n"
                + "\"May 13, 1940\" +\n"
                + "\"Mr. Speaker:\" +\n"
                + "\"On Friday evening last I received His Majesty’s commission to form a\n"
                + "new \" +\n"
                + "\"Administration. It was the evident wish and will of Parliament and the\n"
                + "nation that this should be conceived on the broadest possible basis and that it should\n"
                + "include all parties, both those who supported the late Government and also the parties\n"
                + "of the Opposition.\" +\n"
                + "\"I have completed the most important part of this task. A War Cabinet has\n"
                + "been formed of five Members, representing, with the Liberal Opposition, the unity of the\n"
                + "nation. The three party Leaders have agreed to serve, either in the War Cabinet or in\n"
                + "high executive office. The three Fighting Services have been filled. It was necessary\n"
                + "that this should be done in one single day, on account of the extreme urgency and\n"
                + "rigour of events. A number of other key positions were filled yesterday, and I am\n"
                + "submitting a further list to His Majesty tonight. I hope to complete the appointment of the\n"
                + "principal Ministers during tomorrow. The appointment of the other Ministers usually\n"
                + "takes a little longer, but I trust that, when Parliament meets again, this part of my task\n"
                + "will be completed, and that the Administration will be complete in all respects.\" +\n"
                + "\"Sir, I considered it in the public interest to suggest that the House should\n"
                + "be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in\n"
                + "accordance with the powers conferred upon him by the Resolution of the House. At the\n"
                + "end of the proceedings today, the Adjournment of the House will be proposed until\n"
                + "Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The\n"
                + "business to be considered during that week will be notified to Members at the earliest\n"
                + "opportunity. I now invite the House, by the Resolution which stands in my name, to\n"
                + "record its approval of the steps taken and to declare its confidence in the new\n"
                + "Government.\" +\n"
                + "\"Sir, to form an Administration of this scale and complexity is a serious\n"
                + "undertaking in itself, but it must be remembered that we are in the preliminary stage of\n"
                + "one of the greatest battles in history, that we are in action at many points in Norway and\n"
                + "in Holland, that we have to be prepared in the Mediterranean, that the air battle is\n"
                + "continuous and that many preparations have to be made here at home. In this crisis I\n"
                + "hope I may be pardoned if I do not address the House at any length today. I hope that \n"
                + "any of my friends and colleagues, or former colleagues, who are affected by the political\n"
                + "reconstruction, will make all allowances for any lack of ceremony with which it has been\n"
                + "necessary to act. I would say to the House, as I said to those who’ve joined this\n"
                + "government: \\\"I have nothing to offer but blood, toil, tears and sweat.\\\"\" +\n"
                + "\"We have before us an ordeal of the most grievous kind. We have before\n"
                + "us many, many long months of struggle and of suffering. You ask, what is our policy? I\n"
                + "will say: It is to wage war, by sea, land and air, with all our might and with all the\n"
                + "strength that God can give us; to wage war against a monstrous tyranny, never\n"
                + "surpassed in the dark and lamentable catalogue of human crime. That is our policy. You\n"
                + "ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in\n"
                + "spite of all terror, victory, however long and hard the road may be; for without victory,\n"
                + "there is no survival. Let that be realised; no survival for the British Empire, no survival\n"
                + "for all that the British Empire has stood for, no survival for the urge and impulse of the\n"
                + "ages, that mankind will move forward towards its goal. \" +\n"
                + "\"But I take up my task with buoyancy and hope. I feel sure that our cause\n"
                + "will not be suffered to fail among men. At this time I feel entitled to claim the aid of all,\n"
                + "and I say, \\\"Come then, let us go forward together with our united strength.\\\"";
        
        // Call the method to extract words with punctuation and store the result
        String punctuationWords = getPunctuationWords(str);
        
        // Print the words with punctuation marks
        printWords(punctuationWords);
    }

    // This method takes in a string and returns a string containing only the words that contain punctuation.
    public String getPunctuationWords(String wordIn) {
        String words = new String("");  // Store words with punctuation
        String word = new String("");   // Store current word being processed
        
        // Loop through each character of the input string
        for (int i = 0; i < wordIn.length(); i++) {
            // If a space is found, check if the word has punctuation
            if (wordIn.charAt(i) == ' ') {
                if (checkForPunctuation(word)) {
                    words += word + " ";  // Add the word to the result if it contains punctuation
                }
                word = "";  // Reset the current word
            } else {
                word += wordIn.charAt(i);  // Add the character to the current word
            }
        }
        return words;  // Return the result with words containing punctuation
    }

    // This method checks if a word contains any punctuation marks like comma, period, colon, etc.
    public boolean checkForPunctuation(String wordIn2) {
        // Check if any of the common punctuation marks exist in the word
        return (wordIn2.indexOf(';') != -1 || wordIn2.indexOf(',') != -1 ||
                wordIn2.indexOf(':') != -1 || wordIn2.indexOf('\'') != -1 ||
                wordIn2.indexOf('?') != -1 || wordIn2.indexOf('.') != -1);
    }

    // This method prints out the words that contain punctuation
    public void printWords(String wordsIn) {
        // Print the result to the console
        System.out.println("\n\n\n");
        System.out.println(wordsIn);
        System.out.println("\n\n\n");
    }
}

/*
 * Linear Search Problem 2: Search for a Specific Word in a List of Sentences
Problem:
You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
Approach:
Iterate through the list of sentences.
For each sentence, check if it contains the specific word.
If the word is found, return the current sentence.
If no sentence contains the word, return "Not Found".
 */

 
public class SpecificWordInList {

    public static void main(String[] args) {
        String arr[]={"Tikesh is an Intelligent boy","He is the general secretary of students council ","He is also the Anti-Ragging committee head"};
        System.out.println("Target word is : "+ "Intelligent");
        String ans=null;
        for(String it:arr){
           if(it.contains("Intelligent")){
            ans=it;
           }
        }

        if(!ans.equals(null)) System.out.println("Sentence with target word is : " +ans);
        else System.out.println("Sentence is not present");
    }
    
}
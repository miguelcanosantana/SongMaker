package com.miguel.songmaker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SongMaker {
  public static void main(String[] args) {
    
    
    
    //If number of arguments is not correct show message
    if (args.length != 1) {
      System.out.println("");
      System.out.println(" 🎵——————————————————————————————————————————————🎵");
      System.out.println("  Please launch SongMaker with only one Argument");
      System.out.println(" 🎵——————————————————————————————————————————————🎵");
      System.out.println("");
      System.out.println("   🎶Use the Argument to specify the name🎶");
      System.out.println("               🎶of the song.🎶");
      System.out.println("");

      //If correct number of args
    } else {
      
        try{
          //Write document to written.txt
          BufferedWriter bwr = new BufferedWriter(new FileWriter(args[0] + ".lyrics"));
          
          //INTRO
          System.out.println("");
          System.out.println(" 🎵——————————————————————————————————————————————🎵");
          System.out.println("              Welcome to SongMaker");
          System.out.println(" 🎵——————————————————————————————————————————————🎵");
          System.out.println("");
          System.out.println("   🎶Based on some parameters lyrics for a song🎶");
          System.out.println("     🎶of yours will be generated in a file.🎶");
          System.out.println("");
          
          
          //SETUP
          Scanner s = new Scanner(System.in);
          
            //Times Song Structure Repeats
            int repeatStructure;
            
            do {
              System.out.print("Choose the times the structure of the song will repeat: ");
              repeatStructure = s.nextInt();
              
            } while ( (repeatStructure < 1) );
            
            System.out.print("");
          
            //Mood of the song
            String mood;
            
            do {
              System.out.print("Choose the Mood of the song: happy | sad | angry: ");
              mood = s.nextLine();
              
            } while ( (!mood.equals("happy")) && (!mood.equals("sad")) && (!mood.equals("angry")) );
            
            System.out.print("");
            
            //Custom Words
            System.out.println("...Now You will be asked for some words...");
            System.out.print("");
            
              //Place
              String place;
              do {
                System.out.print("Write a place name: ");
                place = s.nextLine();
              } while (place.isEmpty() || place.equals(" "));
              System.out.print("");
              
              
              //Colour
              String colour;
              do {
                System.out.print("Write a colour: ");
                colour = s.nextLine();
              } while (colour.isEmpty() || colour.equals(" "));
              System.out.print("");
              
              
              //Part of body
              String body;
              do {
                System.out.print("Write a part of the body: ");
                body = s.nextLine();
              } while (body.isEmpty() || body.equals(" "));
              System.out.print("");
              
              
              //Person's name
              String name;
              do {
                System.out.print("Write the name of a person: ");
                name = s.nextLine();
              } while (name.isEmpty() || name.equals(" "));
              System.out.print("");
              
              
              //Objects1
              String object;
              do {
                System.out.print("Write the name of objects (for example 'dreams'): ");
                object = s.nextLine();
              } while (object.isEmpty() || object.equals(" "));
              System.out.print("");
              
              //Objects2
              String object2;
              do {
                System.out.print("Write the name of objects (for example 'mountains'): ");
                object2 = s.nextLine();
              } while (object2.isEmpty() || object2.equals(" "));
              System.out.print("");
              
              
              //Hate
              String hate;
              do {
                System.out.print("Write something you hate so much: ");
                hate = s.nextLine();
              } while (hate.isEmpty() || hate.equals(" "));
              System.out.print("");
              
              
              //Country
              String country;
              do {
                System.out.print("Write the name of a country: ");
                country = s.nextLine();
              } while (country.isEmpty() || country.equals(" "));
              System.out.print("");
              
              
              //Action 1
              String action1;
              do {
                System.out.print("Write the name of an action (for example 'follow'): ");
                action1 = s.nextLine();
              } while (action1.isEmpty() || action1.equals(" "));
              System.out.print("");
              
              
              //Action 2
              String action2;
              do {
                System.out.print("Write the name of another action (for example 'move'): ");
                action2 = s.nextLine();
              } while (action2.isEmpty() || action2.equals(" "));
              System.out.print("");
              
              
              

        //GENERATE SONG
        int counter =  repeatStructure;
        
        while (counter > 0){

               
            /*Lines Number*/ 
            String line1;
            String line2;
            String line3;
            String line4;
            String line5;
            String line6;
            String line7;
            String line8;
            String line9;
            String line10;
            String line11;
            String line12;
            String line13;
            String line14;
            String line15;
            String line16;
            String line17;
            
            
              //Sad
              if (mood.equals("sad")){
                line1 = "Every day feels worse than okey,";
                bwr.write(line1 + "\n");
                line2 = "And my " + object + " are scaring me.";
                bwr.write(line2 + "\n");
                line3 = "I will, delete my " + object2 + " forever,";
                bwr.write(line3 + "\n");
                line4 = "Never, try to forget them ";
                bwr.write(line4 + "\n");
                line5 = "Think in " + colour + " helps me,";
                bwr.write(line5 + "\n");
                line6 = "To not being who I am.";
                bwr.write(line6 + "\n");
                line7 = "";
                bwr.write(line7 + "\n");
                line8 = "If my " + body + " wakes up happier,";
                bwr.write(line8 + "\n");
                line9 = "I'll just get grumpier." ;
                bwr.write(line9 + "\n");
                line10 = "";
                bwr.write(line10 + "\n");
              }
              //Happy
              if (mood.equals("happy")){
                line1 = "Everything is hard to do the first time,";
                bwr.write(line1 + "\n");
                line2 = "But if I get away from " + hate + ", I will succed sometimes.";
                bwr.write(line2 + "\n");
                line3 = "I will, " + action1 + " my " + object + " forever,";
                bwr.write(line3 + "\n");
                line4 = name + " ,we'll travel together,";
                bwr.write(line4 + "\n");
                line5 = "To " + country + " no matter the bad weather,";
                bwr.write(line5 + "\n");
                line6 = "Your " + body + " is as light as a feather.";
                bwr.write(line6 + "\n");
                line7 = "";
                bwr.write(line7 + "\n");
                line8 = "If I believe I can do anything, I can " + action2 + " " + object2 + ",";
                bwr.write(line8 + "\n");
                line9 = "I can " + action2 + " " + object2 + "." ;
                bwr.write(line9 + "\n");
                line10 = "";
                bwr.write(line10 + "\n");
              }           
              
              //Angry
              if (mood.equals("angry")){
                line1 = "Every thing that I think,";
                bwr.write(line1 + "\n");
                line2 = "Is hating " + name + " because of " + hate + ", that thing...";
                bwr.write(line2 + "\n");
                line3 = "I wish, " + name + " was a normal person,";
                bwr.write(line3 + "\n");
                line4 = "Nope, " + name + " isn't a person,";
                bwr.write(line4 + "\n");
                line5 = name + " is just a bunch of " + object +".";
                bwr.write(line5 + "\n");
                line6 = "I will try to " + action1 + " " + name +" forever,";
                bwr.write(line6 + "\n");
                line7 = "And send that pile of " + object + " to " + place +" whatsoever,";
                bwr.write(line7 + "\n");
                line8 = "Will get that " + body + " " + colour + " coloured,";
                bwr.write(line8 + "\n");
                line9 = "Will get that coloured.";
                bwr.write(line9 + "\n");
                line10 = "";
                bwr.write(line10 + "\n");
              }

            //Main part lines
            line11 = "Na na na na na.";
            bwr.write(line11 + "\n");
            line12 = "La la la la la.";
            bwr.write(line12 + "\n");
            line13 = "I want the "+ colour +".";
            bwr.write(line13 + "\n");
            line14 = "Na na na na na.";
            bwr.write(line14 + "\n");
            line15 = "La la la la la.";
            bwr.write(line15 + "\n");
            line16 = "I want the "+ colour +".";
            bwr.write(line16 + "\n");
            line17 = "";
            bwr.write(line17 + "\n");
            
        
            
          counter--;
          
          } 
        bwr.close();
              

        } catch(IOException io) {
          
          System.out.println("Recording Error");
          System.out.println("System error: " + io);
        
        }
      
      
    }
  
  
  
  
  }
  
}

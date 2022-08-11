//package text_adventure;

/**
 * File:   Text_Adventure.java
 * Author: Aamir Khan
 * Date:   7-19-2022 @ 9:00 AM
 */
public class Text_Adventure {

    public static void main(String[] args) {
        String name;
        int levels=5;
        //Introduction:
        intro();
        System.out.println("Press Enter to proceed. ");
        //Creating an anonymous scanner object to wait on the user until enter is pressed.
        new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter Your Adventurer Name: ");
        //Creating an anonymous scanner object to read in our name.
        name=new java.util.Scanner(System.in).nextLine();
        //Create a player object:
        Player player=new Player(name,100);       //Starting with 100 hp.
        //An array to hold which levels we cleared.
        boolean [] levelClrd=new boolean[levels]; //We have 5 levels.
        //A for loop construct:
        for(int i=0;i<levels;i++){
            levelClrd[i]=false; //We begin by saying none of the levels are cleared.
        }
        int curLevel=1; //We are currently on level 1.
        System.out.println("\nYou enter level 1 of the dungeon, and it seems");
        System.out.println("like there's a puzzle that you need to solve.");
        System.out.println("\nWritten on the wall is the following message:");
        System.out.println("To advance to the next level, choose the proper path.");
        System.out.println("One leads to your next destination and the other will be your last.");
        System.out.println("On the left, there's a winding and narrow path.");
        System.out.println("On the right, there's a straight path with light at the end.");
        int choice=-1;
        while(choice!=1&&choice!=2){
            System.out.println("Which path do you choose? ");
            System.out.println("1. Left path.");
            System.out.println("2. Right path.");
            //Creating an anonymous scanner object to read in our choice.
            choice=new java.util.Scanner(System.in).nextInt();
        }
        if(choice==1){
            System.out.println("\nYou chose the right path and a new passageway revealed itself");
            System.out.println("at the end of the left path. You now move onto level 2.");
            levelClrd[curLevel-1]=true; //We cleared the first level.
            curLevel++;
            System.out.println("Press Enter to proceed to the next level. ");
            //Creating an anonymous scanner object to wait on the user until enter is pressed.
            new java.util.Scanner(System.in).nextLine();
            System.out.println("\nIn the next level, you come across a weird creature");
            System.out.println("blocking the entrance to level 3. It has a black body");
            System.out.println("resembling that of a bear and has long claws that look deadly.");
            System.out.println("The only way past is to defeat it, so you prepare yourself for combat.");
            //Create an enemy object:
            Enemy creature=new Enemy("Creature",40); //The enemy has 40 hp points.
            do{
                choice=-1; //We reset our choice variable.
                while(choice!=1&&choice!=2&&choice!=3){
                System.out.println("What do you do?");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Boost");
                //Creating an anonymous scanner object to read in our choice.
                choice=new java.util.Scanner(System.in).nextInt();
                }
                //An if-else if-else block:
                if(choice==1){
                    //Determine how much damage we deal:
                    if(player.isBoosted()){ //If we have a boost...
                        creature.setHealth(creature.getHealth()-20);
                    }
                    else{
                    creature.setHealth(creature.getHealth()-15);
                    }
                    //Output an attack message.
                    player.attack(); 
                }
                else if(choice==2){
                    player.heal();
                }
                else{
                    player.boost();
                }
                if(creature.getHealth()>0){ //We only let the creature make a move if he's still alive.
                    //Randomly decide what the opponent will do using an anonymous rand object.
                    int oppChoice=new java.security.SecureRandom().nextInt(3)+1;
                    //An if-else if-else block:
                    if(oppChoice==1){
                        //Determine how much damage we deal:
                        if(creature.isBoosted()){ //If we have a boost...
                            player.setHealth(player.getHealth()-15); //The player is damaged.
                        }
                        else{//Otherwise, the creature deals 10 damage.
                            player.setHealth(player.getHealth()-10); //The player is damaged.
                        }
                        //Output an attack message.
                        creature.attack(); 
                    }
                    else if(oppChoice==2){
                        creature.heal();
                    }
                    else{
                        creature.boost();
                    }
                }
                //Output the health stats only if we're still alive:
                if(player.getHealth()>0)
                    System.out.println(player.getName()+" has "+player.getHealth()+" hp points.");
                if(creature.getHealth()>0)
                    System.out.println(creature.getName()+" has "+creature.getHealth()+" hp points.");
            }while(creature.getHealth()>0&&player.getHealth()>0); //If the creature dies or I die, we exit.
            if(player.getHealth()<=0){ //If we died...
                System.out.println("\nYou were mauled by the creature and bled out.");
                System.out.println("You couldn't save your partner nor could you");
                System.out.println("save yourself. You died in pain and suffering.");
                System.out.println("GAME OVER...");
                System.exit(1); //Exit the game.
            }
            else{
                System.out.println("\nYou made it past the strange creature with some health to spare.");
                System.out.println("You run through the entrance to level 3 as you make your way closer");
                System.out.println("to finding your partner.");
                levelClrd[curLevel-1]=true; //We have cleared level 2.
                curLevel++;
                System.out.println("\nYou've cleared the following levels.");
                for(int i=0;i<levels;i++){
                    if(levelClrd[i]==true)
                        System.out.printf("Cleared level %d.%n",i+1);
                }
                System.out.println("Press Enter to proceed to the next level. ");
                //Creating an anonymous scanner object to wait on the user until enter is pressed.
                new java.util.Scanner(System.in).nextLine();
                System.out.println("\nYou now make your way to level 3.");
                System.out.println("You're guided to another puzzle to solve for this level.");
                System.out.println("\nAt the far end of the room, there's a strange device with 3 buttons.");
                System.out.println("It appears like we need to somehow use these buttons.");
                System.out.println("The following message is etched onto the walls:");
                System.out.println("The correct sequence will open your eyes, but");
                System.out.println("mistake a button and water will rise.");
                System.out.println("The only hint you're given is that the sequence begins");
                System.out.println("with either button 2 or 3.");
                do{
                    choice=-1; //We reset our choice variable.
                    System.out.println("What sequence do you choose? ");
                    System.out.println("1. 213");
                    System.out.println("2. 231");
                    System.out.println("3. 312");
                    System.out.println("4. 321");
                    //Creating an anonymous scanner object to read in our choice.
                    choice=new java.util.Scanner(System.in).nextInt();
                }while(choice!=1&&choice!=2&&choice!=3&&choice!=4);
                if(choice==3){
                    System.out.println("\nYou chose the correct sequence of buttons.");
                    System.out.println("A pathway appears behind the device leading you");
                    System.out.println("to level 4 of the dungeon. You're slowly making");
                    System.out.println("your way closer to your partner who must be on level 5.");
                    System.out.println("What exactly did your partner get himself into?");
                    System.out.println("Was he kidnapped or has he already met a tragic death?");
                    System.out.println("There's only one way to find out and that's moving forward.");
                    levelClrd[curLevel-1]=true; //We have cleared level 3.
                    curLevel++;
                    System.out.println("\nYou've cleared the following levels.");
                    for(int i=0;i<levels;i++){
                        if(levelClrd[i]==true)
                            System.out.printf("Cleared level %d.%n",i+1);
                    }
                    System.out.println("Press Enter to proceed to the next level. ");
                    //Creating an anonymous scanner object to wait on the user until enter is pressed.
                    new java.util.Scanner(System.in).nextLine();
                    System.out.println("You enter level 4 of the dungeon, and immediately");
                    System.out.println("you're met with a pitch black surrounding that's hard");
                    System.out.println("to move around in. You hear 2 voices calling out to you.");
                    System.out.println("The first voice whispers that it knows where your partner is.");
                    System.out.println("The second voice whispers that it knows where the exit is.");
                    do{
                        choice=-1; //We reset our choice variable.
                        System.out.println("Do you follow after the first voice, second voice, or neither? ");
                        System.out.println("1. First voice.");
                        System.out.println("2. Second voice.");
                        System.out.println("3. Neither.");
                        //Creating an anonymous scanner object to read in our choice.
                        choice=new java.util.Scanner(System.in).nextInt();
                    }while(choice!=1&&choice!=2&&choice!=3);
                    if(choice==1){
                        System.out.println("The voice guides you to the edge of the level, and");
                        System.out.println("a mysterious force pushes you off the edge to your death.");
                        System.out.println("You were misguided and led to your death.");
                        System.out.println("GAME OVER...");
                        System.exit(1); //Exit the game.
                    }
                    else if(choice==3){
                        System.out.println("You lose track of where you are and struggle to find");
                        System.out.println("a source of light. Just when you think you've found a");
                        System.out.println("light source, hundreds of scorpions sting you poisoning ");
                        System.out.println("you to your death. GAME OVER...");
                        System.exit(1); //Exit the game.
                    }
                    else{
                        System.out.println("\nYou chose the right voice to follow, and make your way");
                        System.out.println("to level 4's exit and on to the last level of the dungeon.");
                        System.out.println("The exit is very tight and once you go in, there's no way");
                        System.out.println("back. You decide to still make your way forward in hopes of");
                        System.out.println("saving your partner, whose safety is questionable.");
                        levelClrd[curLevel-1]=true; //We have cleared level 4.
                        curLevel++;
                        System.out.println("\nYou've cleared the following levels.");
                        for(int i=0;i<levels;i++){
                            if(levelClrd[i]==true)
                                System.out.printf("Cleared level %d.%n",i+1);
                        }
                        System.out.println("Press Enter to proceed to the next level. ");
                        //Creating an anonymous scanner object to wait on the user until enter is pressed.
                        new java.util.Scanner(System.in).nextLine();
                        System.out.println("You make your way to level 5 of the dungeon.");
                        System.out.println("Upon entering, you feel a heavy aura surrounding the level.");
                        System.out.println("You notice a strange hunchback figure staring straight at you,");
                        System.out.println("as though it were staring into your soul. It's gaze pierces");
                        System.out.println("your confidence as you realize that it might be responsible");
                        System.out.println("for your partner's disappearance. You ask where your partner is");
                        System.out.println(", but all the figure does is smile back with the most evil of smiles.");
                        System.out.println("You catch a glimpse of another figure behind the first, huddled in fear.");
                        System.out.println("You see your partner at last crying to be saved, but there's a hurdle");
                        System.out.println("you must face before you can get to your partner.");
                        //Create a Boss object as our boss:
                        Boss boss=new Boss("Hunchback",100); //100 hp points.
                        do{
                            choice=-1; //We reset our choice variable.
                            while(choice!=1&&choice!=2&&choice!=3){
                            System.out.println("What do you do?");
                            System.out.println("1. Attack");
                            System.out.println("2. Heal");
                            System.out.println("3. Boost");
                            //Creating an anonymous scanner object to read in our choice.
                            choice=new java.util.Scanner(System.in).nextInt();
                            }
                            //An if-else if-else block:
                            if(choice==1){
                                //Determine how much damage we deal:
                                if(player.isBoosted()){ //If we have a boost...
                                    boss.setHealth(boss.getHealth()-20);
                                }
                                else{
                                boss.setHealth(boss.getHealth()-15);
                                }
                                //Output an attack message.
                                player.attack(); 
                            }
                            else if(choice==2){
                                player.heal();
                            }
                            else{
                                player.boost();
                            }
                            if(boss.getHealth()>0){ //We only let the boss make a move if he's still alive.
                                //Randomly decide what the opponent will do using an anonymous rand object.
                                int oppChoice=new java.security.SecureRandom().nextInt(3)+1;
                                //An if-else if-else block:
                                if(oppChoice==1){
                                    //Determine how much damage we deal:
                                    if(boss.isBoosted()){ //If we have a boost...
                                        player.setHealth(player.getHealth()-25); //The player is damaged.
                                    }
                                    else{//Otherwise, the boss deals 15 damage.
                                        player.setHealth(player.getHealth()-15); //The player is damaged.
                                    }
                                    //Output an attack message.
                                    boss.attack(); 
                                }
                                else if(oppChoice==2){
                                    boss.heal();
                                }
                                else{
                                    boss.boost();
                                }
                            }
                            //Output the health stats only if we're still alive:
                            if(player.getHealth()>0)
                                System.out.println(player.getName()+" has "+player.getHealth()+" hp points.");
                            if(boss.getHealth()>0)
                                System.out.println(boss.getName()+" has "+boss.getHealth()+" hp points.");
                        }while(boss.getHealth()>0&&player.getHealth()>0); //If the boss dies or I die, we exit.
                        if(player.getHealth()<=0){ //If we died...
                            System.out.println("\nOn the verge of saving your partner,");
                            System.out.println("he witnesses your death right before his eyes.");
                            System.out.println("Before he can make out what happened, he is killed");
                            System.out.println("immediately after leaving no remains behind.");
                            System.out.println("All of your efforts were in vain as you both lost your lives.");
                            System.out.println("GAME OVER...");
                            System.exit(1); //Exit the game.
                        }
                        else{
                            levelClrd[curLevel-1]=true; //We have cleared level 5.
                            curLevel++;
                            System.out.println("\nYou finish off the hunchback boss with a finishing blow.");
                            System.out.println("You see your partner just past the hunchback's body.");
                            System.out.println("You run towards your partner to check if he's alright.");
                            System.out.println("He has broken bones all over his body, so you decide to");
                            System.out.println("carry him. You both notice a light at the end of the level, so");
                            System.out.println("you make your way to the light. As you get closer, your");
                            System.out.println("consciousness starts fading and you collapse.");
                            System.out.println("Press Enter to proceed. ");
                            //Creating an anonymous scanner object to wait on the user until enter is pressed.
                            new java.util.Scanner(System.in).nextLine();
                            System.out.println("... You awake to find yourself in your room with your partner");
                            System.out.println("beside you. You jump up and start crying as you hug him.");
                            System.out.println("He looks confused, and asks what's wrong with you. You look");
                            System.out.println("shocked as you realize he has none of the injuries you saw him ");
                            System.out.println("with. As you try to make sense of what's going on, nothing");
                            System.out.println("seems to make sense to you. There's only one explanation...");
                            System.out.println("It then dawns on you that this was all a nightmare. Or was it?");
                            System.out.println("\nYou've cleared the following levels.");
                            for(int i=0;i<levels;i++){
                                if(levelClrd[i]==true)
                                    System.out.printf("Cleared level %d.%n",i+1);
                            }
                        }
                    }
                }
                else{
                    System.out.println("\nYou chose the wrong sequence of buttons.");
                    System.out.println("The water level started rising rapidly.");
                    System.out.println("You struggled to make it to higher ground, but there");
                    System.out.println("was no escape, and you were drowned alive.");
                    System.out.println("You died without making it to your partner's rescue.");
                    System.out.println("GAME OVER...");
                    System.exit(1); //Exit the game.
                }
            }
        }
        else{
            System.out.println("\nYou chose the wrong path and the ground underneath you");
            System.out.println("gave out. You fell into a spiked pit filled with snakes");
            System.out.println("to your death. You weren't able to save your partner.");
            System.out.println("GAME OVER...");
        }
        
        
    }
    //Additional Intro Method.
    public static void intro(){
        System.out.println("... You wake up to what seems to be a normal day, ");
        System.out.println("but you quickly realize that something feels completely off.");
        System.out.println("Your room seems too quiet and it feels unnaturally empty.");
        System.out.println("You can't find your adventuring partner at all. No matter where");
        System.out.println("you look, you don't hear him nor do you see him. The last thing you");
        System.out.println("remember was that he went out the day before to check out the new");
        System.out.println("dungeon that appeared in the city. He had told you that it would be");
        System.out.println("a quick trip and nothing to worry about, but he still hasn't come back.");
        System.out.println("You get worried, so you decide to head to the marketplace to gather some");
        System.out.println("information on where he was last seen. You're hoping to find some help.");
        System.out.println("... After asking around, you verify that your partner was last seen entering");
        System.out.println("the dungeon, so you decide to enter the dungeon at last.");
        System.out.println("You need to sign up with the adventure guild in order to enter the dungeon,");
        System.out.println("so that's you're next step.");
    }
}

//package com.example.medieval_marvels_and_might;
//
//import android.os.Bundle;
//import androidx.core.widget.TextViewCompat;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.util.Log;
//import android.util.TypedValue;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.medieval_marvels_and_might.ArmourFiles.Armour;
//import com.example.medieval_marvels_and_might.ArmourFiles.Helmet;
//import com.example.medieval_marvels_and_might.ArmourFiles.Shirt;
//import com.example.medieval_marvels_and_might.ArmourFiles.Shoe;
//import com.example.medieval_marvels_and_might.ArmourFiles.Trouser;
//import com.example.medieval_marvels_and_might.Enemies.BossEnemy;
//import com.example.medieval_marvels_and_might.Enemies.Enemy;
//import com.example.medieval_marvels_and_might.Game.Art;
//import com.example.medieval_marvels_and_might.Game.Player;
//import com.example.medieval_marvels_and_might.Weapons.Weapon;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.Scanner;
//
//public class MainActivity extends AppCompatActivity implements Serializable {
//
//
//    ImageView mainImageView;
//
//    TextView mainTextView;
//
//    Button userResponse0Button;
//
//    Button userResponse1Button;
//
//    Button userResponse2Button;
//
//    Button userResponse3Button;
//
//    Button userExitButton;
//
//    Button userSubmitButton;
//
//    EditText userTextInput;
//
//    int userChoice = -1;
//
//
//    private static final long serialVersionUID = 1L;
//
//    /* Instance Variables */
//    private Player player;
//
////    private Game.Player player;
//
//    private Enemy enemy;
//
////    private String progress;
//
//    private String chest;
//    private String chestTwo;
//
//    private String doorOne;
//    private String zombie;
//
//    private String enemy2;
//
//    private String enemy3;
//    private int zombieHealth = 4;
//    private int zombieDamage = 2;
//
//    private String userTextInputCollected;
//
//    private boolean validAnswer = false;
//
//    Enemy zombieKing = new Enemy("Zombie King", 20, 20);
//
//    BossEnemy loki = new BossEnemy("Loki God Of Mischeif", 35, 25, 4);
//
//
//    //    Level1 level1;
//    private static String progress = "level1";
//    static boolean newGame = false;
//
//    MainActivity mainActivity = new MainActivity();
//    //        Scanner console = new Scanner(System.in);
//    MedievalGame game = new MedievalGame();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        int autoSizeMinTextSize = 6;
//        int autoSizeMaxTextSize = 30;
//        int autoSizeStepGranularity = 1;
//        int unit = TypedValue.COMPLEX_UNIT_SP;
//
//
//        mainImageView = findViewById(R.id.iv_main_image);
//        mainTextView = findViewById(R.id.tv_main_user_text);
//        Log.d("MainActivity", "mainTextView: " + mainTextView);
//
//        userResponse0Button = findViewById(R.id.btn_main_0);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userResponse0Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//        userResponse1Button = findViewById(R.id.btn_main_1);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userResponse1Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//        userResponse2Button = findViewById(R.id.btn_main_2);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userResponse2Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//        userResponse3Button = findViewById(R.id.btn_main_3);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userResponse3Button, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//        userExitButton = findViewById(R.id.btn_main_exit);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userExitButton, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//        userSubmitButton = findViewById(R.id.btn_main_submit);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userSubmitButton, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//
//        userTextInput = findViewById(R.id.ett_main_user_text);
//        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(
//                userTextInput, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
//
//
//        // TODO 4-E: set onClickListener for each answer Button
//
//        userResponse0Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectOption(0);
//            }
//        });
//
//        userResponse0Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectOption(1);
//            }
//        });
//
//        userResponse0Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectOption(2);
//            }
//        });
//
//        userResponse0Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectOption(3);
//            }
//
//        });
//
//
//        // TODO 5-A: set onClickListener for the submit answer Button
//
//        userSubmitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onAnswerSubmission();
//
//            }
//
//        });
//
//
//        userExitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectOption(4);
//            }
//
//        });
//
//        runGame();
//
//    }
//
//    /* Main Method */
//
//    public void startUp() {
//        runGame();
//
//
//    }
//
//    public void runGame() {
//
//////        MainActivity mainActivity = new MainActivity();
////        Scanner console = new Scanner(System.in);
////        MedievalGame game = new MedievalGame();
//
//        mainActivity.player = mainActivity.start();
//
//        if (newGame == true) {
//            mainActivity.newGame(mainActivity, console);
//        } else {
//            mainActivity.addDelay(1500);
//            System.out.println("Loading character...");
//            mainTextView.setText("Loading character...");
//
//            mainActivity.addDelay(2000);
//            System.out.println("Now let's print out your character again to make sure everything loaded:");
//            mainTextView.setText("Loading character...");
//
//
//            mainActivity.addDelay(500);
//            System.out.println(mainActivity.player);
//            mainTextView.setText(mainActivity.player.toString());
//
//            nextLevel();
//        }
//    }
//
//    public void nextLevel() {
//        switch (progress) {
//
//            case "level1":
////        boolean level1InProgress = true;
//                while (progress.equalsIgnoreCase("level1")) {
//                    progress = "level1";
//                    mainActivity.addDelay(2000);
//                    System.out.println("\nYou discover a chest. Would you like to open it? Type y for yes, n for no, s for save, x for exit.");
//                    //                  String chest = console.next().toLowerCase();
//
//                    int chest = userTextInputCollected;
//
//                    while (true) {
//                        if (chest==0)) {
//                            System.out.println("You open the chest to find a helmet. You put it on.");
//                            Helmet platedHelmet = new Helmet("Plated ArmourFiles.Helmet", 5, 8);
//                            mainActivity.player.setHelmet(platedHelmet);
//                            System.out.println(mainActivity.player);
//                            mainActivity.addDelay(2000);
//                            progress = "level2";
//                            break;
//                        } else if (chest == 1)) {
//                            System.out.println("You choose not to open the chest. An onlooker observes your honesty and gives you a pair of boots.");
//                            Shoe leatherboots = new Shoe("Leather Boots", 10, 10);
//                            mainActivity.player.setShoe(leatherboots);
//                            System.out.println(mainActivity.player);
//                            progress = "level2";
//                            break;
//                        } else if (chest==2) {
//                            System.out.println("Please enter your save mainActivity name.");
//                            //String savedFileName = console.nextLine();
//                            //mainActivity.save(console);
//                            break;
//                        } else if (chest==3) {
//                            System.out.println("Please enter your save mainActivity name.");
//                            //String savedFileName = console.nextLine();
//                            //mainActivity.save(console);
//                            break;
//                        } else if (chest==4) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
//                            System.out.println("Please try again, your options are y or n to open the chest.");
//                            chest = console.next().toLowerCase();
//                        }
//                    }
//                    nextLevel();
//                }
////            break;
//
//            case "level2":
//                while (progress.equalsIgnoreCase("level2")) {
//                    System.out.println("\nYou discover a Zombie. The Zombie has " + mainActivity.zombieHealth + " health and " + mainActivity.zombieDamage + " damage. Would you like to attack it? Type y for yes, n for no, s for save, x for exit.");
//                    mainActivity.zombie = console.next().toLowerCase();
//                    while (true) {
//                        if (mainActivity.zombie.equalsIgnoreCase("y")) {
//                            System.out.println("\nYou attack the zombie");
//                            int currentWeaponDamage = mainActivity.player.getCurrentWeaponDamage();
//                            while (true) {
//                                if (currentWeaponDamage >= mainActivity.zombieHealth) {
//                                    mainActivity.addDelay(2000);
//                                    mainActivity.zombieHealth -= currentWeaponDamage;
//                                    System.out.println("You have killed the Zombie and taken no damage.");
//                                    Weapon longSword = new Weapon("Long Sword", 12);
//                                    mainActivity.player.setCurrentWeapon(longSword);
//                                    System.out.println("The Zombie was carrying a Long Sword which you claim as your own.");
//                                    System.out.println(mainActivity.player);
//                                    progress = "level3";
//                                    System.out.println("Please enter your save game name.");
//                                    String savedFileName = console.nextLine();
//                                    mainActivity.save(console);
//                                    break;
//                                } else {
//                                    mainActivity.addDelay(2000);
//                                    System.out.println("\nYou have damaged the Zombie");
//                                    mainActivity.zombieHealth -= currentWeaponDamage;
//                                    System.out.println("The Zombie now has " + mainActivity.zombieHealth + " health.");
//                                    System.out.println("\nThe Zombie has attacked you with " + mainActivity.zombieDamage + " damage.");
//                                    mainActivity.player.takeDamage(mainActivity.zombieDamage);
//                                }
//                            }
//                            break;
//                        } else if (mainActivity.zombie.equalsIgnoreCase("n")) {
//                            System.out.println("You choose not to attack the Zombie. The Zombie attacks you in the back as you run away.");
//                            mainActivity.player.takeDamage(mainActivity.zombieDamage * 1.5);
//                            progress = "level3";
//                            break;
//
//                        } else if (mainActivity.zombie.equalsIgnoreCase("s")) {
//                            System.out.println("Please enter your save game name.");
//                            String savedFileName = console.nextLine();
//                            mainActivity.save(console);
//                            break;
//                        } else if (mainActivity.zombie.equalsIgnoreCase("x")) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
//                            System.out.println("Please try again, your options are y or n to attack the Zombie, s to Save or x to exit");
//                            mainActivity.zombie = console.next().toLowerCase();
//                        }
//                    }
//                }
//
//            case "level3":
//                while (progress.equalsIgnoreCase("level3")) {
//                    System.out.println("\nYou discover a chest. Would you like to open it? Type y for yes, n for no, s for save, x for exit.");
//                    mainActivity.chestTwo = console.next().toLowerCase();
//                    while (true) {
//                        if (mainActivity.chestTwo.equalsIgnoreCase("y")) {
//                            mainActivity.addDelay(2000);
//                            System.out.println("You open the chest to find some chain mail. You put it on.");
//                            Armour chainMail = new Armour("Chain Mail", 10, 10);
//                            mainActivity.player.setArmour(chainMail);
//                            System.out.println(mainActivity.player);
//                            mainActivity.addDelay(2000);
//                            progress = "level4";
//                            break;
//                        } else if (mainActivity.chestTwo.equalsIgnoreCase("n")) {
//                            System.out.println("You choose not to open the chest. An observer thinks it must be locked and bashes it with their mace. They discover some Chain Mail inside and leave their own armor behind.");
//                            Armour platedArmor = new Armour("Plated Armor", 7, 6);
//                            mainActivity.player.setArmour(platedArmor);
//                            System.out.println(mainActivity.player);
//                            progress = "level4";
//                            break;
//                        } else if (mainActivity.chestTwo.equalsIgnoreCase("s")) {
//                            System.out.println("Please enter your save game name.");
//                            String savedFileName = console.nextLine();
//                            mainActivity.save(console);
//                            break;
//                        } else if (mainActivity.chestTwo.equalsIgnoreCase("x")) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
//                            System.out.println("Please try again, your options are y or n to open the chest.");
//                            mainActivity.chestTwo = console.next().toLowerCase();
//                        }
//                    }
//                }
//            case "level4":
//                while (progress.equalsIgnoreCase("level4")) {
//                    System.out.println("\nYou discover a " + mainActivity.zombieKing.getEnemyName() + " .The Zombie King has " + mainActivity.zombieKing.getEnemyHealth() + " health and " + mainActivity.zombieKing.getEnemyDamage() + " damage. Would you like to attack it? Type y for yes, n for no, s for save, x for exit.");
//                    mainActivity.enemy2 = console.next().toLowerCase();
//                    while (true) {
//                        if (mainActivity.enemy2.equalsIgnoreCase("y")) {
//                            System.out.println("\nYou attack the " + mainActivity.zombieKing.getEnemyName());
//                            int currentWeaponDamage = mainActivity.player.getCurrentWeaponDamage();
//                            int zombieKingHealth = mainActivity.zombieKing.getEnemyHealth();
//                            while (true) {
//                                if (currentWeaponDamage >= zombieKingHealth) {
//                                    mainActivity.addDelay(2000);
//                                    zombieKingHealth -= currentWeaponDamage;
//                                    System.out.println("You have killed the " + mainActivity.zombieKing.getEnemyName() + " and taken no damage.");
//                                    System.out.println("The " + mainActivity.zombieKing.getEnemyName() + " drops a key. You use it to open a chest. Inside is a pair of chain mail trousers.");
//                                    Trouser chainMailTrousers = new Trouser("Chain Mail Trousers", 10, 10);
//                                    mainActivity.player.setTrouser(chainMailTrousers);
//                                    System.out.println(mainActivity.player);
//                                    progress = "level5";
//                                    System.out.println("Please enter your save game name.");
//                                    String savedFileName = console.nextLine();
//                                    mainActivity.save(console);
//                                    progress = "level5";
//                                    break;
//                                } else {
//                                    mainActivity.addDelay(2000);
//                                    System.out.println("\nYou have damaged the " + mainActivity.zombieKing.getEnemyName());
//                                    zombieKingHealth -= currentWeaponDamage;
//                                    System.out.println("The " + mainActivity.zombieKing.getEnemyName() + " now has " + zombieKingHealth + " health.");
//                                    System.out.println("\nThe Zombie has attacked you with " + mainActivity.zombieKing.getEnemyDamage() + " damage.");
//                                    mainActivity.player.takeDamage(mainActivity.zombieKing.getEnemyDamage());
//                                }
//                            }
//                            break;
//                        } else if (mainActivity.enemy2.equalsIgnoreCase("n")) {
//                            System.out.println("You choose not to attack the Zombie. The Zombie attacks you in the back as you run away.");
//                            mainActivity.player.takeDamage(mainActivity.zombieKing.getEnemyDamage() / 2);
//                            progress = "level5";
//                            break;
//                        } else if (mainActivity.enemy2.equalsIgnoreCase("s")) {
//                            System.out.println("Please enter your save mainActivity name.");
//                            String savedFileName = console.nextLine();
//                            mainActivity.save(console);
//                            break;
//                        } else if (mainActivity.enemy2.equalsIgnoreCase("x")) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
//                            System.out.println("Please try again, your options are y or n to attack the Zombie, s to Save or x to exit");
//                            mainActivity.enemy2 = console.next().toLowerCase();
//                        }
//                    }
//                }
//
//            case "level5":
//                while (progress.equalsIgnoreCase("level5")) {
//                    System.out.println("\nYou discover a door. Would you like to open it? Type y for yes, n for no, s for save, x for exit.");
//                    mainActivity.doorOne = console.next().toLowerCase();
//                    while (true) {
//                        if (mainActivity.doorOne.equalsIgnoreCase("y")) {
//                            mainActivity.addDelay(2000);
//                            System.out.println("You open the door to find some a leather jacket. You put it on.");
//                            Shirt leatherJacket = new Shirt("Leather Jacket", 3, 3);
//                            mainActivity.player.setShirt(leatherJacket);
//                            System.out.println(mainActivity.player);
//                            mainActivity.addDelay(2000);
//                            progress = "level6";
//                            break;
//                        } else if (mainActivity.doorOne.equalsIgnoreCase("n")) {
//                            System.out.println("You choose not to open the door. An observer thinks it must be locked and bashes it with their mace. They discover some Chain Mail inside and leave their own armor behind.");
//                            Armour platedArmor = new Armour("Plated Armor", 7, 6);
//                            mainActivity.player.setArmour(platedArmor);
//                            System.out.println(mainActivity.player);
//                            progress = "level6";
//                            break;
//
//                        } else if (mainActivity.doorOne.equalsIgnoreCase("s")) {
//                            System.out.println("Please enter your save mainActivity name.");
//                            String savedFileName = console.nextLine();
//                            mainActivity.save(console);
//                            break;
//                        } else if (mainActivity.doorOne.equalsIgnoreCase("x")) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
//                            System.out.println("Please try again, your options are y or n to open the chest.");
//                            mainActivity.doorOne = console.next().toLowerCase();
//                        }
//                    }
//                }
//            case "level6":
//                while (progress.equalsIgnoreCase("level6")) {
//                    System.out.println("\nYou discover " + mainActivity.loki.getEnemyName() + " .He has " + mainActivity.loki.getEnemyHealth() + " health and " + mainActivity.loki.getEnemyDamage() + " damage. Would you like to attack it? Type y for yes, n for no, s for save, x for exit.");
//                    mainActivity.enemy3 = console.next().toLowerCase();
//
//                    while (true) {
//                        if (mainActivity.enemy3.equalsIgnoreCase("y")) {
//                            System.out.println("\nYou attack " + mainActivity.loki.getEnemyName());
//                            int currentWeaponDamage = mainActivity.player.getCurrentWeaponDamage();
//
//                            int lokiHealth = mainActivity.loki.getEnemyHealth();
//                            while (true) {
//
//                                if (currentWeaponDamage >= lokiHealth) {
//                                    mainActivity.addDelay(2000);
//                                    lokiHealth -= currentWeaponDamage;
//                                    System.out.println("You have killed " + mainActivity.loki.getEnemyName() + " and taken no damage.");
//                                    Trouser chainMailTrousers = new Trouser("Chain Mail Trousers", 10, 10);
//                                    Weapon flamingSword = new Weapon("Flaming Sword", 24);
//                                    System.out.println(mainActivity.loki.getEnemyName() + " drops a key. You use it to open a chest. Inside is a pair of " + chainMailTrousers.getArmourName() + " and a " + flamingSword.getName() + ".");
//                                    mainActivity.player.setCurrentWeapon(flamingSword);
//                                    mainActivity.player.setTrouser(chainMailTrousers);
//                                    System.out.println(mainActivity.player);
//                                    System.out.println("Please enter your save mainActivity name.");
//                                    String savedFileName = console.nextLine();
//                                    mainActivity.save(console);
//                                    System.out.println("Congratulations you have defeated the boss and completed the mainActivity. Well done!");
//                                    progress = "level7";
//                                    System.exit(1);
//                                    break;
//                                } else {
//                                    mainActivity.addDelay(2000);
//                                    System.out.println("\nYou have damaged the " + mainActivity.loki.getEnemyName());
//                                    lokiHealth -= currentWeaponDamage;
//                                    System.out.println("The " + mainActivity.loki.getEnemyName() + " now has " + lokiHealth + " health.");
//                                    System.out.println("\n" + mainActivity.loki.getEnemyName() + "has attacked you with " + mainActivity.loki.getEnemyDamage() + " damage.");
//                                    mainActivity.player.getArmour().reduceDurability(mainActivity.loki.getReduceDurability());
//                                    mainActivity.player.getShirt().reduceDurability(mainActivity.loki.getReduceDurability());
//                                    mainActivity.player.getShoe().reduceDurability(mainActivity.loki.getReduceDurability());
//                                    mainActivity.player.getHelmet().reduceDurability(mainActivity.loki.getReduceDurability());
//                                    mainActivity.player.getTrouser().reduceDurability(mainActivity.loki.getReduceDurability());
//                                    System.out.println(mainActivity.player);
//                                    mainActivity.player.takeDamage(mainActivity.loki.getEnemyDamage());
////                        break;
//
//                                }
////                    break;
//                            }
//                            break;
//                        } else if (mainActivity.enemy3.equalsIgnoreCase("n")) {
//                            System.out.println("You choose not to attack. " + mainActivity.loki.getEnemyName() + " attacks you in the back as you run away.");
//                            mainActivity.player.takeDamage(mainActivity.loki.getEnemyDamage() / 2);
//                            progress = "level7";
//                            System.out.println("Your cowardly actions have not gone unnoticed, the King has thrown you in jail and you journey is at an end. Better luck next time.");
//                            System.exit(0);
//                            break;
//
//                        } else if (mainActivity.enemy3.equalsIgnoreCase("s")) {
//                            System.out.println("Please enter your save mainActivity name.");
//                            String savedFileName = console.nextLine();
//                            mainActivity.save(console);
//                            break;
//                        } else if (mainActivity.enemy3.equalsIgnoreCase("x")) {
//                            System.out.println("Goodbye Traveller, return soon to conquer to hordes of evil!");
//                            System.exit(0);
//                            break;
//                        } else {
////                    progress = "level7";
//                            System.out.println("Please try again, your options are y or n to attack the Zombie, s to Save or x to exit");
//                            mainActivity.enemy2 = console.next().toLowerCase();
//                        }
//                    }
//                }
//                break;
//
//
//        }
//
//    } // End of main
//
//
//
//
//
//
//    /* Instance Methods */
//    private Player start(/*Scanner console*/) {
//        // Add start functionality here
//        Player player;
//        Art.homeScreen();
//
//        System.out.println("Welcome Traveller");
//
//        if (mainTextView != null) {
//            mainTextView.setText("Welcome Traveller");
//        }
//        addDelay(1000);
//        System.out.println("Would you like to start a new game? Y for yes, or N for No to load a previous game.");
//
//        if (mainTextView != null) {
//            mainTextView.setText("Would you like to start a new game? Y for yes, or N for No to load a previous game.");
//        }
//
//        String answer = console.nextLine();
//        String yes = "Y";
//        String no = "N";
//        if (answer.equalsIgnoreCase(yes)) {
//            newGame = true;
//            System.out.println("What would you like your adventurer to be named?");
//            String desiredPlayerName = console.nextLine();
//            player = new Player(desiredPlayerName);
//            return player;
//        } else if (answer.equalsIgnoreCase(no)) {
//            System.out.println("What is the name of your save file?");
//            String loadFileName = console.nextLine() + ".svr";
//            player = load(loadFileName, console);
//            return player;
//
//        } else {
//            newGame = true;
//            System.out.println("Sorry that input was not valid, we have created a new player for you with a great generic name ;)");
//            player = new Player("Generic Knight");
//            return player;
//        }
//    } // End of start
//
//    private String save(Scanner console) {
//        // Add save functionality here
////        String fileName = player.getName() + ".svr";
//        String chosenName = console.nextLine();
//        String fileName = chosenName + ".svr";
//        try {
//
//            FileOutputStream userSaveFile = new FileOutputStream(fileName);
//            ObjectOutputStream playerSaver = new ObjectOutputStream(userSaveFile);
//            playerSaver.writeObject(player);
//            playerSaver.writeObject(progress);
//            System.out.println("We've just saved your game with file name " + chosenName);
//
//            return fileName;
//        } catch (IOException e) {
//            System.out.println("Cannot Save");
//            String cannotSave = "Cannot Save";
//            return cannotSave;
//        }
//    }
//
//    private Player load(String playerName, Scanner console) {
//        // Add load functionality here
//
//        Player loadedPlayer;
//
//        try {
//
//            FileInputStream loadedSaveFile = new FileInputStream(playerName);
//            ObjectInputStream loadedObjectFile = new ObjectInputStream(loadedSaveFile);
//            loadedPlayer = (Player) loadedObjectFile.readObject();
//            this.progress = (String) loadedObjectFile.readObject();
//
//
//            return loadedPlayer;
//        } catch (IOException | ClassNotFoundException e) {
//
//            addDelay(2000);
//            System.out.println("Unable to load file. We have created a new player with the name you have entered " + playerName + ".");
//            addDelay(4000);
//
//            loadedPlayer = new Player(playerName);
//
//            return loadedPlayer;
//            // End of load
//        }
//
//    }
//
//    public void newGame(MainActivity mainActivity, Scanner console) {
//        mainActivity.addDelay(500);
//        System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
//        System.out.println(mainActivity.player);
//
//        mainActivity.addDelay(1000);
//        System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it. Please enter your save game name.");
//        String savedFileName = mainActivity.save(console);
//
//
//        mainActivity.addDelay(2000);
////        System.out.println("We just saved your game...");
//        System.out.println("Now we are going to try to load your character to make sure the save worked...");
//
//        mainActivity.addDelay(1000);
//        System.out.println("Deleting character...");
////        String saveName = savedFileName;
//        mainActivity.player = null;
//
//        mainActivity.addDelay(1500);
//        mainActivity.player = mainActivity.load(savedFileName, console);
//        System.out.println("Loading character...");
//
//        mainActivity.addDelay(2000);
//        System.out.println("Now let's print out your character again to make sure everything loaded:");
//
//        mainActivity.addDelay(500);
//        System.out.println(mainActivity.player);
//    }
//
//
//    private void addDelay(int time) {
//        try {
//            Thread.sleep(time);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private void selectOption(int answerSelection) {
//
//        userChoice = answerSelection;
//        if (answerSelection == 0) {
//            userResponse0Button.setText("✔ " + "yes");
//            userResponse1Button.setText("no");
//            userResponse2Button.setText("Save");
//            userResponse3Button.setText("Load");
//            validAnswer = true;
//        } else if (answerSelection == 1) {
//            userResponse0Button.setText("yes");
//            userResponse1Button.setText("✔" + "no");
//            userResponse2Button.setText("Save");
//            userResponse3Button.setText("Load");
//            validAnswer = true;
//        } else if (answerSelection == 2) {
//            userResponse0Button.setText("yes");
//            userResponse1Button.setText("no");
//            userResponse2Button.setText("✔ " +  "Save");
//            userResponse3Button.setText("Load");
//            validAnswer = true;
//        } else if (answerSelection == 3) {
//            userResponse0Button.setText("yes");
//            userResponse1Button.setText("no");
//            userResponse2Button.setText("Save");
//            userResponse3Button.setText("✔ "+ "Load");
//            validAnswer = true;
//        } else {
//            validAnswer = false;
//        }
//    }
//
//
//    public void onAnswerSubmission() {
//        nextLevel();
//    }
//
//
//
//}
//
//}
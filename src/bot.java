
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bot {
    public static String greetUser(){
        System.out.println("Hi user");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static String repeatName(){
        System.out.println("Please repeat your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi " + name + "! It's nice to meet you." );
        return name;
    }
    public static int guessAge(String name){
        System.out.println("I think I can guess your age.");
        System.out.println("Just answer these 7 questions.");
        double age = 0;
        //age ranges 20s, 30s, 40s, 50+s,

        String[] story = {};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(story));


        // Asks and give answer choices
        System.out.println("What kind of milk do you drink? ");
        System.out.println("A: Cow's Milk"); //50s+
        System.out.println("B: Almond Milk"); //30s
        System.out.println("C: Soy Milk"); //40s
        System.out.println("D: Another Non-dairy alternative"); //20s

        //saves the users answer
        Scanner input = new Scanner(System.in);
        String milk = input.nextLine();

        //checks for valid answer and turns answer into age
        age = milkAge(age, milk);
        while(!(milk.toLowerCase().equals("a") || milk.toLowerCase().equals("b")|| milk.toLowerCase().equals("c") || milk.toLowerCase().equals("d"))){
            System.out.println("Sorry that isn't an answer choice. Please enter A, B, C, or D. ");
            milk = input.nextLine();
            age = milkAge(age, milk);
        }

        // Adds milk result to message array
        switch (milk.toLowerCase()) {
            case "a":
                arrayList.add("cow's milk");
                story = arrayList.toArray(story);
                break;
            case "b":
                arrayList.add("almond milk");
                story = arrayList.toArray(story);
                break;
            case "c":
                arrayList.add("soy milk");
                story = arrayList.toArray(story);
                break;
            case "d":
                arrayList.add("other non-dairy alternative");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }


        //Asks question and saves answer
        System.out.println("How many glasses of water have you had today?");
        int water = input.nextInt();

        // Adds answer to the story array
        arrayList.add(String.valueOf(water));
        story = arrayList.toArray(story);

        // Changes age based on answer choice
        if(water < 2){
            age = age + 20;
        } else if(water < 4){
            age = age + 30;
        } else if(water < 6){
            age = age + 40;
        } else {
            age = age + 50;
        }

        //Asks question and saves the answer
        System.out.println("How do you watch TV?");
        System.out.println("A: Only cable TV");
        System.out.println("B: Only streaming services");
        System.out.println("C: I watch both");
        System.out.println("D: I don't watch TV ever");
        input = new Scanner(System.in);
        String tv = input.nextLine();

        //checks for valid answer and turns answer into age
        age = tvAge(age, tv);
        while(!(tv.toLowerCase().equals("a") || tv.toLowerCase().equals("b")|| tv.toLowerCase().equals("c") || tv.toLowerCase().equals("d"))){
            System.out.println("Sorry that isn't an answer choice. Please enter A, B, C, or D. ");
            tv = input.nextLine();
            age = tvAge(age, tv);
        }

        // Adds tv result to message array
        switch (tv.toLowerCase()) {
            case "a":
                arrayList.add("only cable tv");
                story = arrayList.toArray(story);
                break;
            case "b":
                arrayList.add("only streaming services");
                story = arrayList.toArray(story);
                break;
            case "c":
                arrayList.add("both cable tv and streaming services");
                story = arrayList.toArray(story);
                break;
            case "d":
                arrayList.add("does not watch tv ever");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }

        //Asks question and saves the answer
        System.out.println("How often do you make your bed?");
        System.out.println("A: Every day");
        System.out.println("B: Most days");
        System.out.println("C: Occasionally");
        System.out.println("D: Never");
        input = new Scanner(System.in);
        String bed = input.nextLine();

        //checks for valid answer and turns answer into age
        age = bedAge(age, bed);
        while(!(bed.toLowerCase().equals("a") || bed.toLowerCase().equals("b")|| bed.toLowerCase().equals("c") || bed.toLowerCase().equals("d"))){
            System.out.println("Sorry that isn't an answer choice. Please enter A, B, C, or D. ");
            bed = input.nextLine();
            age = bedAge(age, bed);
        }

        // Adds bed result to message array
        switch (bed.toLowerCase()) {
            case "a":
                arrayList.add("every day");
                story = arrayList.toArray(story);
                break;
            case "b":
                arrayList.add("most days");
                story = arrayList.toArray(story);
                break;
            case "c":
                arrayList.add("occasionally");
                story = arrayList.toArray(story);
                break;
            case "d":
                arrayList.add("never");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }

        //Asks question and saves the answer
        System.out.println("Do you have string lights, faux vines, or LED strip lights in your bedroom?");
        System.out.println("A: Yes");
        System.out.println("B: No");
        input = new Scanner(System.in);
        String lights = input.nextLine();

        //checks for valid answer and turns answer into age
        age = lightsAge(age, lights);
        while(!(lights.toLowerCase().equals("a") || lights.toLowerCase().equals("b")|| lights.toLowerCase().equals("yes") || lights.toLowerCase().equals("no"))){
            System.out.println("Sorry that isn't an answer choice. Please enter Yes, No, A, or B ");
            lights = input.nextLine();
            age = lightsAge(age, lights);
        }

        // Adds lights result to message array
        switch (lights.toLowerCase()) {
            case "a":
            case "yes":
                arrayList.add("yes");
                story = arrayList.toArray(story);
                break;
            case "b":
            case "no":
                arrayList.add("no");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }

        //Asks question and saves the answer
        System.out.println("If frozen food says you can cook it in the microwave or oven, which do you choose?");
        System.out.println("A: Microwave");
        System.out.println("B: Oven");
        System.out.println("C: It depends on what it is");
        input = new Scanner(System.in);
        String cook = input.nextLine();

        //checks for valid answer and turns answer into age
        age = cookAge(age, cook);
        while(!(cook.toLowerCase().equals("a") || cook.toLowerCase().equals("b")|| cook.toLowerCase().equals("c"))){
            System.out.println("Sorry that isn't an answer choice. Please enter A, B, or C. ");
            cook = input.nextLine();
            age = cookAge(age, cook);
        }

        // Adds cook result to message array
        switch (cook.toLowerCase()) {
            case "a":
                arrayList.add("microwave");
                story = arrayList.toArray(story);
                break;
            case "b":
                arrayList.add("oven");
                story = arrayList.toArray(story);
                break;
            case "c":
                arrayList.add("both microwave and oven");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }

        //Asks question and saves the answer
        System.out.println("Which of these apps do you use the most?");
        System.out.println("A: Instagram");
        System.out.println("B: TikTok");
        System.out.println("C: Pinterest");
        System.out.println("D: Facebook");
        System.out.println("E: Twitter");
        input = new Scanner(System.in);
        String apps = input.nextLine();

        //checks for valid answer and turns answer into age
        age = appsAge(age, apps);
        while(!(apps.toLowerCase().equals("a") || apps.toLowerCase().equals("b")|| apps.toLowerCase().equals("c") || apps.toLowerCase().equals("d") || apps.toLowerCase().equals("e"))){
            System.out.println("Sorry that isn't an answer choice. Please enter A, B, C, D, or E. ");
            apps = input.nextLine();
            age = appsAge(age, apps);
        }

        // Adds apps result to message array
        switch (apps.toLowerCase()) {
            case "a":
                arrayList.add("Instagram");
                story = arrayList.toArray(story);
                break;
            case "b":
                arrayList.add("TikTok");
                story = arrayList.toArray(story);
                break;
            case "c":
                arrayList.add("Pinterest");
                story = arrayList.toArray(story);
                break;
            case "d":
                arrayList.add("Facebook");
                story = arrayList.toArray(story);
                break;
            case "e":
                arrayList.add("Twitter");
                story = arrayList.toArray(story);
                break;
            default:
                break;
        }
        System.out.println("Bot has figured it out!");
        System.out.println("You are " + Math.round(age / 7) + " years old.");


        System.out.println("It's story time! ");
        System.out.println("There is a " + Math.round(age /7) + " year old named " + name + " who loves to drinks " + story[0] + " but also had "
                + story[1] + " cup(s) of water today. " + name + " watches " + story[2]
                + " in their free time and " + story[3] + "makes their bed. Does " + name
                + " have cool lights in their house? The answer is " + story[4] + " and they use the " + story[5]
                + " took cook their frozen food. If you want to hang out with " + name
                + ", the best way to get in contact with them is to find them on " + story[6] + ".");

        return (int) Math.round(age / 7);
    }

    private static double milkAge(double age, String milk) {
        switch (milk.toLowerCase()) {
            case "a":
                age = age + 50;
                break;
            case "b":
                age = age + 30;

                break;
            case "c":
                age = age + 40;
                break;
            case "d":
                age = age + 20;
                break;
            default:
                break;
        }
        return age;
    }
    private static double tvAge(double age, String tv) {
        switch (tv.toLowerCase()) {
            case "a":
                age = age + 40;
                break;
            case "b":
                age = age + 20;
                break;
            case "c":
                age = age + 30;
                break;
            case "d":
                age = age + 50;
                break;
            default:
                break;
        }
        return age;
    }
    private static double bedAge(double age, String bed) {
        switch (bed.toLowerCase()) {
            case "a":
                age = age + 50;
                break;
            case "b":
                age = age + 40;
                break;
            case "c":
                age = age + 30;
                break;
            case "d":
                age = age + 20;
                break;
            default:
                break;
        }
        return age;
    }
    private static double lightsAge(double age, String lights) {
        switch (lights.toLowerCase()) {
            case "a":
                age = age + 50;
                break;
            case "b":
                age = age + 40;
                break;
            case "yes":
                age = age + 30;
                break;
            case "no":
                age = age + 20;
                break;
            default:
                break;
        }
        return age;
    }
    private static double cookAge(double age, String cook) {
        switch (cook.toLowerCase()) {
            case "a":
                age = age + 25;
                break;
            case "b":
                age = age + 45;
                break;
            case "c":
                age = age + 35;
                break;
            default:
                break;
        }
        return age;
    }
    private static double appsAge(double age, String apps) {
        switch (apps.toLowerCase()) {
            case "a":
                age = age + 30;
                break;
            case "b":
                age = age + 20;
                break;
            case "c":
                age = age + 35;
                break;
            case "d":
                age = age + 50;
                break;
            case "e":
                age = age + 40;
                break;
           default:
                break;
        }
        return age;
    }

    public static void countTo(){
        System.out.println("What number would you like to count to?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i <= n; i++){
            System.out.println(i);
        }
    }

    public static void testQuestion(){
        System.out.println("What would be the correct way to print 'Howdy Partner' to the console, using Java.");
        System.out.println("A: console.writeline(\"Howdy Partner\");");
        System.out.println("B: echo \"Howdy Partner\";");
        System.out.println("C: System.out.println(\"Howdy Partner\");");
        System.out.println("D: print(\"Howdy Partner\");");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        while(!(answer.toLowerCase().equals("c"))){
            System.out.println("Sorry, wrong answer! Try again");
            answer = input.nextLine();
        }
        System.out.println("Correct! Great job!");
    }

    public static void phrases(){
        System.out.println("Enter a number between 1 and 7 to here what I enjoy about each day of the week.");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while(n<1){
            System.out.println("You must enter a whole number between 1 and 7. Please try again");
            n = input.nextInt();
        }
        while(n>7){
            System.out.println("You must enter a whole number between 1 and 7. Please try again");
            n = input.nextInt();
        }
        if(n == 1){
            System.out.println("Monday is an opportunity to start fresh");
        } else if(n==2){
            System.out.println("The most efficiently restorative sleep generally occurs on Tuesday nights");
        } else if(n==3){
            System.out.println("On Wednesday, when the sky is blue, and I have nothing else to do, I sometimes wonder if it's true that who is what and what is who");
        } else if(n==4){
            System.out.println("Thursday always goes out of its way to praise you publicly and give mannered criticism privately");
        }else if(n==5){
            System.out.println("One of the reasons I love Fridays is because you love Fridays.  It means that you (and most of the people I know) are in a better mood");
        }else if(n==6){
            System.out.println("On Saturdays, the possibilities are so endless.");
        }else if(n==7){
            System.out.println("Sundays are for the best types of food");
        }
    }

    public static void main(String[] args) {
        greetUser();
        String name = repeatName();
        int age = guessAge(name);
        phrases();

    }

}

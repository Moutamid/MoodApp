package com.moutamid.moodapp;

import java.util.Arrays;
import java.util.List;

public class Compliments {
    private List<String> angryCompliments = Arrays.asList("Anger makes you smaller, while forgiveness forces you to grow beyond what you were.", "Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.", "Do not let your anger lead to hatred, as you will hurt yourself more than you would the other.", "There's nothing wrong with anger provided you use it constructively.", "The best fighter is never angry.", "Never do anything when you are in a temper, for you will do everything wrong.", "If you are patient in one moment of anger, you will escape a hundred days of sorrow.", "Don't waste your time in anger, regrets, worries, and grudges. Life is too short to be unhappy.");

    private List<String> annoyedCompliments = Arrays.asList("Some people take offense like it's a limited time offer.", "You can never be annoyed by anyone when you are just alone, insults comes from being too familiar even with the most respectful persons.", "People have an annoying habit of remembering things they should’t.");
    private List<String> calmCompliments = Arrays.asList("You are the sky. Everything else – it’s just the weather.", "Whoever calm and sensible is insane!", "It's calm under the waves in the blue of my oblivion.");
    private List<String> happyCompliments = Arrays.asList("You’re a natural at whatever you do!", "Your creativity is on another level!", "You’re irreplaceable.", "You are more amazing than you realize.", "Everyone needs a friend like you in their life.");
    private List<String> hungryCompliments = Arrays.asList("Cooking is best habit - Cook and Enjoy", "Sometime Hunger is good for Heal");
    private List<String> nervousCompliments = Arrays.asList("Relax; the world's not watching that closely. It's too busy contemplating itself in the mirror.", "The silence was worse than the gunshots. The wait worse than the confusion. The forebode worse\nthan any danger.", "I think it’s glorious to be nervous. Being nervous is great! How often do we get nervous on a daily basis? Being slightly nervous means you care, and you’re alive, and you’re taking some kind of risk.");
    private List<String> sadCompliments = Arrays.asList("Your smile is contagious. Smile for 90 Seconds", "I bet you make babies smile.", "You have the best laugh.", "You light up the room. Please Smile", "If cartoon bluebirds were real, a couple of 'em would be sitting on your shoulders singing right now.", "You're like sunshine on a rainy day.", "Jokes are funnier when you tell them.");
    private List<String> sickCompliments = Arrays.asList("The reason many people in our society are miserable, sick, and highly stressed is because of an unhealthy attachment to things they have no control over.", "Get well Soon", "The most poetical thing in the world is not being sick.");
    private List<String> sleepyCompliments = Arrays.asList("There is no sunrise so beautiful that it is worth waking me up to see it.", "I’m so good at sleeping that I can do it with my eyes closed.", "My mother told me to follow my dreams, so I took a nap.");

    public List<String> getSadCompliments() {
        return this.sadCompliments;
    }

    public List<String> getHappyCompliments() {
        return this.happyCompliments;
    }

    public List<String> getSleepyCompliments() {
        return this.sleepyCompliments;
    }

    public List<String> getNervousCompliments() {
        return this.nervousCompliments;
    }

    public List<String> getCalmCompliments() {
        return this.calmCompliments;
    }

    public List<String> getSickCompliments() {
        return this.sickCompliments;
    }

    public List<String> getAnnoyedCompliments() {
        return this.annoyedCompliments;
    }

    public List<String> getAngryCompliments() {
        return this.angryCompliments;
    }

    public List<String> getHungryCompliments() {
        return this.hungryCompliments;
    }
}

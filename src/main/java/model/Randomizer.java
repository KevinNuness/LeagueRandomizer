package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Randomizer {
    
        Random random = new Random();
       
        public String[] ChampionsNames = { 
            
        "Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Aphelios", "Ashe",
        "Aurelion Sol", "Azir", "Bardo", "Blitzcrank", "Brand", "Braum", "Caitlyn",
        "Camille", "Cassiopeia", "Cho'Gath", "Corki", "Darius", "Diana", "Dr. Mundo", "Draven",
        "Ekko", "Elise", "Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio",
        "Gangplank", "Garen","Gnar", "Gragas", "Graves", "Gwen", "Hecarim", "Heimerdinger",
        "Illaoi", "Irelia", "Ivern", "Janna", "Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx",
        "Kai'Sa", "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kayn",
        "Kennen", "Kha'Zix", "Kindred", "Kled", "Kog'Maw", "LeBlanc", "Lee Sin", "Leona",
        "Lillia", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar", "Maokai",
        "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus",
        "Neeko", "Nidalee", "Nocturne", "Nunu & Willump", "Olaf", "Orianna", "Ornn", "Pantheon",
        "Poppy", "Pyke", "Qiyana", "Quinn", "Rakan", "Rammus", "Rek'Sai", "Rell", "Renekton",
        "Rengar", "Riven", "Rumble", "Ryze", "Samira", "Sejuani", "Senna", "Seraphine", "Sett",
        "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka",
        "Swain", "Sylas", "Syndra", "Tahm Kench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh",
        "Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Twitch", "Udyr", "Urgot", "Varus",
        "Vayne", "Veigar", "Vel'Koz", "Vi", "Viego", "Viktor", "Vladimir", "Volibear", "Warwick",
        "Wukong", "Xayah", "Xerath", "Xin Zhao", "Yasuo", "Yone", "Yorick", "Yuumi", "Zac", "Zed",
        "Ziggs", "Zilean", "Zoe", "Zyra", "Gwen", "Akshan", "Vex", "Zeri", "Renata Glasc",
        "Bel'Veth", "Nilah", "K'Sante", "Milio", "Naafiri", "Briar", "Hwei", "Smolder"
            
        };
        
        ArrayList<String> Champions = new ArrayList<>(Arrays.asList(ChampionsNames));
               
        public String randomChamp(){
        
        int selection = random.nextInt(167);
        return Champions.get(selection);            
     }   
        
        String[] LanesNames = { "Mid", "Top", "Jungler", "Support", "Adc" };
            
            ArrayList <String> Lanes = new ArrayList <>(Arrays.asList(LanesNames));
            
        public String randomLane(){
        
            int selection = random.nextInt(4);
            return Lanes.get(selection);
        }  
 }
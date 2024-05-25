package model;

/**
 * The Randomizer class represents a combination of a lane and a champion for use in a randomization application.
 */
public class Randomizer {
    
    /**
     * The lane selected by the randomizer.
     */
    private String lane;
    
    /**
     * The champion selected by the randomizer.
     */
    private String champion;
    
    /**
     * The unique identifier for the randomizer instance.
     */
    private int id;
    
    /**
     * Constructs a new Randomizer instance with default values.
     */
    public Randomizer(){
        this("", "", 0);
    }
    
    /**
     * Constructs a new Randomizer instance with the specified lane, champion, and identifier.
     * 
     * @param lane The lane selected by the randomizer.
     * @param champion The champion selected by the randomizer.
     * @param id The unique identifier for the randomizer instance.
     */
    public Randomizer(String lane, String champion, int id){
        this.lane = lane;
        this.champion = champion;
        this.id = id;
    }
    
    /**
     * Retrieves the lane selected by the randomizer.
     * 
     * @return The lane selected by the randomizer.
     */
    public String getLane(){
        return lane;
    }
    
    /**
     * Sets the lane selected by the randomizer.
     * 
     * @param lane The lane selected by the randomizer.
     */
    public void setLane(String lane){
        this.lane = lane;
    }
    
    /**
     * Retrieves the champion selected by the randomizer.
     * 
     * @return The champion selected by the randomizer.
     */
    public String getChampion(){
        return champion;
    }
    
    /**
     * Sets the champion selected by the randomizer.
     * 
     * @param champion The champion selected by the randomizer.
     */
    public void setChampion(String champion){
        this.champion = champion;
    }
    
    /**
     * Retrieves the unique identifier for the randomizer instance.
     * 
     * @return The unique identifier for the randomizer instance.
     */
    public int getId(){
        return id;
    }
    
    /**
     * Sets the unique identifier for the randomizer instance.
     * 
     * @param id The unique identifier for the randomizer instance.
     */
    public void setId(int id){
        this.id = id;
    }
}

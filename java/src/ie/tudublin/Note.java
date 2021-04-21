package ie.tudublin;

public class Note 
{

    private char note;
    private int duration;
    private String type;

    public char getNote() 
    {
        return note;
    }

    public void setNote(char note)
    {
        this.note = note;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Note(char note, int duration, String type)
    {
        this.note = note;
        this.duration = duration;
        this.type = type;
    }

    public String toString()
    {
        return "     " + note + "     " + duration + "     "+ type;
    }


    
}

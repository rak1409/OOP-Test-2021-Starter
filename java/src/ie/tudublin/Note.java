package ie.tudublin;

public class Note {

    private String note;
    private int duration;

    public String getNote() 
    {
        return note;
    }

    public void setNote(String note)
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

    public String toString()
    {
        return "This is Note:" + note + "and has duration of" + duration + " .";
    }


    
}

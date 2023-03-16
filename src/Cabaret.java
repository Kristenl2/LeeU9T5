import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer performer){
        if(!performers.contains(performer)) {;
            performers.add(performer);
            return true;
        }else{
            return false;
        }
    }

    public boolean removePerformer(Performer performer){
        if(performers.contains(performer)) {;
            performers.remove(performer);
            return true;
        }else{
            return false;
        }
    }

    public double averagePerformerAge(){
        double sum = 0.0;
        for(Performer age: performers){
            sum += age.getAge();
        }
        return sum/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int lim){
        ArrayList<Performer> overAge= new ArrayList<>();
        for(Performer age: performers){
            if(age.getAge()>=lim){
                overAge.add(age);
            }
        }
        return overAge;
    }

    public void groupRehearsal(){
        for(Performer performer: performers){
            System.out.println("REHEARSAL CALL! " + performer.getName());
            performer.rehearse();
        }
    }

    public void cabaretShow(){
        for(Performer performer: performers){
            System.out.println("Welcome to the cabaret! Next act up..." + performer.getName());
            if(performer instanceof Dancer) {
                ((Dancer)performer).pirouette(2);
                performer.perform();
            }else{
                performer.perform();
            }
        }
    }
}

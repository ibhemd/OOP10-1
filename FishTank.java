import java.util.ArrayList;
import java.util.List;

public class FishTank {

    public ArrayList<Seacreature> creatures;

    public FishTank() {
        this.creatures = new ArrayList<Seacreature>();
    }

    public void addCreature(Seacreature c) throws ExceptionIsLeviathan {
        if (c instanceof Leviathan) {
            throw new ExceptionIsLeviathan();
        } else {
            this.creatures.add(c);
        }
    }

    <T> List<T> filter(T creature) {
        List<T> listOfCreatures = new ArrayList();
        for(int i = 0; i < this.creatures.size(); i++) {
            if(creature.getClass().isInstance(this.creatures.get(i))) {
                listOfCreatures.add(creature);
            }
        }
        return listOfCreatures;
    }

}

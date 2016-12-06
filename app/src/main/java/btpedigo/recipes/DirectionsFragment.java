package btpedigo.recipes;

/**
 * Created by bpedi on 12/1/2016.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}

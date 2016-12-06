package btpedigo.recipes;

/**
 * Created by bpedi on 12/1/2016.
 */

public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}

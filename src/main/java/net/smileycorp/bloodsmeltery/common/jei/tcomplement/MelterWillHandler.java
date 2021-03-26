package net.smileycorp.bloodsmeltery.common.jei.tcomplement;

import net.smileycorp.bloodsmeltery.common.tcon.MeltingWillRecipe;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.IRecipeWrapperFactory;

public class MelterWillHandler implements IRecipeWrapperFactory<MeltingWillRecipe> {

	@Override
	public IRecipeWrapper getRecipeWrapper(MeltingWillRecipe recipe) {
		return new MelterWillRecipeWrapper(recipe);
	}

}

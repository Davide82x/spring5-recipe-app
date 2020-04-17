package dv.springframework.spring5recipeapp.services;

import dv.springframework.spring5recipeapp.commands.RecipeCommand;
import dv.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteByid(Long id);
}

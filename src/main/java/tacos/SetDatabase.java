package tacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tacos.models.Ingredient;
import tacos.models.Ingredient.Type;
import tacos.repository.IngredientRepository;

@Configuration
public class SetDatabase {
    @Bean
    ApplicationRunner dateLoader(@Autowired IngredientRepository ingredientRepository) {
        return args -> {
            ingredientRepository.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
            ingredientRepository.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
            ingredientRepository.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
            ingredientRepository.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
            ingredientRepository.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
            ingredientRepository.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
            ingredientRepository.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
            ingredientRepository.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
            ingredientRepository.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
            ingredientRepository.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
        };
    }

}
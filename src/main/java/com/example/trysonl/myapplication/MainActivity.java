package com.example.trysonl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText createUsername;
    private EditText createPassword;
    private EditText confirmPassword;
    private EditText email;
    private EditText warnPopUp;
    private Spinner emotionSpinner;
    private EditText recipe;
    private EditText ingredient;
    private EditText calorie;
    private EditText prepTime;
    private EditText difficultyLevel;
    private EditText servingNum;
    private List<String> recipeList = new ArrayList<>();
    private List<String> ingredientList = new ArrayList<>();
    private List<String> calorieList= new ArrayList<>();
    private List<String> prepTimeList= new ArrayList<>();
    private List<String> difficultyLevelList= new ArrayList<>();
    private List<String> servingNumList= new ArrayList<>();
    private List<String> moodList= new ArrayList<>();

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        moodList.add("Fun Night");
        moodList.add("Lazy Night");
        moodList.add("Tired Night");
        moodList.add("Fun Night with Kids");
        moodList.add("Fancy Night");
        moodList.add("Fancy Night");
        moodList.add("F Night");
        moodList.add("Fancy Night");
        moodList.add("Fancy Night");

        recipeList.add("Chicken Enchiladas");
        recipeList.add("Golden Potato Soup");
        recipeList.add("Cheesy Chicken Meatballs");
        recipeList.add("Make Your Own Tacos");
        recipeList.add("Harvest Cobb Salad");
        recipeList.add("Coconut-Crusted Tilapia");
        recipeList.add("Chicken Picatta");
        recipeList.add("Steamed Mussels in White Wine Broth");
        recipeList.add("Cuban Pork Sliders");

        ingredientList.add("Medium");
        ingredientList.add("High");
        ingredientList.add("Low");

        calorieList.add("Medium");
        calorieList.add("High");
        calorieList.add("Low");

        prepTimeList.add("Medium");
        prepTimeList.add("High");
        prepTimeList.add("Low");

        difficultyLevelList.add("High");
        difficultyLevelList.add("Medium");
        difficultyLevelList.add("Low");

        servingNumList.add("4");
        servingNumList.add("1");
        servingNumList.add("2");

        final Button logInButton = (Button) findViewById(R.id.login);
        logInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                username = (EditText) findViewById(R.id.username);
                password = (EditText) findViewById(R.id.password);
                setContentView(R.layout.create_account);
                createUsername = (EditText) findViewById(R.id.createUsername);
                createPassword = (EditText) findViewById(R.id.createPassword);
                confirmPassword = (EditText) findViewById(R.id.confirmPassword);
                email = (EditText) findViewById(R.id.createEmail);
                createUsername.setText(username.getText());
                createPassword.setText(password.getText());

                final Button createAccountButton = (Button) findViewById(R.id.createAccountButton);
                createAccountButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (createPassword.getText().toString().contentEquals(confirmPassword.getText().toString()))
                        {
                            setContentView(R.layout.list_meals);
                            final Button nextMealButton = (Button) findViewById(R.id.nextMealButton);
                            nextMealButton.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    emotionSpinner = (Spinner) findViewById(R.id.spinner2);
                                    recipe = (EditText) findViewById(R.id.recipe);
                                    ingredient = (EditText) findViewById(R.id.ingredient);
                                    calorie = (EditText) findViewById(R.id.calorie);
                                    prepTime = (EditText) findViewById(R.id.prepTime);
                                    difficultyLevel = (EditText) findViewById(R.id.difficultyLevel);
                                    servingNum = (EditText) findViewById(R.id.servingNum);
                                    System.out.println(String.valueOf(emotionSpinner.getSelectedItem()));
                                    if (recipeList.size() >= i)
                                    {
                                        recipe.setText(recipeList.get(i));
                                        ingredient.setText(ingredientList.get(i));
                                        calorie.setText(calorieList.get(i));
                                        prepTime.setText(prepTimeList.get(i));
                                        difficultyLevel.setText(difficultyLevelList.get(i));
                                        servingNum.setText(servingNumList.get(i));
                                        i++;
                                    }
                                }
                            });

//                            final Button createMealButton = (Button) findViewById(R.id.createMealButton);
//                            createMealButton.setOnClickListener(new View.OnClickListener() {
//                                public void onClick(View v) {
//                                    setContentView(R.layout.list_meals);
//                                    emotionSpinner = (Spinner) findViewById(R.id.spinner2);
//                                    final Button createMealButton = (Button) findViewById(R.id.createMealButton);
//                                    createMealButton.setOnClickListener(new View.OnClickListener() {
//                                        public void onClick(View v) {
//                                            mealName = (EditText) findViewById(R.id.mealName2);
//                                            meat = (EditText) findViewById(R.id.meat2);
//                                            veggies = (EditText) findViewById(R.id.veggies2);
//                                            dessert = (EditText) findViewById(R.id.dessert2);
//                                            beverage = (EditText) findViewById(R.id.beverage2);
////                                            mealNameList.add(mealName.getText().toString());
////                                            meatList.add(meat.getText().toString());
////                                            veggieList.add(veggies.getText().toString());
////                                            dessertList.add(dessert.getText().toString());
////                                            beverageList.add(beverage.getText().toString());
//                                        }
//                                    });
//                                }
//                            });
                        }
                        else
                        {
                            warnPopUp = (EditText) findViewById(R.id.warnPopUp);
                            warnPopUp.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });


    }
}

package structure.programming;


class MenuManagement {

  DataStore dataStore;
  Menu menu;

  MenuManagement(DataStore dataStore) {

    this.dataStore = dataStore;
    menu = new Menu();
  }

  void addMeal(String name, String description, double price) {

    Meal meal = new Meal();
    meal.name = name;
    meal.description = description;
    meal.price = price;

    dataStore.meals.add(meal);
  }

  void removeMeal(String name) {

    for(Meal meal : dataStore.meals) {

      if(meal.name.equals(name)) {

        dataStore.meals.remove(meal);
      }
    }
  }

  Meal getMeal(String name) {

    Meal selectedMeal = null;

    for(Meal meal : dataStore.meals) {

      if(meal.name.equals(name)) {

        selectedMeal = meal;
      }
    }

    return selectedMeal;
  }

  void getAllMeals() {

    System.out.println("name" + "    " + "description" + "         " + "price");

    for(Meal meal : dataStore.meals) {

      System.out.println(meal.name + "\t" + meal.description + "\t\t" + meal.price);
    }
  }


}

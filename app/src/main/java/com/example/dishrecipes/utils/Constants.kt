package com.example.dishrecipes.utils

import java.lang.StringBuilder

object Constants {

    const val DISH_TYPE: String = "DishType"
    const val DISH_CATEGORY: String = "DishCategory"
    const val DISH_COOKING_TIME: String ="DishCookingTime"

    const val DISH_IMAGE_SOURCE_LOCAL: String = "Local"
    const val DISH_IMAGE_SOURCE_ONLINE: String = "Online"

    const val EXTRA_DISH_DETAILS: String = "DishDetails"

    const val ALL_ITEMS: String = "All"
    const val FILTER_SELECTION: String = "FilterSelection"

    const val API_ENDPOINT: String = "recipes/random"

    const val API_KEY: String = "apiKey"
    const val LIMIT_LICENSE:String = "limitLicense"
    const val TAGS: String = "tags"
    const val NUMBER: String = "number"

    const val BASE_URL = "https://api.spoonacular.com/"

    const val LIMIT_LICENSE_VALUE: Boolean = true
    const val TAGS_VALUE: String = "vegetarian"
    const val NUMBER_VALUE: Int = 1
    const val API_KEY_VALUE: String = "b845dbf066784078a09013986731fa98"

    const val  NOTIFICATION_ID = "DishRecipes_notification_id"
    const val NOTIFICATION_NAME = "DishRecipes"
    const val NOTIFICATION_CHANNEL = "DishRecipes_channel_01"

    fun dishTypes():ArrayList<String>{
        val list = ArrayList<String>()

        list.add("завтрак")
        list.add("обед")
        list.add("закуски")
        list.add("ужин")
        list.add("салат")
        list.add("гарнир")
        list.add("десерт")
        list.add("другие")

        return list
    }

    fun dishCategory():ArrayList<String>{
        val list = ArrayList<String>()

        list.add("Пицца")
        list.add("Барбекю")
        list.add("Выпечка")
        list.add("Бургер")
        list.add("салат")
        list.add("Курица")
        list.add("Десерт")
        list.add("Напитки")
        list.add("Хот-дог")
        list.add("Соки")
        list.add("Сэндвичи")
        list.add("Чай или кофе")
        list.add("Суши и роллы")
        list.add("Другие")

        return list
    }

    fun dishCookTime():ArrayList<String>{
        val list = ArrayList<String>()

        list.add("10")
        list.add("15")
        list.add("20")
        list.add("30")
        list.add("45")
        list.add("50")
        list.add("60")
        list.add("90")
        list.add("120")
        list.add("150")
        list.add("180")

        return list
    }
}
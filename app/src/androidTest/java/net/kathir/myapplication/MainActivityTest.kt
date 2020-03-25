package net.kathir.myapplication

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest
{

    //Todo: This is the function to navigate from first activity to secondary activity
    @Test
    fun test_navSecondaryActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        //Todo: This operation to which button click action to be perform
        onView(withId(R.id.button_next_activity)).perform(click())

        //Todo: It is checking whether successfully naviagate from first activity to second. Here we just add Id as secondary it is the secondary layout rootId to check whether it is successully navigate or not.
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }


    //Todo: This is the function on backpressed from second activity to first activity
    @Test
    fun test_backPress_toMainActivity() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

        //Todo: We can do onbackpressed in the following two methods. Method1 is normal check and method2 is inbuilt function of expresso.
       // onView(withId(R.id.button_back)).perform(click()) //Method 1
        pressBack() //Method 2

        //Todo: It is checking after backpressed successfully first activity layout is visible or not
        onView(withId(R.id.main)).check(matches(isDisplayed()))

    }

    //Todo: This function to be check whether activity is visible or not based on the root layout ID.
    @Test
    fun test_isActivityInView()
    {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    //Todo: This function to be check first activity screen title is displayed or not, next activity id is correct or not and next activity button click visible or not.
    @Test
    fun test_visibility_title_nextButton()
    {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed())) //Method1
        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE))) //Method2
    }

    //Todo: This function to be check title of the activity main is displayed or not based on the string value.
    @Test
    fun test_isTitleTextDisplayed()
    {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)))
    }
}
# ExpressoUITestingActivityIsolation

Espresso is a testing framework for Android to make it easy to write reliable user interface tests.

Google released the Espresso framework in Oct. 2013. Since its 2.0 release Espresso is part of the Android Support Repository.

Espresso automatically synchronizes your test actions with the user interface of your application. The framework also ensures that your activity is started before the tests run. It also let the test wait until all observed background activities have finished.

It is intended to test a single application but can also be used to test across applications. If used for testing outside your application, you can only perform black box testing, as you cannot access the classes outside of your application.

Espresso has basically three components:

ViewMatchers - allows to find view in the current view hierarchy

ViewActions - allows to perform actions on the views

ViewAssertions - allows to assert state of a view

## The following items are main focus of expresso testing

The folder android test is for expresso unit test.

The folder test is for local unit test.

ActivityScenario : An activity class to launch.

ActivityScenarioRule : An intent to start the activity.

Test Suites : It is used to run multiple test cases together at once.

Firebase Test lab : We can configure test cases through firebase project and get the analytics report in the firebase console

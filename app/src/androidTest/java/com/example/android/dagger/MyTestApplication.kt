

package com.example.android.dagger

import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.DaggerTestAppComponent

/**
 * MyTestApplication will override MyApplication in android tests
 */
class MyTestApplication : MyApplication() {

    override fun initializeComponent(): AppComponent {
        // Creates a new TestAppComponent that injects fakes types
        return DaggerTestAppComponent.create()
    }
}

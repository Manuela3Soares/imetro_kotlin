package com.example.stc.di

import android.content.Context
import com.example.stc.MainApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

//    @Singleton
//    @Provides
//    fun provideApplication(@ApplicationContext app: Context): MainApplication {
//        return app as MainApplication
//    }

}
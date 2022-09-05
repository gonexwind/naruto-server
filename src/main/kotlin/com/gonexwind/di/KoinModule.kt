package com.gonexwind.di

import com.gonexwind.repository.HeroRepository
import com.gonexwind.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}

package me.jerryhanks.frugal.di

import androidx.lifecycle.ViewModel
import android.view.View
import dagger.MapKey
import javax.inject.Scope
import kotlin.reflect.KClass

interface Injectable

@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope


@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ChildFragmentScope

/**
 * ViewModel Key
 * */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

/**
 * Custom View Key
 * */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewKey(val value: KClass<out View>)
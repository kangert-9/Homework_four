package com.example.homework

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.BehaviorSubject
import moxy.MvpPresenter

class MainPresenter() :
    MvpPresenter<MainView>() {

    private val subject = BehaviorSubject.create<Int>()

    fun save(number: Int){
        subject.onNext(number)
        observeChanges()
    }

    private fun observeChanges(){
        subject
            .map { it*it }
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                viewState.showNewNumber(it)
            },
                {})
    }
}
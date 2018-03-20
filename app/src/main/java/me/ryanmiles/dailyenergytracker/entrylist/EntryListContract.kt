package me.ryanmiles.dailyenergytracker.entrylist

import me.ryanmiles.dailyenergytracker.BasePresenter
import me.ryanmiles.dailyenergytracker.BaseView

/*
 * Created by Ryan Miles on 3/20/2018.
 */

/**
 * This specifies the contract between the view and the presenter.
 */
interface EntryListContract {

    /** EntryList implementation of the [BaseView] **/
    interface View : BaseView<Presenter>

    /** EntryList implementation of the [BasePresenter] **/
    interface Presenter : BasePresenter


}
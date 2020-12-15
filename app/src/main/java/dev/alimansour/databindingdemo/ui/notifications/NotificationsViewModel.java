package dev.alimansour.databindingdemo.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<Integer> notificationCount;

    public NotificationsViewModel() {
        notificationCount = new MutableLiveData<>();
        notificationCount.setValue(5);
    }

    public LiveData<Integer> getCount() {
        return notificationCount;
    }
}
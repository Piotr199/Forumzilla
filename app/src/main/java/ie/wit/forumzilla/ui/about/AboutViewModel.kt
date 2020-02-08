package ie.wit.forumzilla.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a forumZilla, this app is used for shearing interesting facts and post with other people."
    }
    val text: LiveData<String> = _text
}
package ie.wit.forumzilla.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This a place where you can find Hot News"
    }
    val text: LiveData<String> = _text
}
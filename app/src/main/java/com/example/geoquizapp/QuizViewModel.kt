import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.geoquizapp.MainActivity
import com.example.geoquizapp.Question
import com.example.geoquizapp.R
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


private const val TAG = "QuizViewModel"
class QuizViewModel : ViewModel() {

    private var questionBank = emptyList<Question>()

    var currentIndex = 0
    var isCheater = false

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: String
        get() = questionBank[currentIndex].text

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }

    fun updateQuestionBank(newQuestionList: List<Question>) {
        questionBank = newQuestionList
    }
}


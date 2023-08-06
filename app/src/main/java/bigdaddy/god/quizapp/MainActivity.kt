package bigdaddy.god.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_main)
        val btnStart: Button =findViewById(R.id.btnStart)
        val editName :EditText=findViewById(R.id.editName)

        btnStart.setOnClickListener {
            if(editName.text.isEmpty()){
                Toast.makeText(this,"Please enter your name first",Toast.LENGTH_LONG).show()
            }else{
                val intent=Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,editName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
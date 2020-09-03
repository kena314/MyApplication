package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val button = findViewById<Button>(R.id.button)
                // ボタンタップ時の処理を指定する
                button.setOnClickListener {
            // EditTextへの参照を取得する
            val editText = findViewById<EditText>(R.id.editText)
                    // メッセージを取り出す
                    val message = editText.text.toString()

            // Intentを作成する
            val intent = Intent(this, ResultActivity::class.java)
            // パラメータをセットする
            intent.putExtra("message", message)
            // 画面を遷移させる
            startActivity(intent)
        }
    }
    //テスト倉島
}
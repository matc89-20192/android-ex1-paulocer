package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editNome;
    private TextView labelMensagem;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelMensagem = (TextView)findViewById(R.id.labelMensagem);
        button = (Button)findViewById(R.id.btnCumprimentar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cumprimenta();
            }
        });
    }

    public void cumprimenta() {
        EditText editNome = (EditText)findViewById(R.id.editNome);
        TextView TextView = (TextView)findViewById(R.id.editNome);
        String nome = editNome.getText().toString();
        CharSequence texto = String.format("Alô, %s!", nome);
        labelMensagem.setText(texto);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String meutexto = savedInstanceState.getString("meutexto");
        labelMensagem.setText(meutexto);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("meutexto", labelMensagem.getText().toString());
    }
}

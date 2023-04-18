package es.ieslavereda.ejemplobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView contadorVista;
    private Button incrementaBoton;
    private Button decrementaBoton;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorVista = findViewById(R.id.contadorView);
        incrementaBoton = findViewById(R.id.incrementa);
        decrementaBoton = findViewById(R.id.decrementa);

        incrementaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                contador++;
                if (contadorVista != null) {
                    contadorVista.setText(Integer.toString(contador));
                }
            }
        });

        decrementaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {

                if (contador != 0) {
                    contador--;
                    if (contadorVista != null) {
                        contadorVista.setText(Integer.toString(contador));
                    }
                }
            }
        });
    }

    public void muestraToast (View view) {
        Toast tostada = Toast.makeText(this, "ESTO ES UN EJEMPLO", Toast.LENGTH_SHORT);
        tostada.show();
    }
}
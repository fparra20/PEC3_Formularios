package hfad.com.pec3form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowFormActivity extends AppCompatActivity {

    TextView mTextViewNombre;
    TextView mTextViewTelefono;
    TextView mTextViewEmail;
    TextView mTextViewDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_form);

        Intent intent = getIntent();

        String nombre = intent.getStringExtra("EXTRA_NOMBRE");
        String fecha = intent.getStringExtra("EXTRA_FECHA");
        String tlf = intent.getStringExtra("EXTRA_TELEFONO");
        String email = intent.getStringExtra("EXTRA_EMAIL");
        String desc = intent.getStringExtra("EXTRA_DESCRIPCION");

        mTextViewNombre = (TextView)findViewById(R.id.nombre_completo);
        mTextViewNombre.setText(nombre);

        Resources res = getResources();

        mTextViewTelefono = (TextView)findViewById(R.id.fecha);
        mTextViewTelefono.setText(getString(R.string.conf_fecha, fecha));

        mTextViewTelefono = (TextView)findViewById(R.id.telefono);
        mTextViewTelefono.setText(getString(R.string.conf_telefono, tlf));

        mTextViewEmail = (TextView)findViewById(R.id.email);
        mTextViewEmail.setText(getString(R.string.conf_email, email));

        mTextViewDescripcion = (TextView)findViewById(R.id.descripcion);
        mTextViewDescripcion.setText(getString(R.string.conf_desc, desc));

        Button editar = (Button) findViewById(R.id.botonEditar);
        
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
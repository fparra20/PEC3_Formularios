package hfad.com.pec3form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextViewNombre;
    DatePicker mDatePickerFecha;
    TextView mTextViewTelefono;
    TextView mTextViewEmail;
    TextView mTextViewDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendForm(View view) {
        Intent intent = new Intent(this, ShowFormActivity.class);

        mTextViewNombre = (TextView)findViewById(R.id.nombre_completo);
        intent.putExtra("EXTRA_NOMBRE", (mTextViewNombre.getText().toString()));

        mDatePickerFecha = (DatePicker) findViewById(R.id.fecha_picker);
        intent.putExtra("EXTRA_FECHA", (mDatePickerFecha.getDayOfMonth()+"/"+
                (mDatePickerFecha.getMonth()+1)+"/"+mDatePickerFecha.getYear()));

        mTextViewTelefono = (TextView)findViewById(R.id.telefono);
        intent.putExtra("EXTRA_TELEFONO", (mTextViewTelefono.getText().toString()));

        mTextViewEmail = (TextView)findViewById(R.id.email);
        intent.putExtra("EXTRA_EMAIL", (mTextViewEmail.getText().toString()));

        mTextViewDescripcion = (TextView)findViewById(R.id.descripcion);
        intent.putExtra("EXTRA_DESCRIPCION", (mTextViewDescripcion.getText().toString()));


        startActivity(intent);
    }
}
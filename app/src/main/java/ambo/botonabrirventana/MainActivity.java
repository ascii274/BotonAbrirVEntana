package ambo.botonabrirventana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.irPrimeraVentana);
        button.setOnClickListener(this);
        button2=(Button) findViewById(R.id.irSegundaVentana);
        button2.setOnClickListener(this);


    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.irPrimeraVentana:
                Intent intent=new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.irSegundaVentana:
                Intent intent2=new Intent(this, Main3Activity.class);
                startActivity(intent2);
            default:
                break;
        }


    }

}

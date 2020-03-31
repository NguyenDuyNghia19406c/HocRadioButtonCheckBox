package nguyenduynghia.com.hocradiocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import nguyenduynghia.com.hocradiocheckbox.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        addEvents();
    }

    private void addEvents() {
        binding.btnRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moManHinhChinhRad();
            }
        });
        binding.btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moManHinhChinhCheck();
            }
        });
    }

    private void moManHinhChinhCheck() {
        Intent intent=new Intent(MainActivity.this,CheckBoxActivity.class);
        startActivity(intent);
    }

    private void moManHinhChinhRad() {
        Intent intent=new Intent(MainActivity.this,RadioButtonActivity.class);
        startActivity(intent);
    }

    private void moManHinhChinh() {
        Intent intent=new Intent();

    }
}

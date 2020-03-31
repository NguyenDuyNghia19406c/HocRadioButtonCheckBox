package nguyenduynghia.com.hocradiocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import nguyenduynghia.com.hocradiocheckbox.databinding.ActivityMainBinding;
import nguyenduynghia.com.hocradiocheckbox.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    RadioButton rad;
    ActivityRadioButtonBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRadioButtonBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        addEvents();
    }

    private void addEvents() {

        binding.btnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(binding.radObama.isChecked()==true)binding.txtBinhChon.setText(binding.radObama.getText());
                else if(binding.radPutin.isChecked()==true)binding.txtBinhChon.setText(binding.radPutin.getText());
                else if(binding.radKim.isChecked()==true)binding.txtBinhChon.setText(binding.radKim.getText());

//                int id=binding.grpBinhChon.getCheckedRadioButtonId();
//                binding.txtBinhChon.setText();

            }
        });
    }
}

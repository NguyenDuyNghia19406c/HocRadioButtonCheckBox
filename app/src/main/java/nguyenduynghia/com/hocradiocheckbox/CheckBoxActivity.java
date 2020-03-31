package nguyenduynghia.com.hocradiocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import nguyenduynghia.com.hocradiocheckbox.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    ActivityCheckBoxBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCheckBoxBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        addEvents();
    }

    private void addEvents() {
        binding.btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg="";
                if(binding.chkAndroid.isChecked()==true)msg+=binding.chkAndroid.getText().toString()+"\n";
                if(binding.chkCSharp.isChecked()==true)msg+=binding.chkCSharp.getText().toString()+"\n";
                if(binding.chkSwift.isChecked()==true)msg+=binding.chkSwift.getText().toString()+"\n";

                binding.txtSoThich.setText(msg);
            }
        });
    }
}

package cn.vszone.ko.mobile.arena;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import cn.vszone.ko.mobile.arena.databinding.ActivityUserBinding;
import cn.vszone.ko.mobile.arena.entitys.User;

public class UserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityUserBinding binding=DataBindingUtil.setContentView(this,R.layout.activity_user);
        final User user=new User("test","google");
        binding.setUser(user);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setFirstName("binbin");
//                user.notifyChange();
                binding.setUser(user);
            }
        });
    }
}

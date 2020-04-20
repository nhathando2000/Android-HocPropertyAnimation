package donguyennhathan.com.hocpropertyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

import donguyennhathan.com.hocpropertyanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void xuLyObjectAnimator(View view) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this,
                R.animator.object_animator);
        objectAnimator.setTarget(binding.btnObjectAnimator);
        objectAnimator.start();
    }

    public void xuLyObjectAnimatorSet(View view) {
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.object_animator_set);
        animatorSet.setTarget(binding.btnObjectAnimatorSet);
        animatorSet.start();
    }
}

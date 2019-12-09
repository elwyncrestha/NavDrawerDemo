package com.elvin.navdrawerdemo.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.elvin.navdrawerdemo.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    private CircleImageView civContactImageDetail;
    private TextView tvNameDetail, tvContactDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        this.civContactImageDetail = findViewById(R.id.civContactImageDetail);
        this.tvNameDetail = findViewById(R.id.tvNameDetail);
        this.tvContactDetail = findViewById(R.id.tvContactDetail);

        Bundle bundle = getIntent().getExtras();

        if (null != bundle) {
            civContactImageDetail.setImageResource(bundle.getInt("image"));
            tvNameDetail.setText(bundle.getString("name"));
            tvContactDetail.setText(bundle.getString("contact"));
        }
    }
}

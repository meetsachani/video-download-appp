package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C11284zo1;
import o.C2806Dz;
import o.C5036aE2;
import o.C6998iG2;

/* loaded from: classes3.dex */
public class CategoryListActivity extends ActivityC3020Gb {
    public ArrayList<C2806Dz> C1;
    public ImageView D1;
    public ProgressBar E1;
    public C6998iG2 F1;
    public RecyclerView G1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CategoryListActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(CategoryListActivity.this);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_category_list);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.FALSE);
        this.D1 = (ImageView) findViewById(R.id.btn_back);
        this.G1 = (RecyclerView) findViewById(R.id.recyclerView);
        this.E1 = (ProgressBar) findViewById(R.id.progress);
        this.D1.setOnClickListener(new a());
        this.E1.setVisibility(0);
        this.G1.setVisibility(8);
        ArrayList<C2806Dz> arrayList = (ArrayList) getIntent().getSerializableExtra("link");
        this.C1 = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.E1.setVisibility(8);
            this.G1.setVisibility(0);
            this.F1 = new C6998iG2(this, this.C1, 2);
            this.G1.setLayoutManager(new GridLayoutManager(this, 1));
            this.G1.setAdapter(this.F1);
        }
        R().e(new b(true));
    }
}

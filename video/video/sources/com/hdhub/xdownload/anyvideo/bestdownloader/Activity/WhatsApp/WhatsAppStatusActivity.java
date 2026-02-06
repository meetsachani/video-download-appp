package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C4395Uc2;
import o.C5036aE2;
import o.C5291bH2;
import o.C9165r6;
import o.IN0;
import o.SH2;

/* loaded from: classes3.dex */
public class WhatsAppStatusActivity extends ActivityC3020Gb {
    public static String D1;
    public C9165r6 C1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WhatsAppStatusActivity.this.C1.p.setCurrentItem(0);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WhatsAppStatusActivity.this.C1.p.setCurrentItem(1);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WhatsAppStatusActivity.this.C1.p.setCurrentItem(2);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WhatsAppStatusActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements ViewPager.j {
        public e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            if (i == 0) {
                WhatsAppStatusActivity.this.H1();
                WhatsAppStatusActivity whatsAppStatusActivity = WhatsAppStatusActivity.this;
                whatsAppStatusActivity.C1.c.setImageTintList(ColorStateList.valueOf(whatsAppStatusActivity.getResources().getColor(R.color.white)));
                WhatsAppStatusActivity whatsAppStatusActivity2 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity2.C1.j.setTextColor(whatsAppStatusActivity2.getResources().getColor(R.color.white));
                WhatsAppStatusActivity whatsAppStatusActivity3 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity3.C1.d.setBackground(whatsAppStatusActivity3.getResources().getDrawable(R.drawable.ic_select));
            } else if (i == 1) {
                WhatsAppStatusActivity.this.H1();
                WhatsAppStatusActivity whatsAppStatusActivity4 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity4.C1.n.setImageTintList(ColorStateList.valueOf(whatsAppStatusActivity4.getResources().getColor(R.color.white)));
                WhatsAppStatusActivity whatsAppStatusActivity5 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity5.C1.l.setTextColor(whatsAppStatusActivity5.getResources().getColor(R.color.white));
                WhatsAppStatusActivity whatsAppStatusActivity6 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity6.C1.f845o.setBackground(whatsAppStatusActivity6.getResources().getDrawable(R.drawable.ic_select));
            } else {
                WhatsAppStatusActivity.this.H1();
                WhatsAppStatusActivity whatsAppStatusActivity7 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity7.C1.h.setImageTintList(ColorStateList.valueOf(whatsAppStatusActivity7.getResources().getColor(R.color.white)));
                WhatsAppStatusActivity whatsAppStatusActivity8 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity8.C1.k.setTextColor(whatsAppStatusActivity8.getResources().getColor(R.color.white));
                WhatsAppStatusActivity whatsAppStatusActivity9 = WhatsAppStatusActivity.this;
                whatsAppStatusActivity9.C1.i.setBackground(whatsAppStatusActivity9.getResources().getDrawable(R.drawable.ic_select));
            }
        }
    }

    private void G1() {
        this.C1.e.setOnClickListener(new a());
        this.C1.g.setOnClickListener(new b());
        this.C1.f.setOnClickListener(new c());
        this.C1.b.setOnClickListener(new d());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IN0());
        arrayList.add(new C5291bH2());
        arrayList.add(new C4395Uc2());
        this.C1.p.setAdapter(new SH2(W0(), arrayList));
        this.C1.p.c(new e());
    }

    public final void H1() {
        this.C1.c.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray)));
        this.C1.n.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray)));
        this.C1.h.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.gray)));
        this.C1.j.setTextColor(getResources().getColor(R.color.gray));
        this.C1.l.setTextColor(getResources().getColor(R.color.gray));
        this.C1.k.setTextColor(getResources().getColor(R.color.gray));
        this.C1.d.setBackground(getResources().getDrawable(R.drawable.ic_unselect));
        this.C1.f845o.setBackground(getResources().getDrawable(R.drawable.ic_unselect));
        this.C1.i.setBackground(getResources().getDrawable(R.drawable.ic_unselect));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5036aE2.a(this);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9165r6 c2 = C9165r6.c(getLayoutInflater());
        this.C1 = c2;
        setContentView(c2.getRoot());
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        D1 = getIntent().getStringExtra("name");
        AppCompatTextView appCompatTextView = this.C1.m;
        appCompatTextView.setText(D1 + " Status");
        G1();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}

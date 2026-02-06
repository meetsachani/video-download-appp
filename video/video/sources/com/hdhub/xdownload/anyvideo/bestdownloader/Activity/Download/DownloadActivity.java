package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.HowToUse.HowToUseActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.ActivityC3020Gb;
import o.C11203zS2;
import o.C11284zo1;
import o.C5036aE2;
import o.C5967e5;
import o.C6145ep;
import o.C6229f92;
import o.CS2;
import o.I7;

/* loaded from: classes3.dex */
public class DownloadActivity extends ActivityC3020Gb {
    public static String E1;
    public static String F1;
    public C5967e5 C1;
    public String D1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadActivity.this.I1();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadActivity.this.G1();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                DownloadActivity.this.startActivity(new Intent(DownloadActivity.this, HowToUseActivity.class));
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(DownloadActivity.this, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                DownloadActivity.this.startActivity(new Intent(DownloadActivity.this, MyDownloadsActivity.class).putExtra("type", DownloadActivity.E1));
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C5036aE2.f(DownloadActivity.this)) {
                I7.o(DownloadActivity.this, new a(), new boolean[0]);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends ViewPager2.j {
        public f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i, float f, int i2) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        @SuppressLint({"UseCompatLoadingForColorStateLists"})
        public void c(int i) {
            if (i == 0) {
                DownloadActivity downloadActivity = DownloadActivity.this;
                downloadActivity.C1.j.setBackgroundTintList(downloadActivity.getResources().getColorStateList(R.color.app_color));
                DownloadActivity downloadActivity2 = DownloadActivity.this;
                downloadActivity2.C1.k.setBackgroundTintList(downloadActivity2.getResources().getColorStateList(R.color.unselect));
                DownloadActivity downloadActivity3 = DownloadActivity.this;
                downloadActivity3.C1.l.setBackgroundTintList(downloadActivity3.getResources().getColorStateList(R.color.unselect));
                DownloadActivity.this.C1.j.getLayoutParams().width = DownloadActivity.this.H1(17);
                DownloadActivity.this.C1.j.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view = DownloadActivity.this.C1.j;
                view.setLayoutParams(view.getLayoutParams());
                DownloadActivity.this.C1.k.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.k.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view2 = DownloadActivity.this.C1.k;
                view2.setLayoutParams(view2.getLayoutParams());
                DownloadActivity.this.C1.l.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.l.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view3 = DownloadActivity.this.C1.l;
                view3.setLayoutParams(view3.getLayoutParams());
            } else if (i == 1) {
                DownloadActivity downloadActivity4 = DownloadActivity.this;
                downloadActivity4.C1.j.setBackgroundTintList(downloadActivity4.getResources().getColorStateList(R.color.unselect));
                DownloadActivity downloadActivity5 = DownloadActivity.this;
                downloadActivity5.C1.k.setBackgroundTintList(downloadActivity5.getResources().getColorStateList(R.color.app_color));
                DownloadActivity downloadActivity6 = DownloadActivity.this;
                downloadActivity6.C1.l.setBackgroundTintList(downloadActivity6.getResources().getColorStateList(R.color.unselect));
                DownloadActivity.this.C1.j.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.j.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view4 = DownloadActivity.this.C1.j;
                view4.setLayoutParams(view4.getLayoutParams());
                DownloadActivity.this.C1.k.getLayoutParams().width = DownloadActivity.this.H1(17);
                DownloadActivity.this.C1.k.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view5 = DownloadActivity.this.C1.k;
                view5.setLayoutParams(view5.getLayoutParams());
                DownloadActivity.this.C1.l.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.l.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view6 = DownloadActivity.this.C1.l;
                view6.setLayoutParams(view6.getLayoutParams());
            } else {
                DownloadActivity downloadActivity7 = DownloadActivity.this;
                downloadActivity7.C1.j.setBackgroundTintList(downloadActivity7.getResources().getColorStateList(R.color.unselect));
                DownloadActivity downloadActivity8 = DownloadActivity.this;
                downloadActivity8.C1.k.setBackgroundTintList(downloadActivity8.getResources().getColorStateList(R.color.unselect));
                DownloadActivity downloadActivity9 = DownloadActivity.this;
                downloadActivity9.C1.l.setBackgroundTintList(downloadActivity9.getResources().getColorStateList(R.color.app_color));
                DownloadActivity.this.C1.j.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.j.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view7 = DownloadActivity.this.C1.j;
                view7.setLayoutParams(view7.getLayoutParams());
                DownloadActivity.this.C1.k.getLayoutParams().width = DownloadActivity.this.H1(6);
                DownloadActivity.this.C1.k.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view8 = DownloadActivity.this.C1.k;
                view8.setLayoutParams(view8.getLayoutParams());
                DownloadActivity.this.C1.l.getLayoutParams().width = DownloadActivity.this.H1(17);
                DownloadActivity.this.C1.l.getLayoutParams().height = DownloadActivity.this.H1(6);
                View view9 = DownloadActivity.this.C1.l;
                view9.setLayoutParams(view9.getLayoutParams());
            }
        }
    }

    public final void G1() {
        String obj = this.C1.g.getText().toString();
        if (!obj.isEmpty()) {
            if (E1.equals("Facebook")) {
                if (CS2.b(obj)) {
                    F1 = "Facebook";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Instagram")) {
                if (CS2.c(obj)) {
                    F1 = "Inst";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Twitter")) {
                if (CS2.j(obj)) {
                    F1 = "Twitter";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Thread")) {
                if (CS2.h(obj)) {
                    F1 = "Thread";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Linkedin")) {
                if (CS2.e(obj)) {
                    F1 = "Linkedin";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Pinterest")) {
                if (CS2.f(obj)) {
                    F1 = "Pinterest";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Snack")) {
                if (CS2.g(obj)) {
                    F1 = "Snack";
                    J1(obj);
                    return;
                }
            } else if (E1.equals("Tiktok") && CS2.i(obj)) {
                F1 = "TT";
                J1(obj);
                return;
            }
            this.C1.g.setError("Url is not valid");
        }
        this.C1.g.setError("Url is empty");
    }

    public int H1(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public void I1() {
        this.C1.g.setText("");
        String m = C11203zS2.m(this);
        if (E1.equals("Facebook")) {
            if (C11203zS2.d(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Instagram")) {
            if (C11203zS2.e(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Twitter")) {
            if (C11203zS2.k(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Thread")) {
            if (C11203zS2.i(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Linkedin")) {
            if (C11203zS2.f(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Pinterest")) {
            if (C11203zS2.g(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Snack")) {
            if (C11203zS2.h(m)) {
                this.C1.g.setText(m);
                return;
            }
        } else if (E1.equals("Tiktok") && C11203zS2.j(m)) {
            this.C1.g.setText(m);
            return;
        }
        Toast.makeText(this, "Please Enter Valid Link", 0).show();
    }

    public void J1(String str) {
        C6145ep l3 = C6145ep.l3(str);
        l3.c3(W0(), "bottoms");
        l3.X2(false);
        this.C1.g.setText("");
    }

    public final void K1() {
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.viewPager);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.drawable.img1));
        arrayList.add(Integer.valueOf((int) R.drawable.img2));
        arrayList.add(Integer.valueOf((int) R.drawable.img3));
        viewPager2.setAdapter(new C6229f92(this, arrayList));
        viewPager2.n(new f());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5036aE2.a(this);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5967e5 c2 = C5967e5.c(getLayoutInflater());
        this.C1 = c2;
        setContentView(c2.getRoot());
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        this.C1.d.setOnClickListener(new a());
        E1 = getIntent().getStringExtra("type");
        this.D1 = getIntent().getStringExtra("link");
        this.C1.i.setText(E1);
        if (!this.D1.equals("")) {
            this.C1.g.setText(this.D1);
        }
        this.C1.f.setOnClickListener(new b());
        this.C1.e.setOnClickListener(new c());
        this.C1.c.setOnClickListener(new d());
        this.C1.b.setOnClickListener(new e());
        K1();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}

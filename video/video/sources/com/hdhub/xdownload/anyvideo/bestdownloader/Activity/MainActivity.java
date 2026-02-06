package com.hdhub.xdownload.anyvideo.bestdownloader.Activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.MainActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.ActivityC4864Yy0;
import o.C10143v71;
import o.C2723Dd;
import o.C4343To;
import o.C5036aE2;
import o.C6747hE2;
import o.C9161r5;
import o.InterfaceC5670cr1;
import o.MD1;

/* loaded from: classes3.dex */
public class MainActivity extends ActivityC3020Gb {
    public static String[] F1 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static String[] G1 = {"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
    public C9161r5 C1;
    public boolean D1 = false;
    public ViewPager2 E1;

    /* loaded from: classes3.dex */
    public class a extends AbstractC2891Eu1 {

        /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.MainActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0144a implements Runnable {
            public RunnableC0144a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.D1 = false;
            }
        }

        public a(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            if (C2723Dd.f0() == 0) {
                if (C2723Dd.B()) {
                    C6747hE2.d(MainActivity.this);
                    return;
                }
                MainActivity mainActivity = MainActivity.this;
                if (mainActivity.D1) {
                    mainActivity.finishAffinity();
                    return;
                }
                mainActivity.D1 = true;
                Toast.makeText(mainActivity, "Please tap again!", 0).show();
                new Handler().postDelayed(new RunnableC0144a(), 3000L);
                return;
            }
            C5036aE2.a(MainActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends FragmentStateAdapter {
        public b(@InterfaceC5670cr1 ActivityC4864Yy0 activityC4864Yy0) {
            super(activityC4864Yy0);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @InterfaceC5670cr1
        public Fragment L(int i) {
            if (i == 0) {
                return new C10143v71();
            }
            return new MD1();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            return 2;
        }
    }

    public static /* synthetic */ void F1(MainActivity mainActivity, View view) {
        mainActivity.E1.s(0, false);
        mainActivity.J1();
    }

    public final void H1() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                requestPermissions(G1, 1001);
            } else {
                I1();
            }
        } else if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            requestPermissions(F1, 1002);
        } else {
            I1();
        }
    }

    public final void I1() {
        K1();
        this.E1.s(1, false);
    }

    public final void J1() {
        this.C1.b.setImageResource(R.drawable.ic_home_select);
        this.C1.c.setImageResource(R.drawable.ic_player_unselect);
    }

    public final void K1() {
        this.C1.b.setImageResource(R.drawable.ic_home_unselect);
        this.C1.c.setImageResource(R.drawable.ic_player_select);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9161r5 c = C9161r5.c(getLayoutInflater());
        this.C1 = c;
        setContentView(c.getRoot());
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.E1 = this.C1.e.getViewPager();
        this.E1.setAdapter(new b(this));
        this.E1.setUserInputEnabled(false);
        this.E1.s(0, false);
        J1();
        this.C1.b.setOnClickListener(new View.OnClickListener() { // from class: o.o71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.F1(MainActivity.this, view);
            }
        });
        this.C1.c.setOnClickListener(new View.OnClickListener() { // from class: o.p71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.H1();
            }
        });
        R().e(new a(true));
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if ((i == 1001 || i == 1002) && iArr.length > 0 && iArr[0] == 0) {
            I1();
        }
    }
}

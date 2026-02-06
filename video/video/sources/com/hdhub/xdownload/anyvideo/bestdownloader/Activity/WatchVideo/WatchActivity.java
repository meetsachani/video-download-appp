package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo.WatchActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C5036aE2;
import o.C5287bG2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class WatchActivity extends ActivityC3020Gb {
    public String[] C1 = {"animals", "creation", "auto", "school", "people", "music", "news", "sport"};

    /* loaded from: classes3.dex */
    public class a extends FragmentStateAdapter {
        public a(FragmentManager fragmentManager, f fVar) {
            super(fragmentManager, fVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @InterfaceC5670cr1
        public Fragment L(int i) {
            return C5287bG2.S2(WatchActivity.this.C1[i]);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
        public int g() {
            return WatchActivity.this.C1.length;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WatchActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(WatchActivity.this);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_watch);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.viewPager);
        viewPager2.setAdapter(new a(W0(), b()));
        new com.google.android.material.tabs.b((TabLayout) findViewById(R.id.tabLayout), viewPager2, new b.InterfaceC0131b() { // from class: o.zJ2
            @Override // com.google.android.material.tabs.b.InterfaceC0131b
            public final void a(TabLayout.i iVar, int i) {
                WatchActivity watchActivity = WatchActivity.this;
                iVar.D(watchActivity.C1[i].substring(0, 1).toUpperCase() + watchActivity.C1[i].substring(1));
            }
        }).a();
        findViewById(R.id.ic_back).setOnClickListener(new b());
        R().e(new c(true));
    }
}

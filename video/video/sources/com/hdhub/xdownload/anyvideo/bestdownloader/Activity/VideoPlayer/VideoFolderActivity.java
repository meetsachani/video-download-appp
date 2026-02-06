package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C5036aE2;
import o.C5044aG2;
import o.I7;
import o.InterfaceC9365rv1;
import o.LG;
import o.ZF2;

/* loaded from: classes3.dex */
public class VideoFolderActivity extends ActivityC3020Gb {
    public ImageView C1;
    public RecyclerView D1;
    public ArrayList<ZF2> E1 = new ArrayList<>();
    public TextView F1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoFolderActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements InterfaceC9365rv1 {

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // o.I7.f
            public void a(boolean z) {
                Intent intent = new Intent(VideoFolderActivity.this, VideoListActivity.class);
                intent.putExtra(C5036aE2.a, this.a);
                intent.putExtra(C5036aE2.b, this.b);
                VideoFolderActivity.this.startActivity(intent);
            }
        }

        public b() {
        }

        @Override // o.InterfaceC9365rv1
        public void a(String str, String str2) {
            I7.o(VideoFolderActivity.this, new a(str, str2), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoFolderActivity.this);
        }
    }

    public final void F1() {
        ArrayList<ZF2> arrayList = new ArrayList<>();
        this.E1 = arrayList;
        arrayList.addAll(LG.b(this));
        if (this.E1.size() > 0) {
            this.F1.setVisibility(8);
            this.D1.setVisibility(0);
        } else {
            this.F1.setVisibility(0);
            this.D1.setVisibility(8);
        }
        this.D1.setAdapter(new C5044aG2(this, this.E1, new b()));
        R().e(new c(true));
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_folder);
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.C1 = (ImageView) findViewById(R.id.back);
        this.D1 = (RecyclerView) findViewById(R.id.rvVideoList);
        this.F1 = (TextView) findViewById(R.id.tvResp);
        this.C1.setOnClickListener(new a());
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        F1();
    }
}

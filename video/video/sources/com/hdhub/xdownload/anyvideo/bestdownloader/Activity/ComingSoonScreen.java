package com.hdhub.xdownload.anyvideo.bestdownloader.Activity;

import android.os.Bundle;
import android.view.View;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.ActivityC3020Gb;

/* loaded from: classes3.dex */
public class ComingSoonScreen extends ActivityC3020Gb {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ComingSoonScreen.this.finish();
            ComingSoonScreen.this.finishAffinity();
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_coming_soon_screen);
        findViewById(R.id.cancelbtn).setOnClickListener(new a());
    }
}

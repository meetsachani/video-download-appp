package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbph;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class OutOfContextTestingActivity extends Activity {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String X = "com.google.android.gms.ads.OutOfContextTestingActivity";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String Y = "adUnit";

    @Override // android.app.Activity
    public final void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        super.onCreate(bundle);
        zzdt h = zzbb.a().h(this, new zzbph());
        if (h == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(Y);
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            h.x3(stringExtra, ObjectWrapper.V3(this), ObjectWrapper.V3(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

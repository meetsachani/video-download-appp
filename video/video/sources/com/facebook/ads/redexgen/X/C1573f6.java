package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1573f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C04473r A00;

    public C1573f6(C04473r c04473r) {
        this.A00 = c04473r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0685Dl(this, i));
    }
}

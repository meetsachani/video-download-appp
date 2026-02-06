package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzp implements View.OnTouchListener {
    public final /* synthetic */ zzu X;

    public zzp(zzu zzuVar) {
        this.X = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzavl zzavlVar;
        zzavl zzavlVar2;
        zzu zzuVar = this.X;
        zzavlVar = zzuVar.c1;
        if (zzavlVar != null) {
            zzavlVar2 = zzuVar.c1;
            zzavlVar2.d(motionEvent);
            return false;
        }
        return false;
    }
}

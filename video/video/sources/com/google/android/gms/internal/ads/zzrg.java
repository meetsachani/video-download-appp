package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C6577gY;
import o.C6820hY;
import o.ES1;

/* JADX INFO: Access modifiers changed from: package-private */
@ES1(29)
/* loaded from: classes2.dex */
public final class zzrg {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack$StreamEventCallback b = new zzrf(this);
    public final /* synthetic */ zzri c;

    public zzrg(zzri zzriVar) {
        this.c = zzriVar;
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.a;
        Objects.requireNonNull(handler);
        C6820hY.a(audioTrack, new Executor() { // from class: com.google.android.gms.internal.ads.zzre
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.b);
    }

    public final void b(AudioTrack audioTrack) {
        C6577gY.a(audioTrack, this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}

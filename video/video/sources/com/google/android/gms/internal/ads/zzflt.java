package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzflt extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public final AtomicReference c;
    public final zzfmf d;

    public zzflt(Handler handler, Context context, zzflq zzflqVar, zzfmf zzfmfVar) {
        super(handler);
        this.c = new AtomicReference(Float.valueOf(-1.0f));
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.d = zzfmfVar;
    }

    public static /* bridge */ /* synthetic */ float a(zzflt zzfltVar) {
        AudioManager audioManager = zzfltVar.b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    public final void c() {
        f();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    public final void f() {
        new Thread(new zzfls(this)).start();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        f();
    }
}

package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
import o.ES1;
import o.InterfaceC11300zs1;

@ES1(35)
/* loaded from: classes2.dex */
public final class zzsv {
    public final HashSet a;
    @InterfaceC11300zs1
    public LoudnessCodecController b;

    public zzsv() {
        throw null;
    }

    public final void a(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        zzdc.f(this.a.add(mediaCodec));
    }

    public final void b() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.a.remove(mediaCodec) && (loudnessCodecController = this.b) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.b = null;
        }
        create = LoudnessCodecController.create(i, zzgdq.c(), new zzss(this));
        this.b = create;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public zzsv(zzsu zzsuVar) {
        this.a = new HashSet();
    }
}

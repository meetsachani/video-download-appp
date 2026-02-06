package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.AbstractC0707Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0707Eh<T extends AbstractC0707Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2242qI A02;
    public final C2205pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0707Eh(int i, C2205pg c2205pg, int i2) {
        this.A00 = i;
        this.A03 = c2205pg;
        this.A01 = i2;
        this.A02 = c2205pg.A08(i2);
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0722Ew {
    public InterfaceC0721Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0723Ex A0b(InterfaceC05497p[] interfaceC05497pArr, C2072nW c2072nW, C2090no c2090no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC04543y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0721Ev interfaceC0721Ev, F6 f6) {
        this.A00 = interfaceC0721Ev;
        this.A01 = f6;
    }
}

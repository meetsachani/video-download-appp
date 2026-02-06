package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Of  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0962Of implements Serializable {
    public C0961Oe A00;
    public C0961Oe A01;

    public C0962Of() {
        this(0.5d, 0.5d);
    }

    public C0962Of(double d) {
        this(d, 0.5d);
    }

    public C0962Of(double d, double d2) {
        this.A00 = new C0961Oe(d);
        this.A01 = new C0961Oe(d2);
        A02();
    }

    public final C0961Oe A00() {
        return this.A00;
    }

    public final C0961Oe A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d, double d2) {
        this.A00.A09(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A09(d, d2);
    }
}

package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.3C  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C3C {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public C3C(C3C c3c) {
        this.A04 = c3c.A04;
        this.A00 = c3c.A00;
        this.A01 = c3c.A01;
        this.A03 = c3c.A03;
        this.A02 = c3c.A02;
    }

    public C3C(Object obj) {
        this(obj, -1L);
    }

    public C3C(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C3C(Object obj, int i, int i2, long j, int i3) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public C3C(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3C) {
            C3C c3c = (C3C) obj;
            return this.A04.equals(c3c.A04) && this.A00 == c3c.A00 && this.A01 == c3c.A01 && this.A03 == c3c.A03 && this.A02 == c3c.A02;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = this.A01;
        int result3 = ((((((((17 * 31) + result) * 31) + this.A00) * 31) + result2) * 31) + ((int) this.A03)) * 31;
        int result4 = this.A02;
        return result3 + result4;
    }
}

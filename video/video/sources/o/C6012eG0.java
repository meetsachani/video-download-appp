package o;

import o.C7025iN1;
import o.OL1;

/* renamed from: o.eG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6012eG0 {
    public static final int[] c = {OL1.b.I0, C7025iN1.c.colorOnError, C7025iN1.c.colorErrorContainer, C7025iN1.c.colorOnErrorContainer};
    public final int[] a;
    @InterfaceC4698Xf2
    public final int b;

    public C6012eG0(@InterfaceC8568og @InterfaceC5670cr1 int[] iArr, @InterfaceC4698Xf2 int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.a = iArr;
        this.b = i;
    }

    @InterfaceC5670cr1
    public static C6012eG0 a(@InterfaceC8568og @InterfaceC5670cr1 int[] iArr) {
        return new C6012eG0(iArr, 0);
    }

    @InterfaceC5670cr1
    public static C6012eG0 b(@InterfaceC8568og @InterfaceC5670cr1 int[] iArr, @InterfaceC4698Xf2 int i) {
        return new C6012eG0(iArr, i);
    }

    @InterfaceC5670cr1
    public static C6012eG0 c() {
        return b(c, C7025iN1.n.ThemeOverlay_Material3_HarmonizedColors);
    }

    @InterfaceC5670cr1
    public int[] d() {
        return this.a;
    }

    @InterfaceC4698Xf2
    public int e() {
        return this.b;
    }
}

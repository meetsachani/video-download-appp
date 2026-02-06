package o;

/* renamed from: o.ox2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8639ox2 {
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int[] a(int i, HA0<? super Integer, C7162ix2> ha0) {
        C6562gT0.p(ha0, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = ha0.invoke(Integer.valueOf(i2)).p0();
        }
        return C8395nx2.h(iArr);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final int[] b(int... iArr) {
        C6562gT0.p(iArr, "elements");
        return iArr;
    }
}

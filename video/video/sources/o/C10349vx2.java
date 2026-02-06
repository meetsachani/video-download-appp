package o;

/* renamed from: o.vx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10349vx2 {
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final long[] a(int i, HA0<? super Integer, C9860tx2> ha0) {
        C6562gT0.p(ha0, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ha0.invoke(Integer.valueOf(i2)).p0();
        }
        return C10103ux2.h(jArr);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final long[] b(long... jArr) {
        C6562gT0.p(jArr, "elements");
        return jArr;
    }
}

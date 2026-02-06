package o;

/* loaded from: classes3.dex */
public final class Zx2 {
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final short[] a(int i, HA0<? super Integer, Xx2> ha0) {
        C6562gT0.p(ha0, "init");
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = ha0.invoke(Integer.valueOf(i2)).n0();
        }
        return Yx2.h(sArr);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final short[] b(short... sArr) {
        C6562gT0.p(sArr, "elements");
        return sArr;
    }
}

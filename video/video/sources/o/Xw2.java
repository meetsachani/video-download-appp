package o;

/* loaded from: classes3.dex */
public final class Xw2 {
    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final byte[] a(int i, HA0<? super Integer, Vw2> ha0) {
        C6562gT0.p(ha0, "init");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = ha0.invoke(Integer.valueOf(i2)).n0();
        }
        return Ww2.h(bArr);
    }

    @XP0
    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "1.3")
    public static final byte[] b(byte... bArr) {
        C6562gT0.p(bArr, "elements");
        return bArr;
    }
}

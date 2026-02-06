package o;

import o.InterfaceC10568wr2;

@Deprecated
/* renamed from: o.pr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8858pr2 {
    public static final String f = "TrackEncryptionBox";
    public final boolean a;
    @InterfaceC11300zs1
    public final String b;
    public final InterfaceC10568wr2.a c;
    public final int d;
    @InterfaceC11300zs1
    public final byte[] e;

    public C8858pr2(boolean z, @InterfaceC11300zs1 String str, int i, byte[] bArr, int i2, int i3, @InterfaceC11300zs1 byte[] bArr2) {
        boolean z2;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a((bArr2 == null) ^ z2);
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new InterfaceC10568wr2.a(a(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C10323vs.a2)) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C10323vs.c2)) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C10323vs.b2)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                I31.n(f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}

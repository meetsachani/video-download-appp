package o;

/* renamed from: o.pT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8766pT0 {
    public final boolean a;

    public C8766pT0() {
        boolean z;
        if (U20.a(C8782pY0.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public int a(byte[] bArr) {
        byte b;
        if (!this.a) {
            return bArr.length;
        }
        int i = 2;
        while (i + 4 <= bArr.length && (b = bArr[i]) == -1) {
            int i2 = i + 2;
            int i3 = ((bArr[i2] & 255) << 8) | (bArr[i + 3] & 255);
            if (b == -1 && bArr[i + 1] == -38) {
                while (true) {
                    int i4 = i2 + 2;
                    if (i4 > bArr.length) {
                        return bArr.length;
                    }
                    if (bArr[i2] == -1 && bArr[i2 + 1] == -39) {
                        return i4;
                    }
                    i2++;
                }
            } else {
                i += i3 + 2;
            }
        }
        return bArr.length;
    }
}

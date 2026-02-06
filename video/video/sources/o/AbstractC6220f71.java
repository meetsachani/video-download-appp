package o;

/* renamed from: o.f71  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6220f71 {
    public final int a;
    public final int b;

    public AbstractC6220f71(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public AbstractC6220f71 a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int b() {
        return this.b;
    }

    public abstract byte[] c();

    public abstract byte[] d(int i, byte[] bArr);

    public final int e() {
        return this.a;
    }

    public AbstractC6220f71 f() {
        return new C10230vT0(this);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public AbstractC6220f71 i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public AbstractC6220f71 j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.b * (i + 1));
        for (int i2 = 0; i2 < this.b; i2++) {
            bArr = d(i2, bArr);
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = bArr[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else if (i4 < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}

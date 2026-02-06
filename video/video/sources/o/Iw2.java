package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Iw2 {
    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @InterfaceC5880dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(long[] jArr, int i, int i2) {
        int compare;
        int compare2;
        long r = C10103ux2.r(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                long r2 = C10103ux2.r(jArr, i);
                C10103ux2.J(jArr, i, C10103ux2.r(jArr, i2));
                C10103ux2.J(jArr, i2, r2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC5880dj0
    public static final int b(byte[] bArr, int i, int i2) {
        int i3;
        byte r = Ww2.r(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = r & 255;
                if (C6562gT0.t(Ww2.r(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (C6562gT0.t(Ww2.r(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte r2 = Ww2.r(bArr, i);
                Ww2.J(bArr, i, Ww2.r(bArr, i2));
                Ww2.J(bArr, i2, r2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC5880dj0
    public static final int c(short[] sArr, int i, int i2) {
        int i3;
        short r = Yx2.r(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int r2 = Yx2.r(sArr, i) & Xx2.Y0;
                i3 = r & Xx2.Y0;
                if (C6562gT0.t(r2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (C6562gT0.t(Yx2.r(sArr, i2) & Xx2.Y0, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short r3 = Yx2.r(sArr, i);
                Yx2.J(sArr, i, Yx2.r(sArr, i2));
                Yx2.J(sArr, i2, r3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @InterfaceC5880dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(int[] iArr, int i, int i2) {
        int compare;
        int compare2;
        int r = C8395nx2.r(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                int r2 = C8395nx2.r(iArr, i);
                C8395nx2.J(iArr, i, C8395nx2.r(iArr, i2));
                C8395nx2.J(iArr, i2, r2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @InterfaceC5880dj0
    public static final void e(long[] jArr, int i, int i2) {
        int a = a(jArr, i, i2);
        int i3 = a - 1;
        if (i < i3) {
            e(jArr, i, i3);
        }
        if (a < i2) {
            e(jArr, a, i2);
        }
    }

    @InterfaceC5880dj0
    public static final void f(byte[] bArr, int i, int i2) {
        int b = b(bArr, i, i2);
        int i3 = b - 1;
        if (i < i3) {
            f(bArr, i, i3);
        }
        if (b < i2) {
            f(bArr, b, i2);
        }
    }

    @InterfaceC5880dj0
    public static final void g(short[] sArr, int i, int i2) {
        int c = c(sArr, i, i2);
        int i3 = c - 1;
        if (i < i3) {
            g(sArr, i, i3);
        }
        if (c < i2) {
            g(sArr, c, i2);
        }
    }

    @InterfaceC5880dj0
    public static final void h(int[] iArr, int i, int i2) {
        int d = d(iArr, i, i2);
        int i3 = d - 1;
        if (i < i3) {
            h(iArr, i, i3);
        }
        if (d < i2) {
            h(iArr, d, i2);
        }
    }

    @InterfaceC5880dj0
    public static final void i(@NotNull long[] jArr, int i, int i2) {
        C6562gT0.p(jArr, "array");
        e(jArr, i, i2 - 1);
    }

    @InterfaceC5880dj0
    public static final void j(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        f(bArr, i, i2 - 1);
    }

    @InterfaceC5880dj0
    public static final void k(@NotNull short[] sArr, int i, int i2) {
        C6562gT0.p(sArr, "array");
        g(sArr, i, i2 - 1);
    }

    @InterfaceC5880dj0
    public static final void l(@NotNull int[] iArr, int i, int i2) {
        C6562gT0.p(iArr, "array");
        h(iArr, i, i2 - 1);
    }
}

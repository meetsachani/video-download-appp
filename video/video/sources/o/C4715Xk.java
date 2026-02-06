package o;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

@InterfaceC3147Hi0
@InterfaceC6480g82(version = "1.8")
/* renamed from: o.Xk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4715Xk {
    public static final int e = 8;
    public static final int f = 6;
    public static final int g = 3;
    public static final int h = 4;
    public static final byte i = 61;
    public static final int j = 76;
    public static final int k = 19;
    @NotNull
    public static final C4715Xk m;
    @NotNull
    public static final C4715Xk n;
    public final boolean a;
    public final boolean b;
    @NotNull
    public final b c;
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final byte[] l = {13, 10};

    /* renamed from: o.Xk$a */
    /* loaded from: classes3.dex */
    public static final class a extends C4715Xk {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C4715Xk K() {
            return C4715Xk.n;
        }

        @NotNull
        public final byte[] L() {
            return C4715Xk.l;
        }

        @NotNull
        public final C4715Xk M() {
            return C4715Xk.m;
        }

        public a() {
            super(false, false, b.X, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC6480g82(version = "2.0")
    /* renamed from: o.Xk$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final /* synthetic */ b[] Z0;
        public static final /* synthetic */ InterfaceC3127Hd0 a1;
        public static final b X = new b("PRESENT", 0);
        public static final b Y = new b("ABSENT", 1);
        public static final b Z = new b("PRESENT_OPTIONAL", 2);
        public static final b Y0 = new b("ABSENT_OPTIONAL", 3);

        static {
            b[] e = e();
            Z0 = e;
            a1 = C3323Jd0.c(e);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] e() {
            return new b[]{X, Y, Z, Y0};
        }

        @NotNull
        public static InterfaceC3127Hd0<b> g() {
            return a1;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Z0.clone();
        }
    }

    static {
        b bVar = b.X;
        m = new C4715Xk(true, false, bVar);
        n = new C4715Xk(false, true, bVar);
    }

    public /* synthetic */ C4715Xk(boolean z, boolean z2, b bVar, C9516sY c9516sY) {
        this(z, z2, bVar);
    }

    public static /* synthetic */ byte[] B(C4715Xk c4715Xk, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return c4715Xk.A(bArr, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    public static /* synthetic */ byte[] k(C4715Xk c4715Xk, CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = charSequence.length();
            }
            return c4715Xk.i(charSequence, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ byte[] l(C4715Xk c4715Xk, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return c4715Xk.j(bArr, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ int p(C4715Xk c4715Xk, CharSequence charSequence, byte[] bArr, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i2 = 0;
            }
            if ((i5 & 8) != 0) {
                i3 = 0;
            }
            if ((i5 & 16) != 0) {
                i4 = charSequence.length();
            }
            return c4715Xk.n(charSequence, bArr, i2, i3, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ int q(C4715Xk c4715Xk, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i2 = 0;
            }
            if ((i5 & 8) != 0) {
                i3 = 0;
            }
            if ((i5 & 16) != 0) {
                i4 = bArr.length;
            }
            return c4715Xk.o(bArr, bArr2, i2, i3, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ String t(C4715Xk c4715Xk, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return c4715Xk.s(bArr, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public static /* synthetic */ int v(C4715Xk c4715Xk, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i2 = 0;
            }
            if ((i5 & 8) != 0) {
                i3 = 0;
            }
            if ((i5 & 16) != 0) {
                i4 = bArr.length;
            }
            return c4715Xk.u(bArr, bArr2, i2, i3, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    public static /* synthetic */ Appendable z(C4715Xk c4715Xk, byte[] bArr, Appendable appendable, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return c4715Xk.y(bArr, appendable, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    @NotNull
    public final byte[] A(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "source");
        return C(bArr, i2, i3);
    }

    @NotNull
    public final byte[] C(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "source");
        h(bArr.length, i2, i3);
        byte[] bArr2 = new byte[x(i3 - i2)];
        w(bArr, bArr2, 0, i2, i3);
        return bArr2;
    }

    @NotNull
    public final b D() {
        return this.c;
    }

    public final int E(byte[] bArr, int i2, int i3, int i4) {
        if (i4 != -8) {
            if (i4 != -6) {
                if (i4 != -4) {
                    if (i4 == -2) {
                        return i2 + 1;
                    }
                    throw new IllegalStateException("Unreachable");
                }
                g(i2);
                int I = I(bArr, i2 + 1, i3);
                if (I != i3 && bArr[I] == 61) {
                    return I + 1;
                }
                throw new IllegalArgumentException("Missing one pad character at index " + I);
            }
            g(i2);
            return i2 + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i2);
    }

    public final boolean F() {
        return this.b;
    }

    public final boolean G() {
        return this.a;
    }

    public final boolean H() {
        b bVar = this.c;
        if (bVar != b.X && bVar != b.Z) {
            return false;
        }
        return true;
    }

    public final int I(byte[] bArr, int i2, int i3) {
        int[] iArr;
        if (!this.b) {
            return i2;
        }
        while (i2 < i3) {
            iArr = C4919Zk.b;
            if (iArr[bArr[i2] & 255] != -1) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @InterfaceC6480g82(version = "2.0")
    @NotNull
    public final C4715Xk J(@NotNull b bVar) {
        C6562gT0.p(bVar, "option");
        if (this.c == bVar) {
            return this;
        }
        return new C4715Xk(this.a, this.b, bVar);
    }

    @NotNull
    public final String d(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "source");
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    @NotNull
    public final byte[] e(@NotNull CharSequence charSequence, int i2, int i3) {
        C6562gT0.p(charSequence, "source");
        h(charSequence.length(), i2, i3);
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            if (charAt <= 255) {
                bArr[i4] = (byte) charAt;
                i4++;
            } else {
                bArr[i4] = ED2.a;
                i4++;
            }
            i2++;
        }
        return bArr;
    }

    public final void f(int i2, int i3, int i4) {
        if (i3 >= 0 && i3 <= i2) {
            int i5 = i3 + i4;
            if (i5 >= 0 && i5 <= i2) {
                return;
            }
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i3 + ", destination size: " + i2 + ", capacity needed: " + i4);
        }
        throw new IndexOutOfBoundsException("destination offset: " + i3 + ", destination size: " + i2);
    }

    public final void g(int i2) {
        if (this.c != b.Y) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i2);
    }

    public final void h(int i2, int i3, int i4) {
        AbstractC8896q1.X.a(i3, i4, i2);
    }

    @NotNull
    public final byte[] i(@NotNull CharSequence charSequence, int i2, int i3) {
        byte[] e2;
        C6562gT0.p(charSequence, "source");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            h(str.length(), i2, i3);
            String substring = str.substring(i2, i3);
            C6562gT0.o(substring, "substring(...)");
            Charset charset = HB.g;
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e2 = substring.getBytes(charset);
            C6562gT0.o(e2, "getBytes(...)");
        } else {
            e2 = e(charSequence, i2, i3);
        }
        return l(this, e2, 0, 0, 6, null);
    }

    @NotNull
    public final byte[] j(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "source");
        h(bArr.length, i2, i3);
        int r = r(bArr, i2, i3);
        byte[] bArr2 = new byte[r];
        if (m(bArr, bArr2, 0, i2, i3) == r) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int m(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr = this.a ? C4919Zk.d : C4919Zk.b;
        int i8 = -8;
        int i9 = i2;
        int i10 = i3;
        int i11 = -8;
        int i12 = 0;
        while (true) {
            if (i10 < i4) {
                if (i11 == i8 && i10 + 3 < i4) {
                    i5 = 8;
                    i7 = 1;
                    int i13 = i10 + 4;
                    int i14 = (iArr[bArr[i10 + 1] & 255] << 12) | (iArr[bArr[i10] & 255] << 18) | (iArr[bArr[i10 + 2] & 255] << 6) | iArr[bArr[i10 + 3] & 255];
                    if (i14 >= 0) {
                        bArr2[i9] = (byte) (i14 >> 16);
                        int i15 = i9 + 2;
                        bArr2[i9 + 1] = (byte) (i14 >> 8);
                        i9 += 3;
                        bArr2[i15] = (byte) i14;
                        i10 = i13;
                        i8 = -8;
                    }
                } else {
                    i5 = 8;
                    i7 = 1;
                }
                int i16 = bArr[i10] & 255;
                int i17 = iArr[i16];
                if (i17 < 0) {
                    if (i17 == -2) {
                        i10 = E(bArr, i10, i4, i11);
                        i6 = i7;
                        break;
                    } else if (this.b) {
                        i10++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid symbol '");
                        sb.append((char) i16);
                        sb.append("'(");
                        String num = Integer.toString(i16, BB.a(i5));
                        C6562gT0.o(num, "toString(...)");
                        sb.append(num);
                        sb.append(") at index ");
                        sb.append(i10);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    i10++;
                    i12 = (i12 << 6) | i17;
                    int i18 = i11 + 6;
                    if (i18 >= 0) {
                        bArr2[i9] = (byte) (i12 >>> i18);
                        i12 &= (i7 << i18) - 1;
                        i11 -= 2;
                        i9++;
                    } else {
                        i11 = i18;
                    }
                }
                i8 = -8;
            } else {
                i5 = 8;
                i6 = 0;
                break;
            }
        }
        if (i11 != -2) {
            if (i11 != -8 && i6 == 0 && this.c == b.X) {
                throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
            }
            if (i12 == 0) {
                int I = I(bArr, i10, i4);
                if (I >= i4) {
                    return i9 - i2;
                }
                int i19 = bArr[I] & 255;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Symbol '");
                sb2.append((char) i19);
                sb2.append("'(");
                String num2 = Integer.toString(i19, BB.a(i5));
                C6562gT0.o(num2, "toString(...)");
                sb2.append(num2);
                sb2.append(") at index ");
                sb2.append(I - 1);
                sb2.append(" is prohibited after the pad character");
                throw new IllegalArgumentException(sb2.toString());
            }
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public final int n(@NotNull CharSequence charSequence, @NotNull byte[] bArr, int i2, int i3, int i4) {
        byte[] e2;
        C6562gT0.p(charSequence, "source");
        C6562gT0.p(bArr, "destination");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            h(str.length(), i3, i4);
            String substring = str.substring(i3, i4);
            C6562gT0.o(substring, "substring(...)");
            Charset charset = HB.g;
            C6562gT0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e2 = substring.getBytes(charset);
            C6562gT0.o(e2, "getBytes(...)");
        } else {
            e2 = e(charSequence, i3, i4);
        }
        return q(this, e2, bArr, i2, 0, 0, 24, null);
    }

    public final int o(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i2, int i3, int i4) {
        C6562gT0.p(bArr, "source");
        C6562gT0.p(bArr2, "destination");
        h(bArr.length, i3, i4);
        f(bArr2.length, i2, r(bArr, i3, i4));
        return m(bArr, bArr2, i2, i3, i4);
    }

    public final int r(@NotNull byte[] bArr, int i2, int i3) {
        int[] iArr;
        C6562gT0.p(bArr, "source");
        int i4 = i3 - i2;
        if (i4 == 0) {
            return 0;
        }
        if (i4 != 1) {
            if (this.b) {
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    iArr = C4919Zk.b;
                    int i5 = iArr[bArr[i2] & 255];
                    if (i5 < 0) {
                        if (i5 == -2) {
                            i4 -= i3 - i2;
                            break;
                        }
                        i4--;
                    }
                    i2++;
                }
            } else if (bArr[i3 - 1] == 61) {
                int i6 = i4 - 1;
                if (bArr[i3 - 2] == 61) {
                    i4 -= 2;
                } else {
                    i4 = i6;
                }
            }
            return (int) ((i4 * 6) / 8);
        }
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i2 + ", endIndex: " + i3);
    }

    @NotNull
    public final String s(@NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "source");
        return new String(C(bArr, i2, i3), HB.g);
    }

    public final int u(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i2, int i3, int i4) {
        C6562gT0.p(bArr, "source");
        C6562gT0.p(bArr2, "destination");
        return w(bArr, bArr2, i2, i3, i4);
    }

    public final int w(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i2, int i3, int i4) {
        int i5;
        int i6 = i3;
        C6562gT0.p(bArr, "source");
        C6562gT0.p(bArr2, "destination");
        h(bArr.length, i6, i4);
        f(bArr2.length, i2, x(i4 - i6));
        byte[] bArr3 = this.a ? C4919Zk.c : C4919Zk.a;
        if (this.b) {
            i5 = 19;
        } else {
            i5 = Integer.MAX_VALUE;
        }
        int i7 = i2;
        while (i6 + 2 < i4) {
            int min = Math.min((i4 - i6) / 3, i5);
            for (int i8 = 0; i8 < min; i8++) {
                int i9 = i6 + 2;
                i6 += 3;
                int i10 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i9] & 255);
                bArr2[i7] = bArr3[i10 >>> 18];
                bArr2[i7 + 1] = bArr3[(i10 >>> 12) & 63];
                int i11 = i7 + 3;
                bArr2[i7 + 2] = bArr3[(i10 >>> 6) & 63];
                i7 += 4;
                bArr2[i11] = bArr3[i10 & 63];
            }
            if (min == i5 && i6 != i4) {
                int i12 = i7 + 1;
                byte[] bArr4 = l;
                bArr2[i7] = bArr4[0];
                i7 += 2;
                bArr2[i12] = bArr4[1];
            }
        }
        int i13 = i4 - i6;
        if (i13 != 1) {
            if (i13 == 2) {
                int i14 = i6 + 1;
                i6 += 2;
                int i15 = ((bArr[i14] & 255) << 2) | ((bArr[i6] & 255) << 10);
                bArr2[i7] = bArr3[i15 >>> 12];
                bArr2[i7 + 1] = bArr3[(i15 >>> 6) & 63];
                int i16 = i7 + 3;
                bArr2[i7 + 2] = bArr3[i15 & 63];
                if (H()) {
                    i7 += 4;
                    bArr2[i16] = i;
                } else {
                    i7 = i16;
                }
            }
        } else {
            int i17 = i6 + 1;
            int i18 = (bArr[i6] & 255) << 4;
            bArr2[i7] = bArr3[i18 >>> 6];
            int i19 = i7 + 2;
            bArr2[i7 + 1] = bArr3[i18 & 63];
            if (H()) {
                int i20 = i7 + 3;
                bArr2[i19] = i;
                i7 += 4;
                bArr2[i20] = i;
                i6 = i17;
            } else {
                i6 = i17;
                i7 = i19;
            }
        }
        if (i6 == i4) {
            return i7 - i2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int x(int i2) {
        int i3 = i2 / 3;
        int i4 = i2 % 3;
        int i5 = 4;
        int i6 = i3 * 4;
        if (i4 != 0) {
            if (!H()) {
                i5 = i4 + 1;
            }
            i6 += i5;
        }
        if (this.b) {
            i6 += ((i6 - 1) / 76) * 2;
        }
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @NotNull
    public final <A extends Appendable> A y(@NotNull byte[] bArr, @NotNull A a2, int i2, int i3) {
        C6562gT0.p(bArr, "source");
        C6562gT0.p(a2, "destination");
        a2.append(new String(C(bArr, i2, i3), HB.g));
        return a2;
    }

    public C4715Xk(boolean z, boolean z2, b bVar) {
        this.a = z;
        this.b = z2;
        this.c = bVar;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}

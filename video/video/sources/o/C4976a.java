package o;

import java.util.Arrays;
import o.C8859ps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-Base64")
/* renamed from: o.a  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4976a {
    @NotNull
    public static final byte[] a;
    @NotNull
    public static final byte[] b;

    static {
        C8859ps.a aVar = C8859ps.Y0;
        a = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").w();
        b = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").w();
    }

    @Nullable
    public static final byte[] a(@NotNull String str) {
        int i;
        char charAt;
        C6562gT0.p(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && charAt2 < '[') {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i = 63;
                }
            } else {
                i = 62;
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                i5 += 3;
                bArr[i7] = (byte) i4;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                int i9 = i4 << 6;
                int i10 = i5 + 1;
                bArr[i5] = (byte) (i9 >> 16);
                i5 += 2;
                bArr[i10] = (byte) (i9 >> 8);
            }
        } else {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        C6562gT0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @NotNull
    public static final String b(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i3];
            bArr3[i2] = bArr2[(b2 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b3 & C8077mf.q) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b4 & ED2.a];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i5 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i5];
                bArr3[i2] = bArr2[(b5 & 255) >> 2];
                bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
                bArr3[i2 + 2] = bArr2[(b6 & C8077mf.q) << 2];
                bArr3[i2 + 3] = C4715Xk.i;
            }
        } else {
            byte b7 = bArr[i];
            bArr3[i2] = bArr2[(b7 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b7 & 3) << 4];
            bArr3[i2 + 2] = C4715Xk.i;
            bArr3[i2 + 3] = C4715Xk.i;
        }
        return GO2.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }

    @NotNull
    public static final byte[] d() {
        return a;
    }

    @NotNull
    public static final byte[] f() {
        return b;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }
}

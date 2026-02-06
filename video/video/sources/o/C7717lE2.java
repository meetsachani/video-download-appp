package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,643:1\n1#2:644\n*E\n"})
/* renamed from: o.lE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7717lE2 extends C7474kE2 {
    public static final void q(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        if (str.charAt(i) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i + ", but was '" + str.charAt(i) + '\'').toString());
    }

    @InterfaceC6365fj0
    public static final void r(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        C6562gT0.p(bArr, "dst");
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = C10671xH0.m()[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static final long s(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "<this>");
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static final void t(@NotNull byte[] bArr, int i, long j) {
        C6562gT0.p(bArr, "<this>");
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) (j >> (i2 << 3));
            i2--;
            i++;
        }
    }

    public static final String u(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        C6562gT0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(0, i);
        C6562gT0.o(substring, "substring(...)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    public static final String v(byte[] bArr, int i) {
        return C7330jf.ph(bArr, null, C6566gU0.f, C6566gU0.g, i, null, null, 49, null);
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 w(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "randomBytes");
        byte b = (byte) (bArr[6] & C8077mf.q);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & ED2.a);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        return C6990iE2.Z.a(bArr);
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 x(@NotNull String str) {
        C6562gT0.p(str, "hexString");
        return C6990iE2.Z.b(C10671xH0.H(str, 0, 16, null, 4, null), C10671xH0.H(str, 16, 32, null, 4, null));
    }

    @InterfaceC6365fj0
    @NotNull
    public static final C6990iE2 y(@NotNull String str) {
        C6562gT0.p(str, "hexDashString");
        long H = C10671xH0.H(str, 0, 8, null, 4, null);
        q(str, 8);
        long H2 = C10671xH0.H(str, 9, 13, null, 4, null);
        q(str, 13);
        long H3 = C10671xH0.H(str, 14, 18, null, 4, null);
        q(str, 18);
        long H4 = C10671xH0.H(str, 19, 23, null, 4, null);
        q(str, 23);
        long j = H2 << 16;
        long j2 = H4 << 48;
        return C6990iE2.Z.b(j | (H << 32) | H3, j2 | C10671xH0.H(str, 24, 36, null, 4, null));
    }
}

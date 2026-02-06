package o;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: o.wx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10591wx1 implements ON2 {
    public static final int a = 30;
    public static final int b = 2;

    public static C2469An c(byte[][] bArr, int i) {
        int i2 = i * 2;
        C2469An c2469An = new C2469An(bArr[0].length + i2, bArr.length + i2);
        c2469An.c();
        int i3 = (c2469An.i() - i) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    c2469An.q(i5 + i, i3);
                }
            }
            i4++;
            i3--;
        }
        return c2469An;
    }

    public static C2469An d(C8394nx1 c8394nx1, String str, int i, int i2, int i3, int i4) throws PN2 {
        boolean z;
        boolean z2;
        boolean z3;
        c8394nx1.e(str, i);
        byte[][] c = c8394nx1.f().c(1, 4);
        if (i3 > i2) {
            z = true;
        } else {
            z = false;
        }
        if (c[0].length < c.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            c = e(c);
            z3 = true;
        } else {
            z3 = false;
        }
        int length = i2 / c[0].length;
        int length2 = i3 / c.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] c2 = c8394nx1.f().c(length, length << 2);
            if (z3) {
                c2 = e(c2);
            }
            return c(c2, i4);
        }
        return c(c, i4);
    }

    public static byte[][] e(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.PDF_417) {
            C8394nx1 c8394nx1 = new C8394nx1();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                EnumC9284rb0 enumC9284rb0 = EnumC9284rb0.PDF417_COMPACT;
                if (map.containsKey(enumC9284rb0)) {
                    c8394nx1.h(Boolean.valueOf(map.get(enumC9284rb0).toString()).booleanValue());
                }
                EnumC9284rb0 enumC9284rb02 = EnumC9284rb0.PDF417_COMPACTION;
                if (map.containsKey(enumC9284rb02)) {
                    c8394nx1.i(UG.valueOf(map.get(enumC9284rb02).toString()));
                }
                EnumC9284rb0 enumC9284rb03 = EnumC9284rb0.PDF417_DIMENSIONS;
                if (map.containsKey(enumC9284rb03)) {
                    C10372w30 c10372w30 = (C10372w30) map.get(enumC9284rb03);
                    c8394nx1.j(c10372w30.a(), c10372w30.c(), c10372w30.b(), c10372w30.d());
                }
                EnumC9284rb0 enumC9284rb04 = EnumC9284rb0.MARGIN;
                if (map.containsKey(enumC9284rb04)) {
                    i3 = Integer.parseInt(map.get(enumC9284rb04).toString());
                }
                EnumC9284rb0 enumC9284rb05 = EnumC9284rb0.ERROR_CORRECTION;
                if (map.containsKey(enumC9284rb05)) {
                    i4 = Integer.parseInt(map.get(enumC9284rb05).toString());
                }
                EnumC9284rb0 enumC9284rb06 = EnumC9284rb0.CHARACTER_SET;
                if (map.containsKey(enumC9284rb06)) {
                    c8394nx1.k(Charset.forName(map.get(enumC9284rb06).toString()));
                }
            }
            return d(c8394nx1, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) throws PN2 {
        return a(str, enumC3839Ok, i, i2, null);
    }
}

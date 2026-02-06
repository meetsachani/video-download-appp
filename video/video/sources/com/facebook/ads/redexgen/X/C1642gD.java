package com.facebook.ads.redexgen.X;

import android.provider.Settings;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC3550Ll;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.gD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1642gD {
    public static InterfaceC1622ft A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, QC1.w, 5, 112, 1, C8077mf.C, 51, C8077mf.u, 114, 47, C8077mf.B, 117, C3307Iz.d0, C3307Iz.f0, 36, C3307Iz.c0, 114, 40, 55, 48, 114, C8077mf.y, 47, 51, C3307Iz.c0, 125, 74, ED2.a, 96, 71, 122, 102, 66, Byte.MAX_VALUE, 106, 97, 126, 98, C3307Iz.Z, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, Byte.MAX_VALUE, 49, 6, 81, 35, C3307Iz.c0, 66, 103, 86, C3307Iz.Z, 106, 95, 80, 119, Byte.MAX_VALUE, 122, C3307Iz.Z, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, C3307Iz.f0, C8077mf.C, 88, 115, 98, 97, 121, 100, 125, Byte.MAX_VALUE, QC1.w, 113, 54, 116, 115, 112, 121, 100, 115, 54, Byte.MAX_VALUE, QC1.w, Byte.MAX_VALUE, 98, 55, 83, 81, 83, 66, C4715Xk.i, 106, 101, 81, 105, 111, 64, 109, 32, Byte.MAX_VALUE, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, C8077mf.q, 7, 28, C8077mf.H, 2, C8077mf.q, 0, C8077mf.m, 49, 3, 1, 10, C8077mf.m, 49, 1, 0, C8077mf.G, C8077mf.z, 7, 4, 28, 1, C8077mf.B, C3307Iz.V, 58, C8077mf.q, 103, C8077mf.u, 7, 59, 7, ED2.a, C8077mf.z, 108, 5, 96, 3, 3, 0, 49, C8077mf.z, C3307Iz.X, C8077mf.D, C3307Iz.Z, 19, C8077mf.G, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC1624fv A00(T8 t8) {
        return A03(true, t8);
    }

    public static InterfaceC1624fv A01(T8 t8) {
        return A02(true, t8);
    }

    public static InterfaceC1624fv A02(boolean z, T8 t8) {
        C1628fz c1628fz = new C1628fz();
        C1631g2 networkModuleRequestConfigurationBuilder = A04(t8);
        if (!A0B(t8)) {
            c1628fz.A02(A03);
            c1628fz.A01(A02);
        }
        if (XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(XD.A02());
        }
        C0669Cv A002 = AbstractC1626fx.A00();
        C1628fz networkModuleConfigurationBuilder = c1628fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z).A04(t8.A05().AAO()).A05(), t8.A08(), YG.A01());
    }

    public static InterfaceC1624fv A03(boolean z, T8 t8) {
        return AbstractC1626fx.A00().A00(new C1628fz().A03(z).A00(A04(t8).A09()).A04(t8.A05().AAO()).A05(), t8.A08(), YG.A01());
    }

    public static C1631g2 A04(T8 t8) {
        A08(t8);
        C1631g2 c1631g2 = new C1631g2();
        if (A0B(t8) || XD.A04()) {
            c1631g2.A02(360000).A04(AbstractC3550Ll.d3);
        } else {
            c1631g2.A02(C1123Up.A09(t8)).A04(C1123Up.A0B(t8));
        }
        c1631g2.A03(C1123Up.A0A(t8)).A05(C1123Up.A0C(t8)).A06(C1123Up.A0D(t8));
        synchronized (C1642gD.class) {
            if (A00 != null && (A00 instanceof InterfaceC1622ft)) {
                c1631g2.A07(A00);
            }
        }
        return c1631g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(T8 t8) {
        if (!A04.get()) {
            t8.A08().ABC(A05(C10997yd1.q1, 7, 110), AbstractC1085Td.A21, new C1086Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC1622ft interfaceC1622ft) {
        synchronized (C1642gD.class) {
            A00 = interfaceC1622ft;
        }
    }

    public static boolean A0A(T8 t8) {
        return Settings.Global.getInt(t8.getContentResolver(), A05(C3503Kz.i0, 16, 115), 0) != 0;
    }

    public static boolean A0B(T8 t8) {
        String A9Q = t8.A05().A9Q();
        if (!TextUtils.isEmpty(A9Q)) {
            String urlPrefix = A05(3, 3, 58);
            if (!A9Q.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (A9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}

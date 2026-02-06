package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ab  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1296ab implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"sP3gpwd6Zoi5atkrMGPTc5EXN8BQ3Rhb", "CuI3HGsHCqf5OUDiTkLeplOhcTm9T7NI", "qUh1oDSzqsBPPR1tLa2Ioa4F3OHVyWz", "9USBf0H8rgb5C7JYpIITcKF8xtKeHlI", "rVv7rCrqZ3PnTP4EIzYeJpV", "KXSca88saLVPZ5uec2yV3IdyBKC0ygXP", "JOf8s03jk9aSXntkdxYTuuj", "1B5kCc4TTNYrg"};
    public final /* synthetic */ M8 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].charAt(30) == 'J') {
                throw new RuntimeException();
            }
            A02[6] = "NOG9o";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-68, -67, C2638Cg0.w7, -48, C2638Cg0.A7, -107, -67, C2638Cg0.u7, -68, C2638Cg0.v7, C2638Cg0.t7, -106, -93, -108, -106, -104, -87, -98, -85, -98, -87, -82, C8077mf.x, C3307Iz.V, C8077mf.A, C3307Iz.X, 34, 28, C8077mf.A, C2638Cg0.C7, 28, C3307Iz.V, C3307Iz.Z, C8077mf.B, C3307Iz.V, C3307Iz.Z, C2638Cg0.C7, C8077mf.x, C8077mf.z, C3307Iz.Z, 28, 34, C3307Iz.V, C2638Cg0.C7, 9, -4, -8, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1673gi c1673gi;
        C1673gi c1673gi2;
        C1673gi c1673gi3;
        InterfaceC1315au interfaceC1315au;
        InterfaceC1315au interfaceC1315au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 38);
            str2 = this.A00.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 126);
            str3 = this.A00.A06;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c1673gi = this.A00.A08;
            c1673gi.A0F().A9y();
            try {
                c1673gi3 = this.A00.A08;
                C1177Wu.A0D(c1673gi3, intent);
                interfaceC1315au = this.A00.A05;
                if (interfaceC1315au != null) {
                    interfaceC1315au2 = this.A00.A05;
                    interfaceC1315au2.AF0();
                }
            } catch (C1175Ws e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1673gi2 = this.A00.A08;
                c1673gi2.A08().ABC(A00(11, 11, 0), AbstractC1085Td.A00, new C1086Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    static {
        A01();
    }

    public View$OnClickListenerC1296ab(M8 m8) {
        this.A00 = m8;
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1301ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ M6 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, C2638Cg0.q7, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, C8077mf.r, C8077mf.G, 19, C3307Iz.V, C8077mf.H, C8077mf.B, 19, -35, C8077mf.B, C8077mf.G, 35, C8077mf.x, C8077mf.G, 35, -35, C8077mf.r, C8077mf.u, 35, C8077mf.B, C8077mf.H, C8077mf.G, -35, 5, -8, -12, 6};
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
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c1673gi = this.A00.A09;
            c1673gi.A0F().A9y();
            try {
                c1673gi3 = this.A00.A09;
                C1177Wu.A0D(c1673gi3, intent);
                interfaceC1315au = this.A00.A06;
                interfaceC1315au.AF0();
            } catch (C1175Ws e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1673gi2 = this.A00.A09;
                c1673gi2.A08().ABC(A00(11, 11, 3), AbstractC1085Td.A00, new C1086Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    public View$OnClickListenerC1301ag(M6 m6) {
        this.A00 = m6;
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;
import o.C3503Kz;
import o.ED2;
import o.QC1;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.f3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1570f3 extends AbstractRunnableC1160Wc {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ T8 A01;
    public final /* synthetic */ TW A02;
    public final /* synthetic */ C1086Te A03;
    public final /* synthetic */ String A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -97, C2638Cg0.o7, -67, -48, C2638Cg0.q7, 123, -66, C2638Cg0.y7, -68, C2638Cg0.z7, C2638Cg0.r7, 123, -67, C2638Cg0.o7, -66, -68, -48, C2638Cg0.z7, C2638Cg0.o7, 123, C2638Cg0.z7, -96, C2638Cg0.v7, -47, -60, C2638Cg0.y7, C2638Cg0.w7, C2638Cg0.v7, -56, C2638Cg0.o7, C2638Cg0.v7, C2638Cg0.A7, -97, -68, C2638Cg0.A7, -68, -85, C2638Cg0.y7, C2638Cg0.w7, -47, -60, -65, C2638Cg0.o7, C2638Cg0.y7, 123, C2638Cg0.v7, C2638Cg0.w7, C2638Cg0.A7, 123, -60, C2638Cg0.v7, C2638Cg0.s7, C2638Cg0.o7, -66, C2638Cg0.A7, C2638Cg0.o7, -65, 113, -121, -116, -119, 62, -121, -111, 62, -116, -109, -118, -118, ED2.a, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, Byte.MAX_VALUE, 116, 117, Byte.MAX_VALUE, QC1.w, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, QC1.w, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, C2638Cg0.s7, -72, -60, -56, -72, C2638Cg0.t7, C2638Cg0.u7, -78, -68, -73, -115, -113, 124, -114, -109, -118, Byte.MAX_VALUE, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C1570f3(T8 t8, String str, int i, C1086Te c1086Te, TW tw) {
        this.A01 = t8;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c1086Te;
        this.A02 = tw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        String str;
        Map<String, String> A5a;
        String A8L;
        AtomicReference atomicReference;
        try {
            if (TX.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            VL.A08(this.A01, VD.A0A.toString() + A00(0, 1, 50) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = AbstractC1200Xt.A03(this.A01, cause);
            } else if (AbstractC1125Ur.A0R(this.A01)) {
                T8 t8 = this.A01;
                Throwable deLogExceptionCause = this.A03;
                str = AbstractC1200Xt.A03(t8, deLogExceptionCause);
            } else {
                str = A00(0, 0, 81) + this.A03.getMessage();
            }
            if (AbstractC1125Ur.A0V(this.A01)) {
                A5a = this.A01.A04().A5a();
            } else if (this.A02 != null) {
                A5a = this.A02.A7z();
            } else if (TX.A02) {
                TX.A0F(new RuntimeException(A00(1, 57, 84), this.A03));
                A5a = new HashMap<>();
            } else {
                A5a = this.A01.A04().A5a();
            }
            A5a.put(A00(136, 7, 19), this.A04);
            A5a.put(A00(C3503Kz.g0, 12, 30), String.valueOf(this.A00));
            JSONObject A03 = this.A03.A03();
            if (A03 != null) {
                A5a.put(A00(71, 15, 43), A03.toString());
            }
            if ((A00(106, 5, 124).equals(this.A04) || A00(111, 15, 29).equals(this.A04)) && (A8L = this.A01.A04().A8L()) != null) {
                A5a.put(A00(86, 20, 12), A8L);
            }
            String A0C = this.A01.A0C();
            if (A0C != null && !TextUtils.isEmpty(A0C)) {
                A5a.put(A00(126, 10, 76), A0C);
            }
            atomicReference = TX.A0A;
            TV tv = (TV) atomicReference.get();
            if (tv == null) {
                TX.A0F(new RuntimeException(A00(58, 13, 23)));
            } else {
                tv.AL5(str, A5a, this.A01);
            }
        } catch (Throwable t) {
            TX.A0F(t);
        }
    }
}

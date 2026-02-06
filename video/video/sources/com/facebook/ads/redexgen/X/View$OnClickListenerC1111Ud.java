package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAdLayout;
import java.util.Arrays;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Ud  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1111Ud implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, T4 {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1673gi A00;
    public final /* synthetic */ UK A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i4] = b;
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, 64, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, 64, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, 64, 10, 42, 5, 0, 10, 2, C8077mf.D, 73, 1, 8, C8077mf.C, C8077mf.C, C8077mf.n, 7, C8077mf.n, 13, 73, C8077mf.G, 6, 6, 73, C8077mf.q, 8, C8077mf.D, C8077mf.G, 71, 13, 9, 10, 62, 47, 34, C3307Iz.f0, C3307Iz.X, 40, C3307Iz.f0, 5, C3307Iz.f0, ED2.a, 60, 36, 57, 32, C8077mf.B, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, C3307Iz.Y, 58, 51, 55, C3307Iz.X, 51, 118, 51, 56, C3307Iz.X, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, C3307Iz.X, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, ED2.a, 51, C3307Iz.V, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, ED2.a, 56, 49, 118, 48, 55, 58, C3307Iz.X, 51, 118, ED2.a, 48, 118, 47, 57, 35, 118, ED2.a, 56, 34, 51, 36, 53, 51, C3307Iz.Y, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, QC1.w, 13, C8077mf.m, C8077mf.r, QC1.w, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public View$OnClickListenerC1111Ud(UK uk, C1673gi c1673gi) {
        this.A01 = uk;
        this.A00 = c1673gi;
    }

    public /* synthetic */ View$OnClickListenerC1111Ud(UK uk, C1673gi c1673gi, C1155Vx c1155Vx) {
        this(uk, c1673gi);
    }

    private Map<String, String> A01() {
        C1618fp c1618fp;
        Y2 y2;
        EnumC1138Ve enumC1138Ve;
        boolean z;
        boolean z2;
        EnumC1138Ve enumC1138Ve2;
        C1330b9 c1330b9 = new C1330b9();
        c1618fp = this.A01.A0U;
        C1330b9 A032 = c1330b9.A03(c1618fp);
        y2 = this.A01.A0j;
        Map<String, String> A05 = A032.A02(y2).A05();
        enumC1138Ve = this.A01.A0K;
        if (enumC1138Ve != null) {
            enumC1138Ve2 = this.A01.A0K;
            A05.put(A00(201, 3, 62), String.valueOf(enumC1138Ve2.A05()));
        }
        z = this.A01.A0a;
        if (z) {
            z2 = this.A01.A0a;
            A05.put(A00(198, 3, 75), String.valueOf(z2));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0e != null) {
            this.A01.A0e.A0M(extraData);
        }
    }

    public final void A04() {
        NativeAdLayout nativeAdLayout;
        NativeAdLayout nativeAdLayout2;
        C1673gi c1673gi;
        nativeAdLayout = this.A01.A08;
        if (nativeAdLayout != null) {
            nativeAdLayout2 = this.A01.A08;
            c1673gi = this.A01.A0g;
            ((C1702hB) nativeAdLayout2.getNativeAdLayoutApi()).A04(new ZX(c1673gi));
        }
    }

    @Override // com.facebook.ads.redexgen.X.T4
    public final C1673gi A6m() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y2 y2;
        C1673gi c1673gi;
        Y2 y22;
        C1673gi c1673gi2;
        Y2 y23;
        Y2 y24;
        if (WU.A02(this)) {
            return;
        }
        try {
            y2 = this.A01.A0j;
            boolean A08 = y2.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, 115, 126));
            }
            c1673gi = this.A01.A0g;
            int minimumElapsedTime = C1123Up.A0K(c1673gi);
            if (minimumElapsedTime >= 0) {
                y23 = this.A01.A0j;
                if (y23.A03() < minimumElapsedTime) {
                    y24 = this.A01.A0j;
                    if (!y24.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            y22 = this.A01.A0j;
            c1673gi2 = this.A01.A0g;
            if (y22.A09(c1673gi2)) {
                if (this.A01.A0e != null) {
                    this.A01.A0e.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C1327b6 c1327b6;
        C1327b6 c1327b62;
        View view3;
        View view4;
        C1327b6 c1327b63;
        C1327b6 c1327b64;
        view2 = this.A01.A04;
        if (view2 != null) {
            c1327b6 = this.A01.A0O;
            if (c1327b6 != null) {
                c1327b62 = this.A01.A0O;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c1327b62.setBounds(0, 0, width, view4.getHeight());
                c1327b63 = this.A01.A0O;
                c1327b64 = this.A01.A0O;
                c1327b63.A0D(!c1327b64.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Y2 y2;
        C1673gi c1673gi;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        y2 = this.A01.A0j;
        c1673gi = this.A01.A0g;
        view2 = this.A01.A04;
        y2.A06(c1673gi, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}

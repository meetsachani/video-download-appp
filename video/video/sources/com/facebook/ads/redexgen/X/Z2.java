package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C1852ji A01;
    public final AbstractC1847jd A02;
    public final C1673gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C0979Ow A07;
    public final AbstractC0973Oq A08;
    public final AbstractC1617fo A09;
    public final C1618fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Z2(C1673gi c1673gi, VA va, C1079Sx c1079Sx, WeakReference<Z1> weakReference, int i, int i2, int i3, int i4, C1852ji c1852ji, String str) {
        super(c1673gi);
        this.A06 = new Y2();
        this.A03 = c1673gi;
        this.A04 = va;
        this.A01 = c1852ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC1847jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i4, i2, i3);
        LinearLayout linearLayout = new LinearLayout(c1673gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1079Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, C8077mf.G, C2638Cg0.E7, C8077mf.G, C8077mf.D, C3307Iz.e0, C8077mf.D, C2638Cg0.E7, C8077mf.E, C3307Iz.f0, C3307Iz.Z, C8077mf.G, C3307Iz.X, C8077mf.H, C2638Cg0.E7, 34, C3307Iz.d0, C2638Cg0.E7, 28, C8077mf.D, C3307Iz.Z, C3307Iz.Z, 40, C3307Iz.e0, C2638Cg0.E7, C8077mf.E, C8077mf.H, C2638Cg0.E7, C3307Iz.Z, C3307Iz.f0, C3307Iz.X, C3307Iz.X, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, ED2.a, ED2.a, 54, 67, -1, 52, C4715Xk.i, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C0979Ow A02(AbstractC1847jd abstractC1847jd) {
        C0931Na A00;
        NR A29 = abstractC1847jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1214Yh
            public final void A4j(String str) {
                String str2;
                C1673gi c1673gi;
                StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = Z2.this.A0B;
                Intent intent = new Intent(append.append(str2).toString());
                c1673gi = Z2.this.A03;
                P2.A00(c1673gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC1847jd.A28().A01();
        } else {
            NN A28 = abstractC1847jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        C0979Ow c0979Ow = new C0979Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC1847jd.A2A());
        c0979Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC1847jd.A2C().A01(), null, null);
        if (C1123Up.A1N(this.A03)) {
            c0979Ow.A0k();
        }
        return c0979Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC0973Oq A04(C1079Sx c1079Sx) {
        final View$OnClickListenerC1232Yz view$OnClickListenerC1232Yz = new View$OnClickListenerC1232Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1079Sx, this.A01) && videoUrl != null) {
            C05146g videoView = new C05146g(this.A03, this.A04, c1079Sx, this.A05, view$OnClickListenerC1232Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1123Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1135Vb A0H = this.A01.A0H();
        if (A0H != null) {
            final C1673gi c1673gi = this.A03;
            final VI vi = this.A05;
            final AbstractC1847jd abstractC1847jd = this.A02;
            C05246q A0I = new AbstractC0973Oq(c1673gi, view$OnClickListenerC1232Yz, vi, abstractC1847jd) { // from class: com.facebook.ads.redexgen.X.6q
                public final C1326b5 A00;

                {
                    super(c1673gi, view$OnClickListenerC1232Yz, vi, abstractC1847jd);
                    this.A00 = new C1326b5(c1673gi);
                    addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0973Oq
                public final void A0E() {
                    super.A0E();
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0973Oq
                public final void A0F() {
                    super.A0F();
                    if (this.A04 != null) {
                        YB.A0J(this.A04);
                        this.A04.setLayoutParams(AbstractC0973Oq.A0A(null));
                        addView(this.A04);
                    }
                }

                public final C05246q A0I(String str) {
                    new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C0974Or(this)).A07(str);
                    A0F();
                    return this;
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC0973Oq
                public int getMediaViewId() {
                    return this.A00.getId();
                }
            }.A0I(A0H.getUrl());
            if (C1123Up.A1P(this.A03)) {
                setViewAsCTA(A0I);
            }
            return A0I;
        }
        return null;
    }

    private C0958Ob A06() {
        return new C0958Ob(this);
    }

    private C1618fp A07(int i, int i2, int i3, int i4) {
        C1618fp c1618fp = new C1618fp(this, i, i2, true, new WeakReference(this.A09), this.A03);
        c1618fp.A0W(i3);
        c1618fp.A0X(i4);
        return c1618fp;
    }

    private void A0C() {
        String A0M = this.A01.A0M();
        if (!TextUtils.isEmpty(A0M)) {
            X6 x6 = new X6();
            C1673gi c1673gi = this.A03;
            Uri A00 = XB.A00(A0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x6, c1673gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC0964Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1236Zd A01 = AbstractC1237Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C1079Sx c1079Sx, C1852ji c1852ji) {
        String A0e = c1852ji.A0e();
        if (TextUtils.isEmpty(A0e)) {
            return false;
        }
        String videoUrl = c1079Sx.A0T(A0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC0973Oq abstractC0973Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0973Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C1618fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}

package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.4V  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4V extends AbstractC0760Gj {
    public static byte[] A0V;
    public static String[] A0W = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public VH A01;
    public AbstractC1386c3 A02;
    public InterfaceC1504dy A03;
    public C1541ea A04;
    public EnumC1560et A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final View A0H;
    public final InterfaceC1041Rk A0I;
    public final AbstractC1208Yb A0J;
    public final InterfaceC1503dx A0K;
    public final C0720Eu A0L;
    public final C0710Ek A0M;
    public final C4L A0N;
    public final EA A0O;
    public final E8 A0P;
    public final E4 A0Q;
    public final E2 A0R;
    public final E0 A0S;
    public final AbstractC0699Dz A0T;
    public final DZ A0U;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0V = new byte[]{C8077mf.A, ED2.a, C3307Iz.a0, 47, ED2.a, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, C4715Xk.i, 42, 56, C3307Iz.f0, C4715Xk.i, C3307Iz.c0, 42, C3307Iz.c0, C8077mf.r, 57, C3307Iz.Y, C3307Iz.c0, 42, 32, 49, C3307Iz.a0, C3307Iz.c0, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0S(boolean z, boolean z2) {
        if (this.A03 != null) {
            this.A08 = false;
        } else if (this.A08) {
            boolean A2C = C1123Up.A2C(super.A05);
            if (!z && (!A2C || !z2)) {
                if (z2) {
                    super.A05.A0F().ACC();
                }
                super.A0A.A4j(super.A0B.A6l());
                this.A04.A06();
                this.A08 = false;
                if (this.A02 != null) {
                    this.A02.A1D();
                }
                return;
            }
            this.A08 = false;
        }
    }

    static {
        A0F();
    }

    public C4V(C1673gi c1673gi, ZU zu, VA va, AbstractC1847jd abstractC1847jd, C1079Sx c1079Sx, InterfaceC1214Yh interfaceC1214Yh) {
        super(c1673gi, zu, va, abstractC1847jd, c1079Sx, interfaceC1214Yh);
        this.A0I = new GN(this);
        this.A0S = new E0() { // from class: com.facebook.ads.redexgen.X.4w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E1 e1) {
                AbstractC1386c3 abstractC1386c3;
                C4V.this.A0E = true;
                abstractC1386c3 = C4V.this.A02;
                abstractC1386c3.A1J(e1);
            }
        };
        this.A0R = new E2() { // from class: com.facebook.ads.redexgen.X.4t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                C4V.this.A0F = true;
                C4V.this.A0e();
            }
        };
        this.A0Q = new E4() { // from class: com.facebook.ads.redexgen.X.4s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
            }
        };
        this.A0T = new AbstractC0699Dz() { // from class: com.facebook.ads.redexgen.X.4r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4A c4a) {
                AbstractC1386c3 abstractC1386c3;
                int i;
                C4V.this.A0P(c4a);
                C4V.this.A0O(c4a);
                abstractC1386c3 = C4V.this.A02;
                i = C4V.this.A00;
                abstractC1386c3.A1K(c4a, i);
            }
        };
        this.A0O = new EA() { // from class: com.facebook.ads.redexgen.X.4q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                C0710Ek c0710Ek;
                C4V c4v = C4V.this;
                c0710Ek = C4V.this.A0M;
                c4v.A0N(c4k, c0710Ek.getState() != EnumC1615fm.A06, false);
            }
        };
        this.A0P = new C04604e(this);
        boolean z = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A06 = false;
        this.A09 = false;
        this.A07 = false;
        this.A01 = VH.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0K = new GE(this);
        this.A0M = new C0710Ek(super.A05);
        this.A0M.setFunnelLoggingHandler(super.A07);
        this.A0M.getEventBus().A03(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
        this.A0B = abstractC1847jd.A1t();
        this.A0N = new C4L(super.A05, super.A06, this.A0M, super.A03.A2E(), 0, 0, super.A03.A29().A0U(), null, null);
        if (C1123Up.A20(super.A05)) {
            this.A0L = new C0720Eu(super.A05, super.A06, this.A0M, super.A03.A2E(), super.A03.A29().A0U(), this.A0N, null);
        } else {
            this.A0L = null;
        }
        this.A04 = new C1541ea(super.A05, super.A0B, super.A03.A1G(), interfaceC1214Yh);
        if (!A0m()) {
            this.A0H = new C0679Df(super.A05, super.A07);
        } else {
            this.A0H = new C0677Dd(super.A05, super.A07);
        }
        int i = -1;
        i = (super.A03.A1h() || A0m()) ? A02(super.A03) * 1000 : i;
        if (!A0m()) {
            this.A0U = new DZ(super.A05, i);
        } else {
            this.A0U = new DZ(super.A05, i, DZ.A0D);
        }
        if ((this.A0B && !super.A03.A1r()) || super.A03.A1i()) {
            this.A0U.setVisibility(8);
        }
        if (super.A03.A29().A0U() || super.A03.A1W()) {
            this.A0U.setShouldClearAnimationWhenVideoCompleted(false);
        }
        A0E();
        String A09 = super.A03.A29().A0H().A09();
        C0710Ek c0710Ek = this.A0M;
        String videoUrl = super.A04.A0T(A09);
        c0710Ek.setVideoURI(videoUrl);
        A0C();
        int unskippableSeconds = super.A03.A29().A0H().A04();
        if (C1123Up.A2Q(super.A05)) {
            this.A0C = unskippableSeconds == 0;
        } else {
            this.A0C = unskippableSeconds <= 0;
        }
        if (super.A03.A29().A0S() && super.A03.A29().A0H().A03() > 0) {
            z = true;
        }
        this.A08 = z;
        Integer toolbarBackgroundColor = getBackgroundColorForToolbar();
        if (toolbarBackgroundColor == null) {
            YB.A0N(this, super.A03.A28().A01().A08(true));
        } else {
            YB.A0N(this, toolbarBackgroundColor.intValue());
        }
        if (C1123Up.A2K(super.A05) || super.A03.A1h()) {
            super.A09.setProgressSpinnerInvisible(true);
        }
        if (super.A03.A1u()) {
            super.A05.A0F().AEX();
        }
    }

    private float A00() {
        float A04 = super.A03.A29().A0H().A04();
        boolean isRV = super.A0B.A8l().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (A04 == -1.0f && isRV && super.A03.A1m()) {
            float videoDuration = this.A0M.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        } else if (!this.A0B) {
            float serverUnskippableSeconds = this.A0M.getDuration();
            return Math.min(1000.0f * A04, serverUnskippableSeconds);
        } else {
            return 1000.0f * A04;
        }
    }

    private int A01(int i, int i2, int i3) {
        int i4 = 0;
        if (this.A0B) {
            int i5 = this.A00;
            if (A0W[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i4 = i3 * i5;
        }
        int completedVideoCycleDuration = i / 1000;
        return (i2 - i4) - completedVideoCycleDuration;
    }

    public static int A02(AbstractC1847jd abstractC1847jd) {
        if (abstractC1847jd.A10().equals(A0A(18, 14, 49))) {
            return abstractC1847jd.A29().A0H().A03();
        }
        if (abstractC1847jd.A10().equals(A0A(6, 12, 112))) {
            return abstractC1847jd.A29().A0H().A04();
        }
        String[] strArr = A0W;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC1386c3 A06(int i) {
        C1389c6 A0M = new C1389c6(super.A05, super.A06, super.A0A, super.A03, this.A0M, super.A0C, super.A08).A0J(super.A09.getToolbarHeight()).A0P(super.A09).A0I(i).A0K(this.A0H).A0R(this.A0U).A0M(super.A07);
        if (super.A03.A29().A0S() && C1123Up.A1d(super.A05) && super.A03.A29().A0L() != null) {
            A0M.A0O(getPackageInstallListener());
        }
        A0M.A0L(C0926Mu.A00(super.A05, super.A06, A0A(0, 0, 98), XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C1390c7 params = A0M.A0U();
        return AbstractC1387c4.A00(params, null, true);
    }

    private void A0B() {
        this.A0M.postDelayed(new GV(this), C1123Up.A0O(super.A05));
    }

    private void A0C() {
        this.A0M.postDelayed(new GU(this), C1123Up.A0P(super.A05));
    }

    private void A0D() {
        this.A0C = true;
        super.A09.A0A();
        if (this.A02 != null) {
            this.A02.A1F();
        }
    }

    private void A0E() {
        this.A0M.A0f(this.A0U);
        if (this.A0H instanceof InterfaceC1561eu) {
            this.A0M.A0f((InterfaceC1561eu) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A03.A29().A0H().A08())) {
            C3S c3s = new C3S(super.A05, A0m());
            this.A0M.A0f(c3s);
            c3s.setImage(super.A03.A29().A0H().A08());
        }
        if (!A0m()) {
            AnonymousClass34 anonymousClass34 = new AnonymousClass34(super.A05, true, super.A07);
            this.A0M.A0f(anonymousClass34);
            this.A0M.A0f(new C0681Dh(anonymousClass34, EnumC1576f9.A02, true));
        }
        this.A0M.A0f(new C3B(super.A05));
    }

    private void A0G(VH vh) {
        new VI(super.A03.A2E(), super.A05.A0A()).A04(vh, null);
        super.A0A.A4j(super.A0B.A6l());
        this.A04.A06();
        if (this.A02 instanceof C6H) {
            ((C6H) this.A02).A1Z();
        }
        if (!super.A03.A1r()) {
            this.A0G.postDelayed(new RunnableC1499dt(this), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(VH vh) {
        if (!this.A06) {
            this.A09 = true;
            this.A01 = vh;
            return;
        }
        A0G(vh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(C4K c4k, boolean z, boolean z2) {
        if (this.A03 != null) {
            if (z) {
                super.A05.A0F().AEY();
            }
            super.A05.A0F().AEV();
            this.A03.AIY();
        } else if (this.A0D) {
        } else {
            if (!z && this.A08 && this.A0B) {
                this.A00++;
                this.A0M.A0e(EnumC1560et.A02, 20);
                return;
            }
            if (!this.A0C) {
                A0D();
            }
            if (!z && this.A00 < super.A03.A29().A0G()) {
                this.A0M.A0e(EnumC1560et.A02, 32);
            } else {
                this.A0D = true;
                if (this.A02 != null) {
                    this.A02.A1I(c4k);
                }
            }
            if (this.A00 == 0) {
                A0R(z, z2);
            }
            this.A00++;
            String[] strArr = A0W;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[0] = "";
            strArr2[1] = "mBWwcFSbVIKH";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(C4A c4a) {
        if (this.A0M.getState() == EnumC1615fm.A02 && C1123Up.A1e(super.A05)) {
            this.A0M.postDelayed(new GT(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(C4A c4a) {
        float f;
        int A00 = c4a.A00();
        int totalSecondsForNextCta = super.A03.A29().A0H().A02();
        int currentPosMs = super.A03.A29().A0H().A05();
        int currentPosMs2 = A01(A00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A02 && this.A02 != null && this.A02.A1N()) {
            super.A02 = true;
            super.A09.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A03.A29().A0H().A03();
            int currentPosMs3 = super.A03.A29().A0H().A05();
            int A01 = A01(A00, totalSecondsForNextCta2, currentPosMs3);
            AbstractC1847jd abstractC1847jd = super.A03;
            if (A0W[6].length() != 22) {
                String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!View$OnClickListenerC0871Kr.A05(abstractC1847jd)) {
                    boolean A1u = super.A03.A1u();
                    String A0A = A0A(0, 0, 98);
                    if (A1u || super.A03.A1s() || super.A03.A1h()) {
                        super.A09.setToolbarActionMessage(A0A);
                    } else if (A01 > 0) {
                        super.A09.setToolbarActionMessage(super.A03.A2D().A06().replace(A0A(0, 6, 50), String.valueOf(A01)));
                    } else {
                        super.A09.setToolbarActionMessage(A0A);
                    }
                }
                if (A01 <= 0) {
                    A0S(false, false);
                }
            } else {
                throw new RuntimeException();
            }
        }
        float A002 = A00();
        float totalCurrentPosMs = A00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0M.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (super.A03.A1m()) {
            int currentPosMs5 = (A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1));
            if (currentPosMs5 > 0) {
                f = totalCurrentPosMs / A002;
            } else {
                f = 1.0f;
            }
        } else {
            f = totalCurrentPosMs / A002;
        }
        boolean A1s = super.A03.A1s();
        if (A0W[5].charAt(8) != 102) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!A1s) {
            float unskippableSeconds = 100.0f * f;
            super.A09.setProgress(unskippableSeconds);
        } else {
            int i = 0;
            int currentPosMs6 = ((A002 - totalCurrentPosMs) > 0.0f ? 1 : ((A002 - totalCurrentPosMs) == 0.0f ? 0 : -1));
            if (currentPosMs6 > 0) {
                int currentPosMs7 = (int) (A002 - totalCurrentPosMs);
                i = currentPosMs7 / 1000;
            }
            AbstractC1208Yb abstractC1208Yb = super.A09;
            String[] strArr3 = A0W;
            String str = strArr3[7];
            String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs8 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs8) {
                float unskippableSeconds2 = 100.0f * f;
                abstractC1208Yb.A0C(unskippableSeconds2, i);
            } else {
                A0W[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f;
                abstractC1208Yb.A0C(unskippableSeconds3, i);
            }
        }
        int currentPosMs9 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (currentPosMs9 >= 0 && !this.A0C) {
            A0D();
            AbstractC1208Yb abstractC1208Yb2 = super.A09;
            int currentPosMs10 = getCloseButtonStyle();
            abstractC1208Yb2.setToolbarActionMode(currentPosMs10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str) {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        int i = 0;
        int duration = 0;
        if (this.A0M != null) {
            i = this.A0M.getCurrentPositionInMillis();
            duration = this.A0M.getDuration();
            this.A0M.A0b(3);
        }
        super.A05.A0F().A3a(str);
        if (C1123Up.A1f(super.A05)) {
            A0N(new C4K(i, duration), false, true);
            return;
        }
        super.A0A.A4j(super.A0B.A81());
        InterfaceC1214Yh interfaceC1214Yh = super.A0A;
        ZU zu = super.A0B;
        int currentPositionMS = A0W[4].charAt(26);
        if (currentPositionMS != 70) {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o6mUTp9wkX0m";
        interfaceC1214Yh.A4j(zu.A7w());
    }

    private void A0R(boolean z, boolean z2) {
        super.A09.setToolbarActionMessage(A0A(0, 0, 98));
        A0S(z, z2);
        if (z2) {
            if (super.A03.A29().A0T()) {
                super.A05.A0F().ACE();
            } else {
                super.A05.A0F().ACD();
            }
            AbstractC1208Yb abstractC1208Yb = super.A09;
            String[] strArr = A0W;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[0] = "";
            strArr2[1] = "xKhq1oBo2v82";
            abstractC1208Yb.setToolbarActionMode(0);
            return;
        }
        super.A09.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final AbstractC1208Yb A0c() {
        AbstractC1208Yb A0c = super.A0c();
        if (A0m() && super.A03.A2T()) {
            A0c.setOnTouchListener(new View$OnTouchListenerC1501dv(this));
        }
        if (super.A03.A2T()) {
            A0c.setOnClickListener(new View$OnClickListenerC1497dr(this));
        }
        return A0c;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final void A0d() {
        Rect requestedMargins;
        super.A0d();
        if (!super.A03.A1W() || (requestedMargins = super.A09.getRequestedMargins()) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0H.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, requestedMargins.top, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.A0H.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final void A0g() {
        if (this.A02 != null) {
            super.A07.A04(VH.A0Y, null);
            if (super.A03.A29().A0H().A07() != null) {
                this.A0M.A0d(EnumC1552el.A05);
                if (C1123Up.A1H(super.A05)) {
                    super.A03.A29().A0H().A07().A0U(false);
                }
            }
            EnumC0922Mq A1B = this.A02.A1B(A0A(32, 4, 60));
            if (super.A03.A2N()) {
                return;
            }
            EnumC0922Mq actionOutcome = EnumC0922Mq.A09;
            if (A1B != actionOutcome) {
                EnumC0922Mq actionOutcome2 = EnumC0922Mq.A06;
                if (A1B != actionOutcome2) {
                    A0f();
                    return;
                }
                return;
            }
            return;
        }
        super.A07.A04(VH.A0Z, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final void A0h() {
        YB.A0L(this.A02);
        this.A0M.setVisibility(4);
        if (!super.A03.A1o()) {
            A0n();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final void A0k(C1035Re c1035Re) {
        FrameLayout.LayoutParams layoutParams;
        c1035Re.A0A(this.A0I);
        int orientation = c1035Re.A05().getResources().getConfiguration().orientation;
        this.A02 = A06(orientation);
        this.A02.setAccidentalClickCappingListener(new InterfaceC0923Mr() { // from class: com.facebook.ads.redexgen.X.GW
            @Override // com.facebook.ads.redexgen.X.InterfaceC0923Mr
            public final void ACk() {
                C4V.this.A0o();
            }
        });
        A0j(this.A02);
        if (super.A01 != null) {
            addView(super.A01, AbstractC0760Gj.A0H);
        }
        boolean z = false;
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = super.A09.getRequestedMargins();
            if (requestedMargins == null) {
                int i = XV.A0u;
                int orientation2 = XV.A0r;
                layoutParams.setMargins(i, orientation2, 0, 0);
            } else {
                int i2 = requestedMargins.left;
                int i3 = requestedMargins.top;
                int i4 = requestedMargins.right;
                int orientation3 = requestedMargins.bottom;
                layoutParams.setMargins(i2, i3, i4, orientation3);
            }
        } else {
            int orientation4 = super.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation4);
        }
        addView(super.A09, layoutParams);
        if (this.A0J != null) {
            addView(this.A0J, new FrameLayout.LayoutParams(-1, this.A0J.getToolbarHeight()));
            YB.A0H(this.A0J);
        }
        AbstractC1386c3 abstractC1386c3 = this.A02;
        if (A0W[5].charAt(8) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o0V9GMeYx8z7";
        YB.A0H(abstractC1386c3);
        YB.A0H(super.A09);
        if (super.A03.A1o() && (this.A02 instanceof C6H)) {
            ((C6H) this.A02).setVideoAdViewListener(this.A0K);
        }
        if (this.A02 != null && this.A02.A1O()) {
            z = true;
        }
        setUpFullscreenMode(z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final boolean A0l() {
        if (this.A02 != null) {
            boolean A1P = this.A02.A1P(this.A08);
            String[] strArr = A0W;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0W[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (A1P) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj
    public final boolean A0m() {
        if (super.A03.A29().A0H().A07() == null) {
            if (!super.A03.A1w()) {
                boolean A1y = super.A03.A1y();
                if (A0W[5].charAt(8) != 'f') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "yoI6qUf6VdU9";
                if (!A1y) {
                    return false;
                }
            }
            return true;
        }
        return super.A03.A1n();
    }

    public final void A0n() {
        this.A0M.setVisibility(0);
        YB.A0L(super.A09);
        this.A0M.setVolume(super.A03.A29().A0H().A0A() ? 0.0f : 1.0f);
        if (A0m()) {
            AbstractC1386c3 abstractC1386c3 = this.A02;
            if (A0W[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            if (abstractC1386c3 instanceof C6H) {
                ((C6H) this.A02).A1a(getResources().getConfiguration().orientation);
                ((C6H) this.A02).A1Y();
            }
        }
        this.A0M.A0e(EnumC1560et.A02, 20);
        if (this.A02 != null && this.A08) {
            this.A02.A1E();
        }
        if (this.A02 != null && !this.A0C) {
            this.A02.A1G();
        }
        A0B();
    }

    public final /* synthetic */ void A0o() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
        this.A06 = false;
        if (this.A02 != null) {
            this.A02.A1L(z);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0n()) {
            return;
        }
        this.A05 = this.A0M.getVideoStartReason();
        this.A0A = z;
        this.A0M.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
        this.A06 = true;
        if (this.A09) {
            this.A09 = false;
            A0G(this.A01);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0o() || this.A0D || this.A0M.getState() == EnumC1615fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0A || z) {
            this.A0M.A0e(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private InterfaceC1188Xh getPackageInstallListener() {
        return new GS(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Gj, com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void onDestroy() {
        super.onDestroy();
        if (C1123Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A0M);
        }
        if (this.A02 != null) {
            this.A02.A1C();
        }
        if (this.A0M != null) {
            if (!this.A0D) {
                this.A0M.A0d(EnumC1552el.A05);
            }
            this.A0M.getEventBus().A04(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
            this.A0M.A0W();
        }
        if (this.A0L != null) {
            this.A0L.A07();
        }
        C4L c4l = this.A0N;
        if (A0W[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0W[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c4l.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C1541ea c1541ea) {
        this.A04 = c1541ea;
    }

    public void setVideoLeadingPlayableAdListener(InterfaceC1504dy interfaceC1504dy) {
        this.A03 = interfaceC1504dy;
    }
}

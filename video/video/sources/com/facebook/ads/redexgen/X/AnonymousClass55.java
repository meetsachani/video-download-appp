package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.55  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass55 extends AbstractC0812Ij {
    public static byte[] A0o;
    public static String[] A0p = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public M8 A04;
    public C1302ah A05;
    public M3 A06;
    public C1350bT A07;
    public View$OnClickListenerC0871Kr A08;
    public C1402cJ A09;
    public EnumC1560et A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final int A0O;
    public final Handler A0P;
    public final Handler A0Q;
    public final Handler A0R;
    public final AbstractC0925Mt A0S;
    public final C0931Na A0T;
    public final C1673gi A0U;
    public final VI A0V;
    public final AbstractC1208Yb A0W;
    public final LK A0X;
    public final InterfaceC1351bU A0Y;
    public final InterfaceC1493dm A0Z;
    public final C0720Eu A0a;
    public final C0710Ek A0b;
    public final C4L A0c;
    public final EA A0d;
    public final E8 A0e;
    public final E4 A0f;
    public final E2 A0g;
    public final E0 A0h;
    public final AbstractC0699Dz A0i;
    public final C0677Dd A0j;
    public final DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0o, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A0W() {
        A0o = new byte[]{C3307Iz.V, C3307Iz.f0, C3307Iz.c0, C3307Iz.V, C3307Iz.a0, C8077mf.G, 49, C3307Iz.e0, 55, 48, C3307Iz.V, C3307Iz.Z, 58, 54, 52, 119, ED2.a, 56, 58, 60, 59, 54, 54, 50, 119, 56, C4715Xk.i, 42, 119, 48, 55, C3307Iz.e0, 60, C3307Iz.c0, 42, C3307Iz.e0, 48, C3307Iz.e0, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, C4715Xk.i, C3307Iz.V, 54, 36, 50, C3307Iz.V, 55, 54, 55, C8077mf.n, C3307Iz.X, 58, 55, 54, 60, C4715Xk.i, 59, C3307Iz.e0, 58, C3307Iz.c0, 36, C3307Iz.V, C3307Iz.c0, 35, C8077mf.A, C3307Iz.f0, C3307Iz.V, 36, 60, C3307Iz.e0, 58, C3307Iz.e0, C3307Iz.d0, 9};
    }

    static {
        A0W();
        A0q = (int) (XX.A02 * 4.0f);
        A0r = (int) (XX.A02 * 32.0f);
        A0s = P3.A02(-1, 77);
        A0t = (int) (XX.A02 * 26.0f);
        A0u = (int) (XX.A02 * 12.0f);
    }

    public AnonymousClass55(C1673gi c1673gi, VA va, AbstractC1208Yb abstractC1208Yb, AbstractC1847jd abstractC1847jd, C1079Sx c1079Sx, ZU zu, int i, InterfaceC1214Yh interfaceC1214Yh, VI vi, int i2, boolean z, boolean z2, InterfaceC1493dm interfaceC1493dm, int i3, int i4) {
        super(c1673gi, zu, va, abstractC1847jd, i, z, z2, interfaceC1214Yh, i4);
        C0931Na A00;
        this.A0H = false;
        this.A0G = false;
        this.A0F = false;
        this.A01 = 0;
        this.A0J = true;
        this.A0M = false;
        this.A0I = false;
        this.A0Q = new Handler(Looper.getMainLooper());
        this.A0l = new RunnableC1486df(this);
        this.A0E = false;
        this.A00 = 0.0f;
        this.A0B = true;
        this.A0C = false;
        this.A0K = false;
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0h = new E0() { // from class: com.facebook.ads.redexgen.X.5D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E1 e1) {
                boolean z3;
                C1673gi c1673gi2;
                LK lk;
                LK lk2;
                LK lk3;
                z3 = AnonymousClass55.this.A0M;
                if (!z3) {
                    AnonymousClass55.this.A0M = true;
                    c1673gi2 = AnonymousClass55.this.A0U;
                    c1673gi2.A0F().AKh(XL.A00((float) ((AbstractC0812Ij) AnonymousClass55.this).A06.A0k()), AnonymousClass55.this.getResources().getConfiguration().orientation, true, true, AbstractC0925Mt.A0A());
                    AnonymousClass55.this.A0X(AnonymousClass55.this.getResources().getConfiguration().orientation);
                    lk = AnonymousClass55.this.A0X;
                    lk.setVisibility(0);
                    lk2 = AnonymousClass55.this.A0X;
                    lk2.A0u(AnonymousClass55.this.getResources().getConfiguration().orientation);
                    lk3 = AnonymousClass55.this.A0X;
                    lk3.bringToFront();
                    AnonymousClass55.this.A0V();
                }
            }
        };
        this.A0g = new E2() { // from class: com.facebook.ads.redexgen.X.5B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                if (!((AbstractC0812Ij) AnonymousClass55.this).A0A.A07()) {
                    AnonymousClass55.this.A1F();
                }
            }
        };
        this.A0f = new E4() { // from class: com.facebook.ads.redexgen.X.59
            @Override // com.facebook.ads.redexgen.X.UN
            public final /* bridge */ /* synthetic */ void A03(C4B c4b) {
            }
        };
        this.A0i = new AbstractC0699Dz() { // from class: com.facebook.ads.redexgen.X.58
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4A c4a) {
                float f;
                C0710Ek c0710Ek;
                InterfaceC1493dm interfaceC1493dm2;
                AnonymousClass55.this.A0o(c4a);
                f = AnonymousClass55.this.A00;
                c0710Ek = AnonymousClass55.this.A0b;
                float duration = (f * c0710Ek.getDuration()) + c4a.A00();
                interfaceC1493dm2 = AnonymousClass55.this.A0Z;
                interfaceC1493dm2.ADw(duration);
            }
        };
        this.A0d = new EA() { // from class: com.facebook.ads.redexgen.X.57
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                InterfaceC1493dm interfaceC1493dm2;
                C0710Ek c0710Ek;
                C0710Ek c0710Ek2;
                interfaceC1493dm2 = AnonymousClass55.this.A0Z;
                c0710Ek = AnonymousClass55.this.A0b;
                interfaceC1493dm2.ADc(c0710Ek.getDuration());
                AnonymousClass55.A01(AnonymousClass55.this, 1.0f);
                c0710Ek2 = AnonymousClass55.this.A0b;
                c0710Ek2.A0e(EnumC1560et.A02, 28);
            }
        };
        this.A0e = new AnonymousClass56(this);
        this.A0Y = new HW(this);
        this.A0W = abstractC1208Yb;
        this.A0O = i3;
        this.A0P = new Handler(Looper.getMainLooper());
        this.A0S = C0926Mu.A01(c1673gi, va, abstractC1847jd.A2E(), XB.A00(abstractC1847jd.A29().A0J().A05()), new HashMap(), false, true, abstractC1847jd.A2A());
        this.A0U = c1673gi;
        this.A0V = vi;
        this.A0j = new C0677Dd(this.A0U, this.A0V);
        this.A0k = new DZ(this.A0U, i3);
        this.A0Z = interfaceC1493dm;
        if (i2 == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A0T = A00;
        AbstractC1374br.A00(this.A0U, this, abstractC1847jd.A29().A0H().A08());
        this.A0b = new C0710Ek(this.A0U);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C4L(c1673gi, va, this.A0b, abstractC1847jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c1079Sx.A0T(videoUrl));
        this.A0N = (float) abstractC1847jd.A0k();
        A0Q();
        A0M();
        A0L();
        this.A0X = A0D();
        addView(this.A0X);
        YB.A0K(this.A0X);
        A0T();
        A0R();
        A0S();
        this.A0X.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (C1123Up.A1z(this.A0U)) {
            VM A0B = this.A0U.A0B();
            C0710Ek c0710Ek = this.A0b;
            String videoUrl2 = super.A06.A2E();
            A0B.AKn(c0710Ek, videoUrl2, true);
        }
        if (C1123Up.A20(this.A0U)) {
            this.A0a = new C0720Eu(this.A0U, va, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0d(abstractC1847jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        A0P();
        c1673gi.A0F().ACI(this.A0m, this.A0n, true);
        this.A0j.bringToFront();
    }

    public static /* synthetic */ float A01(AnonymousClass55 anonymousClass55, float f) {
        float f2 = anonymousClass55.A00 + f;
        anonymousClass55.A00 = f2;
        return f2;
    }

    public static /* synthetic */ int A03(AnonymousClass55 anonymousClass55) {
        int i = anonymousClass55.A01;
        anonymousClass55.A01 = i + 1;
        return i;
    }

    private LK A0D() {
        String A0J;
        if (super.A06.A10().equals(A0J(49, 14, 78))) {
            A0J = EnumC1566ez.A04.A03();
        } else {
            A0J = A0J(12, 37, 68);
        }
        LK A03 = new C1375bs(this.A0N, A0J, this.A0U, getColors(), super.A06, super.A0B, this.A08, AbstractC0812Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0k, this.A0V, true).A03();
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        A03.setVisibility(8);
        A03.setChainedAdInfo(super.A00);
        A03.setLayoutParams(adDetailsParams);
        return A03;
    }

    private void A0K() {
        this.A09 = new C1402cJ(this.A0U, super.A06, this.A0V, this.A0Q, super.A0B);
        this.A09.A0I(false);
        addView(this.A09.A0C(getRegularCtaForEndCard()));
    }

    private void A0L() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0u, A0u, A0u, A0u);
    }

    private void A0M() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(XV.A0b, XV.A0r, XV.A0b, XV.A0Z);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            A0q(A0J(63, 18, 85));
        }
    }

    private void A0O() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            Map<String, String> A05 = new C1330b9().A03(null).A02(null).A05();
            A05.put(A0J(0, 12, 95), A0J(63, 18, 85));
            super.A08.AB6(super.A06.A2E(), A05);
        }
    }

    private void A0P() {
        if (!super.A06.A29().A0K().A04()) {
            return;
        }
        this.A02 = new ImageView(this.A0U);
        addView(this.A02);
        this.A02.setVisibility(4);
        new LM(this.A02, this.A0U).A04().A06(new C0779Hc(this)).A07(super.A06.A29().A0H().A08());
    }

    private void A0Q() {
        postDelayed(new C0790Hn(this), C1123Up.A0P(this.A0U));
    }

    private void A0R() {
        YB.A0J(this.A03);
        this.A03 = new LinearLayout(this.A0U);
        this.A03.setOrientation(1);
        YB.A0K(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (super.A06.A1X() && this.A0S != null && XL.A03(this.A0N)) {
            this.A07 = new C1350bT(this.A0U, super.A0B, super.A06.A0l(), this.A0S, this.A0X.getCTAButton(), this.A0X);
            addView(this.A07.getBrowserPeekView());
            this.A0R.postDelayed(new RunnableC1483dc(this), 5900L);
        }
    }

    private void A0T() {
        if (super.A06.A1e()) {
            this.A0b.setOnClickListener(new View$OnClickListenerC1489di(this));
        }
        YB.A0J(this.A0b);
        YB.A0K(this.A0b);
        addView(this.A0b, new RelativeLayout.LayoutParams(-1, -2));
        this.A08 = new View$OnClickListenerC0871Kr(this.A0U, super.A06, this.A0T, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC1188Xh) null);
        YB.A0G(1001, this.A08);
        if (C1123Up.A17(this.A0U)) {
            View.OnClickListener onClickListener = new View$OnClickListenerC1481da(this);
            this.A0X.setCTAClickListener(onClickListener);
            if (this.A0W != null) {
                View.OnClickListener onClickListener2 = new View$OnClickListenerC1482db(this);
                this.A0W.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C3S c3s = new C3S(this.A0U, true);
            this.A0b.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C3B(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        int duration = this.A0b.getDuration();
        int videoDuration = this.A0k.getCustomDuration();
        if (videoDuration > duration) {
            this.A0k.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(int i) {
        if (!this.A0M) {
            return;
        }
        C0710Ek c0710Ek = this.A0b;
        RelativeLayout adjacentView = (RelativeLayout) this.A0b.getVideoView();
        this.A0b.A0Z(i);
        A0Z(i, c0710Ek, adjacentView);
    }

    private void A0Y(int i) {
        if (this.A0j != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0j.getLayoutParams();
            layoutParams.setMargins(XV.A09, i, XV.A09, XV.A05);
            this.A0j.setLayoutParams(layoutParams);
        }
    }

    private void A0Z(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        YB.A0J(this.A0X);
        if ((this.A0X instanceof C6V) || (this.A0X instanceof C6U)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0X.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0X);
            } else {
                View view = this.A0X;
                String[] strArr = A0p;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0p[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0X instanceof C6T) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0X.setLayoutParams(layoutParams2);
            addView(this.A0X, layoutParams2);
        }
        this.A0X.A0l(i);
        this.A0X.A0y(viewGroup, relativeLayout, i);
    }

    private void A0a(ViewGroup viewGroup, View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0X(i);
    }

    private void A0b(ViewGroup viewGroup, View view, AbstractC1208Yb abstractC1208Yb, int i) {
        YB.A0d(this.A03);
        YB.A0J(abstractC1208Yb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC1208Yb.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0X.A0z(viewGroup, false, false, this.A03.getId());
        A0X(i);
        viewGroup.addView(abstractC1208Yb, layoutParams);
    }

    private void A0c(ViewGroup viewGroup, View view, AbstractC1208Yb abstractC1208Yb, int i) {
        YB.A0J(this.A03);
        YB.A0J(abstractC1208Yb);
        YB.A0J(this.A0X);
        boolean A05 = XL.A05(this.A0N);
        boolean isBrowserBelowMediaView = i == 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!super.A06.A2U() || i != 2 || !A05) {
            A0Y(XV.A0N);
            layoutParams.setMargins(XV.A0T, XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(XV.A0T, XV.A0B, 0, 0);
            A0Y(XV.A0B);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams browserLayoutParam = (RelativeLayout.LayoutParams) view.getLayoutParams();
        browserLayoutParam.removeRule(14);
        browserLayoutParam.removeRule(9);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean z = isBrowserBelowMediaView || A05;
        if (z) {
            layoutParams2.height = getHeightPixels() / 4;
            browserLayoutParam.height = getHeightPixels() / 4;
            if (A0p[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "aNPRQigyxlriqHgRS6C1obCW9NP8FFpI";
            strArr[2] = "RUJfPTyX2Zr9a7jBp48wtOZ1EckF1HKn";
            browserLayoutParam.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            this.A0b.A0Z(i);
            layoutParams2.height = -1;
            browserLayoutParam.height = -1;
            browserLayoutParam.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        browserLayoutParam.width = -2;
        view.setLayoutParams(browserLayoutParam);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (z) {
            addView(this.A03);
            addView(abstractC1208Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC1208Yb, layoutParams);
        }
        this.A0X.A0z(viewGroup, true, A05, this.A03.getId());
    }

    private void A0d(NR nr) {
        this.A0X.setInfo(nr.A0I(), nr.A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, this.A0Y);
        this.A0X.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(C4A c4a) {
        if (this.A0b.getState() == EnumC1615fm.A02 && C1123Up.A1e(this.A0U)) {
            postDelayed(new C0789Hm(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(String str) {
        M3 m3;
        YB.A0J(this.A06);
        C0794Hr c0794Hr = new C0794Hr(this);
        if (this.A0U.A0E() == null) {
            this.A0U.A0F().A9v();
        }
        if (this.A07 != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (AbstractC1124Uq.A02(this.A0U) || this.A0U.A0E() == null) {
            m3 = new M3(this.A0U, c0794Hr);
        } else {
            m3 = new M3(this.A0U, this.A0U.A0E(), c0794Hr);
        }
        this.A06 = m3;
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0q(String str) {
        Map<String, String> A05 = new C1330b9().A03(null).A02(null).A05();
        A05.put(A0J(0, 12, 95), str);
        this.A0V.A04(VH.A0J, A05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), A05);
        if (C1123Up.A2U(this.A0U)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1886kH.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1886kH.A05, Boolean.TRUE.toString());
            hashMap.put(AbstractC1886kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0q(str);
        } else if (super.A06.A1d()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0s(String str) {
        if (!this.A0K) {
            this.A0K = true;
            this.A0Z.AGQ(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(String str) {
        if (!this.A0D) {
            this.A0X.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0u(boolean z) {
        if (!z && this.A0m) {
            return;
        }
        this.A0D = z;
        if (z) {
            this.A01 = 0;
            this.A0G = false;
            this.A0F = false;
        } else {
            this.A0P.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.A03;
        float y = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z) {
            heightPixels /= 4.0f;
        }
        String A0J = A0J(81, 1, 109);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, y, heightPixels);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0b, A0J, this.A0b.getY(), 0.0f);
        ofFloat2.setDuration(500L);
        int height = this.A0b.getHeight();
        int heightPixels2 = getHeightPixels();
        if (z) {
            heightPixels2 /= 4;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
        duration.addUpdateListener(new C1484dd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, duration);
        animatorSet.addListener(new C1485de(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        A0w(this.A0D, true);
        if (!z && this.A06 != null) {
            this.A06.destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r6 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        r4.setCloseButtonVisibility(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r6 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0v(boolean z, int i) {
        this.A0U.A0F().ACG(!z, i);
        if (this.A04 != null) {
            boolean z2 = this.A0m;
            int i2 = 4;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "EaXPQIkUGhcx1dZHr3fchF7eoR8nmh6r";
            strArr2[7] = "BoqCm6Atk4DXyXzUZY25jylGRvSX4IAb";
            if (z2) {
                this.A04.setCloseButtonVisibility(4);
                return;
            }
            M8 m8 = this.A04;
            String[] strArr3 = A0p;
            if (strArr3[3].length() == strArr3[0].length()) {
                String[] strArr4 = A0p;
                strArr4[3] = "X7";
                strArr4[0] = "zP";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0w(boolean z, boolean z2) {
        if (!this.A0M) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (z) {
            A0c(this.A0b, this.A0b.getVideoView(), this.A0W, i);
        } else if (z2) {
            C0710Ek c0710Ek = this.A0b;
            C0710Ek c0710Ek2 = this.A0b;
            String[] strArr = A0p;
            String str = strArr[6];
            String str2 = strArr[7];
            int charAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (charAt == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0b(c0710Ek, c0710Ek2.getVideoView(), this.A0W, i);
        } else {
            A0a(this.A0b, this.A0b.getVideoView(), i);
        }
    }

    private final boolean A0x() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final EnumC0922Mq A1D(String str) {
        if (!A0x()) {
            if (this.A09 != null) {
                return this.A09.A0E().A0E(str);
            }
            return this.A0X.getCTAButton().A0E(str);
        }
        return EnumC0922Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1E() {
        A0O();
        this.A0X.A0j();
        this.A0R.removeCallbacksAndMessages(null);
        if (this.A09 != null) {
            this.A09.A0F();
        }
        this.A0Q.removeCallbacksAndMessages(null);
        if (C1123Up.A1z(this.A0U)) {
            this.A0U.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            this.A0a.A07();
        }
        C1350bT c1350bT = this.A07;
        String[] strArr = A0p;
        if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
            throw new RuntimeException();
        }
        A0p[4] = "zZx5K1WC5ur1IIrcKdsfSp5hTLdY49e9";
        if (c1350bT != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1G() {
        this.A0I = true;
        this.A0X.A0o();
        YB.A0d(this.A0b, this.A0X, this.A0k, this.A04, this.A0j, this.A03, this.A0W);
        if (this.A07 != null) {
            this.A07.A0B();
        }
        YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0K();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
        addView(this.A0W, layoutParams);
        this.A0W.bringToFront();
        this.A0B = true;
        this.A0Z.AFw(true);
        if (this.A0W != null && getAdDataBundle().A29().A0K().A00() > 0) {
            this.A0B = false;
            if (getAdDataBundle().A2P()) {
                this.A0W.setToolbarActionMode(8);
            } else {
                this.A0W.setToolbarActionMode(2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1487dg(this), getAdDataBundle().A29().A0K().A00());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1H() {
        C0710Ek c0710Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0710Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC1560et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0O;
            if (A02 < secondsForNextCta2) {
                if (A02 <= 0) {
                    return;
                }
                this.A0W.setProgressSpinnerInvisible(true);
                new XO(A02, new C0792Hp(this)).A07();
                return;
            }
        }
        this.A0W.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1I(boolean z) {
        this.A0J = z;
        A0v(z, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r5 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        r4 = r6.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass55.A0p[4].charAt(14) == 'r') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r5 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass55.A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
        r4.A0C();
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1J(boolean z) {
        if (!this.A0C) {
            this.A0X.A0m(z);
        }
        if (this.A09 != null) {
            boolean z2 = this.A0C;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "0qZcOgUU1tryulZiP6XyTUbAv74itU8r";
            strArr2[2] = "FbQDSrVtnmrn6n1tCiGdEtRCABZgMVu6";
            if (!z2) {
                this.A09.A0H(z);
            }
        }
        this.A0C = false;
        if (this.A0b.A0n()) {
            return;
        }
        if (this.A07 != null) {
            int i = getResources().getConfiguration().orientation;
            if (A0p[5].charAt(30) != '1') {
                A0p[5] = "NO4KYfXMvMpDq3TiuILiTAIZZLlPHE1o";
            } else {
                String[] strArr3 = A0p;
                strArr3[1] = "uxhOTaOwbBr7x682JVxutMugyCdaSc2z";
                strArr3[2] = "WtxTL59IucrgXt9Ertpm7Y8tzE2Zsttw";
            }
        }
        this.A0A = this.A0b.getVideoStartReason();
        this.A0L = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() == EnumC1615fm.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0L || z) {
            C0710Ek c0710Ek = this.A0b;
            EnumC1560et enumC1560et = this.A0A;
            String[] strArr = A0p;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            c0710Ek.A0e(enumC1560et, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1L() {
        if (super.A06.A29().A0V() && super.A06.A29().A0K().A04()) {
            boolean z = this.A0I;
            if (A0p[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1N() {
        return this.A0B;
    }

    public final boolean A1O() {
        return !A0x();
    }

    public C0931Na getColors() {
        return this.A0T;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public C1491dk getFullScreenAdStyle() {
        return new C1491dk(true, C1491dk.A06, super.A06.A28().A01(), View$OnClickListenerC0871Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private View$OnClickListenerC0871Kr getRegularCtaForEndCard() {
        View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr = new View$OnClickListenerC0871Kr(this.A0U, super.A06.A0w(), super.A06.A28().A01(), super.A08, super.A0B, (C1618fp) null, super.A0A, super.A06.A2A());
        view$OnClickListenerC0871Kr.setViewShowsOverMedia(true);
        YB.A0K(view$OnClickListenerC0871Kr);
        view$OnClickListenerC0871Kr.setText(super.A06.A29().A0J().A04());
        YB.A0G(1001, view$OnClickListenerC0871Kr);
        view$OnClickListenerC0871Kr.setCta(super.A06.A29().A0J(), super.A06.A2E(), new HashMap(), null);
        return view$OnClickListenerC0871Kr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0I) {
            return;
        }
        A0X(configuration.orientation);
        A0w(this.A0D, false);
        if (this.A07 != null) {
            this.A07.A0D(configuration.orientation);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
            return;
        }
        this.A0C = true;
        A1J(false);
    }

    private void setUpBrowserControls(M3 m3) {
        if (this.A04 != null) {
            YB.A0J(this.A04);
        }
        this.A04 = new M8(this.A0U, m3, true);
        if (this.A0m) {
            A0v(this.A0J, 1);
        }
        m3.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        YB.A0K(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(XV.A0v, XV.A0v, XV.A0v, XV.A0v);
        this.A04.setListener(new C0793Hq(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            YB.A0J(this.A05);
        }
        this.A05 = new C1302ah(this.A0U, null, 16842872);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0q));
    }
}

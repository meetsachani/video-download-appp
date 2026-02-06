package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.5S  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C5S extends AbstractC0812Ij {
    public static byte[] A0e;
    public static String[] A0f = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public C0931Na A01;
    public XO A02;
    public C1402cJ A03;
    public C1534eS A04;
    public EnumC1560et A05;
    public DR A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Handler A0I;
    public final View A0J;
    public final C1673gi A0K;
    public final VI A0L;
    public final AbstractC1208Yb A0M;
    public final AbstractC1336bF A0N;
    public final View$OnClickListenerC0871Kr A0O;
    public final InterfaceC1493dm A0P;
    public final C1528eM A0Q;
    public final C0720Eu A0R;
    public final C0710Ek A0S;
    public final C4L A0T;
    public final EA A0U;
    public final E8 A0V;
    public final E4 A0W;
    public final E2 A0X;
    public final E0 A0Y;
    public final AbstractC0699Dz A0Z;
    public final C0686Dm A0a;
    public final DZ A0b;
    public final boolean A0c;
    public final boolean A0d;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A0e = new byte[]{82, 94, 92, 31, 87, 80, 82, 84, 83, 94, 94, 90, 31, 80, 85, 66, 31, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, 31, 82, 93, 88, 82, 90, 84, 85, 54, C3307Iz.V, 51, C3307Iz.X, 54, 32, C3307Iz.V, 32, C8077mf.E, 50, C3307Iz.e0, 32, C3307Iz.V, C3307Iz.c0, 105, 118, 123, 122, 112};
    }

    static {
        A0J();
        A0k = (int) (XX.A02 * 48.0f);
        A0i = P3.A02(-1, 77);
        A0p = (int) (XX.A02 * 26.0f);
        A0q = (int) (XX.A02 * 12.0f);
        A0m = (int) (XX.A02 * 12.0f);
        A0n = (int) (XX.A02 * 44.0f);
        A0l = XV.A0v;
        A0o = (int) (XX.A02 * 16.0f);
        A0j = P3.A02(A0i, 90);
        A0h = (int) (XX.A02 * 4.0f);
        A0g = (int) (XX.A03 * 32.0f);
    }

    public C5S(C1673gi c1673gi, VA va, AbstractC1847jd abstractC1847jd, C1079Sx c1079Sx, ZU zu, int i, InterfaceC1214Yh interfaceC1214Yh, VI vi, AbstractC1208Yb abstractC1208Yb, int i2, int customVideoDurationMs, int i3, boolean z, int i4, boolean z2, boolean z3, boolean z4, InterfaceC1493dm interfaceC1493dm, int i5, int i6) {
        super(c1673gi, zu, va, abstractC1847jd, i, z3, z4, interfaceC1214Yh, i6);
        C0931Na A00;
        this.A0I = new Handler(Looper.getMainLooper());
        this.A00 = 0.0f;
        this.A07 = false;
        this.A08 = false;
        this.A0C = false;
        this.A09 = false;
        this.A0A = false;
        this.A0Y = new E0() { // from class: com.facebook.ads.redexgen.X.5g
            public static String[] A01 = {"7gUYNYKFrrI6cUcpcHgvAqL4Gs6ZbmaO", "eulXJJXioKb3UmnXwerKdv", "DeECHluE8BU5loeJcqNW1HYG1mHcuBH8", "x81kE4wfDh8vlLxHq80CctXU2mbMn00Z", "zBHmazzeC9pHgiKU9uedQ6l4AdxQz", "WRgOWCAEbqLirqS5ZGHJuFqEkTHfhP5W", "572CNMLKJv9WD0LgrUqd1zfS4LkJfaLe", "B1saI0DOHUkU6pw"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E1 e1) {
                DZ dz;
                View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr;
                C1673gi c1673gi2;
                C1673gi c1673gi3;
                AbstractC1336bF abstractC1336bF;
                AbstractC1336bF abstractC1336bF2;
                AbstractC1336bF abstractC1336bF3;
                C5S.this.A0C = true;
                if (C5S.this.getAdDataBundle().A1c()) {
                    c1673gi2 = C5S.this.A0K;
                    AbstractC0925Mt A002 = C0926Mu.A00(c1673gi2, ((AbstractC0812Ij) C5S.this).A08, "", XB.A00(((AbstractC0812Ij) C5S.this).A06.A29().A0J().A05()), new HashMap(), ((AbstractC0812Ij) C5S.this).A06.A2A());
                    c1673gi3 = C5S.this.A0K;
                    c1673gi3.A0F().AKh(XL.A00((float) ((AbstractC0812Ij) C5S.this).A06.A0k()), C5S.this.getResources().getConfiguration().orientation, true, true, AbstractC0925Mt.A0C(A002));
                    C5S.this.A0L(C5S.this.getResources().getConfiguration().orientation);
                    abstractC1336bF = C5S.this.A0N;
                    abstractC1336bF.setVisibility(0);
                    abstractC1336bF2 = C5S.this.A0N;
                    if (abstractC1336bF2 instanceof LK) {
                        abstractC1336bF3 = C5S.this.A0N;
                        ((LK) abstractC1336bF3).A0u(C5S.this.getResources().getConfiguration().orientation);
                    }
                }
                if (C5S.this.getAdDataBundle().A1e()) {
                    C5S c5s = C5S.this;
                    if (A01[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[2] = "UfF1b519MGYLAJGTcPK3SRNJ7v4WOh3N";
                    strArr[0] = "9iqifXeSGzjDh5N7cdDazqMOJ7agOy96";
                    dz = c5s.A0b;
                    view$OnClickListenerC0871Kr = C5S.this.A0O;
                    dz.setOnClickListener(view$OnClickListenerC0871Kr);
                }
            }
        };
        this.A0X = new E2() { // from class: com.facebook.ads.redexgen.X.5c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                if (!((AbstractC0812Ij) C5S.this).A0A.A07()) {
                    C5S.this.A1F();
                }
            }
        };
        this.A0W = new E4() { // from class: com.facebook.ads.redexgen.X.5a
            @Override // com.facebook.ads.redexgen.X.UN
            public final /* bridge */ /* synthetic */ void A03(C4B c4b) {
            }
        };
        this.A0Z = new AbstractC0699Dz() { // from class: com.facebook.ads.redexgen.X.5Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4A c4a) {
                float f;
                C0710Ek c0710Ek;
                InterfaceC1493dm interfaceC1493dm2;
                C5S.this.A0R(c4a);
                f = C5S.this.A00;
                c0710Ek = C5S.this.A0S;
                float duration = (f * c0710Ek.getDuration()) + c4a.A00();
                interfaceC1493dm2 = C5S.this.A0P;
                interfaceC1493dm2.ADw(duration);
            }
        };
        this.A0U = new EA() { // from class: com.facebook.ads.redexgen.X.5U
            public static String[] A01 = {"wKs2F0CoKZ83CrYftessGgwUooVDkZ8i", "2Ibb583RxwN39nWjhOn5WWPQj1VmynHE", "A0Qs557f", "DKPVxx7rRSfdfe4bDqdhQ5dEhLiH9LON", "bebhf1UP90kEJwgsUj64UnMMPskca", "Y97MwE7h44FvVbPafIuJT7XHPF7ToAyu", "yGLwGxqGR6Hkk5b2IyfusTMojDv2e", "vJPYkkaf"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                InterfaceC1493dm interfaceC1493dm2;
                C0710Ek c0710Ek;
                float f;
                InterfaceC1493dm interfaceC1493dm3;
                C0710Ek c0710Ek2;
                interfaceC1493dm2 = C5S.this.A0P;
                c0710Ek = C5S.this.A0S;
                interfaceC1493dm2.ADc(c0710Ek.getDuration());
                f = C5S.this.A00;
                if (f < ((float) ((AbstractC0812Ij) C5S.this).A06.A29().A0G())) {
                    C5S.A01(C5S.this, 1.0f);
                    c0710Ek2 = C5S.this.A0S;
                    c0710Ek2.A0e(EnumC1560et.A02, 28);
                    return;
                }
                C5S c5s = C5S.this;
                String[] strArr = A01;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "gUju5w26hU6oOlSn7mf4ATVXJhH4p8zJ";
                strArr2[1] = "33WeYKtkMTovDIRRTCZ4bD6vTYI44Qru";
                if (!c5s.A1L()) {
                    interfaceC1493dm3 = C5S.this.A0P;
                    interfaceC1493dm3.ADA();
                    return;
                }
                C5S.this.A1G();
            }
        };
        this.A0V = new C5T(this);
        this.A0K = c1673gi;
        this.A0L = vi;
        this.A0M = abstractC1208Yb;
        this.A0H = i5;
        int i7 = -1;
        if (!super.A06.A1c()) {
            this.A0J = new C0679Df(this.A0K, vi);
        } else {
            i7 = i5;
            this.A0J = new C0677Dd(this.A0K, vi);
        }
        this.A0b = new DZ(this.A0K, i7);
        if (this.A00 < ((float) abstractC1847jd.A29().A0G())) {
            this.A0b.setShouldClearAnimationWhenVideoCompleted(false);
        }
        this.A0F = i4;
        this.A0d = z2;
        this.A0E = i2;
        this.A0G = customVideoDurationMs;
        this.A0P = interfaceC1493dm;
        this.A0D = i3;
        this.A0c = z;
        this.A0Q = new C1528eM(this.A0K, va, super.A06);
        if (customVideoDurationMs == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A01 = A00;
        this.A0S = new C0710Ek(this.A0K);
        this.A0S.getEventBus().A03(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
        this.A0T = new C4L(c1673gi, va, this.A0S, abstractC1847jd.A2E(), 0, 0, abstractC1847jd.A29().A0U(), null, null);
        A0I();
        this.A0S.setVideoURI(c1079Sx.A0T(super.A06.A29().A0H().A09()));
        A0H();
        XR A02 = super.A09.A02(abstractC1847jd);
        this.A0K.A0H().A00(A02.A01);
        this.A0N = A06();
        if (this.A0N instanceof C0857Kd) {
            new DA(this.A0N, 400, 100, 0).A4A(true, false);
        } else {
            this.A0N.setVisibility(8);
        }
        this.A0a = new C0686Dm(true, abstractC1847jd.A29().A0U());
        A0K();
        this.A0O = this.A0N.getCTAButton();
        if (A02.A00) {
            this.A0S.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.dN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5S.this.A1O(view);
                }
            });
        }
        YB.A0G(1001, this.A0O);
        A0G();
        if (!getAdDataBundle().A1c()) {
            A0F();
        }
        this.A0N.bringToFront();
        if (C1123Up.A1z(this.A0K)) {
            this.A0K.A0B().AKn(this.A0S, super.A06.A2E(), true);
        }
        if (C1123Up.A20(this.A0K)) {
            this.A0R = new C0720Eu(this.A0K, va, this.A0S, super.A06.A2E(), abstractC1847jd.A29().A0U(), this.A0T, null);
        } else {
            this.A0R = null;
        }
    }

    public static /* synthetic */ float A01(C5S c5s, float f) {
        float f2 = c5s.A00 + f;
        c5s.A00 = f2;
        return f2;
    }

    private AbstractC1336bF A06() {
        String A0C;
        AbstractC1336bF c0857Kd;
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -2);
        adDetailsParams.addRule(12);
        if (super.A06.A10().equals(A0C(37, 14, 3))) {
            A0C = EnumC1566ez.A04.A03();
        } else {
            A0C = A0C(0, 37, 118);
        }
        double A0k2 = super.A06.A0k();
        if (!getAdDataBundle().A1c()) {
            C1673gi c1673gi = this.A0K;
            int i = A0k;
            boolean z = super.A06.A29().A0I().A00() == NW.A05;
            C0931Na colors = getColors();
            boolean A06 = super.A06.A29().A0J().A06();
            VA va = super.A08;
            InterfaceC1214Yh interfaceC1214Yh = super.A0B;
            C1618fp c1618fp = super.A0D;
            Y2 y2 = super.A0A;
            AbstractC1847jd abstractC1847jd = super.A06;
            if (A0f[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[5] = "xymrPLzTH8UHDAaiBZe05WSUA2";
            strArr[7] = "XCaDYNVy2gwp6c65cWzWipC7tC";
            c0857Kd = new C0857Kd(c1673gi, null, i, z, colors, A06, A0C, va, interfaceC1214Yh, c1618fp, y2, abstractC1847jd);
        } else {
            c0857Kd = new C1375bs((float) A0k2, A0C, this.A0K, getColors(), super.A06, super.A0B, this.A0O, AbstractC0812Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0b, this.A0L, false).A03();
            ((LK) c0857Kd).setChainedAdInfo(super.A00);
        }
        c0857Kd.getCTAButton().getCtaActionHelper().A08(super.A06);
        c0857Kd.getCTAButton().setCreativeAsCtaLoggingHelper(super.A09);
        YB.A0G(1008, c0857Kd);
        c0857Kd.A0l(this.A0G);
        addView(c0857Kd, adDetailsParams);
        c0857Kd.setInfo(super.A06.A29().A0I(), super.A06.A29().A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, null);
        return c0857Kd;
    }

    private void A0D() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A04 != null) {
            C1534eS c1534eS = this.A04;
            if (A0f[6].length() != 13) {
                throw new RuntimeException();
            }
            A0f[0] = "pczVUfQTZlSxQoKEEMr5D2oLadoOsoUQ";
            c1534eS.A0f(false);
            addView(this.A04.A0W(), layoutParams);
        }
    }

    private void A0E() {
        if (getAdDataBundle().A29().A0K().A03() && !getAdDataBundle().A29().A0K().A02().isEmpty()) {
            YB.A0d(this.A0N, this.A0J, this.A0O);
            this.A04 = new C1534eS(this.A0K, getAdDataBundle(), super.A0B, this.A0O, this.A0I, this.A0L);
            A0D();
        } else if (getAdDataBundle().A29().A0K().A04() || getAdDataBundle().A29().A0K().A03()) {
            YB.A0d(this.A0N, this.A0J, this.A0O);
            this.A03 = new C1402cJ(this.A0K, super.A06, this.A0L, this.A0I, super.A0B);
            this.A03.A0I(false);
            addView(this.A03.A0C(this.A0O));
        } else {
            Pair<EnumC1527eL, View> A03 = this.A0Q.A03(this.A0O);
            View endCardView = (View) A03.second;
            YB.A0G(1101, endCardView);
            A0Q((EnumC1527eL) A03.first, endCardView);
        }
    }

    private void A0F() {
        this.A0b.A08(-1, A0i, false);
        this.A0b.setPadding(A0q, A0q, A0q, A0q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0p);
        layoutParams.addRule(12);
        addView(this.A0b, layoutParams);
    }

    private void A0G() {
        RelativeLayout.LayoutParams layoutParams;
        if (!super.A06.A1c()) {
            this.A0J.setPadding(A0m, A0m, A0m, A0m);
            layoutParams = new RelativeLayout.LayoutParams(A0n, A0n);
            layoutParams.setMargins(0, AbstractC1208Yb.A00, A0l, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(A0g, A0g);
            layoutParams.setMargins(XV.A0b, XV.A0r, XV.A0b, XV.A0Z);
            layoutParams.addRule(9);
        }
        RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0S, videoViewParams);
        addView(this.A0J, layoutParams);
    }

    private void A0H() {
        postDelayed(new IL(this), C1123Up.A0P(this.A0K));
    }

    private void A0I() {
        this.A0S.A0f(this.A0b);
        if (this.A0J instanceof InterfaceC1561eu) {
            this.A0S.A0f((InterfaceC1561eu) this.A0J);
        }
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C3S c3s = new C3S(this.A0K);
            this.A0S.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0S.A0f(new C3B(this.A0K));
    }

    private final void A0K() {
        View expandableLayout = this.A0N.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A06 != null) {
                C0686Dm c0686Dm = this.A0a;
                DR dr = this.A06;
                String[] strArr = A0f;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0f[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                c0686Dm.A0L(dr);
            }
            C0931Na A01 = super.A06.A28().A01();
            this.A0a.A0L(new DB(this.A0N.getCTAButton(), 300, -1, A01.A0A(true)));
            Drawable A08 = YB.A08(A0i, A0j, A0h);
            Drawable endDrawable = YB.A05(A01.A09(true), A0h);
            this.A0a.A0L(new DS(this.A0N.getCTAButton(), 300, A08, endDrawable));
            this.A0a.A0L(new DQ(expandableLayout, 150, false));
            this.A0a.AAv(this.A0S);
            this.A0a.A0K(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (!getAdDataBundle().A1c()) {
            return;
        }
        this.A0K.A0F().AKj(i);
        this.A0S.A0Z(i);
        A0M(i, this.A0S, (RelativeLayout) this.A0S.getVideoView());
    }

    private final void A0M(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (this.A0N instanceof LK) {
            boolean z = this.A0N instanceof C6V;
            if (A0f[0].charAt(8) == 'J') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[5] = "oeSYnKfd6qg69aJdYBhoeO0UNx";
            strArr[7] = "WvPjUISg3i5kB9lwMl0NPsGMqU";
            if (z || (this.A0N instanceof C6U)) {
                YB.A0J(this.A0N);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    this.A0N.setLayoutParams(layoutParams);
                    viewGroup.addView(this.A0N);
                } else {
                    addView(this.A0N, layoutParams);
                }
            }
            this.A0N.A0l(i);
            ((LK) this.A0N).A0y(viewGroup, relativeLayout, i);
        }
    }

    private void A0Q(EnumC1527eL enumC1527eL, View view) {
        this.A0S.A0h(false);
        this.A0S.setVisibility(8);
        switch (C1470dP.A00[enumC1527eL.ordinal()]) {
            case 1:
                this.A0N.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC1208Yb.A00, 0, 0);
                layoutParams.addRule(2, this.A0N.getId());
                addView(view, layoutParams);
                return;
            case 2:
                YB.A0d(this.A0N);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0o, A0o, A0o, A0o);
                addView(view, layoutParams2);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(C4A c4a) {
        if (this.A0S.getState() == EnumC1615fm.A02 && C1123Up.A1e(this.A0K)) {
            postDelayed(new I7(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(String str) {
        if (!this.A0A) {
            this.A0A = true;
            this.A0P.AGQ(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final EnumC0922Mq A1D(String str) {
        return this.A0O.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1E() {
        super.A1E();
        this.A0N.A0j();
        if (this.A02 != null) {
            XO xo = this.A02;
            String[] strArr = A0f;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            xo.A06();
        }
        this.A0I.removeCallbacksAndMessages(null);
        if (this.A04 != null) {
            this.A04.A0Y();
        }
        if (this.A03 != null) {
            this.A03.A0F();
        }
        if (C1123Up.A1z(this.A0K)) {
            this.A0K.A0B().AKU(this.A0S);
        }
        if (this.A0R != null) {
            this.A0R.A07();
        }
        if (this.A0S != null) {
            this.A0S.getEventBus().A04(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
            YB.A0H(this.A0S);
            this.A0S.A0W();
        }
        this.A0T.A0p();
        YB.A0d(this.A0S, this.A0b, this.A0J);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1G() {
        this.A0K.A0F().A4x();
        this.A07 = true;
        YB.A0W(this);
        YB.A0H(this.A0S);
        YB.A0d(this.A0S, this.A0b, this.A0J);
        A0E();
        if (this.A0D != 0 || !this.A0c) {
            this.A0P.AFw(true);
            if (this.A0M != null && getAdDataBundle().A29().A0K().A00() > 0) {
                this.A08 = false;
                if (getAdDataBundle().A2P()) {
                    this.A0M.setToolbarActionMode(8);
                } else {
                    this.A0M.setToolbarActionMode(2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1469dO(this), getAdDataBundle().A29().A0K().A00());
                return;
            }
            this.A08 = true;
            return;
        }
        if (this.A0d) {
            this.A0P.AKc();
        }
        if (this.A0M != null) {
            this.A0M.setToolbarActionMode(getAdDataBundle().A2P() ? 8 : 2);
        }
        this.A02 = new XO(this.A0F, 100.0f, 100L, new Handler(Looper.getMainLooper()), new IU(this));
        this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1H() {
        C0710Ek c0710Ek = this.A0S;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0710Ek.setVolume(secondsForNextCta);
        this.A0S.A0e(EnumC1560et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 >= 0) {
            this.A0M.setProgressSpinnerInvisible(true);
        }
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0H;
            if (A02 < secondsForNextCta2) {
                if (A02 > 0) {
                    new XO(A02, new IT(this)).A07();
                    return;
                }
                return;
            }
        }
        AbstractC1208Yb abstractC1208Yb = this.A0M;
        if (A0f[6].length() != 13) {
            throw new RuntimeException();
        }
        A0f[6] = "z6ph3MLFkPTln";
        abstractC1208Yb.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1J(boolean z) {
        if (!this.A09) {
            this.A0N.A0m(z);
        }
        if (this.A04 != null && !this.A09) {
            this.A04.A0e(z);
        }
        if (this.A03 != null) {
            boolean z2 = this.A09;
            if (A0f[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A0f[1] = "b5uF0JnyggmSeY84XgIRQgfLbHOcd54k";
            if (!z2) {
                this.A03.A0H(z);
            }
        }
        this.A09 = false;
        if (this.A02 != null) {
            this.A02.A06();
        }
        if (this.A0S.A0n()) {
            return;
        }
        this.A05 = this.A0S.getVideoStartReason();
        this.A0B = z;
        this.A0S.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final void A1K(boolean z) {
        if (this.A02 != null && !this.A02.A05()) {
            this.A02.A07();
        }
        if (this.A07 || this.A0S.getState() == EnumC1615fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0B || z) {
            this.A0S.A0e(this.A05, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1L() {
        return (this.A0D == 2 || !super.A06.A29().A0V() || this.A07) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1M() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public final boolean A1N() {
        return this.A08;
    }

    public final /* synthetic */ void A1O(View view) {
        this.A0O.A0E(A0C(51, 5, 88));
    }

    public C0931Na getColors() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public C1491dk getFullScreenAdStyle() {
        return new C1491dk(true, C1491dk.A06, super.A06.A28().A01(), View$OnClickListenerC0871Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij
    public Y2 getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0812Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C0931Na A00;
        super.onConfigurationChanged(configuration);
        if (!this.A07) {
            if (getAdDataBundle().A1c()) {
                A0L(configuration.orientation);
                return;
            }
            if (configuration.orientation == 1) {
                NN A28 = super.A06.A28();
                String[] strArr = A0f;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A0f[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                A00 = A28.A01();
            } else {
                A00 = super.A06.A28().A00();
            }
            this.A01 = A00;
            this.A0O.setViewShowsOverMedia(true);
            this.A0O.setUpButtonColors(this.A01);
            this.A0N.A0l(configuration.orientation);
        } else if (this.A04 == null) {
        } else {
            this.A04.A0a(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!getAdDataBundle().A1c() && (expandableLayout = this.A0N.getExpandableLayout()) != null && z && this.A06 == null) {
            this.A06 = new DR(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A0a.A0L(this.A06);
            this.A0a.A0J();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
            return;
        }
        this.A09 = true;
        A1J(false);
    }
}

package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6M */
/* loaded from: assets/audience_network/classes2.dex */
public class C6M extends AbstractC0834Jg {
    public ZI A00;
    public InterfaceC1435cq A01;
    public C1514e8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C0749Fy A07;
    public final C1673gi A08;
    public final EA A09;
    public final E4 A0A;
    public final E2 A0B;
    public final E0 A0C;
    public final AbstractC0691Dr A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C1390c7 A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (XX.A02 * 0.0f);
    public static final int A0M = (int) (XX.A02 * 9.0f);
    public static final int A0K = (int) (XX.A02 * 9.0f);

    public C6M(C1390c7 c1390c7, boolean z, String str, C0749Fy c0749Fy) {
        super(c1390c7, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AbstractC0691Dr() { // from class: com.facebook.ads.redexgen.X.6S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C0692Ds c0692Ds) {
                if (C6M.this.getVideoView() != null) {
                    C6M.this.A07.A0P().setVolume(C6M.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new EA() { // from class: com.facebook.ads.redexgen.X.6R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                C6M.this.A01();
                Object tag = C6M.this.getTag(-1593835536);
                if (tag != null) {
                    C6M.this.A07.A0N().AGM(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new E2() { // from class: com.facebook.ads.redexgen.X.6Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                C6M.this.A00();
                C6M.this.A07.A0O().AGY(C6M.this);
            }
        };
        this.A0A = new E4() { // from class: com.facebook.ads.redexgen.X.6O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                C6M.this.A01();
                C6M.this.A07.A0O().AGW(C6M.this);
            }
        };
        this.A0C = new E0() { // from class: com.facebook.ads.redexgen.X.6N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E1 e1) {
                C6M.A08(C6M.this, true);
                C6M.A07(C6M.this);
            }
        };
        this.A0I = c1390c7;
        this.A07 = c0749Fy;
        this.A0E = str;
        this.A08 = c1390c7.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        YB.A0N(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    public void A00() {
        if (this.A0I.A0E() != null && this.A02 != null) {
            DZ A0E = this.A0I.A0E();
            C0710Ek simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0E.AAv(simpleVideoView);
            if (C1123Up.A2L(getContext())) {
                this.A0I.A0E().A09(false);
            }
        }
    }

    public void A01() {
        if (this.A0I.A0E() != null) {
            this.A0I.A0E().A06();
            if (this.A02 != null) {
                this.A0I.A0E().AKV(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
        if (r3 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (A1V()) {
            boolean z = this.A05;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        }
        if (A1V() || !this.A04) {
            return;
        }
        this.A01.ACz();
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        YB.A0K(view);
    }

    public static /* synthetic */ void A07(C6M c6m) {
        c6m.A02();
    }

    public static /* synthetic */ boolean A08(C6M c6m, boolean z) {
        c6m.A05 = z;
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1R() {
        if (A1V() && this.A02 != null) {
            C1514e8 c1514e8 = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c1514e8.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            if (this.A02 != null) {
                this.A02.A05(EnumC1560et.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1T() {
        float volume = this.A07.A0P().getVolume();
        if (!A1V() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final boolean A1U() {
        return A1V() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final boolean A1V() {
        return this.A03;
    }

    public final void A1W(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1V()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C1514e8 getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C0933Nc c0933Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c0933Nc, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new LM(this.A00, this.A08).A04().A06(new C0858Ke(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC1435cq interfaceC1435cq) {
        this.A01 = interfaceC1435cq;
    }

    public void setUpImageView(C1673gi c1673gi) {
        this.A00 = new ZI(c1673gi);
        if (C1123Up.A1J(c1673gi)) {
            AbstractC1333bC.A00(this.A00, C1123Up.A1K(c1673gi), new View$OnClickListenerC1359bc(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C1673gi c1673gi) {
        this.A06 = new RelativeLayout(c1673gi);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1673gi c1673gi) {
        this.A02 = new C1514e8(c1673gi, new VI(this.A0E, getAdEventManager()));
        if (C1123Up.A1L(c1673gi)) {
            AbstractC1333bC.A00(this.A02, C1123Up.A1M(c1673gi), new View$OnClickListenerC1360bd(this));
        }
        C1514e8 c1514e8 = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c1514e8);
    }

    private void setUpView(C1673gi c1673gi) {
        setUpImageView(c1673gi);
        setUpVideoView(c1673gi);
        setUpMediaContainer(c1673gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C1514e8 c1514e8 = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c1514e8 != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}

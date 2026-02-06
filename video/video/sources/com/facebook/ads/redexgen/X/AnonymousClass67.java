package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.67 */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass67 extends AbstractC0834Jg implements XQ {
    public static byte[] A0L;
    public static String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public RelativeLayout A00;
    public ZI A01;
    @Nullable
    public InterfaceC1435cq A02;
    public C0749Fy A03;
    public C1514e8 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1673gi A0B;
    public final XS A0C;
    public final InterfaceC1214Yh A0D;
    public final C1390c7 A0E;
    public final EA A0F;
    public final E4 A0G;
    public final E2 A0H;
    public final E0 A0I;
    public final AbstractC0691Dr A0J;
    public final String A0K;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A03() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, QC1.w, 68, 70, 85, 67};
    }

    public abstract void A1X(C1673gi c1673gi);

    static {
        A03();
        A0O = (int) (XX.A02 * 1.0f);
        A0P = (int) (XX.A02 * 4.0f);
        A0N = (int) (XX.A02 * 6.0f);
    }

    public AnonymousClass67(C1390c7 c1390c7, boolean z, String str, C0749Fy c0749Fy) {
        super(c1390c7, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0J = new AbstractC0691Dr() { // from class: com.facebook.ads.redexgen.X.6C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C0692Ds c0692Ds) {
                C0749Fy c0749Fy2;
                c0749Fy2 = AnonymousClass67.this.A03;
                c0749Fy2.A0P().setVolume(AnonymousClass67.this.getVideoView().getVolume());
            }
        };
        this.A0F = new EA() { // from class: com.facebook.ads.redexgen.X.6B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                C0749Fy c0749Fy2;
                c0749Fy2 = AnonymousClass67.this.A03;
                c0749Fy2.A0N().AGM(((Integer) AnonymousClass67.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0H = new E2() { // from class: com.facebook.ads.redexgen.X.6A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                C0749Fy c0749Fy2;
                c0749Fy2 = AnonymousClass67.this.A03;
                c0749Fy2.A0O().AGY(AnonymousClass67.this);
            }
        };
        this.A0G = new E4() { // from class: com.facebook.ads.redexgen.X.69
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                C0749Fy c0749Fy2;
                c0749Fy2 = AnonymousClass67.this.A03;
                c0749Fy2.A0O().AGW(AnonymousClass67.this);
            }
        };
        this.A0I = new E0() { // from class: com.facebook.ads.redexgen.X.68
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E1 e1) {
                AnonymousClass67.A06(AnonymousClass67.this, true);
                AnonymousClass67.A05(AnonymousClass67.this);
            }
        };
        this.A0D = c1390c7.A0C();
        this.A0E = c1390c7;
        this.A03 = c0749Fy;
        this.A0K = str;
        this.A0B = c1390c7.A06();
        this.A0C = XS.A00(c1390c7.A06(), c1390c7.A05(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        YB.A0N(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
    }

    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if ((A1V() && this.A07) || (!A1V() && this.A06)) {
            this.A02.ACz();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        YB.A0K(view);
    }

    public static /* synthetic */ void A05(AnonymousClass67 anonymousClass67) {
        anonymousClass67.A02();
    }

    public static /* synthetic */ boolean A06(AnonymousClass67 anonymousClass67, boolean z) {
        anonymousClass67.A07 = z;
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public final void A1C() {
        super.A1C();
        this.A0C.A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1R() {
        if (A1V()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            C1514e8 c1514e8 = this.A04;
            EnumC1560et enumC1560et = EnumC1560et.A02;
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "GrzUS";
            c1514e8.A05(enumC1560et);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final void A1T() {
        float volume = this.A03.A0P().getVolume();
        if (A1V()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                C1514e8 c1514e8 = this.A04;
                if (A0M[5].length() == 9) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c1514e8.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final boolean A1U() {
        if (A1V()) {
            boolean A06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (A06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0834Jg
    public final boolean A1V() {
        return this.A05;
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A01(0, 13, 44));
    }

    public final void A1Y(Map<String, String> extraParams) {
        this.A04.A02();
        if (A1V()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C1514e8 getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A04(str, str2, null, true, false);
    }

    public void setCTAInfo(C0933Nc c0933Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c0933Nc, this.A0K, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new LM(this.A01, this.A0B).A04().A06(new C0833Jf(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC1435cq interfaceC1435cq) {
        this.A02 = interfaceC1435cq;
    }

    public void setUpImageView(C1673gi c1673gi) {
        this.A01 = new ZI(c1673gi);
        if (C1123Up.A1J(c1673gi)) {
            AbstractC1333bC.A00(this.A01, C1123Up.A1K(c1673gi), new View$OnClickListenerC1441cw(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(C1673gi c1673gi) {
        this.A00 = new RelativeLayout(c1673gi);
        A04(this.A00);
        XR A02 = this.A0C.A02(this.A0E.A05());
        this.A0E.A06().A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A05().A1e() && C1123Up.A2w(this.A0B)) {
            this.A00.setOnClickListener(new View$OnClickListenerC1440cv(this));
        } else if (!A02.A00) {
        } else {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnonymousClass67.this.A1W(view);
                }
            });
        }
    }

    public void setUpVideoView(C1673gi c1673gi) {
        this.A04 = new C1514e8(c1673gi, new VI(this.A0K, getAdEventManager()));
        if (C1123Up.A1L(c1673gi)) {
            AbstractC1333bC.A00(this.A04, C1123Up.A1M(c1673gi), new View$OnClickListenerC1442cx(this));
        }
        A04(this.A04);
    }

    private void setUpView(C1673gi c1673gi) {
        setUpImageView(c1673gi);
        setUpVideoView(c1673gi);
        setUpMediaContainer(c1673gi);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1X(c1673gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}

package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3503Kz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Cz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class TextureView$SurfaceTextureListenerC0673Cz extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1597fU, InterfaceC1613fk, InterfaceC1599fW {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1673gi A0A;
    public EnumC1560et A0B;
    public C1600fX A0C;
    public EnumC1615fm A0D;
    public EnumC1615fm A0E;
    public InterfaceC1616fn A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-56, -11, -11, -14, -11, -93, -20, -15, -93, -56, -5, -14, -45, -17, -28, -4, -24, -11, -93, -25, -8, -24, -93, -9, -14, -93, -14, -15, -42, -8, -11, -23, -28, -26, -24, -41, -24, -5, -9, -8, -11, -24, C2638Cg0.u7, -24, -10, -9, -11, -14, -4, -24, -25, -93, -25, -8, -11, -20, -15, -22, -93, -10, -24, -9, C2638Cg0.E7, -20, -25, -24, -14, -42, -8, -11, -23, -28, -26, -24, -93, -24, C8077mf.E, C8077mf.u, -13, C8077mf.q, 4, 28, 8, C8077mf.y, C2638Cg0.r7, 8, C8077mf.y, C8077mf.y, C8077mf.u, C8077mf.y, C2638Cg0.r7, C8077mf.A, C8077mf.y, C8077mf.n, 10, 10, 8, C8077mf.y, 8, 7, C2638Cg0.r7, 5, 28, C2638Cg0.r7, C8077mf.u, 17, -10, C8077mf.B, C8077mf.y, 9, 4, 6, 8, -9, 8, C8077mf.E, C8077mf.A, C8077mf.B, C8077mf.y, 8, -25, 8, C8077mf.z, C8077mf.A, C8077mf.y, C8077mf.u, 28, 8, 7, C2638Cg0.r7, 7, C8077mf.B, C8077mf.y, C8077mf.n, 17, 10, C2638Cg0.r7, 19, 4, C8077mf.B, C8077mf.z, 8, C2638Cg0.r7, -26, C8077mf.p, C8077mf.p, 6, C8077mf.m, 4, -65, 0, C8077mf.m, C8077mf.z, 0, C8077mf.B, C8077mf.u, -65, 19, 7, 17, C8077mf.p, C8077mf.z, -65, 0, 13, -65, 4, C8077mf.A, 2, 4, C8077mf.q, 19, 8, C8077mf.p, 13, -65, C8077mf.z, 8, 19, 7, -65, C8077mf.u, 4, 19, C2638Cg0.C7, 0, 2, 10, 6, 17, C8077mf.p, C8077mf.x, 13, 3, -29, 17, 0, C8077mf.z, 0, 1, C8077mf.m, 4, -65, C8077mf.p, 13, -65, -19, C8077mf.p, C8077mf.x, 6, 0, 19, -65, 0, 1, C8077mf.p, C8077mf.y, 4, C2638Cg0.y7, -65, C8077mf.u, C8077mf.p, -65, C8077mf.z, 4, -65, C8077mf.u, 8, C8077mf.m, 4, 13, 19, C8077mf.m, C8077mf.B, -65, 8, 6, 13, C8077mf.p, 17, 4, -65, 8, 19, C2638Cg0.y7, -92, -52, -52, -60, C2638Cg0.v7, C2638Cg0.q7, 125, -66, C2638Cg0.v7, -44, -66, -42, -48, 125, -47, C2638Cg0.s7, C2638Cg0.A7, -52, -44, 125, -66, C2638Cg0.x7, 125, C2638Cg0.q7, -43, C2638Cg0.o7, C2638Cg0.q7, C2638Cg0.y7, -47, C2638Cg0.t7, -52, C2638Cg0.x7, 125, -44, C2638Cg0.t7, -47, C2638Cg0.s7, 125, -48, C2638Cg0.q7, -47, -93, -52, C2638Cg0.A7, C2638Cg0.q7, -60, C2638Cg0.A7, -52, -46, C2638Cg0.x7, C2638Cg0.p7, 125, -52, C2638Cg0.x7, 125, -85, -52, -46, -60, -66, -47, 125, -66, -65, -52, -45, C2638Cg0.q7, -117, 125, -48, -52, 125, -44, C2638Cg0.q7, 125, -48, C2638Cg0.t7, C2638Cg0.v7, C2638Cg0.q7, C2638Cg0.x7, -47, C2638Cg0.v7, -42, 125, C2638Cg0.t7, -60, C2638Cg0.x7, -52, C2638Cg0.A7, C2638Cg0.q7, 125, C2638Cg0.t7, -47, -117, C2638Cg0.q7, -43, -48, -47, -37, -116, -33, -32, C2638Cg0.y7, -32, -47, -116, C2638Cg0.A7, -44, C2638Cg0.y7, C2638Cg0.B7, -45, -47, -48, -116, -32, -37, -116, -25, -27, -18, -27, -14, -23, -29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C1123Up.A20(this.A0A)) {
            EnumC1615fm enumC1615fm = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC1615fm == EnumC1615fm.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AIz();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADy(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureView$SurfaceTextureListenerC0673Cz.class.getSimpleName();
    }

    public TextureView$SurfaceTextureListenerC0673Cz(C1673gi c1673gi) {
        super(c1673gi);
        this.A0D = EnumC1615fm.A04;
        this.A0E = EnumC1615fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1560et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1673gi;
    }

    public TextureView$SurfaceTextureListenerC0673Cz(C1673gi c1673gi, AttributeSet attributeSet) {
        super(c1673gi, attributeSet);
        this.A0D = EnumC1615fm.A04;
        this.A0E = EnumC1615fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1560et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1673gi;
    }

    public TextureView$SurfaceTextureListenerC0673Cz(C1673gi c1673gi, AttributeSet attributeSet, int i) {
        super(c1673gi, attributeSet, i);
        this.A0D = EnumC1615fm.A04;
        this.A0E = EnumC1615fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1560et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1673gi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r5.A0K == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04() {
        this.A0C = new C1600fX(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity A0E = this.A0A.A0E();
            if (A0E != null) {
                this.A09 = new MediaController(A0E);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new C1606fd(this));
                this.A09.setEnabled(true);
            } else if (A0P[5].charAt(4) != 'y') {
                A0P[6] = "TO7k5EC8ZWp6tpojZW";
                this.A09 = null;
            } else {
                String[] strArr = A0P;
                strArr[0] = "fS";
                strArr[1] = "9d";
                this.A09 = null;
            }
        }
        if (this.A0G != null) {
            String str = this.A0G;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Pg";
            strArr2[1] = "vu";
            if (str.length() != 0) {
            }
        }
        this.A0C.A0F(this.A0A.A02(), this.A06);
        setVideoState(EnumC1615fm.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        C1598fV videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC1615fm.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C1600fX.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void A9d() {
        if (!this.A0H) {
            AGr(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final boolean A9q() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final boolean A9r() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final boolean AAc() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1597fU
    public final void AFL(String str, Exception exc) {
        this.A0A.A0F().ACW(str);
        this.A0A.A0F().A3i(1);
        setVideoState(EnumC1615fm.A03);
        this.A0A.A08().ABC(A03(362, 7, 50), AbstractC1085Td.A1N, new C1086Te(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        r3 = com.facebook.ads.redexgen.X.EnumC1615fm.A05;
        r2 = com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0673Cz.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r2[4].length() == r2[7].length()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        com.facebook.ads.redexgen.X.TextureView$SurfaceTextureListenerC0673Cz.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1597fU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFM(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(EnumC1615fm.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                if (this.A0F == null) {
                    return;
                }
                InterfaceC1616fn interfaceC1616fn = this.A0F;
                int seekFrom = getCurrentPosition();
                interfaceC1616fn.AFr(i2, seekFrom);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                if (this.A05 > 0 && this.A05 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z) {
                    boolean z2 = this.A0N;
                    if (A0P[5].charAt(4) == 'y') {
                        A0P[5] = "3r7lyS1P0Mh4AObuDTaZ0iezAfx5hfrS";
                        break;
                    } else {
                        String[] strArr = A0P;
                        strArr[3] = "T7dswaxt6nrXidjLTysunwDPvSX4Ru7O";
                        strArr[2] = "ANtZP5BaeS0Nfv6aTfoZkiJnjx34FJZx";
                        break;
                    }
                }
                if (z || this.A0D == EnumC1615fm.A06) {
                    return;
                }
                setVideoState(EnumC1615fm.A07);
                EnumC1615fm enumC1615fm = this.A0E;
                String[] strArr2 = A0P;
                if (strArr2[3].charAt(16) != strArr2[2].charAt(16)) {
                    throw new RuntimeException();
                }
                A0P[6] = "MPZySUBjU8eQIDiJ8j";
                if (enumC1615fm != EnumC1615fm.A0A) {
                    return;
                }
                AK6(this.A0B, 8);
                this.A0E = EnumC1615fm.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(EnumC1615fm.A06);
                }
                if (this.A0C != null) {
                    this.A0C.A0I(false);
                    if (A0P[5].charAt(4) == 'y') {
                        String[] strArr3 = A0P;
                        strArr3[4] = "0npepmR7M4IL";
                        strArr3[7] = "iLUr5jfc2zzHXCQiIz3oIHQjifgBE";
                        if (!z) {
                            this.A0C.A0A();
                        }
                    }
                }
                this.A0N = false;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1599fW
    public final void AGa(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void AGr(boolean z, int i) {
        this.A0A.A0F().A3e(i);
        this.A0E = EnumC1615fm.A05;
        this.A0M = z;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC1615fm.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void AK1(int i) {
        this.A0A.A0F().ACX(i);
        setVideoState(EnumC1615fm.A09);
        AKF(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void AK6(EnumC1560et enumC1560et, int i) {
        this.A0A.A0F().A3p(i);
        this.A0M = false;
        this.A0E = EnumC1615fm.A0A;
        this.A0B = enumC1560et;
        if (this.A0C == null) {
            setup(this.A06);
        } else if (this.A0D != EnumC1615fm.A07 && this.A0D != EnumC1615fm.A05 && this.A0D != EnumC1615fm.A06) {
        } else {
            this.A0C.A0I(true);
            EnumC1615fm enumC1615fm = EnumC1615fm.A0A;
            String[] strArr = A0P;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Wi";
            strArr2[1] = "9L";
            setVideoState(enumC1615fm);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void AKF(int i) {
        this.A0A.A0F().A3r(i);
        this.A0E = EnumC1615fm.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC1615fm.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public EnumC1560et getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public EnumC1615fm getState() {
        return this.A0D;
    }

    public EnumC1615fm getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C1123Up.A2l(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC1615fm.A03);
            AKF(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC1615fm.A05 && !this.A0M) {
            AK6(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                try {
                    this.A0C.A0E(null);
                } catch (Exception e) {
                    this.A0A.A0F().ACW(A03(0, 75, 53) + e.getMessage());
                }
            }
        }
        if (this.A0D != EnumC1615fm.A05) {
            try {
                AGr(false, 5);
                return true;
            } catch (Exception e2) {
                this.A0A.A0F().ACW(A03(75, 68, 85) + e2.getMessage());
                return true;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC1615fm.A05) {
                if ((this.A0A.A0H().A01() || C1123Up.A25(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fc
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextureView$SurfaceTextureListenerC0673Cz.this.A0A();
                        }
                    }, 1000L);
                } else {
                    A9d();
                }
            }
        } else if (this.A0D != EnumC1615fm.A05 || this.A0M) {
        } else {
            AK6(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        this.A05 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0Q, A03(C3503Kz.g0, 102, 81));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new View$OnTouchListenerC1608ff(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.w(A0Q, A03(245, 94, 15));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new View$OnTouchListenerC1607fe(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC1615fm.A08 && this.A0D != EnumC1615fm.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC1615fm enumC1615fm) {
        if (enumC1615fm != this.A0D) {
            if (this.A0A.A05().AAO()) {
                String str = A03(339, 23, 30) + enumC1615fm;
            }
            this.A0D = enumC1615fm;
            if (this.A0D == EnumC1615fm.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AGd(enumC1615fm);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setVideoStateChangeListener(InterfaceC1616fn interfaceC1616fn) {
        this.A0F = interfaceC1616fn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1613fk
    public void setup(Uri uri) {
        this.A0A.A0F().A3h();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}

package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.9n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05919n extends AbstractC2097nv implements DI {
    public long A00;
    public InterfaceC05015t A01;
    public InterfaceC1923ku<InterfaceExecutorC0727Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2231q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C05919n(C2231q7 c2231q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC1923ku<InterfaceExecutorC0727Fb> interfaceC1923ku) {
        this.A07 = (AnonymousClass32) AbstractC04543y.A01(c2231q7.A03);
        this.A08 = c2231q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = C10323vs.b;
        this.A02 = interfaceC1923ku;
    }

    private void A00() {
        final Timeline c05909m = new C05909m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c05909m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.X.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2209pl A0I(int i, C2209pl c2209pl, boolean z) {
                    super.A0I(i, c2209pl, z);
                    c2209pl.A05 = true;
                    return c2209pl;
                }

                @Override // com.facebook.ads.redexgen.X.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2207pj A0L(int i, C2207pj c2207pj, long j) {
                    super.A0L(i, c2207pj, j);
                    c2207pj.A0F = true;
                    return c2207pj;
                }
            };
            c05909m = timeline;
        }
        A05(c05909m);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2097nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2097nv
    public final void A0A(InterfaceC05015t interfaceC05015t) {
        this.A01 = interfaceC05015t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC04543y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0671Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2091np A5W(C2090no c2090no, F0 f0, long j) {
        InterfaceExecutorC0727Fb interfaceExecutorC0727Fb;
        InterfaceC2178pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 A01 = A01(c2090no);
        FF ff = this.A0C;
        D8 A02 = A02(c2090no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0727Fb = this.A02.get();
        } else {
            interfaceExecutorC0727Fb = null;
        }
        return new C05939p(uri, A5I, A5X, a6, A01, ff, A02, this, f0, str, i, interfaceExecutorC0727Fb);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0671Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void AG0(long j, boolean z, boolean z2) {
        if (j == C10323vs.b) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0671Cx
    public final void AHk(InterfaceC2091np interfaceC2091np) {
        ((C05939p) interfaceC2091np).A0a();
    }
}

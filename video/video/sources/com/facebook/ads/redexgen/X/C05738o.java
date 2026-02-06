package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05738o {
    public final Handler A00;
    public final InterfaceC05748p A01;

    public C05738o(Handler handler, InterfaceC05748p interfaceC05748p) {
        this.A00 = interfaceC05748p != null ? (Handler) AbstractC04543y.A01(handler) : null;
        this.A01 = interfaceC05748p;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A02(i, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j, long j2) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD9(i, j, j2);
    }

    public final void A03(final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A04(j);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD5(j);
    }

    public final void A05(final C2242qI c2242qI, final C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A06(c2242qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2242qI c2242qI, C6L c6l) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD3(c2242qI);
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD4(c2242qI, c6l);
    }

    public final void A07(final C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A09(c6i);
                }
            });
        }
    }

    public final void A08(final C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A0A(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C6I c6i) {
        c6i.A02();
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD1(c6i);
    }

    public final /* synthetic */ void A0A(C6I c6i) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD2(c6i);
    }

    public final void A0B(final C05758r c05758r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C05758r c05758r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD6(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AD0(str, j, j2);
    }

    public final void A0I(final boolean z) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    C05738o.this.A0J(z);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z) {
        ((InterfaceC05748p) C5C.A0f(this.A01)).AFy(z);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}

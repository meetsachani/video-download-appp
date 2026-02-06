package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1236Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC0965Oi A02;
    public C0966Oj A03;
    public C0967Ok A04;
    public InterfaceC1235Zc A05;
    public final C0963Og A06;
    public final C1673gi A07;
    public final VA A08;
    public final InterfaceC1214Yh A09;
    public final InterfaceC1215Yi A0A;
    public final String A0B;
    public final C0943Nm A0C;
    public final InterfaceC1238Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi);

    public abstract boolean A0S();

    public AbstractC1236Zd(C1673gi c1673gi, VA va, String str) {
        this(c1673gi, va, str, null, null, null);
    }

    public AbstractC1236Zd(C1673gi c1673gi, VA va, String str, C0943Nm c0943Nm, InterfaceC1215Yi interfaceC1215Yi, InterfaceC1214Yh interfaceC1214Yh) {
        super(c1673gi);
        this.A00 = 0;
        this.A02 = EnumC0965Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c1673gi;
        this.A08 = va;
        this.A0A = interfaceC1215Yi;
        this.A09 = interfaceC1214Yh;
        this.A0B = str;
        this.A0C = c0943Nm;
        this.A06 = AbstractC0964Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC1236Zd abstractC1236Zd) {
        int i = abstractC1236Zd.A00;
        abstractC1236Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC1236Zd abstractC1236Zd) {
        int i = abstractC1236Zd.A00;
        abstractC1236Zd.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C0967Ok c0967Ok) {
        this.A03.A08(this.A02);
        A0Q(c0967Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C0967Ok c0967Ok) {
        this.A04 = c0967Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c0967Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C0966Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC1215Yi interfaceC1215Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1215Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC1235Zc interfaceC1235Zc) {
        this.A05 = interfaceC1235Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}

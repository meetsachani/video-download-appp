package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.2j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04152j extends Q9<C1618fp> implements T4 {
    public C1673gi A00;
    public boolean A01;

    public C04152j(C1618fp c1618fp, C1673gi c1673gi) {
        super(c1618fp);
        this.A00 = c1673gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07() {
        View view;
        WeakReference weakReference;
        boolean z;
        int i;
        int i2;
        int i3;
        C1619fq c1619fq;
        boolean wasViewable;
        Map map;
        Map map2;
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractRunnableC1160Wc abstractRunnableC1160Wc;
        Handler handler;
        AbstractRunnableC1160Wc abstractRunnableC1160Wc2;
        int i4;
        boolean z5;
        boolean z6;
        Map map3;
        C1619fq c1619fq2;
        C1618fp A08 = A08();
        int i5 = 0;
        if (A08 == null) {
            A00(0);
            return;
        }
        view = A08.A0C;
        weakReference = A08.A0E;
        AbstractC1617fo abstractC1617fo = (AbstractC1617fo) weakReference.get();
        int i6 = 1;
        boolean z7 = view == null;
        if (!z7 && abstractC1617fo != null) {
            i = A08.A0A;
            C1619fq A0E = C1618fp.A0E(view, i, this.A00);
            if (A0E.A04()) {
                C1618fp.A05(A08);
            } else {
                A08.A00 = 0;
            }
            i2 = A08.A00;
            i3 = A08.A09;
            boolean z8 = i2 > i3;
            c1619fq = A08.A05;
            if (c1619fq != null) {
                c1619fq2 = A08.A05;
                if (c1619fq2.A04()) {
                    wasViewable = true;
                    if (!z8 || !A0E.A04()) {
                        A08.A05 = A0E;
                    }
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A08) {
                        map = A08.A06;
                        if (map.containsKey(valueOf)) {
                            map3 = A08.A06;
                            i5 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A08.A06;
                        map2.put(valueOf, Integer.valueOf(i5 + 1));
                    }
                    if (z8 && !wasViewable) {
                        this.A01 = true;
                        A08.A03 = System.currentTimeMillis();
                        z5 = A08.A07;
                        if (z5) {
                            this.A00.A0F().A3w();
                        }
                        abstractC1617fo.A03();
                        if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(500L);
                            view.startAnimation(alphaAnimation);
                        }
                        z6 = A08.A0F;
                        if (!z6) {
                            return;
                        }
                    } else if (!z8 && wasViewable) {
                        this.A01 = true;
                        z3 = A08.A07;
                        if (z3) {
                            this.A00.A0F().A3S(A0E.A02());
                        }
                        abstractC1617fo.A00();
                    } else {
                        abstractC1617fo.A02();
                        if (!this.A01) {
                            z2 = A08.A07;
                            if (z2) {
                                this.A00.A0F().A3u(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    z4 = A08.A08;
                    if (z4) {
                        return;
                    }
                    abstractRunnableC1160Wc = A08.A04;
                    if (abstractRunnableC1160Wc == null) {
                        return;
                    }
                    handler = A08.A0B;
                    abstractRunnableC1160Wc2 = A08.A04;
                    i4 = A08.A02;
                    handler.postDelayed(abstractRunnableC1160Wc2, i4);
                    return;
                }
            }
            wasViewable = false;
            if (!z8) {
            }
            A08.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A08) {
            }
        } else {
            z = A08.A07;
            if (z) {
                if (!z7) {
                    i6 = 2;
                }
                A00(i6);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.T4
    public final C1673gi A6m() {
        return this.A00;
    }
}

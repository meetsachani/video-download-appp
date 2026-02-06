package com.facebook.ads.redexgen.X;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import o.AD1;
import o.C2638Cg0;
import o.C3307Iz;

/* loaded from: assets/audience_network/classes2.dex */
public final class OL extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC1794ik A06;
    public final C1673gi A07;
    public final C1669ge A08;
    public final AbstractRunnableC1160Wc A09;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, C2638Cg0.p7, C2638Cg0.o7, C2638Cg0.s7, C2638Cg0.x7, -42, C2638Cg0.v7, C2638Cg0.y7, -42, -72, C2638Cg0.u7, C2638Cg0.u7, -42, C2638Cg0.t7, C2638Cg0.v7, C2638Cg0.o7, -68, C2638Cg0.s7, C2638Cg0.x7, -72, C2638Cg0.x7, C2638Cg0.o7, C2638Cg0.t7, C2638Cg0.s7, -42, C2638Cg0.q7, -68, -48, C2638Cg0.w7, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, C2638Cg0.C7, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, C3307Iz.X, 74, 65, 54};
    }

    static {
        A07();
    }

    public OL(C1673gi c1673gi, AbstractC1794ik abstractC1794ik) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new OK(this);
        this.A07 = c1673gi;
        this.A08 = c1673gi.A02();
        this.A05 = new Messenger(this);
        this.A06 = abstractC1794ik;
        this.A09 = new C1775iQ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6p() == OD.A06) {
            this.A07.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
        } else if (this.A06.A03().A6q() == OD.A07) {
            if (AbstractC1126Us.A08(this.A07)) {
                this.A07.A0F().AHn();
                if (this.A06 instanceof C7Y) {
                    this.A06.AEs(o.J8.b0, this.A06.A04(), null);
                    return;
                } else if (this.A06 instanceof C7X) {
                    this.A06.AEs(3000, this.A06.A04(), null);
                    if (((C7X) this.A06).A0E().A03 != null) {
                        this.A06.AEs(AD1.m1, this.A06.A04(), null);
                    }
                    this.A06.AEs(2110, this.A06.A04(), null);
                    return;
                } else {
                    return;
                }
            }
            C1673gi c1673gi = this.A07;
            String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c1673gi.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
        } else if (this.A06.A03().A6p() != OD.A05) {
        } else {
            if (AbstractC1126Us.A0C(this.A07)) {
                this.A07.A0F().AI4();
                this.A06.A03().AAw();
                this.A06.A0D(true);
                this.A06.A09();
                return;
            }
            this.A07.A0F().AI3();
            this.A06.A03().AJR(new AdError(2008, A04(31, 21, 34)));
        }
    }

    private void A08(Messenger messenger, int i, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, i);
        obtain.replyTo = this.A05;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(obtain);
    }

    public static void A0B(C1673gi c1673gi, String str) {
        c1673gi.A0F().AHr(str);
        T5 A0G = c1673gi.A0G();
        if (A0G != null && A0G.A6o() != null && A0G.A6k() != null) {
            A0G.A6o().onError(A0G.A6k(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AIG();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C1673gi c1673gi, int i) {
        Throwable cause;
        this.A07.A0F().AIE();
        AdActivityIntent A05 = C1177Wu.A05(c1673gi);
        A05.putExtra(A04(65, 8, 123), WK.A0F);
        A05.putExtra(A04(52, 13, 3), this.A06.A04());
        A05.putExtra(A04(5, 26, 33), i);
        try {
            int usedContext = C1177Wu.A00(c1673gi, A05);
            this.A07.A0F().AIF(usedContext);
        } catch (C1175Ws e) {
            String A04 = A04(0, 5, 75);
            if (e.getCause() != null) {
                A04 = A04 + cause.toString();
            }
            A0B(c1673gi, A04);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = OM.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0F().AHt();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, AbstractC1126Us.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AI1();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e) {
            A0C();
            this.A07.A0F().AHw(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AIB();
                    AbstractC1126Us.A07(this.A08);
                } else {
                    this.A07.A0F().AIA();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AIH();
            } else if (message.what == 2001 || message.what == 1011) {
                OM.A02(this.A08, message);
            } else {
                this.A07.A0F().AI2(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}

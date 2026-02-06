package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Dm */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0686Dm implements InterfaceC1561eu {
    public static String[] A0E = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public C0710Ek A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final E4 A09 = new E4() { // from class: com.facebook.ads.redexgen.X.42
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4B c4b) {
            Handler handler;
            boolean A0G;
            handler = C0686Dm.this.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = C0686Dm.this.A0G(EnumC1586fJ.A04);
            if (A0G) {
                C0686Dm.this.A03();
                C0686Dm.this.A06(true, false);
            }
            C0686Dm.this.A05 = true;
        }
    };
    public final EA A08 = new EA() { // from class: com.facebook.ads.redexgen.X.41
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4K c4k) {
            boolean z;
            C0686Dm.this.A02 = true;
            z = C0686Dm.this.A03;
            if (z) {
                return;
            }
            C0686Dm.this.A03();
            C0686Dm.this.A06(false, false);
            C0686Dm.this.A05 = true;
        }
    };
    public final E2 A0A = new C04533x(this);
    public final AbstractC0699Dz A0B = new AbstractC0699Dz() { // from class: com.facebook.ads.redexgen.X.3w
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.UN
        /* renamed from: A00 */
        public final void A03(C4A c4a) {
            boolean z;
            boolean A0G;
            z = C0686Dm.this.A04;
            if (z) {
                return;
            }
            A0G = C0686Dm.this.A0G(EnumC1586fJ.A04);
            if (!A0G) {
                return;
            }
            C0686Dm.this.A03();
            C0686Dm.this.A06(true, false);
        }
    };
    public final AbstractC0693Dt A0C = new C04513v(this);
    public final Handler A07 = new Handler();
    public final List<InterfaceC1587fK> A0D = new ArrayList();
    public int A00 = 2000;
    public boolean A02 = false;

    public C0686Dm(boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
    }

    public static /* synthetic */ int A00(C0686Dm c0686Dm) {
        return c0686Dm.A00;
    }

    public static /* synthetic */ Handler A01(C0686Dm c0686Dm) {
        return c0686Dm.A07;
    }

    public void A03() {
        this.A07.removeCallbacksAndMessages(null);
        Iterator<InterfaceC1587fK> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0E[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(C0686Dm c0686Dm) {
        c0686Dm.A03();
    }

    public static /* synthetic */ void A05(C0686Dm c0686Dm, boolean z, boolean z2) {
        c0686Dm.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (InterfaceC1587fK interfaceC1587fK : this.A0D) {
            interfaceC1587fK.A4A(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(C0686Dm c0686Dm) {
        return c0686Dm.A05;
    }

    public static /* synthetic */ boolean A08(C0686Dm c0686Dm) {
        return c0686Dm.A02;
    }

    public static /* synthetic */ boolean A09(C0686Dm c0686Dm) {
        return c0686Dm.A03;
    }

    public static /* synthetic */ boolean A0A(C0686Dm c0686Dm) {
        return c0686Dm.A04;
    }

    public static /* synthetic */ boolean A0B(C0686Dm c0686Dm) {
        return c0686Dm.A06;
    }

    public static /* synthetic */ boolean A0C(C0686Dm c0686Dm, EnumC1586fJ enumC1586fJ) {
        return c0686Dm.A0G(enumC1586fJ);
    }

    public static /* synthetic */ boolean A0D(C0686Dm c0686Dm, boolean z) {
        c0686Dm.A05 = z;
        return z;
    }

    public static /* synthetic */ boolean A0F(C0686Dm c0686Dm, boolean z) {
        c0686Dm.A06 = z;
        return z;
    }

    public boolean A0G(EnumC1586fJ enumC1586fJ) {
        for (InterfaceC1587fK interfaceC1587fK : this.A0D) {
            if (interfaceC1587fK.A9B() != enumC1586fJ) {
                return false;
            }
        }
        return true;
    }

    public final void A0H() {
        this.A0D.clear();
    }

    public final void A0I() {
        if (this.A04) {
            this.A07.removeCallbacksAndMessages(null);
            this.A04 = false;
        }
    }

    public final void A0J() {
        this.A06 = true;
        this.A05 = true;
        A06(false, false);
    }

    public final void A0K(int i) {
        this.A00 = i;
    }

    public final void A0L(InterfaceC1587fK interfaceC1587fK) {
        this.A0D.add(interfaceC1587fK);
    }

    public final boolean A0M() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AAv(C0710Ek c0710Ek) {
        this.A01 = c0710Ek;
        c0710Ek.getEventBus().A03(this.A09, this.A0C, this.A0A, this.A0B, this.A08);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AKV(C0710Ek c0710Ek) {
        A03();
        c0710Ek.getEventBus().A04(this.A08, this.A0C, this.A0A, this.A0B, this.A09);
        this.A01 = null;
    }
}

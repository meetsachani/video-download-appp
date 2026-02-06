package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Fy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0749Fy extends R7 {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC1434cp A02;
    public C1618fp A04;
    public List<C1511e5> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C1743hr A0C;
    public final RF A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC1438ct A0F = new G1(this);
    public InterfaceC1436cr A03 = new G0(this);
    public final InterfaceC1437cs A0E = new C0750Fz(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, C2638Cg0.y7, C2638Cg0.t7, C2638Cg0.r7, -52, -60, -68, -42, C2638Cg0.r7, -68, C2638Cg0.y7, -68, C2638Cg0.r7, -42, C2638Cg0.u7, -72, C2638Cg0.v7, -72, -60};
    }

    static {
        A08();
    }

    public C0749Fy(C1J c1j, int i, List<C1511e5> list, C1618fp c1618fp, Bundle bundle) {
        this.A0C = c1j.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c1618fp;
        this.A0D = new C1742hq(c1j.getContext());
        this.A0B = c1j.getContext();
        c1j.A1h(this);
        A0D(bundle);
    }

    private AbstractC0834Jg A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private AbstractC0834Jg A04(int i, int i2, boolean z) {
        AbstractC0834Jg abstractC0834Jg = null;
        while (i <= i2) {
            AbstractC0834Jg abstractC0834Jg2 = (AbstractC0834Jg) this.A0C.A1o(i);
            if (abstractC0834Jg2 == null || abstractC0834Jg2.A1U()) {
                return null;
            }
            boolean A0a = A0a(abstractC0834Jg2);
            if (abstractC0834Jg == null && abstractC0834Jg2.A1V() && A0a && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(abstractC0834Jg2, this.A0A))) {
                abstractC0834Jg = abstractC0834Jg2;
            }
            if (abstractC0834Jg2.A1V() && !A0a) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC0834Jg;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC0834Jg A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A1S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A25 = this.A0C.A25();
        if (A25 != -1) {
            int curPos = this.A05.size();
            if (A25 < curPos - 1) {
                int curPos2 = A25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC0834Jg A04 = A04(i + 1, this.A0C.A27(), false);
        if (A04 != null) {
            A04.A1S();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC1386c3 abstractC1386c3, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = XX.A04.widthPixels - 1;
        } else {
            int width = abstractC1386c3.getWidth();
            int allowedAreaMinX = XX.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i2 = XX.A04.widthPixels;
            int allowedAreaMinX2 = abstractC1386c3.getWidth();
            furthestX = (int) (((i2 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC1386c3.getX();
        int allowedAreaMinX3 = abstractC1386c3.getWidth();
        if (((int) (x + allowedAreaMinX3)) <= allowedAreaMaxX) {
            int allowedAreaMinX4 = (abstractC1386c3.getX() > furthestX ? 1 : (abstractC1386c3.getX() == furthestX ? 0 : -1));
            if (allowedAreaMinX4 >= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0J(AbstractC0834Jg abstractC0834Jg) {
        if (this.A08 && abstractC0834Jg.A1V()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public void A0L(C7M c7m, int i) {
        super.A0L(c7m, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public void A0M(C7M c7m, int i, int i2) {
        super.A0M(c7m, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC1436cr A0N() {
        return this.A03;
    }

    public final InterfaceC1437cs A0O() {
        return this.A0E;
    }

    public final InterfaceC1438ct A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A27 = this.A0C.A27();
        for (int A26 = this.A0C.A26(); A26 <= A27 && A26 >= 0; A26++) {
            AbstractC0834Jg card = (AbstractC0834Jg) this.A0C.A1o(A26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1U()) {
                this.A01 = A26;
                card.A1R();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC0834Jg abstractC0834Jg = (AbstractC0834Jg) this.A0C.A1o(this.A01);
        if (abstractC0834Jg != null && this.A01 >= 0) {
            abstractC0834Jg.A1S();
        }
    }

    public final void A0S(int i) {
        AbstractC0834Jg abstractC0834Jg = (AbstractC0834Jg) this.A0C.A1o(i);
        if (abstractC0834Jg != null && !A0a(abstractC0834Jg)) {
            A0Z(abstractC0834Jg, false);
        }
    }

    public final void A0T(int i) {
        AbstractC0834Jg abstractC0834Jg = (AbstractC0834Jg) this.A0C.A1o(i);
        if (abstractC0834Jg == null) {
            return;
        }
        if (A0a(abstractC0834Jg)) {
            A0Z(abstractC0834Jg, true);
        }
        if (!A0J(abstractC0834Jg) || this.A05 == null) {
            return;
        }
        this.A0F.setVolume(this.A05.get(((Integer) abstractC0834Jg.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AKa(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC1434cp interfaceC1434cp) {
        this.A02 = interfaceC1434cp;
    }

    public void A0Z(AbstractC0834Jg abstractC0834Jg, boolean z) {
        if (A0H()) {
            A0X(abstractC0834Jg, z);
        }
        if (!z && abstractC0834Jg.A1U()) {
            abstractC0834Jg.A1R();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Ge  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0755Ge extends FrameLayout implements InterfaceC1215Yi {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C1355bY A03;
    public AbstractC0812Ij A04;
    public C1541ea A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1839jT A0A;
    public final InterfaceC1041Rk A0B;
    public final C1079Sx A0C;
    public final C1673gi A0D;
    public final VA A0E;
    public final VI A0F;
    public final View$OnSystemUiVisibilityChangeListenerC1204Xx A0G;
    public final AbstractC1208Yb A0H;
    public final InterfaceC1214Yh A0I;
    public final ZU A0J;
    public final ArrayList<C1491dk> A0K;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0I();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0755Ge(C1673gi c1673gi, ZU zu, VA va, C1839jT c1839jT, C1079Sx c1079Sx, InterfaceC1214Yh interfaceC1214Yh) {
        super(c1673gi);
        FrameLayout.LayoutParams layoutParams;
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new C0759Gi(this);
        this.A0D = c1673gi;
        this.A0J = zu;
        this.A0E = va;
        this.A0A = c1839jT;
        this.A0C = c1079Sx;
        this.A0I = interfaceC1214Yh;
        this.A0F = new VI(this.A0A.A27(0).A2E(), this.A0E);
        this.A0G = new View$OnSystemUiVisibilityChangeListenerC1204Xx(this);
        this.A0G.A05(EnumC1203Xw.A02);
        this.A05 = new C1541ea(this.A0D, this.A0J, this.A0A.A1G(), interfaceC1214Yh);
        this.A0H = A07();
        if (this.A0A.A1c()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (r4.A1L() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4x();
        r6.A04.A1G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
        if (r4.A1L() != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        if (!this.A09) {
            if (this.A04 != null && this.A04.A1M() && this.A0A.A22() == 1 && this.A04.A1N()) {
                A0X(false, this.A02);
                return 1;
            }
            return 0;
        } else if (this.A04 == null || !this.A04.A1M() || this.A0A.A22() != 1 || this.A04.A1N()) {
            if (A0Y()) {
                AbstractC0812Ij abstractC0812Ij = this.A04;
                String[] strArr = A0M;
                if (strArr[6].length() != strArr[3].length()) {
                    String[] strArr2 = A0M;
                    strArr2[5] = "AFu5VcCLRWlCVSPev3Ny5pnjuJiPpe";
                    strArr2[7] = "Nhy8N08k5Vw4Z8hL9UmI1FpStaZ0OS";
                    if (abstractC0812Ij != null && (this.A04.A1M() || this.A0A.A22() == 2 || !this.A04.A1L())) {
                        if (!this.A0A.A2I()) {
                            this.A08 = true;
                        }
                        A0X(false, this.A02);
                        return 2;
                    }
                }
                throw new RuntimeException();
            }
            if (this.A04 != null) {
                AbstractC0812Ij abstractC0812Ij2 = this.A04;
                String[] strArr3 = A0M;
                if (strArr3[6].length() != strArr3[3].length()) {
                    String[] strArr4 = A0M;
                    strArr4[2] = "s0FLaM76nMM9Qr7TZwL2usTxvSsXcmqy";
                    strArr4[4] = "fT84jb4om2WjLoB8b8HhBoC0fCgiLofU";
                } else {
                    String[] strArr5 = A0M;
                    strArr5[5] = "A7yRQ8ZNY7QUzDAYMeY8X6eQmfD57M";
                    strArr5[7] = "dEOP0V0Fm3EsPKfzbtzpY8oiy2RB1y";
                }
                throw new RuntimeException();
            }
            if (A0Z() && !A0a()) {
                A0H();
                String[] strArr6 = A0M;
                if (strArr6[6].length() != strArr6[3].length()) {
                    String[] strArr7 = A0M;
                    strArr7[6] = "ldx0hXy1";
                    strArr7[3] = "A9K45C3zzpDFd";
                    return 4;
                }
                throw new RuntimeException();
            } else if ((this.A04 instanceof C04895h) && A0Y()) {
                A0X(false, this.A02);
                return 5;
            } else {
                this.A0F.A04(VH.A07, null);
                A0M(4);
                return 6;
            }
        } else {
            return 0;
        }
    }

    private int A01(int i) {
        if (this.A0A.A2I()) {
            C1839jT c1839jT = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c1839jT.A2B().size() && i >= 0) {
                return this.A0A.A2B().get(i).intValue();
            }
        }
        return this.A0A.A0p();
    }

    public static /* synthetic */ int A03(C0755Ge c0755Ge, int i) {
        int i2 = c0755Ge.A01 + i;
        c0755Ge.A01 = i2;
        return i2;
    }

    private AbstractC1208Yb A07() {
        AbstractC1208Yb pu;
        if (!this.A0A.A1c()) {
            pu = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            pu = new PU(this.A0D, this.A0A.A27(this.A00), 2);
        }
        pu.setFullscreen(true);
        pu.setToolbarListener(new C0756Gf(this));
        return pu;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC0812Ij A0C(boolean z, int i) {
        boolean z2;
        C0758Gh c0758Gh = new C0758Gh(this, i);
        AbstractC1847jd A27 = this.A0A.A27(this.A00);
        if (A27.A2T()) {
            this.A0H.setOnClickListener(new View$OnClickListenerC1492dl(this));
        }
        if (this.A0A.A2F()) {
            int i2 = this.A00;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i2 > 0) {
                z2 = true;
                boolean z3 = !this.A0A.A2E() && this.A00 > 0;
                String A29 = this.A0A.A29();
                if (!A0b(A27)) {
                    int A01 = A01(this.A00);
                    if (A01 == 0) {
                        setUnskippableSecondsComplete(true);
                    }
                    this.A0D.A0F().AJt(M5.A06);
                    this.A0D.A0F().AJL(this.A00);
                    this.A0D.A0F().A4v(A29);
                    return new C04895h(this.A0D, this.A0J, this.A00, this.A0E, A27, this.A0I, this.A0H, this.A0F, z2, z3, c0758Gh, A01, this.A0A.A23());
                } else if (A27.A29().A0T()) {
                    this.A0D.A0F().AJt(M5.A07);
                    this.A0D.A0F().AJL(this.A00);
                    this.A0D.A0F().A4v(A29);
                    if (this.A0A.A1c()) {
                        return new AnonymousClass55(this.A0D, this.A0E, this.A0H, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, c0758Gh, A01(this.A00), this.A0A.A23());
                    }
                    return new C5F(this.A0D, this.A0E, this.A0H, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, c0758Gh, A01(this.A00), this.A0A.A23());
                } else {
                    this.A0D.A0F().AJt(M5.A07);
                    this.A0D.A0F().AJL(this.A00);
                    this.A0D.A0F().A4v(A29);
                    return new C5S(this.A0D, this.A0E, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A0p(), i, this.A0A.A22(), z, this.A0A.A24(), this.A0A.A2I(), z2, z3, c0758Gh, A01(this.A00), this.A0A.A23());
                }
            }
        }
        z2 = false;
        if (this.A0A.A2E()) {
        }
        String A292 = this.A0A.A29();
        if (!A0b(A27)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0F().A4y(A00);
        }
    }

    private void A0F() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A27(this.A00 - 1).A2E())) {
            VA va = this.A0E;
            String A2E = this.A0A.A27(this.A00 - 1).A2E();
            C1330b9 A03 = new C1330b9().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC0812Ij abstractC0812Ij = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            va.AB7(A2E, A03.A02(abstractC0812Ij != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        if (this.A0H.getToolbarActionMode() == 8) {
            AbstractC1208Yb abstractC1208Yb = this.A0H;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC1208Yb.setToolbarActionMode(2);
        }
        int i = this.A00 - 1;
        if (this.A0A.A2J(i)) {
            AbstractC1847jd A27 = this.A0A.A27(i);
            AbstractC1208Yb abstractC1208Yb2 = this.A0H;
            String[] strArr3 = A0M;
            String str = strArr3[2];
            String str2 = strArr3[4];
            int charAt = str.charAt(19);
            int index = str2.charAt(19);
            if (charAt == index) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC1208Yb2.setProgressSpinnerInvisible(!A27.A2S());
            A27.A2K(false);
            A27.A29().A0M(-1);
        }
    }

    private void A0H() {
        this.A0D.A0F().A4w();
        this.A07 = true;
        this.A03 = new C1355bY(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C1491dk c1491dk = null;
        Iterator<C1491dk> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1491dk next = it.next();
            if (next.A00 == C1491dk.A06) {
                c1491dk = next;
                break;
            }
        }
        if (c1491dk != null) {
            A0N(this.A03, c1491dk);
        } else {
            boolean isEmpty = this.A0K.isEmpty();
            String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!isEmpty) {
                A0N(this.A03, this.A0K.get(0));
            }
        }
        A0W(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            YB.A0J(this.A04);
            this.A04.A1E();
            this.A04 = null;
        }
        YB.A0J(this.A03);
        YB.A0G(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0J() {
        this.A0G.A05(EnumC1203Xw.A03);
    }

    private synchronized void A0K() {
        this.A0I.A4j(this.A0J.A6l());
        this.A05.A06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(float f) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A2I() ? 0 : this.A01) + f;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A2I()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(int i) {
        this.A0D.A0F().A4t(i);
        setUnskippableSecondsComplete(true);
        A0K();
        A0F();
        this.A0D.A0F().AB0();
        this.A0I.A4j(this.A0J.A7w());
    }

    private void A0N(ViewGroup viewGroup, C1491dk c1491dk) {
        if (c1491dk.A00 == C1491dk.A06 && c1491dk.A03 != null) {
            AbstractC1374br.A00(this.A0D, viewGroup, c1491dk.A03);
        } else {
            int i = c1491dk.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            YB.A0N(viewGroup, i);
        }
        this.A0H.setFullscreen(c1491dk.A05);
        this.A0H.A0D(c1491dk.A02, c1491dk.A04);
    }

    private void A0O(AbstractC1847jd abstractC1847jd) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            if (A0b(abstractC1847jd) && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC1847jd.A2C());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0P(C1035Re c1035Re) {
        c1035Re.A0A(this.A0B);
        int i = c1035Re.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0X(this.A0A.A2D(), i);
        A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0W(boolean z) {
        boolean z2;
        boolean willShowCombinedEndCards;
        String[] strArr;
        if (A0Z() && !A0Y()) {
            boolean A0a = A0a();
            String[] strArr2 = A0M;
            if (strArr2[0].length() == strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0M;
            strArr3[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr3[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (!A0a) {
                z2 = true;
                willShowCombinedEndCards = A0Y();
                if (willShowCombinedEndCards && !z2) {
                    setUnskippableSecondsComplete(true);
                    if (z) {
                        this.A0H.setToolbarActionMessage(A0D(0, 0, 85));
                    }
                    AbstractC1208Yb abstractC1208Yb = this.A0H;
                    String[] strArr4 = A0M;
                    if (strArr4[6].length() == strArr4[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0M;
                    strArr5[0] = "6hDdRvQvhZI2wvmWyf";
                    strArr5[1] = "dfELTL2TgrvtcbRt37j2";
                    abstractC1208Yb.setToolbarActionMode(0);
                    return;
                }
                AbstractC1208Yb abstractC1208Yb2 = this.A0H;
                strArr = A0M;
                if (strArr[0].length() == strArr[1].length()) {
                    String[] strArr6 = A0M;
                    strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
                    strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
                    abstractC1208Yb2.setToolbarActionMode(1);
                    return;
                }
                String[] strArr7 = A0M;
                strArr7[6] = "uCb48oA3";
                strArr7[3] = "eCwSqnipc7icS";
                abstractC1208Yb2.setToolbarActionMode(1);
                return;
            }
        }
        z2 = false;
        willShowCombinedEndCards = A0Y();
        if (willShowCombinedEndCards) {
        }
        AbstractC1208Yb abstractC1208Yb22 = this.A0H;
        strArr = A0M;
        if (strArr[0].length() == strArr[1].length()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z, int i) {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04.removeAllViews();
            YB.A0J(this.A04);
        }
        if (this.A0A.A1c()) {
            YB.A0J(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(XV.A0u, XV.A0r, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0Y()) {
            setUnskippableSecondsComplete(true);
            if (A0Z()) {
                A0H();
                return;
            }
            A0M(1);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A2I()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            T1 A01 = this.A0D.A01();
            AbstractC1847jd A27 = this.A0A.A27(this.A00);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = A01.AAM(A27.A2E(), this.A0A.A28());
                if (!isLoaded) {
                    this.A0D.A0F().A4u();
                    A0M(2);
                    return;
                }
                AbstractC0812Ij A0C = A0C(z, i);
                this.A04 = A0C;
                AbstractC0812Ij abstractC0812Ij = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC0812Ij.A1I(isLoaded2);
                setupToolbarForAd(A0C);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1H();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0Y() {
        return this.A00 < this.A0A.A23();
    }

    private boolean A0Z() {
        return this.A0A.A22() == 2;
    }

    private final boolean A0a() {
        return this.A07;
    }

    public static boolean A0b(AbstractC1847jd abstractC1847jd) {
        return TextUtils.isEmpty(abstractC1847jd.A29().A0H().A09());
    }

    public final void A0d() {
        A0X(false, this.A02);
    }

    public final boolean A0e() {
        boolean z = this.A00 < this.A0A.A23() && this.A0A.A2G();
        if (z) {
            this.A0D.A0F().AC1();
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AAu(Intent intent, Bundle bundle, C1035Re c1035Re) {
        this.A0I.A45(this, A0N);
        A0P(c1035Re);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
        if (this.A04 != null) {
            this.A04.A1J(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
        if (this.A04 != null) {
            this.A04.A1K(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AIv(Bundle bundle) {
    }

    public AbstractC0812Ij getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof C04895h) {
            A0N(this.A04, this.A04.getFullScreenAdStyle());
            A0O(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04 = null;
        }
        this.A0D.A01().A4z(this.A0A.A28());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1214Yh interfaceC1214Yh) {
    }

    public void setServerSideRewardHandler(C1541ea c1541ea) {
        this.A05 = c1541ea;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A1I(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC0812Ij abstractC0812Ij) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        AbstractC1847jd A27 = this.A0A.A27(this.A00);
        int A01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0G(this.A0D, A27.A22());
            ((FullScreenAdToolbar) this.A0H).A0F(A27.A2C(), A27.A2E(), A01);
        } else if (this.A0H instanceof PU) {
            ((PU) this.A0H).setInitialUnskippableSeconds(A01);
        }
        C1491dk fullScreenAdStyle = abstractC0812Ij.getFullScreenAdStyle();
        A0N(abstractC0812Ij, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0D(4, 3, 90) + (this.A00 + 1) + A0D(0, 4, 21) + this.A0A.A23());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0O(A27);
    }
}

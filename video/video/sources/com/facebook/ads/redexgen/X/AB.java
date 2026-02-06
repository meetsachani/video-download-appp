package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import o.C10071up2;
import o.C10323vs;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class AB implements Handler.Callback, InterfaceC2092nq, InterfaceC0721Ev, InterfaceC0670Cw, C6P, InterfaceC05357b {
    public static byte[] A0x;
    public static String[] A0y = {"EvYOBb0fNCsu7OcAaOZNwoEPwn2", "8jIqnMhTOhQ3fU", "vmW", "edZR1F4oYcKYyzs7tUfX3dHGMGqqrKBY", "TI8UsWNSVk9Jh7srInWeHwVEqkc209d4", "AVB8fiMNMM9Dy8Zuh880FwllBoFt5PF1", "1mkHXRje2n0Pvvw2j", "LF2w13BN71krhrKRtprOb2x3jYcy1FYO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A06;
    public C05176j A07;
    public C05216n A08;
    public C7Z A0A;
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public InterfaceC2151oo A0B;
    public C05547u A0C;
    public InterfaceC0671Cx A0D;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public InterfaceC2151oo[] A0W;
    public final long A0Y;
    public final long A0Z;
    public final Handler A0a;
    public final HandlerThread A0b;
    public final C2209pl A0c;
    public final C2207pj A0d;
    public final AnonymousClass45 A0e;
    public final C4X A0f;
    public final C2159ow A0g;
    public final C05206m A0h;
    public final AnonymousClass74 A0i;
    public final C2147ok A0k;
    public final AbstractC0722Ew A0l;
    public final C0723Ex A0m;
    public final F6 A0n;
    public final C05869g A0o;
    public final ArrayList<C05196l> A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final InterfaceC2151oo[] A0v;
    public final InterfaceC05497p[] A0w;
    public long A05 = C10323vs.b;
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public EnumC1801ir A0E = EnumC1801ir.A09;
    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0J = false;
    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public C7W A09 = null;
    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0L = false;
    @MetaExoPlayerCustomization("D71523094: Added for negative testing")
    public Integer A0F = null;
    public final C7E A0j = new C7E();
    @MetaExoPlayerCustomization
    public final int A0X = A00();

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0x, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "wOV";
            strArr[6] = "lGv9KfQpa0xBFnWlu";
            copyOfRange[i4] = (byte) ((b - i3) - 57);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x037e, code lost:
        if (r3 == 1) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0380, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0393, code lost:
        if (r3 == 1) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03ab, code lost:
        r24.A0R = r24.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03bb, code lost:
        if (com.facebook.ads.redexgen.X.AB.A0y[5].charAt(1) == 'q') goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bd, code lost:
        r2 = com.facebook.ads.redexgen.X.AB.A0y;
        r2[4] = "Uyz0TdICBPSSMiRUHh3H6S4m2yqjGOAg";
        r2[3] = "3B1Lhsj2yRloVQBWBzqqqLZ9kauiXzuH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03cb, code lost:
        if (r24.A0B == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d4, code lost:
        if (r24.A0B.A9N() != 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d6, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03d7, code lost:
        A0W(2, r8);
        A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
        if (r7 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
        if (r24.A0A.A0C == (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
        r8 = (com.facebook.ads.redexgen.X.C2Y.A01(r24.A0A.A0C - r24.A0A.A02) > 1000 ? 1 : (com.facebook.ads.redexgen.X.C2Y.A01(r24.A0A.A0C - r24.A0A.A02) == 1000 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
        if (com.facebook.ads.redexgen.X.AB.A0y[7].charAt(12) == '2') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
        com.facebook.ads.redexgen.X.AB.A0y[5] = "BlhxJ9uFvDlxNeph5MIqggmIWIv4QApO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
        if (r8 <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bc, code lost:
        if (r7 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
        if (r24.A0H != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
        r8 = r9.A9p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ef, code lost:
        if (com.facebook.ads.redexgen.X.AB.A0y[7].charAt(12) == '2') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f1, code lost:
        com.facebook.ads.redexgen.X.AB.A0y[5] = "gun24np1Fz9ULZxkMCl3omnFVmny067U";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
        if (r8 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
        r9.AJN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0201, code lost:
        if (r24.A0H != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0210, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0216, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f7  */
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0F() throws AD, IOException {
        String[] strArr;
        InterfaceC2151oo[] interfaceC2151ooArr;
        long AKe = this.A0e.AKe();
        A0P();
        if (!this.A0j.A0N()) {
            A0I();
            A0a(AKe, 10L);
            return;
        }
        C7A A0F = this.A0j.A0F();
        C7A A0G = this.A0j.A0G();
        AnonymousClass54.A02(A0D(353, 10, 65));
        A0Q();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0F.A07.A60(this.A0A.A0C - this.A0Y, this.A0r);
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = this.A0W.length > 1;
        InterfaceC2151oo[] interfaceC2151ooArr2 = this.A0W;
        int length = interfaceC2151ooArr2.length;
        int i = 0;
        while (true) {
            String A0D = A0D(223, 35, 31);
            String A0D2 = A0D(0, 21, 22);
            if (i < length) {
                InterfaceC2151oo interfaceC2151oo = interfaceC2151ooArr2[i];
                interfaceC2151oo.AIX(this.A06, elapsedRealtime);
                if (A0G.A00.A05) {
                    boolean z5 = this.A0O;
                    if (A0y[0].length() == 16) {
                        break;
                    }
                    String[] strArr2 = A0y;
                    strArr2[4] = "S4Fyq0ZfVTRLxRTM4wwKz81RK4qT5SRq";
                    strArr2[3] = "dt9NVxX1YAgTPnpY37Axx0Ou68rzEGgN";
                    if (z5) {
                        if (!interfaceC2151oo.A9p()) {
                            boolean z6 = this.A0H;
                            if (A0y[0].length() != 16) {
                                A0y[5] = "eiShONRNAduVJjGMnbACFBBBapCf3AHm";
                            } else {
                                String[] strArr3 = A0y;
                                strArr3[4] = "JgPz5rm3gJhJD0DUOH89UMmPp4ssm19B";
                                strArr3[3] = "EHDY1dQAFQsMAYBzgGAEpHtmXIGNI89a";
                            }
                        }
                        interfaceC2151oo.AJN();
                    } else if (A0y[5].charAt(1) != 'q') {
                        String[] strArr4 = A0y;
                        strArr4[4] = "usLdHWXdVdc1eYm8Xo8iItMQczfdPoTF";
                        strArr4[3] = "jdYe6RXL6unoORbHA5yicze0YAqR3j0n";
                    }
                }
                if (!(interfaceC2151oo instanceof C03831b)) {
                    z4 = z4 && interfaceC2151oo.AAP();
                }
                z2 = z2 && interfaceC2151oo.AAP();
                boolean z7 = interfaceC2151oo.AAe() || interfaceC2151oo.AAP() || A17(interfaceC2151oo);
                if (!z7) {
                    z = true;
                    try {
                        interfaceC2151oo.ACU();
                    } catch (C2168p5 e) {
                        if (!e.getClass().equals(C2168p5.class)) {
                            throw e;
                        }
                        if (!this.A0N) {
                            throw e;
                        }
                        if (this.A05 == C10323vs.b) {
                            Log.w(A0D2, A0D + e.getMessage());
                            this.A05 = System.currentTimeMillis();
                            if (this.A0q) {
                                this.A0a.obtainMessage(4, e).sendToTarget();
                            }
                        } else if (System.currentTimeMillis() - this.A05 > this.A0Z) {
                            throw e;
                        }
                    }
                    this.A0B = interfaceC2151oo;
                    if (A0y[7].charAt(12) == '2') {
                        break;
                    }
                    A0y[5] = "qlbqZn2WmIl9Oup3QtCZToOsAISM7SD4";
                }
                z3 = z3 && z7;
                i++;
            } else {
                if (!z3) {
                    A0I();
                }
                if (this.A0Q && z4 && !z2) {
                    for (InterfaceC2151oo interfaceC2151oo2 : this.A0W) {
                        if (interfaceC2151oo2 instanceof C03831b) {
                            interfaceC2151oo2.AIX(C10071up2.f, C10071up2.f);
                            z2 = interfaceC2151oo2.AAP();
                        }
                    }
                }
                long j = A0F.A00.A00;
                boolean z8 = false;
                if (z2 && (j == C10323vs.b || j <= this.A0A.A0C)) {
                    C7B c7b = A0F.A00;
                    String[] strArr5 = A0y;
                    if (strArr5[2].length() == strArr5[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0y;
                    strArr6[2] = "uQd";
                    strArr6[6] = "zdLpoimG1uHaXVEOP";
                    if (c7b.A05) {
                        A0V(4);
                        A0O();
                        if (this.A0A.A00 == 2) {
                            for (InterfaceC2151oo interfaceC2151oo3 : this.A0W) {
                                z = true;
                                try {
                                    interfaceC2151oo3.ACU();
                                } catch (C2168p5 e2) {
                                    if (!e2.getClass().equals(C2168p5.class)) {
                                        throw e2;
                                    }
                                    boolean z9 = this.A0N;
                                    if (A0y[1].length() != 31) {
                                        A0y[0] = "ROTBjRrt9pmtd4l9PrsJpq4cigEOLmNk";
                                        if (!z9) {
                                            throw e2;
                                        }
                                        if (this.A05 == C10323vs.b) {
                                            long currentTimeMillis = System.currentTimeMillis() - this.A05;
                                            long j2 = this.A0Z;
                                            if (A0y[5].charAt(1) != 'q') {
                                                A0y[1] = "nYRcp";
                                                if (currentTimeMillis <= j2) {
                                                }
                                            } else {
                                                A0y[0] = "0hUy";
                                                if (currentTimeMillis <= j2) {
                                                }
                                            }
                                            throw e2;
                                        }
                                        Log.w(A0D2, A0D + e2.getMessage());
                                        this.A05 = System.currentTimeMillis();
                                        if (this.A0q) {
                                            this.A0a.obtainMessage(4, e2).sendToTarget();
                                        }
                                    } else {
                                        if (!z9) {
                                            throw e2;
                                        }
                                        if (this.A05 == C10323vs.b) {
                                        }
                                    }
                                }
                            }
                        }
                        boolean z10 = this.A0P;
                        strArr = A0y;
                        if (strArr[4].charAt(1) != strArr[3].charAt(1)) {
                            A0y[0] = "CfnO3oWhmhBZYFdKQQ3";
                            if ((z10 && this.A0A.A00 == 3) || this.A0A.A00 == 2) {
                                A0a(AKe, this.A0X);
                            } else if (this.A0W.length == 0 || this.A0A.A00 == 4) {
                                this.A0f.AIT(2);
                            } else {
                                A0a(AKe, 1000L);
                            }
                            if (!z) {
                                this.A05 = C10323vs.b;
                            }
                            AnonymousClass54.A00();
                            return;
                        }
                    }
                }
                if (this.A0A.A00 == 2 && A19(z3)) {
                    if (this.A0J && !this.A0L) {
                        this.A0L = true;
                        this.A0F = A0B();
                        if (this.A0F != null && this.A0F.intValue() > 0) {
                            A0a(AKe, this.A0F.intValue());
                            return;
                        }
                    }
                    if (this.A0B != null) {
                        int A9N = this.A0B.A9N();
                        if (A0y[5].charAt(1) != 'q') {
                            A0y[1] = "FUTTGuZgInj0HgAB4TKGqFNOnZ8TLHiw";
                        }
                    }
                    A0t(this.A0E, z8);
                    if (this.A0P) {
                        A0N();
                    }
                    this.A0B = null;
                } else if (this.A0A.A00 == 3) {
                    if (this.A0W.length == 0) {
                    }
                }
                if (this.A0A.A00 == 2) {
                }
                boolean z102 = this.A0P;
                strArr = A0y;
                if (strArr[4].charAt(1) != strArr[3].charAt(1)) {
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0P() throws AD, IOException {
        if (this.A0D == null) {
            return;
        }
        if (this.A02 > 0) {
            this.A0D.ACT();
            return;
        }
        A0J();
        C7A A0E = this.A0j.A0E();
        if (A0E != null && !A0E.A0R()) {
            boolean z = this.A0A.A0A;
            if (A0y[1].length() != 31) {
                A0y[5] = "JakbFE5sCqyiHPWhcmq5QKrahWaBlD8R";
                if (!z) {
                    A0w(false);
                }
            }
            throw new RuntimeException();
        }
        A0y(false);
        if (this.A0j.A0N()) {
            C7A A0F = this.A0j.A0F();
            C7A A0G = this.A0j.A0G();
            boolean z2 = false;
            while (this.A0P && A0F != A0G && this.A06 >= A0F.A0I().A0H(this.A0K)) {
                if (z2) {
                    A0H();
                }
                int i = A0F.A00.A07 ? 0 : 3;
                C7A c7a = A0F;
                A0F = this.A0j.A0B();
                A0g(c7a);
                C7Z c7z = this.A0A;
                C2090no c2090no = A0F.A00.A04;
                long j = A0F.A00.A03;
                if (A0y[7].charAt(12) == '2') {
                    throw new RuntimeException();
                }
                String[] strArr = A0y;
                strArr[4] = "OGZbExKcucXIKKZQBdHGOATJ9dYdrwhN";
                strArr[3] = "TJxPjvISq11gHqp4fguKhlEOGAavfVmH";
                this.A0A = c7z.A06(c2090no, j, A0F.A00.A02, A01());
                this.A0h.A04(i);
                A0Q();
                z2 = true;
            }
            C7B c7b = A0G.A00;
            String[] strArr2 = A0y;
            if (strArr2[4].charAt(1) != strArr2[3].charAt(1)) {
                A0y[7] = "WHxPanRASNJPtq4bnE3dJm5Kco7OvEcN";
                if (c7b.A05) {
                    for (int i2 = 0; i2 < this.A0v.length; i2++) {
                        InterfaceC2151oo interfaceC2151oo = this.A0v[i2];
                        DT dt = A0G.A09[i2];
                        if (dt != null && interfaceC2151oo.A9D() == dt && interfaceC2151oo.A9p()) {
                            interfaceC2151oo.AJN();
                        }
                    }
                    return;
                } else if (A0G.A0I() == null) {
                    return;
                } else {
                    C7A A0I = A0G.A0I();
                    String[] strArr3 = A0y;
                    if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                        A0y[7] = "aMxVvZtAQBe9jxU0Z4NX1LXmsoJEfXr7";
                        if (A0I.A02) {
                            for (int i3 = 0; i3 < this.A0v.length; i3++) {
                                InterfaceC2151oo interfaceC2151oo2 = this.A0v[i3];
                                DT dt2 = A0G.A09[i3];
                                if (interfaceC2151oo2.A9D() != dt2) {
                                    return;
                                }
                                if (dt2 != null && !interfaceC2151oo2.A9p()) {
                                    return;
                                }
                            }
                            C0723Ex A0K = A0G.A0K();
                            C7A A0C = this.A0j.A0C();
                            C0723Ex A0K2 = A0C.A0K();
                            boolean z3 = A0C.A07.AHQ() != C10323vs.b;
                            for (int i4 = 0; i4 < this.A0v.length; i4++) {
                                InterfaceC2151oo interfaceC2151oo3 = this.A0v[i4];
                                if (A0K.A00(i4)) {
                                    if (z3) {
                                        interfaceC2151oo3.AJN();
                                    } else {
                                        boolean AAN = interfaceC2151oo3.AAN();
                                        if (A0y[0].length() != 16) {
                                            A0y[1] = "9mAYXkFxI0mZazBGslnkswropOC4T";
                                            if (AAN) {
                                                continue;
                                            }
                                            InterfaceC2054nE interfaceC2054nE = A0K2.A04[i4];
                                            boolean A00 = A0K2.A00(i4);
                                            boolean z4 = this.A0w[i4].A9N() != -2;
                                            C05527s c05527s = A0K.A03[i4];
                                            C05527s c05527s2 = A0K2.A03[i4];
                                            if (A0y[1].length() != 31) {
                                                throw new RuntimeException();
                                            }
                                            A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                            if (A00 && c05527s2.equals(c05527s) && !z4) {
                                                C2242qI[] A1A = A1A(interfaceC2054nE);
                                                Log.e(A0D(0, 21, 22), A0D(392, 13, 67));
                                                interfaceC2151oo3.AIa(A1A, A0C.A09[i4], A0C.A0H(this.A0K), A0C.A0B());
                                            } else {
                                                interfaceC2151oo3.AJN();
                                            }
                                        } else {
                                            A0y[0] = "RavyRccOc8FddTyMpAZEZ";
                                            if (AAN) {
                                                continue;
                                            }
                                            InterfaceC2054nE interfaceC2054nE2 = A0K2.A04[i4];
                                            boolean A002 = A0K2.A00(i4);
                                            if (this.A0w[i4].A9N() != -2) {
                                            }
                                            C05527s c05527s3 = A0K.A03[i4];
                                            C05527s c05527s22 = A0K2.A03[i4];
                                            if (A0y[1].length() != 31) {
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    public static void A0R() {
        A0x = new byte[]{-108, C2638Cg0.u7, -66, -97, -69, -80, -56, -76, C2638Cg0.p7, -104, -68, -65, -69, -104, -67, C2638Cg0.r7, -76, C2638Cg0.p7, -67, -80, -69, -15, 36, C8077mf.E, -4, C8077mf.B, 13, C3307Iz.X, 17, C8077mf.H, -11, C8077mf.C, 28, C8077mf.B, -11, C8077mf.D, 32, 17, C8077mf.H, C8077mf.D, 13, C8077mf.B, -26, -12, 13, C8077mf.D, C8077mf.r, C8077mf.B, 17, C8077mf.H, -87, C2638Cg0.u7, C2638Cg0.z7, C2638Cg0.A7, -46, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.u7, Byte.MIN_VALUE, C2638Cg0.y7, C2638Cg0.s7, -45, -45, C2638Cg0.p7, C2638Cg0.u7, C2638Cg0.s7, -45, Byte.MIN_VALUE, -45, C2638Cg0.s7, C2638Cg0.z7, -44, Byte.MIN_VALUE, C2638Cg0.p7, C2638Cg0.t7, -44, C2638Cg0.s7, -46, Byte.MIN_VALUE, -46, C2638Cg0.s7, -52, C2638Cg0.s7, C2638Cg0.p7, -45, C2638Cg0.s7, -114, -107, -70, C2638Cg0.o7, -79, -66, -70, -83, -72, 108, -66, C2638Cg0.p7, -70, C2638Cg0.o7, -75, -71, -79, 108, -79, -66, -66, -69, -66, 122, C2638Cg0.w7, -26, -37, -13, -36, -37, -35, -27, -102, -33, -20, -20, -23, -20, -88, -114, -86, -97, -73, -96, -97, -95, -87, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, QC1.w, 94, 99, -94, 106, 94, -96, -77, -92, -92, -93, -80, -93, -94, -126, -77, -80, -97, -78, -89, -83, -84, -117, -79, QC1.w, 94, 99, -94, 106, 94, -84, -93, -74, -78, -118, -83, -97, -94, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, QC1.w, 94, 99, -94, -76, -48, -42, -45, -60, C2638Cg0.t7, -127, C2638Cg0.t7, -45, -45, -48, -45, -113, -72, C2638Cg0.E7, -44, -43, -123, C2638Cg0.x7, C2638Cg0.t7, C2638Cg0.z7, -47, C2638Cg0.w7, C2638Cg0.v7, -109, -78, -97, -91, -84, -67, C2638Cg0.s7, -56, C2638Cg0.u7, C2638Cg0.w7, -71, C2638Cg0.w7, C2638Cg0.p7, -60, -47, QC1.w, C2638Cg0.p7, -65, C2638Cg0.t7, C2638Cg0.u7, C2638Cg0.w7, C2638Cg0.p7, C2638Cg0.t7, -65, QC1.w, C2638Cg0.x7, -52, C2638Cg0.w7, -67, -71, C2638Cg0.s7, QC1.w, -67, C2638Cg0.w7, C2638Cg0.w7, C2638Cg0.u7, C2638Cg0.w7, -110, QC1.w, -108, -78, -71, -87, -82, -89, 96, -76, -81, 96, -77, -91, -82, -92, 96, -83, -91, -77, -77, -95, -89, -91, 96, -81, -82, 96, -95, 96, -92, -91, -95, -92, 96, -76, -88, -78, -91, -95, -92, 110, 5, C8077mf.H, C8077mf.y, 40, 32, C8077mf.y, 19, 36, C8077mf.y, C8077mf.x, -48, C8077mf.y, 34, 34, 31, 34, -48, C8077mf.x, C8077mf.y, 28, C8077mf.C, C3307Iz.Y, C8077mf.y, 34, C8077mf.C, C8077mf.H, C8077mf.A, -48, C8077mf.G, C8077mf.y, 35, 35, 17, C8077mf.A, C8077mf.y, -48, 31, C8077mf.H, -48, C8077mf.y, 40, 36, C8077mf.y, 34, C8077mf.H, 17, 28, -48, 36, C8077mf.B, 34, C8077mf.y, 17, C8077mf.x, -34, -34, -23, C2638Cg0.y7, -23, -25, -33, -47, -23, -20, -27, C3307Iz.X, C8077mf.G, 28, C3307Iz.V, C8077mf.C, 8, C8077mf.G, 42, C3307Iz.V, C3307Iz.Z, 28, 1, 28, -70, -81, -68, -77, -71, -82, -102, -71, -67, -77, -66, -77, -71, -72, -97, -67, -18, C2638Cg0.C7, -20, -24, -35, -33, C2638Cg0.C7, C2638Cg0.A7, -16, -18, C2638Cg0.C7, -35, -23};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0276, code lost:
        A0v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0279, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027f, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0219, code lost:
        if (r8.A00() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021b, code lost:
        r3 = r14.A0j.A0K(r5, java.lang.Integer.valueOf(r4), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0229, code lost:
        if (r3.equals(r8) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022f, code lost:
        if (r3.A00() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0231, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0233, code lost:
        r14.A0A = r14.A0A.A06(r3, A06(r3, r1), r10, A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0244, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0245, code lost:
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024d, code lost:
        if (r8.A00() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
        r9 = r14.A0j;
        r3 = r14.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025f, code lost:
        if (com.facebook.ads.redexgen.X.AB.A0y[1].length() == 31) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
        r6 = com.facebook.ads.redexgen.X.AB.A0y;
        r6[4] = "30gHr5wufVP7jVH5IRZCDYCZy2V5u0Zf";
        r6[3] = "xPVmpg9j3VPOmOyowbQUJ4kDfZKAMzov";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0271, code lost:
        if (r9.A0Q(r5, r8, r3) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0273, code lost:
        A0x(false);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0e(C05186k c05186k) throws AD {
        C2090no c2090no;
        if (c05186k.A01 != this.A0D) {
            return;
        }
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c05186k.A00;
        this.A0A = this.A0A.A04(timeline2);
        A0M();
        if (this.A02 > 0) {
            this.A0h.A03(this.A02);
            this.A02 = 0;
            if (this.A08 != null) {
                Pair<Object, Long> A09 = A09(this.A08, true);
                this.A08 = null;
                if (A09 == null) {
                    A0G();
                    return;
                }
                Object obj = A09.first;
                long longValue = ((Long) A09.second).longValue();
                C2090no A0K = this.A0j.A0K(timeline2, obj, longValue);
                this.A0A = this.A0A.A06(A0K, A0K.A00() ? 0L : longValue, longValue, this.A0A.A0D);
                return;
            } else if (A0y[1].length() == 31) {
                throw new RuntimeException();
            } else {
                String[] strArr = A0y;
                strArr[2] = "O4I";
                strArr[6] = "ahZa31gq0LeVPqA4e";
                if (0 != 0) {
                    throw new NullPointerException(A0D(376, 16, 17));
                }
                if (this.A0A.A02 == C10323vs.b) {
                    if (timeline2.A0N()) {
                        A0G();
                        return;
                    }
                    Pair<Object, Long> A08 = A08(timeline2, timeline2.A0B(this.A0V), C10323vs.b);
                    Object obj2 = A08.first;
                    long longValue2 = ((Long) A08.second).longValue();
                    C2090no A0K2 = this.A0j.A0K(timeline2, obj2, longValue2);
                    C7Z c7z = this.A0A;
                    String[] strArr2 = A0y;
                    if (strArr2[2].length() == strArr2[6].length()) {
                        throw new RuntimeException();
                    }
                    A0y[0] = "JR6dPBbFHW2aBR0iQ91GP51A";
                    this.A0A = c7z.A06(A0K2, A0K2.A00() ? 0L : longValue2, longValue2, this.A0A.A0D);
                    return;
                }
                return;
            }
        }
        Object obj3 = this.A0A.A05.A04;
        long j = this.A0A.A01;
        if (timeline.A0N()) {
            if (timeline2.A0N()) {
                return;
            }
            C2090no A0K3 = this.A0j.A0K(timeline2, obj3, j);
            this.A0A = this.A0A.A06(A0K3, A0K3.A00() ? 0L : j, j, this.A0A.A0D);
            return;
        }
        C7A A0D = this.A0j.A0D();
        Object obj4 = A0D == null ? this.A0A.A05.A04 : A0D.A08;
        int A0A = timeline2.A0A(obj4);
        if (A0A == -1) {
            Object A0C = A0C(obj4, timeline, timeline2);
            if (A0C == null) {
                A0G();
                return;
            }
            Pair<Object, Long> A082 = A08(timeline2, timeline2.A0J(A0C, this.A0c).A00, C10323vs.b);
            Object obj5 = A082.first;
            long longValue3 = ((Long) A082.second).longValue();
            C2090no A0K4 = this.A0j.A0K(timeline2, obj5, longValue3);
            if (A0D != null) {
                while (A0D.A0I() != null) {
                    A0D = A0D.A0I();
                    if (A0D.A00.A04.equals(A0K4)) {
                        C7E c7e = this.A0j;
                        String[] strArr3 = A0y;
                        if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                            A0y[0] = "lm8nmDAIswUHpj0OrSP7ctv";
                            A0D.A00 = c7e.A0I(timeline2, A0D.A00);
                        } else {
                            A0D.A00 = c7e.A0I(timeline2, A0D.A00);
                        }
                    }
                }
            }
            long A06 = A06(A0K4, A0K4.A00() ? 0L : longValue3);
            C7Z c7z2 = this.A0A;
            long A01 = A01();
            String[] strArr4 = A0y;
            if (strArr4[4].charAt(1) == strArr4[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0y;
            strArr5[2] = "HJD";
            strArr5[6] = "HIUAzKTwmQi0tOVOF";
            this.A0A = c7z2.A06(A0K4, A06, longValue3, A01);
            return;
        }
        C7Z c7z3 = this.A0A;
        String[] strArr6 = A0y;
        if (strArr6[4].charAt(1) != strArr6[3].charAt(1)) {
            String[] strArr7 = A0y;
            strArr7[4] = "QYIV2IuM2tD6Cg4Dd0tvfiQK4IQ6icHf";
            strArr7[3] = "hXYkHU7O6zP410ynmzMqamHjkcWcTxII";
            c2090no = c7z3.A05;
        } else {
            c2090no = c7z3.A05;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0f(C05216n c05216n) throws AD {
        long longValue;
        C2090no A0K;
        long longValue2;
        boolean z;
        this.A0h.A03(1);
        Pair<Object, Long> A09 = A09(c05216n, true);
        if (A09 == null) {
            A0K = A0A();
            longValue2 = C10323vs.b;
            longValue = C10323vs.b;
            z = true;
        } else {
            Object obj = A09.first;
            longValue = ((Long) A09.second).longValue();
            A0K = this.A0j.A0K(this.A0A.A03, obj, longValue);
            if (A0K.A00()) {
                longValue2 = 0;
                z = true;
            } else {
                longValue2 = ((Long) A09.second).longValue();
                z = c05216n.A01 == C10323vs.b;
            }
        }
        try {
            try {
                if (this.A0D != null && this.A02 <= 0) {
                    try {
                        if (longValue2 == C10323vs.b) {
                            A0V(4);
                            A13(false, true, false);
                        } else {
                            long j = longValue2;
                            if (A0K.equals(this.A0A.A05)) {
                                C7A A0F = this.A0j.A0F();
                                if (A0F != null && j != 0) {
                                    j = A0F.A07.A6r(j, this.A0C);
                                }
                                if (C2Y.A01(j) == C2Y.A01(this.A0A.A0C)) {
                                    this.A0A = this.A0A.A06(A0K, this.A0A.A0C, longValue, A01());
                                    if (z) {
                                        this.A0h.A04(2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            long A06 = A06(A0K, j);
                            z |= longValue2 != A06;
                            longValue2 = A06;
                        }
                        this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                        if (z) {
                            return;
                        }
                        this.A0h.A04(2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                        if (z) {
                            this.A0h.A04(2);
                        }
                        throw th;
                    }
                }
                this.A08 = c05216n;
                this.A07 = null;
                this.A0A = this.A0A.A06(A0K, longValue2, longValue, A01());
                if (z) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static {
        A0R();
    }

    public AB(InterfaceC2151oo[] interfaceC2151ooArr, AbstractC0722Ew abstractC0722Ew, C0723Ex c0723Ex, AnonymousClass74 anonymousClass74, F6 f6, boolean z, int i, boolean z2, Handler handler, AnonymousClass45 anonymousClass45, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, boolean z9, int i2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C8O c8o) {
        this.A0v = interfaceC2151ooArr;
        this.A0l = abstractC0722Ew;
        this.A0m = c0723Ex;
        this.A0i = anonymousClass74;
        this.A0n = f6;
        this.A0P = z;
        this.A03 = i;
        this.A0V = z2;
        this.A0a = handler;
        this.A0e = anonymousClass45;
        this.A0U = z3;
        this.A0H = z4;
        this.A0G = z5;
        this.A0M = z6;
        this.A0I = z7;
        this.A0T = z8;
        this.A0Z = j;
        this.A0q = z9;
        this.A00 = i2;
        this.A0u = z11;
        this.A0s = z10;
        this.A0O = z12;
        this.A0Q = z13;
        this.A0K = z14;
        this.A0t = z15;
        this.A0N = j > 0;
        this.A0Y = anonymousClass74.A70(c8o);
        this.A0r = anonymousClass74.AIn(c8o);
        this.A0C = C05547u.A03;
        this.A0A = new C7Z(Timeline.A02, C10323vs.b, C2072nW.A06, c0723Ex);
        this.A0h = new C05206m();
        this.A0w = new InterfaceC05497p[interfaceC2151ooArr.length];
        for (int i3 = 0; i3 < interfaceC2151ooArr.length; i3++) {
            interfaceC2151ooArr[i3].AA9(i3, c8o);
            this.A0w[i3] = interfaceC2151ooArr[i3].A7D();
        }
        this.A0g = new C2159ow(this, anonymousClass45);
        this.A0k = new C2147ok(anonymousClass45);
        this.A0o = z11 ? new C05869g(anonymousClass45) : null;
        this.A0p = new ArrayList<>();
        this.A0W = new InterfaceC2151oo[0];
        this.A0d = new C2207pj();
        this.A0c = new C2209pl();
        abstractC0722Ew.A02(this, f6);
        this.A0b = new HandlerThread(A0D(21, 29, 115), -16);
        this.A0b.start();
        this.A0f = anonymousClass45.A5P(this.A0b.getLooper(), this);
    }

    @MetaExoPlayerCustomization
    private int A00() {
        int exoplayerThreadPollingIntervalMs = C1844ja.A00(EnumC1842jY.A04);
        if (exoplayerThreadPollingIntervalMs > 0) {
            return exoplayerThreadPollingIntervalMs;
        }
        return 10;
    }

    private long A01() {
        return A04(this.A0A.A0B);
    }

    private final long A02() {
        long loadingPeriodStartPositionUs;
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            loadingPeriodStartPositionUs = 0;
        } else {
            loadingPeriodStartPositionUs = A05(A0E);
        }
        if (A0E == null || loadingPeriodStartPositionUs == C10323vs.b) {
            return 0L;
        }
        return A0E.A0C(loadingPeriodStartPositionUs);
    }

    private final long A03() {
        long A0C;
        C7A A0F = this.A0j.A0F();
        if (A0F == null) {
            A0C = 0;
        } else {
            A0C = A0F.A0C(A0F.A0D(this.A06));
        }
        return A0C + A02();
    }

    private long A04(long j) {
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            return 0L;
        }
        return j - A0E.A0D(this.A06);
    }

    private final long A05(C7A c7a) {
        long j = Long.MAX_VALUE;
        DT[] dtArr = c7a.A09;
        for (int i = 0; i < dtArr.length; i++) {
            if (dtArr[i] instanceof DU) {
                long periodStartPositionUs = ((DU) dtArr[i]).A89();
                j = Math.min(j, periodStartPositionUs);
            }
        }
        return j == Long.MAX_VALUE ? C10323vs.b : j;
    }

    private long A06(C2090no c2090no, long j) throws AD {
        return A07(false, c2090no, j, this.A0j.A0F() != this.A0j.A0G());
    }

    private long A07(boolean z, C2090no c2090no, long j, boolean z2) throws AD {
        A0O();
        this.A0R = false;
        A0V(2);
        C7A A0F = this.A0j.A0F();
        C7A c7a = A0F;
        while (true) {
            if (c7a == null) {
                break;
            } else if (A18(c2090no, j, c7a)) {
                this.A0j.A0S(c7a);
                break;
            } else {
                c7a = this.A0j.A0B();
            }
        }
        if (A0F != c7a || z2) {
            for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
                A0l(interfaceC2151oo);
            }
            this.A0W = new InterfaceC2151oo[0];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[4] = "70t8rv27mnV5UL6KHl8v284ienTbIO4o";
            strArr[3] = "4hBvGCC7ZdKRW68bijyzpqxjpy9h3CGi";
            A0F = null;
        }
        if (c7a != null) {
            A0g(A0F);
            if (c7a.A01) {
                j = c7a.A07.AJ8(j, z);
                c7a.A07.A60(j - this.A0Y, this.A0r);
            }
            A0Y(j);
            A0w(this.A0G);
        } else {
            this.A0j.A0M(true);
            A0Y(j);
        }
        A0v(false);
        this.A0f.AJA(2);
        return j;
    }

    private Pair<Object, Long> A08(Timeline timeline, int i, long j) {
        return timeline.A0D(this.A0d, this.A0c, i, j);
    }

    private Pair<Object, Long> A09(C05216n c05216n, boolean z) {
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c05216n.A02;
        if (timeline.A0N()) {
            return null;
        }
        if (timeline2.A0N()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> periodPosition = timeline2.A0E(this.A0d, this.A0c, c05216n.A00, c05216n.A01);
            if (timeline == timeline2) {
                return periodPosition;
            }
            int A0A = timeline.A0A(periodPosition.first);
            if (A0A != -1) {
                return periodPosition;
            }
            if (!z || A0C(periodPosition.first, timeline2, timeline) == null) {
                return null;
            }
            return A08(timeline, timeline.A0H(A0A, this.A0c).A00, C10323vs.b);
        } catch (IndexOutOfBoundsException unused) {
            throw new C04222q(timeline, c05216n.A00, c05216n.A01);
        }
    }

    private C2090no A0A() {
        Timeline timeline = this.A0A.A03;
        if (timeline.A0N()) {
            return C7Z.A0E;
        }
        return new C2090no(timeline.A0M(timeline.A0K(timeline.A0B(this.A0V), this.A0d).A00));
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D71523094: Added for negative testing")
    private final Integer A0B() {
        C7V playbackLatencyConfig;
        if (this.A09 == null || (playbackLatencyConfig = this.A09.A02()) == null) {
            String[] strArr = A0y;
            if (strArr[2].length() != strArr[6].length()) {
                A0y[7] = "1rqbEBrQgQNr61xUccdMybR9UEwvq3L8";
                return null;
            }
        } else {
            int A00 = playbackLatencyConfig.A00();
            if (A0y[0].length() != 16) {
                String[] strArr2 = A0y;
                strArr2[2] = "KUZ";
                strArr2[6] = "wQAKuizVIm50S6vdz";
                return Integer.valueOf(A00);
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object A0C(Object obj, Timeline timeline, Timeline timeline2) {
        int A0A = timeline.A0A(obj);
        int i = -1;
        int maxIterations = timeline.A06();
        for (int newPeriodIndex = 0; newPeriodIndex < maxIterations && i == -1 && (A0A = timeline.A09(A0A, this.A0c, this.A0d, this.A03, this.A0V)) != -1; newPeriodIndex++) {
            i = timeline2.A0A(timeline.A0M(A0A));
        }
        return timeline2.A0M(i);
    }

    private void A0E() {
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            return;
        }
        A0E.A07.A4s(A0E.A0D(this.A06));
    }

    private void A0G() {
        A0V(4);
        A13(false, true, false);
    }

    private void A0H() {
        int i;
        if (this.A0h.A06(this.A0A)) {
            Handler handler = this.A0a;
            int A00 = C05206m.A00(this.A0h);
            if (C05206m.A02(this.A0h)) {
                i = C05206m.A01(this.A0h);
            } else {
                i = -1;
            }
            handler.obtainMessage(0, A00, i, this.A0A).sendToTarget();
            this.A0h.A05(this.A0A);
        }
    }

    private void A0I() throws IOException {
        C7A A0E = this.A0j.A0E();
        C7A readingPeriodHolder = this.A0j.A0G();
        if (A0E != null && !A0E.A02) {
            if (readingPeriodHolder != null) {
                C7A loadingPeriodHolder = readingPeriodHolder.A0I();
                if (loadingPeriodHolder != A0E) {
                    return;
                }
            }
            for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
                if (!interfaceC2151oo.A9p()) {
                    return;
                }
            }
            A0E.A07.ACS();
        }
    }

    private void A0J() throws IOException {
        this.A0j.A0L(this.A06);
        if (this.A0j.A0O()) {
            C7B A0H = this.A0j.A0H(this.A06, this.A0A);
            if (A0H == null) {
                this.A0D.ACT();
                return;
            }
            this.A0j.A0J(this.A0w, this.A0t ? 60000000L : 0L, this.A0l, this.A0i.A6v(), this.A0D, A0H, this.A0m).AH5(this, A0H.A03);
            A0y(true);
            A0v(false);
        }
    }

    private void A0K() {
        A13(true, true, true);
        this.A0i.AFc(C8O.A03);
        A0V(1);
        this.A0b.quit();
        synchronized (this) {
            this.A0S = true;
            notifyAll();
        }
    }

    private void A0L() throws AD {
        boolean z;
        if (!this.A0j.A0N()) {
            return;
        }
        float f = this.A0g.A8m().A01;
        C7A periodHolder = this.A0j.A0G();
        boolean z2 = true;
        for (C7A A0F = this.A0j.A0F(); A0F != null && A0F.A02; A0F = A0F.A0I()) {
            C0723Ex A0L = A0F.A0L(f, this.A0A.A03);
            if (A0L != null) {
                if (z2) {
                    C7A A0F2 = this.A0j.A0F();
                    boolean A0S = this.A0j.A0S(A0F2);
                    boolean[] zArr = new boolean[this.A0v.length];
                    long A0G = A0F2.A0G(A0L, this.A0A.A0C, A0S, zArr);
                    if (this.A0A.A00 != 4 && A0G != this.A0A.A0C) {
                        this.A0A = this.A0A.A06(this.A0A.A05, A0G, this.A0A.A01, A01());
                        this.A0h.A04(4);
                        A0Y(A0G);
                    }
                    int i = 0;
                    boolean[] zArr2 = new boolean[this.A0v.length];
                    for (int i2 = 0; i2 < this.A0v.length; i2++) {
                        InterfaceC2151oo interfaceC2151oo = this.A0v[i2];
                        zArr2[i2] = interfaceC2151oo.A9A() != 0;
                        DT dt = A0F2.A09[i2];
                        if (dt != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            DT A9D = interfaceC2151oo.A9D();
                            if (A0y[7].charAt(12) == '2') {
                                throw new RuntimeException();
                            }
                            A0y[1] = "PyyQ9suxdi7C";
                            if (dt != A9D) {
                                A0l(interfaceC2151oo);
                            } else if (zArr[i2]) {
                                interfaceC2151oo.AIm(this.A06);
                            }
                        }
                    }
                    this.A0A = this.A0A.A07(A0F2.A0J(), A0F2.A0K());
                    A14(zArr2, i);
                    z = false;
                } else {
                    this.A0j.A0S(A0F);
                    if (A0F.A02) {
                        z = false;
                        A0F.A0F(A0L, Math.max(A0F.A00.A03, A0F.A0D(this.A06)), false);
                    } else {
                        z = false;
                    }
                }
                A0v(true);
                if (this.A0A.A00 != 4) {
                    A0w(z);
                    A0Q();
                    this.A0f.AJA(2);
                    return;
                }
                return;
            }
            if (A0F == periodHolder) {
                z2 = false;
            }
        }
    }

    private void A0M() {
        for (int size = this.A0p.size() - 1; size >= 0; size--) {
            if (!A16(this.A0p.get(size))) {
                this.A0p.get(size).A03.A0A(false);
                this.A0p.remove(size);
            }
        }
        Collections.sort(this.A0p);
    }

    private void A0N() throws AD {
        this.A0R = false;
        this.A0g.A05();
        this.A0k.A00();
        if (this.A0u) {
            this.A0o.A00();
        }
        for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
            interfaceC2151oo.start();
        }
    }

    private void A0O() throws AD {
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
            A0m(interfaceC2151oo);
        }
    }

    private void A0Q() throws AD {
        if (!this.A0j.A0N()) {
            return;
        }
        C7A A0F = this.A0j.A0F();
        long AHQ = A0F.A07.AHQ();
        if (AHQ != C10323vs.b) {
            A0Y(AHQ);
            if (AHQ != this.A0A.A0C) {
                this.A0A = this.A0A.A06(this.A0A.A05, AHQ, this.A0A.A01, A01());
                this.A0h.A04(4);
            }
        } else {
            C2159ow c2159ow = this.A0g;
            C7A playingPeriodHolder = this.A0j.A0G();
            this.A06 = c2159ow.A04(A0F != playingPeriodHolder);
            long A0D = A0F.A0D(this.A06);
            A0Z(this.A0A.A0C, A0D);
            this.A0A.A0C = A0D;
        }
        C7A playingPeriodHolder2 = this.A0j.A0E();
        this.A0A.A0B = playingPeriodHolder2.A09();
        this.A0A.A0D = A01();
        this.A0A.A0D = A0F.A0C(this.A0A.A0C);
    }

    private void A0S(byte b) {
        C7A A0E = this.A0j.A0E();
        if (A0E != null && this.A0U) {
            A0E.A07.AKb(b);
        }
    }

    private void A0T(float f) {
        InterfaceC2054nE[] interfaceC2054nEArr;
        for (C7A A0D = this.A0j.A0D(); A0D != null && A0D.A02; A0D = A0D.A0I()) {
            for (InterfaceC2054nE interfaceC2054nE : A0D.A0K().A04) {
                if (interfaceC2054nE != null) {
                    interfaceC2054nE.AFJ(f);
                }
            }
        }
    }

    private void A0U(int i) throws AD {
        this.A03 = i;
        if (!this.A0j.A0P(this.A0A.A03, i)) {
            if (A0y[0].length() == 16) {
                throw new RuntimeException();
            }
            A0y[5] = "F0pbcDG7mrKSFF2ySsjJdp1en5xQxzay";
            A0x(true);
        }
        A0v(false);
    }

    private void A0V(int i) {
        if (this.A0A.A00 != i) {
            this.A0A = this.A0A.A01(i);
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0W(int i, boolean z) {
        if (this.A0A.A00 != i) {
            C7Z A03 = this.A0A.A03(i, z);
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            A0y[1] = "pTubBuiOOGTe";
            this.A0A = A03;
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0X(int i, boolean playing, int i2) throws AD {
        C7A A0F = this.A0j.A0F();
        InterfaceC2151oo interfaceC2151oo = this.A0v[i];
        this.A0W[i2] = interfaceC2151oo;
        if (interfaceC2151oo.A9A() == 0) {
            C7A A0G = this.A0j.A0G();
            C7A playingPeriodHolder = this.A0j.A0F();
            boolean z = A0G == playingPeriodHolder;
            C05527s c05527s = A0F.A0K().A03[i];
            C2242qI[] A1A = A1A(A0F.A0K().A04[i]);
            boolean z2 = this.A0P && this.A0A.A00 == 3;
            interfaceC2151oo.A6L(c05527s, A1A, A0F.A09[i], this.A06, !playing && z2, z, A0G.A0H(this.A0K), A0F.A0B());
            this.A0g.A09(interfaceC2151oo);
            if (z2) {
                interfaceC2151oo.start();
            }
        }
    }

    private void A0Y(long j) throws AD {
        long A0E;
        InterfaceC2151oo[] interfaceC2151ooArr;
        if (this.A0j.A0N()) {
            A0E = this.A0j.A0F().A0E(j);
        } else {
            A0E = (this.A0t ? 60000000 : 0) + j;
        }
        this.A06 = A0E;
        this.A0g.A07(this.A06);
        for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
            long j2 = this.A06;
            String[] strArr = A0y;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0y[5] = "3LWS1la82nevxXslk8B3HGv7gilut34u";
            interfaceC2151oo.AIm(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r5 >= r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r5 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (com.facebook.ads.redexgen.X.AB.A0y[7].charAt(12) == '2') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        com.facebook.ads.redexgen.X.AB.A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
        if (r5 != r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        if (r3.A01 > r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
        r0 = r7.A01;
        r7.A01 = r0 + 1;
        r1 = r7.A01;
        r0 = r7.A0p.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
        if (r1 >= r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r1 = r7.A0p;
        r0 = r7.A01;
        r3 = r1.get(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
        if (r5 >= r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0Z(long j, long j2) throws AD {
        C05196l c05196l;
        C05196l nextInfo;
        if (this.A0p.isEmpty() || this.A0A.A05.A00()) {
            return;
        }
        C7Z c7z = this.A0A;
        if (A0y[0].length() != 16) {
            String[] strArr = A0y;
            strArr[4] = "N4EB4VnnGuurJLGLQe09RRoMwim7ZTwR";
            strArr[3] = "el7QB6NOzA9v772mMpBH3ujflXdKxCpX";
            if (c7z.A02 == j) {
                j--;
            }
            int A0A = this.A0A.A03.A0A(this.A0A.A05.A04);
            int currentPeriodIndex = this.A01;
            if (currentPeriodIndex > 0) {
                ArrayList<C05196l> arrayList = this.A0p;
                int currentPeriodIndex2 = this.A01;
                int i = currentPeriodIndex2 - 1;
                if (A0y[1].length() != 31) {
                    String[] strArr2 = A0y;
                    strArr2[2] = "q3c";
                    strArr2[6] = "HlTr3zIzL5MxTNWEN";
                    c05196l = arrayList.get(i);
                }
            } else {
                c05196l = null;
            }
            while (c05196l != null) {
                if (c05196l.A00 <= A0A) {
                    if (c05196l.A00 != A0A) {
                        break;
                    }
                    int currentPeriodIndex3 = (c05196l.A01 > j ? 1 : (c05196l.A01 == j ? 0 : -1));
                    if (currentPeriodIndex3 <= 0) {
                        break;
                    }
                }
                int currentPeriodIndex4 = this.A01;
                this.A01 = currentPeriodIndex4 - 1;
                int currentPeriodIndex5 = this.A01;
                if (currentPeriodIndex5 > 0) {
                    ArrayList<C05196l> arrayList2 = this.A0p;
                    int currentPeriodIndex6 = this.A01;
                    c05196l = arrayList2.get(currentPeriodIndex6 - 1);
                } else {
                    c05196l = null;
                }
            }
            int i2 = this.A01;
            int currentPeriodIndex7 = this.A0p.size();
            if (i2 < currentPeriodIndex7) {
                ArrayList<C05196l> arrayList3 = this.A0p;
                int currentPeriodIndex8 = this.A01;
                nextInfo = arrayList3.get(currentPeriodIndex8);
            } else {
                nextInfo = null;
            }
            while (nextInfo != null && nextInfo.A02 != null) {
                int i3 = nextInfo.A00;
                if (A0y[5].charAt(1) != 'q') {
                    A0y[1] = "urcr7rEa5cce4ZESz6";
                }
            }
            while (nextInfo != null) {
                Object obj = nextInfo.A02;
                if (A0y[1].length() != 31) {
                    String[] strArr3 = A0y;
                    strArr3[2] = "ENU";
                    strArr3[6] = "SOUOSvSypycWuSHSN";
                    if (obj == null) {
                        return;
                    }
                    int currentPeriodIndex9 = nextInfo.A00;
                    if (currentPeriodIndex9 == A0A && nextInfo.A01 > j && nextInfo.A01 <= j2) {
                        A0j(nextInfo.A03);
                        if (nextInfo.A03.A0B() || nextInfo.A03.A0D()) {
                            ArrayList<C05196l> arrayList4 = this.A0p;
                            int currentPeriodIndex10 = this.A01;
                            arrayList4.remove(currentPeriodIndex10);
                        } else {
                            int currentPeriodIndex11 = this.A01;
                            this.A01 = currentPeriodIndex11 + 1;
                        }
                        int i4 = this.A01;
                        int currentPeriodIndex12 = this.A0p.size();
                        if (i4 < currentPeriodIndex12) {
                            ArrayList<C05196l> arrayList5 = this.A0p;
                            int currentPeriodIndex13 = this.A01;
                            C05196l nextInfo2 = arrayList5.get(currentPeriodIndex13);
                            nextInfo = nextInfo2;
                        } else {
                            nextInfo = null;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0a(long j, long j2) {
        this.A0f.AIT(2);
        this.A0f.AJB(2, j + j2);
    }

    private void A0b(C2221px c2221px) {
        this.A0g.AJd(c2221px);
        if (this.A0o != null) {
            this.A0o.AJd(c2221px);
        }
        if (this.A0k != null) {
            this.A0k.AJd(c2221px);
        }
    }

    private void A0c(C05176j c05176j) throws AD {
        throw new NullPointerException(A0D(376, 16, 17));
    }

    private void A0d(C05176j c05176j, boolean z) throws AD {
        this.A0h.A03(1);
        throw new NullPointerException(A0D(363, 13, 127));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r8.A00(r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r7.AAN() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r7.A9D() != r10.A09[r6]) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        A0l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r8.A00(r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(C7A c7a) throws AD {
        C7A A0F = this.A0j.A0F();
        if (A0F == null || c7a == A0F) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0v.length];
        String[] strArr = A0y;
        String str = strArr[4];
        String str2 = strArr[3];
        int enabledRendererCount = str.charAt(1);
        if (enabledRendererCount == str2.charAt(1)) {
            throw new RuntimeException();
        }
        A0y[0] = "";
        int i2 = 0;
        while (i2 < this.A0v.length) {
            InterfaceC2151oo interfaceC2151oo = this.A0v[i2];
            zArr[i2] = interfaceC2151oo.A9A() != 0;
            if (A0F.A0K().A00(i2)) {
                i++;
            }
            if (zArr[i2]) {
                C0723Ex A0K = A0F.A0K();
                int enabledRendererCount2 = A0y[5].charAt(1);
                if (enabledRendererCount2 != 113) {
                    String[] strArr2 = A0y;
                    strArr2[4] = "5yNp1I7g7IY9vjHrSpd0TTAHnxoP5q4N";
                    strArr2[3] = "spEmpaFlzQc3LcHeWE04rIrq6t30lchN";
                }
            }
            i2++;
        }
        this.A0A = this.A0A.A07(A0F.A0J(), A0F.A0K());
        A14(zArr, i);
    }

    private void A0h(C05377d c05377d) throws AD {
        if (c05377d.A0D()) {
            return;
        }
        try {
            c05377d.A05().A9i(c05377d.A01(), c05377d.A09());
        } finally {
            c05377d.A0A(true);
        }
    }

    private void A0i(C05377d c05377d) throws AD {
        if (c05377d.A02() == C10323vs.b) {
            A0j(c05377d);
        } else if (this.A0D == null || this.A02 > 0) {
            this.A0p.add(new C05196l(c05377d));
        } else {
            C05196l c05196l = new C05196l(c05377d);
            if (A16(c05196l)) {
                this.A0p.add(c05196l);
                Collections.sort(this.A0p);
                return;
            }
            c05377d.A0A(false);
        }
    }

    private void A0j(C05377d c05377d) throws AD {
        if (c05377d.A03() == this.A0f.A8R()) {
            A0h(c05377d);
            if (this.A0A.A00 == 3 || this.A0A.A00 == 2) {
                this.A0f.AJA(2);
                return;
            }
            return;
        }
        this.A0f.ACj(15, c05377d).A02();
    }

    private void A0k(final C05377d c05377d) {
        Looper A03 = c05377d.A03();
        if (!A03.getThread().isAlive()) {
            Log.w(A0D(220, 3, 37), A0D(258, 40, 7));
            c05377d.A0A(false);
            return;
        }
        this.A0e.A5P(A03, null).A03(new Runnable() { // from class: com.facebook.ads.redexgen.X.6h
            @Override // java.lang.Runnable
            public final void run() {
                AB.this.A1E(c05377d);
            }
        });
    }

    private void A0l(InterfaceC2151oo interfaceC2151oo) throws AD {
        this.A0g.A08(interfaceC2151oo);
        A0m(interfaceC2151oo);
        interfaceC2151oo.A5x();
    }

    private void A0m(InterfaceC2151oo interfaceC2151oo) throws AD {
        if (interfaceC2151oo.A9A() == 2) {
            interfaceC2151oo.stop();
        }
    }

    private void A0n(C05547u c05547u) {
        this.A0C = c05547u;
    }

    private void A0o(InterfaceC2091np interfaceC2091np) {
        if (!this.A0j.A0T(interfaceC2091np)) {
            return;
        }
        this.A0j.A0L(this.A06);
        A0w(false);
    }

    private void A0p(InterfaceC2091np interfaceC2091np) throws AD {
        byte b;
        if (!this.A0j.A0T(interfaceC2091np)) {
            return;
        }
        C7A A0E = this.A0j.A0E();
        A0E.A0N(this.A0g.A8m().A01, this.A0A.A03);
        A0s(A0E.A0J(), A0E.A0K());
        if (!this.A0j.A0N()) {
            C7A loadingPeriodHolder = this.A0j.A0B();
            A0Y(loadingPeriodHolder.A00.A03);
            A0g(null);
        }
        if (this.A0M || this.A0P) {
            b = 0;
        } else {
            b = 2;
        }
        A0S(b);
        A10(this.A0P);
        if (A0y[7].charAt(12) == '2') {
            throw new RuntimeException();
        }
        A0y[5] = "0JHOWU68jltYXS7XBlXTYuPeT3LWkLA2";
        A0w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.DW
    /* renamed from: A0q */
    public final void ADV(InterfaceC2091np interfaceC2091np) {
        this.A0f.ACj(10, interfaceC2091np).A02();
    }

    private void A0r(InterfaceC0671Cx interfaceC0671Cx, boolean z, boolean z2) {
        this.A02++;
        A13(true, z, z2);
        this.A0i.AFR(C8O.A03);
        this.A0D = interfaceC0671Cx;
        A0V(2);
        interfaceC0671Cx.AH7(this, null);
        this.A0f.AJA(2);
    }

    private void A0s(C2072nW c2072nW, C0723Ex c0723Ex) {
        this.A0i.AGF(new AnonymousClass73(C8O.A03, this.A0A.A03, this.A0A.A04, this.A0A.A0C, A01(), this.A0g.A8m().A01, this.A0P, this.A0R, C10323vs.b, this.A04), c2072nW, c0723Ex.A04);
    }

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    private void A0t(EnumC1801ir enumC1801ir, boolean z) {
        if (this.A0A.A00 != 3) {
            this.A0A = this.A0A.A02(3, enumC1801ir, z);
            this.A04 = -1L;
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D63737392: Added for negative testing")
    private void A0u(String str) {
        boolean z = false;
        if (str == null) {
            this.A0J = false;
            this.A09 = null;
            return;
        }
        if (str != null && str.length() > 0) {
            z = true;
        }
        this.A0J = z;
        this.A09 = new C7W(str);
    }

    private void A0v(boolean z) {
        C2090no c2090no;
        C7A A0E = this.A0j.A0E();
        if (A0E == null) {
            C7Z c7z = this.A0A;
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "b0w";
            strArr[6] = "WyMJg745VdMbfing6";
            c2090no = c7z.A05;
        } else {
            c2090no = A0E.A00.A04;
        }
        C2090no loadingMediaPeriodId = this.A0A.A04;
        boolean loadingMediaPeriodChanged = !loadingMediaPeriodId.equals(c2090no);
        if (loadingMediaPeriodChanged) {
            this.A0A = this.A0A.A05(c2090no);
        }
        if ((loadingMediaPeriodChanged || z) && A0E != null && A0E.A02) {
            A0s(A0E.A0J(), A0E.A0K());
        }
    }

    @MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182")
    private void A0w(boolean z) {
        long A0C;
        C7A A0E = this.A0j.A0E();
        long A0A = A0E.A0A();
        if (A0A == Long.MIN_VALUE) {
            A0y(false);
            return;
        }
        long A0D = A0E.A0D(this.A06);
        if (!this.A0s || A0E == this.A0j.A0F() || this.A0j.A0F() == null) {
            A0C = A0E.A0C(A0D);
            if (this.A0O) {
                for (C7A A0F = this.A0j.A0F(); A0F != null && A0F != A0E; A0F = A0F.A0I()) {
                    long nextLoadPositionUs = this.A06;
                    A0C += A0F.A0C(A0F.A0D(nextLoadPositionUs));
                }
            }
        } else {
            A0C = A02();
        }
        Timeline timeline = this.A0A.A03;
        C2090no c2090no = A0E.A00.A04;
        float f = this.A0g.A8m().A01;
        boolean z2 = this.A0P || z;
        boolean z3 = this.A0R;
        long nextLoadPositionUs2 = this.A04;
        boolean AJv = this.A0i.AJv(new AnonymousClass73(null, timeline, c2090no, A0D, A0C, f, z2, z3, C10323vs.b, nextLoadPositionUs2));
        if (this.A0T && this.A0P && this.A0R && !AJv && this.A0A.A00 == 2) {
            Long valueOf = Long.valueOf(A0D / 1000);
            Long valueOf2 = Long.valueOf(A0C / 1000);
            Long valueOf3 = Long.valueOf(A0A / 1000);
            String[] strArr = A0y;
            if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "Frr";
            strArr2[6] = "mfKzHFhLmxUYLc6Gx";
            this.A0a.obtainMessage(5, C5C.A0n(A0D(125, 70, 5), valueOf, valueOf2, valueOf3)).sendToTarget();
            this.A0T = false;
        }
        A0y(AJv);
        if (AJv) {
            A0E.A0O(this.A06);
        }
    }

    private void A0x(boolean z) throws AD {
        C2090no c2090no = this.A0j.A0F().A00.A04;
        long A07 = A07(false, c2090no, this.A0A.A0C, true);
        if (A07 != this.A0A.A0C) {
            this.A0A = this.A0A.A06(c2090no, A07, this.A0A.A01, A01());
            if (z) {
                C05206m c05206m = this.A0h;
                String[] strArr = A0y;
                if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                    throw new RuntimeException();
                }
                A0y[5] = "dnthUoDEzHvBWSE2tp3YAJwgKJx1FOWZ";
                c05206m.A04(4);
            }
        }
    }

    private void A0y(boolean z) {
        if (this.A0A.A0A != z) {
            this.A0A = this.A0A.A08(z);
        }
    }

    private void A0z(boolean z) throws AD {
        try {
            this.A0R = false;
            this.A0P = z;
            A10(z);
            if (!z) {
                A0O();
                A0Q();
                A0S((byte) 2);
                if (this.A0I) {
                    A0E();
                }
            } else {
                A0S((byte) 0);
                if (this.A0A.A00 != 3) {
                    if (this.A0A.A00 == 2) {
                        this.A0f.AJA(2);
                    }
                } else {
                    A0N();
                    this.A0f.AJA(2);
                }
            }
        } finally {
            this.A0a.obtainMessage(3, Boolean.valueOf(z)).sendToTarget();
        }
    }

    @MetaExoPlayerCustomization("D19875605 Prevent further error loading once pausing video")
    private void A10(boolean z) {
        C7A loadingPeriod = this.A0j.A0E();
        if (loadingPeriod == null) {
            return;
        }
        loadingPeriod.A07.AJc(z);
    }

    private void A11(boolean z) throws AD {
        this.A0V = z;
        if (!this.A0j.A0R(this.A0A.A03, z)) {
            A0x(true);
        }
        A0v(false);
    }

    private void A12(boolean z, boolean z2) {
        A13(true, z, z);
        this.A0h.A03(this.A02 + (z2 ? 1 : 0));
        this.A02 = 0;
        this.A0i.AG6(C8O.A03);
        A0V(1);
    }

    private void A13(boolean z, boolean z2, boolean z3) {
        long j;
        C2072nW c2072nW;
        C0723Ex c0723Ex;
        this.A0f.AIT(2);
        this.A0R = false;
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        this.A06 = this.A0t ? 60000000L : 0L;
        for (InterfaceC2151oo interfaceC2151oo : this.A0W) {
            try {
                A0l(interfaceC2151oo);
            } catch (AD | RuntimeException e) {
                Log.e(A0D(0, 21, 22), A0D(208, 12, 44), e);
            }
        }
        this.A0W = new InterfaceC2151oo[0];
        this.A0j.A0M(!z2);
        A0y(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            Iterator<C05196l> it = this.A0p.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0p.clear();
            this.A01 = 0;
        }
        C2090no A0A = z2 ? A0A() : this.A0A.A05;
        long j2 = C10323vs.b;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            C7Z c7z = this.A0A;
            if (A0y[5].charAt(1) != 'q') {
                String[] strArr = A0y;
                strArr[4] = "7gx390g1msf1u5QKnR2KjvR4WQmRx8YK";
                strArr[3] = "VlC7tbQkEF507tv73u1W2v85d7ApXXNM";
                j = c7z.A0C;
            } else {
                A0y[5] = "C79IK8sPJjEkg2u4SoGimfUAaE3F5yew";
                j = c7z.A0C;
            }
        }
        if (!z2) {
            C7Z c7z2 = this.A0A;
            if (A0y[5].charAt(1) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "uSR";
            strArr2[6] = "FwoZ6mA9qzJ4hrvJt";
            j2 = c7z2.A01;
        }
        Timeline timeline = z3 ? Timeline.A02 : this.A0A.A03;
        int i = this.A0A.A00;
        if (z3) {
            c2072nW = C2072nW.A06;
        } else {
            C7Z c7z3 = this.A0A;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "yizxhFEcEwEbIh7DB6ScCbr86G64zHmf";
            c2072nW = c7z3.A06;
        }
        if (z3) {
            c0723Ex = this.A0m;
        } else {
            c0723Ex = this.A0A.A07;
        }
        this.A0A = new C7Z(timeline, A0A, j, j2, i, false, c2072nW, c0723Ex, A0A, j, 0L, j);
        if (z && this.A0D != null) {
            this.A0D.AHl(this);
            this.A0D = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A14(boolean[] zArr, int i) throws AD {
        this.A0W = new InterfaceC2151oo[i];
        int enabledRendererCount = 0;
        C7A A0F = this.A0j.A0F();
        for (int i2 = 0; i2 < enabledRendererCount; i2++) {
            if (A0F.A0K().A00(i2)) {
                A0X(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A15() {
        C7A playingPeriodHolder = this.A0j.A0F();
        C7A A0I = playingPeriodHolder.A0I();
        long j = playingPeriodHolder.A00.A00;
        return j == C10323vs.b || this.A0A.A0C < j || (A0I != null && (A0I.A02 || A0I.A00.A04.A00()));
    }

    private boolean A16(C05196l c05196l) {
        if (c05196l.A02 == null) {
            Pair<Object, Long> A09 = A09(new C05216n(c05196l.A03.A04(), c05196l.A03.A00(), C2Y.A00(c05196l.A03.A02())), false);
            if (A09 == null) {
                return false;
            }
            int A0A = this.A0A.A03.A0A(A09.first);
            if (A0y[5].charAt(1) != 'q') {
                A0y[5] = "NfGCtpMsHKBVYsn3O7a8Zqq9gxyOlhFa";
                c05196l.A01(A0A, ((Long) A09.second).longValue(), A09.first);
                return true;
            }
            throw new RuntimeException();
        }
        int A0A2 = this.A0A.A03.A0A(c05196l.A02);
        if (A0A2 == -1) {
            return false;
        }
        c05196l.A00 = A0A2;
        return true;
    }

    private boolean A17(InterfaceC2151oo interfaceC2151oo) {
        C7A A0G = this.A0j.A0G();
        C7A readingPeriodHolder = A0G.A0I();
        if (readingPeriodHolder != null) {
            C7A readingPeriodHolder2 = A0G.A0I();
            if (readingPeriodHolder2.A02 && interfaceC2151oo.A9p()) {
                return true;
            }
        }
        return false;
    }

    private boolean A18(C2090no c2090no, long j, C7A c7a) {
        if (c2090no.equals(c7a.A00.A04)) {
            boolean z = c7a.A02;
            if (A0y[1].length() != 31) {
                A0y[1] = "z9";
                if (z) {
                    this.A0A.A03.A0J(this.A0A.A05.A04, this.A0c);
                    int A07 = this.A0c.A07(j);
                    if (A07 != -1) {
                        long A0D = this.A0c.A0D(A07);
                        C7B c7b = c7a.A00;
                        if (A0y[5].charAt(1) == 'q') {
                            A0y[5] = "RcBDfVPYXZ1IWswHj8kiKJAUw6BsFYM7";
                            int nextAdGroupIndex = (A0D > c7b.A01 ? 1 : (A0D == c7b.A01 ? 0 : -1));
                            if (nextAdGroupIndex == 0) {
                                return true;
                            }
                            return false;
                        }
                        String[] strArr = A0y;
                        strArr[4] = "w6QknFDGuvwfcqywG7nwGfdAAoNokq6y";
                        strArr[3] = "I5j8Ais0ITqpKL2oROmKoI7QN1W2GqI7";
                        int nextAdGroupIndex2 = (A0D > c7b.A01 ? 1 : (A0D == c7b.A01 ? 0 : -1));
                        if (nextAdGroupIndex2 == 0) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            throw new RuntimeException();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182"), @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A19(boolean z) {
        boolean z2;
        long A0C;
        if (this.A0W.length == 0) {
            return A15();
        }
        boolean z3 = false;
        if (!z) {
            if (this.A0B != null) {
                this.A0E = this.A0B.A99();
            }
            return false;
        } else if (this.A0A.A0A) {
            C7A A0E = this.A0j.A0E();
            if (A0E.A0R()) {
                C7B c7b = A0E.A00;
                if (A0y[7].charAt(12) == '2') {
                    throw new RuntimeException();
                }
                A0y[5] = "JVFQROlQoWGuZTJ8G1Kf7NjovTqMHrup";
                if (c7b.A05) {
                    z2 = true;
                    if (this.A0s || this.A0j.A0F() == this.A0j.A0E() || this.A0j.A0F() == null) {
                        A0C = A0E.A0C(A0E.A0D(this.A06));
                    } else {
                        A0C = A03();
                    }
                    z3 = (!z2 || this.A0i.AJy(A0C, this.A0g.A8m().A01, this.A0R, this.A00 <= 0 && (this.A04 > 0L ? 1 : (this.A04 == 0L ? 0 : -1)) > 0 && ((System.currentTimeMillis() - this.A04) > ((long) this.A00) ? 1 : ((System.currentTimeMillis() - this.A04) == ((long) this.A00) ? 0 : -1)) < 0, C10323vs.b)) ? true : true;
                    if (!z3) {
                        this.A0E = EnumC1801ir.A04;
                    }
                    return z3;
                }
            }
            z2 = false;
            if (this.A0s) {
            }
            A0C = A0E.A0C(A0E.A0D(this.A06));
            if (z2) {
            }
            if (!z3) {
            }
            return z3;
        } else {
            return true;
        }
    }

    public static C2242qI[] A1A(InterfaceC0716Eq interfaceC0716Eq) {
        int length = interfaceC0716Eq != null ? interfaceC0716Eq.length() : 0;
        C2242qI[] c2242qIArr = new C2242qI[length];
        for (int i = 0; i < length; i++) {
            c2242qIArr[i] = interfaceC0716Eq.A8B(i);
        }
        return c2242qIArr;
    }

    public final Looper A1B() {
        return this.A0b.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void A1C() {
        if (this.A0S) {
            return;
        }
        this.A0f.AJA(7);
        boolean z = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A1D(Timeline timeline, int i, long j) {
        this.A0f.ACj(3, new C05216n(timeline, i, j)).A02();
    }

    public final /* synthetic */ void A1E(C05377d c05377d) {
        try {
            A0h(c05377d);
        } catch (AD e) {
            Log.e(A0D(0, 21, 22), A0D(298, 55, 119), e);
            throw new RuntimeException(e);
        }
    }

    public final void A1F(InterfaceC0671Cx interfaceC0671Cx, boolean z, boolean z2) {
        this.A0f.ACi(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC0671Cx).A02();
    }

    public final void A1G(boolean z) {
        this.A0f.ACh(1, z ? 1 : 0, 0).A02();
    }

    public final void A1H(boolean z) {
        this.A0f.ACh(6, z ? 1 : 0, 0).A02();
    }

    @Override // com.facebook.ads.redexgen.X.C6P
    public final void AFI(C2221px c2221px) {
        this.A0a.obtainMessage(1, c2221px).sendToTarget();
        A0T(c2221px.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2092nq
    public final void AFS(InterfaceC2091np interfaceC2091np) {
        this.A0f.ACj(9, interfaceC2091np).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0670Cw
    public final void AG1(InterfaceC0671Cx interfaceC0671Cx, Timeline timeline) {
        this.A0f.ACj(8, new C05186k(interfaceC0671Cx, timeline)).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0721Ev
    public final void AGD() {
        this.A0f.AJA(11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05357b
    public final synchronized void AJC(C05377d c05377d) {
        if (this.A0S) {
            Log.w(A0D(0, 21, 22), A0D(50, 37, 39));
            c05377d.A0A(false);
            return;
        }
        this.A0f.ACj(14, c05377d).A02();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A0D = A0D(0, 21, 22);
        try {
            switch (message.what) {
                case 0:
                    A0r((InterfaceC0671Cx) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0z(message.arg1 != 0);
                    break;
                case 2:
                    A0F();
                    break;
                case 3:
                    A0f((C05216n) message.obj);
                    break;
                case 4:
                    A0b((C2221px) message.obj);
                    break;
                case 5:
                    A0n((C05547u) message.obj);
                    break;
                case 6:
                    A12(message.arg1 != 0, true);
                    break;
                case 7:
                    A0K();
                    return true;
                case 8:
                    A0e((C05186k) message.obj);
                    break;
                case 9:
                    A0p((InterfaceC2091np) message.obj);
                    break;
                case 10:
                    A0o((InterfaceC2091np) message.obj);
                    break;
                case 11:
                    A0L();
                    break;
                case 12:
                    A0U(message.arg1);
                    break;
                case 13:
                    A11(message.arg1 != 0);
                    break;
                case 14:
                    A0i((C05377d) message.obj);
                    break;
                case 15:
                    A0k((C05377d) message.obj);
                    break;
                case 16:
                    break;
                case 17:
                    A0d(null, false);
                    throw null;
                case 18:
                    A0c(null);
                    throw null;
                case 19:
                    A0u((String) message.obj);
                    break;
                default:
                    return false;
            }
            A0H();
        } catch (AD e) {
            Log.e(A0D, A0D(110, 15, 65), e);
            A12(false, false);
            this.A0a.obtainMessage(2, e).sendToTarget();
            A0H();
        } catch (IOException e2) {
            Log.e(A0D, A0D(195, 13, 40), e2);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A01(e2, 2000)).sendToTarget();
            A0H();
        } catch (RuntimeException e3) {
            Log.e(A0D, A0D(87, 23, 19), e3);
            A12(false, false);
            this.A0a.obtainMessage(2, AD.A02(e3)).sendToTarget();
            A0H();
        }
        return true;
    }
}

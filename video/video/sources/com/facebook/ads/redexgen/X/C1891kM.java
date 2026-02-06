package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import o.C10323vs;
import o.C10997yd1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.kM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1891kM implements MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public MM A02;
    public boolean A03;
    public final InterfaceC1897kS A04;
    public final MV A05;
    public final C0914Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
            i4++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, C3307Iz.a0, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, C8077mf.B, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, C8077mf.n, 9, 0, 1, 69, 17, 10, 69, 6, C8077mf.A, 0, 4, 17, 0, 69, 48, C3307Iz.d0, C3307Iz.V, 69, 3, C8077mf.n, 9, 0, 95, 69, 31, 56, 48, 53, 60, C4715Xk.i, 121, C3307Iz.e0, 54, 121, 58, C3307Iz.c0, 60, 56, C3307Iz.e0, 60, 121, 58, 56, 58, 49, 60, 121, C8077mf.n, C8077mf.r, C8077mf.G, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, C8077mf.r, 10, 112, 87, 95, 90, 83, 82, C8077mf.z, 66, 89, C8077mf.z, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, C8077mf.z, 85, 87, 85, 94, 83, C8077mf.z, 95, 88, 82, 95, 85, 83, 69, C8077mf.n, C8077mf.z, C3307Iz.c0, C8077mf.n, 4, 1, 8, 9, 77, C8077mf.C, 2, 77, 1, 4, C8077mf.H, C8077mf.C, 77, C8077mf.p, C8077mf.n, C8077mf.p, 5, 8, 77, 9, 4, 31, 8, C8077mf.p, C8077mf.C, 2, 31, C8077mf.x, 77, C8077mf.m, 4, 1, 8, C8077mf.H, 87, 77, 48, C8077mf.A, 31, C8077mf.D, 19, C8077mf.u, 86, 2, C8077mf.C, 86, 4, 19, C8077mf.E, C8077mf.C, 0, 19, 86, C8077mf.r, 31, C8077mf.D, 19, 86, 31, C8077mf.B, C8077mf.u, 19, C8077mf.p, 86, 19, C8077mf.B, 2, 4, C8077mf.q, 86, C8077mf.r, C8077mf.C, 4, 76, 86, 56, C8077mf.x, C8077mf.C, 19, C8077mf.D, 7, C8077mf.B, C8077mf.r, 17, 85, 32, 60, 49, 85, 19, 28, C8077mf.C, C8077mf.r, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, C8077mf.u, 91, 92, 86, 87, 74, C8077mf.u, 84, 91, 94, 87, C8077mf.u, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0G(File file, boolean z, File[] fileArr, Map<String, MU> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else {
                    if (z) {
                        boolean A0A = C0914Mi.A0A(name);
                        if (A0C[0].length() != 2) {
                            String[] strArr2 = A0C;
                            strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                            strArr2[4] = "SAWP83LvD";
                            if (!A0A) {
                                if (name.endsWith(A04(0, 4, 107))) {
                                }
                            }
                        }
                    }
                    long j = -1;
                    long j2 = C10323vs.b;
                    MU remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j = remove.A01;
                        j2 = remove.A00;
                    }
                    C1890kL A01 = C1890kL.A01(file2, j, j2, this.A06);
                    if (A01 != null) {
                        A0C(A01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<MZ> A0I(String str) {
        C0912Mg A0C2;
        AbstractC04543y.A08(!this.A03);
        A0C2 = this.A06.A0C(str);
        return (A0C2 == null || A0C2.A09()) ? new TreeSet() : new TreeSet((Collection) A0C2.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized long A7B(String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long A7C = A7C(str, j4, j5 - j4);
                if (A7C > 0) {
                    j3 += A7C;
                } else {
                    A7C = -A7C;
                }
                j4 += A7C;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C1891kM(File file, InterfaceC1897kS interfaceC1897kS) {
        this(file, interfaceC1897kS, (byte[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1891kM(File file, InterfaceC1897kS interfaceC1897kS, C5O c5o, byte[] bArr, boolean z, boolean z2) {
        this(file, interfaceC1897kS, r1, r0);
        MV mv;
        C0914Mi c0914Mi = new C0914Mi(c5o, file, bArr, z, z2);
        if (c5o != null && !z2) {
            mv = new MV(c5o);
        } else {
            mv = null;
        }
    }

    public C1891kM(File file, InterfaceC1897kS interfaceC1897kS, C0914Mi c0914Mi, MV mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC1897kS;
            this.A06 = c0914Mi;
            this.A05 = mv;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC1897kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C0921Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C1891kM(File file, InterfaceC1897kS interfaceC1897kS, byte[] bArr, boolean z) {
        this(file, interfaceC1897kS, null, bArr, z, true);
    }

    public static long A00(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC04624g.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C1890kL A03(String str, long j, long j2) {
        C1890kL A04;
        C0912Mg A0C2 = this.A06.A0C(str);
        if (A0C2 == null) {
            return C1890kL.A04(str, j, j2);
        }
        while (true) {
            A04 = A0C2.A04(j, j2);
            if (!A04.A05 || A04.A03.length() == A04.A01) {
                break;
            }
            A06();
        }
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (MM e) {
                this.A02 = e;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] listFiles = file.listFiles();
        String A04 = A04(297, 11, 30);
        if (listFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC04624g.A05(A04, str);
            this.A02 = new MM(str);
            return;
        }
        this.A01 = A02(listFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e2) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC04624g.A08(A04, str2, e2);
                this.A02 = new MM(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, MU> A05 = this.A05.A05();
                A0G(this.A07, true, listFiles, A05);
                this.A05.A09(A05.keySet());
            } else {
                A0G(this.A07, true, listFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e3) {
                AbstractC04624g.A08(A04, A04(308, 25, 25), e3);
            }
        } catch (IOException e4) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC04624g.A08(A04, str3, e4);
            this.A02 = new MM(str3, e4);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        for (C0912Mg c0912Mg : this.A06.A0G()) {
            Iterator<C1890kL> it = c0912Mg.A06().iterator();
            while (it.hasNext()) {
                C1890kL next = it.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i2 = str.charAt(29);
            if (i2 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((MZ) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(mz.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG3(this, mz);
            }
        }
        this.A04.AG3(this, mz);
    }

    private void A0A(MZ mz) {
        C0912Mg A0C2 = this.A06.A0C(mz.A04);
        if (A0C2 == null || !A0C2.A0D(mz)) {
            return;
        }
        this.A00 -= mz.A01;
        if (this.A05 != null) {
            String name = mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC04624g.A07(A04(297, 11, 30), A04(C10997yd1.u1, 39, 93) + name);
            }
        }
        this.A06.A0K(A0C2.A02);
        A09(mz);
    }

    private void A0C(C1890kL c1890kL) {
        this.A06.A0D(c1890kL.A04).A08(c1890kL);
        this.A00 += c1890kL.A01;
        A0D(c1890kL);
    }

    private void A0D(C1890kL c1890kL) {
        ArrayList<MO> arrayList = this.A08.get(c1890kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MO mo = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                mo.AG2(this, c1890kL);
            }
        }
        this.A04.AG2(this, c1890kL);
    }

    private void A0E(C1890kL c1890kL, MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(c1890kL.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG4(this, c1890kL, mz);
            }
        }
        this.A04.AG4(this, c1890kL, mz);
    }

    public static void A0F(File file) throws MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AbstractC04624g.A05(message, str);
        throw new MM(str);
    }

    public static synchronized boolean A0H(File file) {
        boolean add;
        synchronized (C1891kM.class) {
            add = A0D.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized void A4E(String str, C0917Ml c0917Ml) throws MM {
        AbstractC04543y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c0917Ml);
        try {
            this.A06.A0I();
        } catch (IOException e) {
            throw new MM(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized void A55(File file, long j) throws MM {
        AbstractC04543y.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C1890kL c1890kL = (C1890kL) AbstractC04543y.A01(C1890kL.A02(file, j, this.A06));
            C0912Mg c0912Mg = (C0912Mg) AbstractC04543y.A01(this.A06.A0C(c1890kL.A04));
            AbstractC04543y.A08(c0912Mg.A0B(c1890kL.A02, c1890kL.A01));
            long A00 = AbstractC0915Mj.A00(c0912Mg.A03());
            if (A00 != -1) {
                AbstractC04543y.A08(c1890kL.A02 + c1890kL.A01 <= A00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c1890kL.A01, c1890kL.A00);
                } catch (IOException e) {
                    throw new MM(e);
                }
            }
            A0C(c1890kL);
            try {
                this.A06.A0I();
                notifyAll();
            } catch (IOException e2) {
                throw new MM(e2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized long A7A() {
        AbstractC04543y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j, long j2) {
        C0912Mg cachedContent;
        AbstractC04543y.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized InterfaceC0916Mk A7S(String str) {
        AbstractC04543y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized void AHg(MZ mz) {
        AbstractC04543y.A08(!this.A03);
        C0912Mg c0912Mg = (C0912Mg) AbstractC04543y.A01(this.A06.A0C(mz.A04));
        c0912Mg.A07(mz.A02);
        this.A06.A0K(c0912Mg.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized void AIU(String str) {
        AbstractC04543y.A08(!this.A03);
        for (MZ mz : A0I(str)) {
            A0A(mz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized void AIV(MZ mz) {
        AbstractC04543y.A08(!this.A03);
        A0A(mz);
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j) throws MM {
        C0912Mg A0C2;
        File file;
        AbstractC04543y.A08(!this.A03);
        A08();
        A0C2 = this.A06.A0C(str);
        AbstractC04543y.A01(A0C2);
        AbstractC04543y.A08(A0C2.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C1890kL.A05(file, A0C2.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized MZ AKA(String str, long j, long j2, MN mn) throws InterruptedException, MM {
        MZ span;
        AbstractC04543y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j, j2, mn);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.X.MP
    public final synchronized C1890kL AKB(String str, long j, long j2, MN mn) throws MM {
        AbstractC04543y.A08(!this.A03);
        A08();
        C1890kL A03 = A03(str, j, j2);
        if (A03.A05) {
            C1890kL span = this.A06.A0C(str).A05(A03, A03.A00, false);
            A0E(A03, span);
            return span;
        } else if (this.A06.A0D(str).A0C(j, A03.A01)) {
            return A03;
        } else {
            return null;
        }
    }
}

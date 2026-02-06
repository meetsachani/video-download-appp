package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import o.C10997yd1;
import o.C2638Cg0;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.Uj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1117Uj implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"eAEkEYRVeXrfS58a4k5WuKPwy8inSFa", "kCWvHOIytqFj1LqyoQQyp7", "68j8lTajfoiD43mqP1eMjl4G9M", "TuTeUuVTuzlBunCet0oFaCexHHLwVmnb", "nTNwkbliDK7ulO", "oDpWF45gCEuTtB4s", "WYN7gIj7AgnNZEOK", "71vjkKoJ6BpaE0wznNMgre6CgC3xNcNz"};
    public final UZ A01;
    public final Deque<C1116Ui> A02 = new LinkedList();
    public boolean A00 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-37, 7, 13, 4, -4, -72, 6, 7, C8077mf.n, -72, -7, -4, -4, -72, 10, -3, -5, 7, 10, -4, -72, C8077mf.n, 7, -72, 6, -3, C8077mf.q, 4, 17, -72, -7, -4, -4, -3, -4, -72, -2, 1, 4, -3, C8077mf.H, 57, 65, 68, C4715Xk.i, 60, -8, 76, 71, -8, 60, C4715Xk.i, 68, C4715Xk.i, 76, C4715Xk.i, -8, 62, 65, 68, C4715Xk.i, -8, -1, -3, 75, -1, -73, -46, C2638Cg0.B7, -35, -42, -43, -111, -27, -32, -111, -35, C2638Cg0.B7, -28, -27, -111, -41, C2638Cg0.B7, -35, -42, -43, -111, C2638Cg0.B7, -33, -111, -43, C2638Cg0.B7, -29, -42, -44, -27, -32, -29, -22, -111, -104, -106, -28, -104, C2638Cg0.C7, -4, 4, 7, 0, -1, -69, C8077mf.q, 10, -69, 7, 10, -4, -1, -69, 1, 4, 7, 0, -69, C2638Cg0.q7, C2638Cg0.o7, C8077mf.p, C2638Cg0.q7, C2638Cg0.u7, -69, C8077mf.p, 6, 4, C8077mf.m, C8077mf.m, 4, 9, 2, -69, -4, 7, 7, -69, C8077mf.m, 13, 0, 17, 4, 10, C8077mf.r, C8077mf.p, -69, 1, 4, 7, 0, C8077mf.p, -69, C8077mf.r, 9, C8077mf.q, 4, 7, -69, C2638Cg0.o7, -1, -37, -4, -5, -70, -16, -4, -5, 1, -10, -12, 2, -4, 2, 0, -83, -5, -18, -6, -14, -15, -83, -13, -10, -7, -14, -83, -10, -5, -83, -7, -4, -12, -12, -10, -5, -12, -83, -15, -10, -1, -14, -16, 1, -4, -1, 6, C2638Cg0.u7, -83, -78, -15, -71, -83, -6, -10, -5, -83, -10, 0, -83, -78, -15, -43, -24, -26, -14, -11, -25, C2638Cg0.v7, -20, -17, -24, -42, -24, -12, -8, -24, -15, -26, -24, -93, -28, -17, -11, -24, -28, -25, -4, -93, -26, -17, -14, -10, -24, -25, 47, 72, 69, 72, 73, 81, 72, -6, 64, 67, 70, ED2.a, -6, 67, 72, -6, 70, 73, 65, 65, 67, 72, 65, -6, 62, 67, 76, ED2.a, C4715Xk.i, 78, 73, 76, 83, C8077mf.x, -6, 1, -1, 77, 1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized int A09() throws IOException {
        int i;
        if (this.A00) {
            throw new IOException(A02(227, 33, 31));
        }
        i = 0;
        for (C1116Ui c1116Ui : this.A02) {
            i += c1116Ui.A01();
        }
        return i;
    }

    static {
        A03();
    }

    public C1117Uj(UZ uz, InterfaceC1115Uh interfaceC1115Uh) throws IOException {
        this.A01 = uz;
        A05(uz, interfaceC1115Uh);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private C1116Ui A00() throws IOException {
        int i = -1;
        if (!this.A02.isEmpty()) {
            i = this.A02.getLast().A00();
        }
        int i2 = i + 1;
        this.A02.add(new C1116Ui(i2, new C1113Uf(new File(this.A01.A05(), A01(i2)))));
        return this.A02.getLast();
    }

    public static String A01(int i) {
        return Integer.toString(i);
    }

    private void A04(int i, File file) throws IOException {
        C1113Uf c1113Uf = new C1113Uf(file);
        c1113Uf.A05();
        this.A02.addFirst(new C1116Ui(i, c1113Uf));
    }

    private void A05(UZ uz, InterfaceC1115Uh interfaceC1115Uh) throws IOException {
        File[] listFiles = uz.A05().listFiles();
        if (listFiles != null) {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            int i = -1;
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    hashMap.put(Integer.valueOf(parseInt), file);
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    interfaceC1115Uh.AIc(String.format(Locale.US, A02(260, 39, 118), file.getCanonicalPath()));
                }
            }
            boolean isEmpty = hashMap.isEmpty();
            if (A04[0].length() != 31) {
                throw new RuntimeException();
            }
            A04[7] = "dQtFqGLzpKOzaVLFdcsStellVtbbzgLH";
            if (!isEmpty) {
                int i2 = i;
                while (hashMap.containsKey(Integer.valueOf(i2 - 1))) {
                    i2--;
                }
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue < i2) {
                        interfaceC1115Uh.AIc(String.format(Locale.US, A02(C10997yd1.t1, 61, 41), Integer.valueOf(intValue), Integer.valueOf(i2)));
                        hashSet.add((File) hashMap.remove(Integer.valueOf(intValue)));
                    }
                }
                while (i >= i2) {
                    File file2 = (File) hashMap.get(Integer.valueOf(i));
                    try {
                        A04(i, file2);
                        hashMap.remove(Integer.valueOf(i));
                        i--;
                    } catch (IOException e) {
                        interfaceC1115Uh.AId(String.format(Locale.US, A02(104, 62, 55), file2.getCanonicalPath(), Integer.valueOf(i)), e);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (Object obj : hashSet) {
                String[] strArr = A04;
                if (strArr[2].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A04[4] = "c1qN9eBQiEQB2i";
                File file3 = (File) obj;
                if (!file3.delete()) {
                    Locale locale = Locale.US;
                    String canonicalPath = file3.getCanonicalPath();
                    Object[] objArr = new Object[1];
                    if (A04[7].charAt(19) != 'm') {
                        A04[7] = "thOmxL8vB3eH9n9jjORGQQ6LKF6RMw2U";
                        objArr[0] = canonicalPath;
                        interfaceC1115Uh.AIc(String.format(locale, A02(40, 26, 116), objArr));
                    } else {
                        A04[7] = "xgRJlHLuW2qx7z7dN03x9GIdgxBOKXSD";
                        objArr[0] = canonicalPath;
                        interfaceC1115Uh.AIc(String.format(locale, A02(38, 20, 82), objArr));
                    }
                }
            }
            return;
        }
        IOException e2 = new IOException(String.format(Locale.US, A02(66, 38, 13), uz.A05().getCanonicalPath()));
        throw e2;
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(227, 33, 31));
        }
        return this.A02.size();
    }

    public final synchronized UX A0A(int i, int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        if (!this.A00) {
            for (C1116Ui file : this.A02) {
                if (file.A00() == i) {
                    return new UX(i, file.A02(i2, bArr, i3, iArr, i4));
                }
            }
            return new UX(-1, new UW(UV.A05, -1, -1, 0));
        }
        throw new IOException(A02(227, 33, 31));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            for (C1116Ui c1116Ui : this.A02) {
                c1116Ui.A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(227, 33, 31));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 52));
            }
        } else {
            throw new IOException(A02(227, 33, 31));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() > 1) {
                this.A02.removeFirst();
                this.A02.getFirst().A04();
                return true;
            }
            return false;
        }
        throw new IOException(A02(227, 33, 31));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        for (C1116Ui c1116Ui : this.A02) {
            c1116Ui.A03();
        }
    }
}

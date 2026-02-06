package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ApicFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.GeobFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.PrivFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.C3307Iz;
import o.C3503Kz;
import o.C7193j50;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.9U  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9U extends AbstractC2014mZ {
    public static byte[] A01;
    public static String[] A02 = {"dfkl9gE5OREu5AXL5lY0ohuUUe3SXBJr", "hKeIXQ7stisHjmNWZz70dNldldiAaQvi", "Ev47ZYJBP4qmoN0JeJrCKxe3cHeEd2Mz", "un9uiXmeOTgIIo", "Wd16eevQjbu9Ian59LTBbcV1NeBW6y6R", "QoAdFFIsNXY7HGA7Qc965AL0CxX7pFDa", "35FvwnlVw7oPAj", "U3kKyqEMJJ2afey5JgaPdqN5tYmvQhts"};
    public static final IE A03;
    public final IE A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ApicFrame A04(C04774v c04774v, int i, int i2) {
        int A022;
        String A012;
        int A0I = c04774v.A0I();
        Charset A0M = A0M(A0I);
        byte[] bArr = new byte[i - 1];
        c04774v.A0k(bArr, 0, i - 1);
        String A0J = A0J(402, 6, 90);
        if (i2 == 2) {
            A022 = 2;
            A012 = A0J + AbstractC1877k7.A01(new String(bArr, 0, 3, AbstractC1879k9.A00));
            if (A0J(418, 9, 47).equals(A012)) {
                A012 = A0J(408, 10, 122);
            }
        } else {
            A022 = A02(bArr, 0);
            A012 = AbstractC1877k7.A01(new String(bArr, 0, A022, AbstractC1879k9.A00));
            if (A012.indexOf(47) == -1) {
                A012 = A0J + A012;
            }
        }
        int i3 = bArr[A022 + 1] & 255;
        int i4 = A022 + 2;
        int A032 = A03(bArr, i4, A0I);
        return new ApicFrame(A012, new String(bArr, i4, A032 - i4, A0M), i3, A0Q(bArr, A00(A0I) + A032, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(C04774v c04774v, int i, int i2, boolean z, int i3, IE ie) {
        int A09 = c04774v.A09();
        int A022 = A02(c04774v.A0l(), A09);
        String str = new String(c04774v.A0l(), A09, A022 - A09, AbstractC1879k9.A00);
        c04774v.A0f(A022 + 1);
        int A0C = c04774v.A0C();
        int A0C2 = c04774v.A0C();
        long A0Q = c04774v.A0Q();
        if (A0Q == 4294967295L) {
            A0Q = -1;
        }
        long A0Q2 = c04774v.A0Q();
        if (A0Q2 == 4294967295L) {
            A0Q2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A09 + i;
        while (true) {
            int A092 = c04774v.A09();
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "yxJytYiELIVuKxluLLGjsQCljTQ6t8ax";
            strArr[0] = "riKuEgzQ5i9bwl4lr9MCLXtR5zTvU4EY";
            if (A092 >= i4) {
                return new ChapterFrame(str, A0C, A0C2, A0Q, A0Q2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
            }
            Id3Frame A0B = A0B(i2, c04774v, z, i3, ie);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static GeobFrame A09(C04774v c04774v, int i) {
        int A0I = c04774v.A0I();
        Charset A0M = A0M(A0I);
        byte[] bArr = new byte[i - 1];
        c04774v.A0k(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, AbstractC1879k9.A00);
        int i2 = A022 + 1;
        int A032 = A03(bArr, i2, A0I);
        String A0L = A0L(bArr, i2, A032, A0M);
        int A00 = A00(A0I) + A032;
        int A033 = A03(bArr, A00, A0I);
        return new GeobFrame(str, A0L, A0L(bArr, A00, A033, A0M), A0Q(bArr, A00(A0I) + A033, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static MlltFrame A0C(C04774v c04774v, int i) {
        int A0M = c04774v.A0M();
        int A0K = c04774v.A0K();
        int A0K2 = c04774v.A0K();
        int A0I = c04774v.A0I();
        int A0I2 = c04774v.A0I();
        C04764u c04764u = new C04764u();
        c04764u.A0C(c04774v);
        int i2 = ((i - 10) * 8) / (A0I + A0I2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int A04 = c04764u.A04(A0I);
            int A042 = c04764u.A04(A0I2);
            iArr[i3] = A04;
            iArr2[i3] = A042;
            if (A02[5].charAt(22) == 'F') {
                throw new RuntimeException();
            }
            A02[4] = "fcLz7frwMRu6ITyb";
        }
        return new MlltFrame(A0M, A0K, A0K2, iArr, iArr2);
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A01 = new byte[]{C8077mf.D, C8077mf.q, 9, 103, 109, C3307Iz.c0, 109, C3307Iz.c0, 109, C3307Iz.c0, C3307Iz.a0, 111, C3307Iz.a0, 111, C3307Iz.a0, 111, C3307Iz.a0, 111, 6, 10, 76, 88, 75, 71, 79, 121, 67, 80, 79, C8077mf.A, C3307Iz.X, 0, C8077mf.y, 0, 65, C8077mf.y, C8077mf.p, C8077mf.p, 65, C8077mf.u, 9, C8077mf.p, 19, C8077mf.y, 65, C8077mf.y, C8077mf.p, 65, 3, 4, 65, 0, C8077mf.q, 65, 40, C3307Iz.X, 82, 65, C8077mf.y, 0, 6, 76, 107, 99, 102, 111, 110, 42, 126, 101, 42, 110, 111, 105, 101, 110, 111, 42, 108, QC1.w, 107, 103, 111, 48, 42, 99, 110, 55, 114, 85, 93, 88, 81, 80, C8077mf.x, 64, 91, C8077mf.x, 66, 85, 88, 93, 80, 85, 64, 81, C8077mf.x, 125, 112, 7, C8077mf.x, 64, 85, 83, C8077mf.x, 67, 93, 64, 92, C8077mf.x, 89, 85, 94, 91, 70, 98, 81, 70, 71, 93, 91, 90, 9, C3307Iz.Z, 19, 0, C8077mf.n, 4, 65, C8077mf.u, 8, C8077mf.E, 4, 65, 4, C8077mf.C, 2, 4, 4, 5, C8077mf.u, 65, 19, 4, C8077mf.n, 0, 8, C8077mf.q, 8, C8077mf.q, 6, 65, C8077mf.y, 0, 6, 65, 5, 0, C8077mf.y, 0, 74, 103, 48, 71, 102, 96, 108, 103, 102, 113, 85, 109, 111, 118, 118, 99, 98, C3307Iz.Y, 79, 66, 53, C3307Iz.Y, 114, 103, 97, C3307Iz.Y, 113, 111, 114, 110, C3307Iz.Y, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 52, C3307Iz.Y, 103, 104, 98, C3307Iz.Y, 115, 104, 98, 99, 96, 111, 104, 99, 98, C3307Iz.Y, 101, 105, 107, 118, 116, 99, 117, 117, 111, 105, 104, C3307Iz.Y, 117, 101, 110, 99, 107, 99, 104, 80, 82, 75, 75, 94, 95, C8077mf.E, 114, Byte.MAX_VALUE, 8, C8077mf.E, 79, 90, 92, C8077mf.E, 76, 82, 79, 83, C8077mf.E, 78, 85, 72, 78, 75, 75, 84, 73, 79, 94, 95, C8077mf.E, 86, 90, 81, 84, 73, 109, 94, 73, 72, 82, 84, 85, 6, 42, C8077mf.u, C8077mf.r, 9, 9, C8077mf.r, C8077mf.A, C8077mf.H, 89, C8077mf.n, C8077mf.A, 10, C8077mf.n, 9, 9, C8077mf.z, C8077mf.m, 13, 28, C8077mf.G, 89, C8077mf.D, C8077mf.z, C8077mf.x, 9, C8077mf.m, 28, 10, 10, 28, C8077mf.G, 89, C8077mf.z, C8077mf.m, 89, 28, C8077mf.A, C8077mf.D, C8077mf.m, 0, 9, 13, 28, C8077mf.G, 89, 31, C8077mf.m, C8077mf.B, C8077mf.x, 28, 62, 50, 50, 50, 119, 76, 71, 90, 82, 71, 65, 86, 71, 70, 2, 68, 75, 80, 81, 86, 2, 86, 74, 80, 71, 71, 2, 64, 91, 86, 71, 81, 2, 77, 68, 2, 107, 102, 17, 2, 86, 67, 69, 2, 74, 71, 67, 70, 71, 80, C8077mf.B, 2, C8077mf.u, 90, 121, 118, 118, 118, 62, 58, 54, 48, 50, QC1.w, C8077mf.H, C8077mf.D, C8077mf.z, C8077mf.r, C8077mf.u, 88, C8077mf.G, 7, C8077mf.u, C8077mf.r, 75, 79, 67, 69, 71, 13, 72, 82, 69};
    }

    static {
        A0N();
        A03 = new IE() { // from class: com.facebook.ads.redexgen.X.mT
            @Override // com.facebook.ads.redexgen.X.IE
            public final boolean A6Q(int i, int i2, int i3, int i4, int i5) {
                return C9U.A0O(i, i2, i3, i4, i5);
            }
        };
    }

    public C9U() {
        this(null);
    }

    public C9U(IE ie) {
        this.A00 = ie;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(C04774v c04774v, int i) {
        byte[] A0l = c04774v.A0l();
        int A09 = c04774v.A09();
        int i2 = A09;
        while (startPosition < A09 + i) {
            int startPosition = A0l[i2];
            if ((startPosition & 255) == 255 && A0l[i2 + 1] == 0) {
                int i3 = i2 + 2;
                int i4 = i2 + 1;
                int relativePosition = (i - (i2 - A09)) - 2;
                String[] strArr = A02;
                String str = strArr[1];
                String str2 = strArr[7];
                int startPosition2 = str.charAt(20);
                if (startPosition2 != str2.charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "XZV6e8MYnWgHLOD3ZLXsdTcFpPsY6V3F";
                strArr2[7] = "PRKMokf209xLCZShYH0Zduqvqdx50TVA";
                System.arraycopy(A0l, i3, A0l, i4, relativePosition);
                i--;
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A02(byte[] bArr, int i) {
        while (i < i) {
            int i2 = bArr[i];
            if (i2 == 0) {
                return i;
            }
            i++;
        }
        int i3 = bArr.length;
        return i3;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(byte[] bArr, int i, int i2) {
        int A022 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return A022;
        }
        while (A022 < terminationPos - 1) {
            int terminationPos = A022 - i;
            if (terminationPos % 2 == 0) {
                int terminationPos2 = A022 + 1;
                if (bArr[terminationPos2] == 0) {
                    return A022;
                }
            }
            int terminationPos3 = A022 + 1;
            A022 = A02(bArr, terminationPos3);
        }
        int terminationPos4 = bArr.length;
        return terminationPos4;
    }

    public static BinaryFrame A05(C04774v c04774v, int i, String str) {
        byte[] bArr = new byte[i];
        c04774v.A0k(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C04774v c04774v, int i, int i2, boolean z, int elementIdEndIndex, IE ie) {
        int A09 = c04774v.A09();
        int A022 = A02(c04774v.A0l(), A09);
        String str = new String(c04774v.A0l(), A09, A022 - A09, AbstractC1879k9.A00);
        c04774v.A0f(A022 + 1);
        int framePosition = c04774v.A0I();
        boolean z2 = (framePosition & 2) != 0;
        boolean z3 = (framePosition & 1) != 0;
        int A0I = c04774v.A0I();
        String[] strArr = new String[A0I];
        for (int i3 = 0; i3 < A0I; i3++) {
            int startIndex = c04774v.A09();
            int A023 = A02(c04774v.A0l(), startIndex);
            int elementIdEndIndex2 = A023 - startIndex;
            strArr[i3] = new String(c04774v.A0l(), startIndex, elementIdEndIndex2, AbstractC1879k9.A00);
            c04774v.A0f(A023 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A09 + i;
        while (c04774v.A09() < i4) {
            Id3Frame A0B = A0B(i2, c04774v, z, elementIdEndIndex, ie);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame A08(C04774v c04774v, int i) {
        if (i < 4) {
            return null;
        }
        int textStartIndex = c04774v.A0I();
        Charset A0M = A0M(textStartIndex);
        byte[] bArr = new byte[3];
        c04774v.A0k(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        c04774v.A0k(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0M);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        return new CommentFrame(description, language, A0L(data, A00, encoding4, A0M));
    }

    public static IF A0A(C04774v c04774v) {
        int A0K;
        int A07 = c04774v.A07();
        String A0J = A0J(C7193j50.f, 10, 14);
        if (A07 < 10) {
            AbstractC04624g.A07(A0J, A0J(30, 31, 108));
            return null;
        }
        boolean z = false;
        if (c04774v.A0K() != 4801587) {
            AbstractC04624g.A07(A0J, A0J(348, 50, 47) + String.format(A0J(0, 4, 50), Integer.valueOf(A0K)));
            return null;
        }
        int A0I = c04774v.A0I();
        c04774v.A0g(1);
        int flags = c04774v.A0I();
        int A0H = c04774v.A0H();
        if (A0I == 2) {
            int id = flags & 64;
            int id2 = id != 0 ? 1 : 0;
            if (id2 != 0) {
                AbstractC04624g.A07(A0J, A0J(180, 68, 11));
                return null;
            }
        } else if (A0I == 3) {
            int id3 = flags & 64;
            int id4 = id3 != 0 ? 1 : 0;
            if (id4 != 0) {
                int id5 = c04774v.A0C();
                c04774v.A0g(id5);
                A0H -= id5 + 4;
            }
        } else if (A0I == 4) {
            int id6 = flags & 64;
            int id7 = id6 != 0 ? 1 : 0;
            if (id7 != 0) {
                int majorVersion = c04774v.A0H();
                int id8 = majorVersion - 4;
                c04774v.A0g(id8);
                A0H -= majorVersion;
            }
            int id9 = flags & 16;
            int id10 = id9 != 0 ? 1 : 0;
            if (id10 != 0) {
                A0H -= 10;
            }
        } else {
            AbstractC04624g.A07(A0J, A0J(248, 46, 54) + A0I);
            return null;
        }
        if (A0I < 4) {
            int id11 = flags & 128;
            if (id11 != 0) {
                z = true;
            }
        }
        return new IF(A0I, z, A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d9, code lost:
        if (r8 == 67) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
        if (r4 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0124, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r4 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame A0B(int frameId3, C04774v c04774v, boolean z, int i, IE ie) {
        int i2;
        int A0K;
        int i3;
        Id3Frame A07;
        int frameId2 = c04774v.A0I();
        int frameId1 = c04774v.A0I();
        int frameId0 = c04774v.A0I();
        if (frameId3 >= 3) {
            i2 = c04774v.A0I();
        } else {
            i2 = 0;
        }
        if (frameId3 == 4) {
            int A0L = c04774v.A0L();
            if (!z) {
                int frameSize = A0L >> 8;
                int i4 = (A0L & 255) | ((frameSize & 255) << 7);
                int frameSize2 = A0L >> 16;
                int i5 = i4 | ((frameSize2 & 255) << 14);
                int frameSize3 = A0L >> 24;
                A0K = i5 | ((frameSize3 & 255) << 21);
            } else {
                A0K = A0L;
            }
        } else if (frameId3 == 3) {
            A0K = c04774v.A0L();
        } else {
            A0K = c04774v.A0K();
        }
        if (frameId3 >= 3) {
            i3 = c04774v.A0M();
        } else {
            i3 = 0;
        }
        if (frameId2 == 0 && frameId1 == 0 && frameId0 == 0 && i2 == 0 && A0K == 0 && i3 == 0) {
            c04774v.A0f(c04774v.A0A());
            return null;
        }
        int flags = c04774v.A09() + A0K;
        int A0A = c04774v.A0A();
        String A0J = A0J(C7193j50.f, 10, 14);
        if (flags > A0A) {
            AbstractC04624g.A07(A0J, A0J(C3503Kz.W, 37, 108));
            c04774v.A0f(c04774v.A0A());
            return null;
        } else if (ie != null && !ie.A6Q(frameId3, frameId2, frameId1, frameId0, i2)) {
            c04774v.A0f(flags);
            String[] strArr = A02;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A02[4] = "e3YBkKHUVMVtsvvPrHCe6nHMIy";
            return null;
        } else {
            boolean nextFramePosition = false;
            boolean hasDataLength = false;
            boolean isEncrypted = false;
            boolean isCompressed = false;
            int frameSize4 = 0;
            if (frameId3 == 3) {
                isCompressed = (i3 & 128) != 0;
                hasDataLength = (i3 & 64) != 0;
                frameSize4 = (i3 & 32) != 0 ? 1 : 0;
                nextFramePosition = isCompressed;
            } else if (frameId3 == 4) {
                frameSize4 = (i3 & 64) != 0 ? 1 : 0;
                nextFramePosition = (i3 & 8) != 0;
                int i6 = i3 & 4;
                String[] strArr2 = A02;
                if (strArr2[6].length() != strArr2[3].length()) {
                    A02[5] = "YrGhE76fNDxr3LSniMVr4VzIG8CV74Mf";
                } else {
                    A02[5] = "eLbk71BgL0f2DKr72Qx6greuw57xH3Wk";
                }
                isEncrypted = (i3 & 2) != 0;
                isCompressed = (i3 & 1) != 0;
            }
            if (nextFramePosition || hasDataLength) {
                AbstractC04624g.A07(A0J, A0J(294, 50, 116));
                return null;
            }
            if (frameSize4 != 0) {
                A0K--;
                c04774v.A0g(1);
            }
            if (isCompressed) {
                A0K -= 4;
                c04774v.A0g(4);
            }
            if (isEncrypted) {
                A0K = A01(c04774v, A0K);
            }
            try {
                if (frameId2 == 84 && frameId1 == 88 && frameId0 == 88 && (frameId3 == 2 || i2 == 88)) {
                    A07 = A0E(c04774v, A0K);
                } else if (frameId2 == 84) {
                    A07 = A0F(c04774v, A0K, A0K(frameId3, frameId2, frameId1, frameId0, i2));
                } else if (frameId2 == 87 && frameId1 == 88 && frameId0 == 88 && (frameId3 == 2 || i2 == 88)) {
                    A07 = A0G(c04774v, A0K);
                } else if (frameId2 == 87) {
                    A07 = A0H(c04774v, A0K, A0K(frameId3, frameId2, frameId1, frameId0, i2));
                } else if (frameId2 == 80 && frameId1 == 82 && frameId0 == 73 && i2 == 86) {
                    A07 = A0D(c04774v, A0K);
                } else if (frameId2 == 71 && frameId1 == 69 && frameId0 == 79 && (i2 == 66 || frameId3 == 2)) {
                    A07 = A09(c04774v, A0K);
                } else if (frameId3 != 2) {
                    if (frameId2 == 65) {
                        if (frameId1 == 80) {
                            if (frameId0 == 73) {
                            }
                        }
                    }
                    if (frameId2 == 67) {
                    }
                    if (frameId2 != 67) {
                    }
                    if (frameId2 != 67) {
                    }
                } else {
                    if (frameId2 == 80 && frameId1 == 73 && frameId0 == 67) {
                        A07 = A04(c04774v, A0K, frameId3);
                    }
                    if (frameId2 == 67 || frameId1 != 79 || frameId0 != 77 || (i2 != 77 && frameId3 != 2)) {
                        if (frameId2 != 67 && frameId1 == 72 && frameId0 == 65 && i2 == 80) {
                            A07 = A06(c04774v, A0K, frameId3, z, i, ie);
                        } else {
                            A07 = (frameId2 != 67 && frameId1 == 84 && frameId0 == 79 && i2 == 67) ? A07(c04774v, A0K, frameId3, z, i, ie) : (frameId2 != 77 && frameId1 == 76 && frameId0 == 76 && i2 == 84) ? A0C(c04774v, A0K) : A05(c04774v, A0K, A0K(frameId3, frameId2, frameId1, frameId0, i2));
                        }
                    } else {
                        A07 = A08(c04774v, A0K);
                    }
                }
                if (A07 == null) {
                    AbstractC04624g.A07(A0J, A0J(61, 27, 7) + A0K(frameId3, frameId2, frameId1, frameId0, i2) + A0J(18, 12, 39) + A0K);
                }
                return A07;
            } finally {
                c04774v.A0f(flags);
            }
        }
    }

    public static PrivFrame A0D(C04774v c04774v, int i) {
        byte[] bArr = new byte[i];
        c04774v.A0k(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, AbstractC1879k9.A00), A0Q(bArr, A022 + 1, bArr.length));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0E(C04774v c04774v, int i) {
        if (i < 1) {
            return null;
        }
        int A0I = c04774v.A0I();
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c04774v.A0k(bArr, 0, encoding2);
        int A032 = A03(bArr, 0, A0I);
        String str = new String(bArr, 0, A032, A0M(A0I));
        int encoding3 = A00(A0I);
        return new TextInformationFrame(A0J(344, 4, 103), str, A0I(bArr, A0I, encoding3 + A032));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0F(C04774v c04774v, int i, String str) {
        if (i < 1) {
            return null;
        }
        int A0I = c04774v.A0I();
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        c04774v.A0k(data, 0, i - 1);
        return new TextInformationFrame(str, null, A0I(data, A0I, 0));
    }

    public static UrlLinkFrame A0G(C04774v c04774v, int i) {
        if (i < 1) {
            return null;
        }
        int A0I = c04774v.A0I();
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c04774v.A0k(bArr, 0, encoding2);
        int A032 = A03(bArr, 0, A0I);
        String str = new String(bArr, 0, A032, A0M(A0I));
        int descriptionEndIndex = A00(A0I) + A032;
        String description = A0L(bArr, descriptionEndIndex, A02(bArr, descriptionEndIndex), AbstractC1879k9.A00);
        return new UrlLinkFrame(A0J(398, 4, 35), str, description);
    }

    public static UrlLinkFrame A0H(C04774v c04774v, int i, String str) {
        byte[] bArr = new byte[i];
        c04774v.A0k(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), AbstractC1879k9.A00));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.String> */
    public static BP<String> A0I(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        String A0J = A0J(0, 0, 108);
        if (i2 >= length) {
            return BP.A04(A0J);
        }
        C2K A012 = BP.A01();
        int valueEndIndex = A03(bArr, i2, i);
        while (i2 < valueEndIndex) {
            int valueStartIndex = valueEndIndex - i2;
            A012.A04(new String(bArr, i2, valueStartIndex, A0M(i)));
            i2 = valueEndIndex + A00(i);
            valueEndIndex = A03(bArr, i2, i);
        }
        BP<String> A05 = A012.A05();
        return A05.isEmpty() ? BP.A04(A0J) : A05;
    }

    public static String A0K(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0J(4, 6, 69), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0J(10, 8, 1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0L(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            return A0J(0, 0, 108);
        }
        return new String(bArr, i, i2 - i, charset);
    }

    public static Charset A0M(int i) {
        switch (i) {
            case 1:
                return AbstractC1879k9.A02;
            case 2:
                return AbstractC1879k9.A03;
            case 3:
                return AbstractC1879k9.A05;
            default:
                Charset charset = AbstractC1879k9.A00;
                if (A02[5].charAt(22) != 'F') {
                    A02[5] = "KvSqsioCKy57forlhJv7i4SYYwwKGyHr";
                    return charset;
                }
                throw new RuntimeException();
        }
    }

    public static /* synthetic */ boolean A0O(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0P(C04774v c04774v, int i, int i2, boolean z) {
        int A0C;
        long A0Q;
        int A0M;
        int A09 = c04774v.A09();
        while (true) {
            try {
                if (c04774v.A07() < i2) {
                    c04774v.A0f(A09);
                    return true;
                }
                if (i >= 3) {
                    try {
                        A0C = c04774v.A0C();
                        A0Q = c04774v.A0Q();
                        A0M = c04774v.A0M();
                    } catch (Throwable th) {
                        th = th;
                        c04774v.A0f(A09);
                        throw th;
                    }
                } else {
                    A0C = c04774v.A0K();
                    A0Q = c04774v.A0K();
                    A0M = 0;
                }
                if (A0C == 0 && A0Q == 0 && A0M == 0) {
                    c04774v.A0f(A09);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & A0Q) != 0) {
                        c04774v.A0f(A09);
                        String[] strArr = A02;
                        if (strArr[1].charAt(20) == strArr[7].charAt(20)) {
                            String[] strArr2 = A02;
                            strArr2[1] = "5mCE9WytQNPeLFhBzaYSd2zmXPTMRlgu";
                            strArr2[7] = "AgecK2HA7Twj8m2CWduPdApaKwCpCynb";
                            return false;
                        }
                    } else {
                        A0Q = (((A0Q >> 24) & 255) << 21) | (A0Q & 255) | (((A0Q >> 8) & 255) << 7) | (((A0Q >> 16) & 255) << 14);
                    }
                }
                int id = 0;
                int flags = 0;
                if (i == 4) {
                    id = (A0M & 64) != 0 ? 1 : 0;
                    flags = (A0M & 1) == 0 ? 0 : 1;
                } else if (i == 3) {
                    id = (A0M & 32) != 0 ? 1 : 0;
                    flags = (A0M & 128) == 0 ? 0 : 1;
                }
                int i3 = 0;
                String[] strArr3 = A02;
                if (strArr3[1].charAt(20) != strArr3[7].charAt(20)) {
                    break;
                }
                String[] strArr4 = A02;
                strArr4[1] = "MVZStPJLdDxKiV7nz1H6dv3NOIiLFLEe";
                strArr4[7] = "QTxGzLkjWgw6uSVWxpxBdQfPOh5DKkgy";
                if (id != 0) {
                    i3 = 0 + 1;
                }
                if (flags != 0) {
                    i3 += 4;
                }
                int minimumFrameSize = (A0Q > i3 ? 1 : (A0Q == i3 ? 0 : -1));
                if (minimumFrameSize < 0) {
                    c04774v.A0f(A09);
                    return false;
                }
                int minimumFrameSize2 = c04774v.A07();
                long j = minimumFrameSize2;
                String[] strArr5 = A02;
                String str = strArr5[6];
                String str2 = strArr5[3];
                int length = str.length();
                int minimumFrameSize3 = str2.length();
                if (length != minimumFrameSize3) {
                    int minimumFrameSize4 = (j > A0Q ? 1 : (j == A0Q ? 0 : -1));
                    if (minimumFrameSize4 < 0) {
                        break;
                    }
                    int minimumFrameSize5 = (int) A0Q;
                    c04774v.A0g(minimumFrameSize5);
                } else {
                    A02[5] = "edbBlZh6UxoMPnyEc6lG0E5oPDAO53n7";
                    int minimumFrameSize6 = (j > A0Q ? 1 : (j == A0Q ? 0 : -1));
                    if (minimumFrameSize6 < 0) {
                        break;
                    }
                    int minimumFrameSize52 = (int) A0Q;
                    c04774v.A0g(minimumFrameSize52);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        c04774v.A0f(A09);
        return false;
    }

    public static byte[] A0Q(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C5C.A07;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2014mZ
    public final Metadata A0R(C05849e c05849e, ByteBuffer byteBuffer) {
        return A0S(byteBuffer.array(), byteBuffer.limit());
    }

    public final Metadata A0S(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C04774v c04774v = new C04774v(bArr, i);
        IF A0A = A0A(c04774v);
        if (A0A == null) {
            return null;
        }
        int startPosition = c04774v.A09();
        int frameHeaderSize = IF.A00(A0A) == 2 ? 6 : 10;
        int A012 = IF.A01(A0A);
        if (IF.A02(A0A)) {
            A012 = A01(c04774v, IF.A01(A0A));
        }
        c04774v.A0e(startPosition + A012);
        boolean z = false;
        if (!A0P(c04774v, IF.A00(A0A), frameHeaderSize, false)) {
            if (IF.A00(A0A) == 4 && A0P(c04774v, 4, frameHeaderSize, true)) {
                z = true;
            } else {
                AbstractC04624g.A07(A0J(C7193j50.f, 10, 14), A0J(88, 45, 57) + IF.A00(A0A));
                return null;
            }
        }
        while (c04774v.A07() >= frameHeaderSize) {
            Id3Frame A0B = A0B(IF.A00(A0A), c04774v, z, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }
}

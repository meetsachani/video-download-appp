package com.facebook.ads.androidx.media3.extractor;

import android.net.Uri;
import com.facebook.ads.androidx.media3.extractor.DefaultExtractorsFactory;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.ads.redexgen.X.AbstractC04162k;
import com.facebook.ads.redexgen.X.AnonymousClass53;
import com.facebook.ads.redexgen.X.C1840jW;
import com.facebook.ads.redexgen.X.C1928kz;
import com.facebook.ads.redexgen.X.C1932l3;
import com.facebook.ads.redexgen.X.C1939lA;
import com.facebook.ads.redexgen.X.C1954lP;
import com.facebook.ads.redexgen.X.C1956lR;
import com.facebook.ads.redexgen.X.C1959lU;
import com.facebook.ads.redexgen.X.C1962lX;
import com.facebook.ads.redexgen.X.C1987lw;
import com.facebook.ads.redexgen.X.C1993m2;
import com.facebook.ads.redexgen.X.C1994m3;
import com.facebook.ads.redexgen.X.C2007mG;
import com.facebook.ads.redexgen.X.C2018md;
import com.facebook.ads.redexgen.X.C2021mg;
import com.facebook.ads.redexgen.X.C2026ml;
import com.facebook.ads.redexgen.X.C2242qI;
import com.facebook.ads.redexgen.X.H4;
import com.facebook.ads.redexgen.X.H5;
import com.facebook.ads.redexgen.X.H9;
import com.facebook.ads.redexgen.X.HD;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;
import o.Xu2;

/* loaded from: assets/audience_network/classes2.dex */
public final class DefaultExtractorsFactory implements HD {
    public static byte[] A0D;
    public static String[] A0E = {"XjRCK", "YKKzt2Kz2K7V0l18n", "uXpf", "oBPf3SXxcwKIIjUAiSrSO2O", "bGsaI0", "ItuqzfwzHHPicVJR9bxtDiYARBCa2uxZ", "TYxjAZ909gRPDezWj", "NTeqQWiGfYp1zE0qSPlL6iBK546ff9Um"};
    public static final H5 A0F;
    public static final H5 A0G;
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 1;
    public int A09 = Xu2.B;
    @MetaExoPlayerCustomization("Replaces ImmutableList with List")
    public List<C2242qI> A0A = C1840jW.A03(new C2242qI[0]);
    public boolean A0B;
    public boolean A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{74, 86, 84, C8077mf.y, 77, 72, 74, 76, 73, 86, 86, 82, C8077mf.y, 72, 75, 90, C8077mf.y, 72, 85, 75, 89, 86, 80, 75, 95, C8077mf.y, 84, 76, 75, 80, 72, C8077mf.D, C8077mf.y, 75, 76, 74, 86, 75, 76, 89, C8077mf.y, 84, 80, 75, 80, C8077mf.y, 52, 80, 75, 80, C3307Iz.d0, 95, 91, 89, 72, 74, 91, 86, 89, -6, 6, 4, C2638Cg0.s7, -3, -8, -6, -4, -7, 6, 6, 2, C2638Cg0.s7, -8, -5, 10, C2638Cg0.s7, -2, 6, 6, -2, 3, -4, C2638Cg0.s7, -8, 5, -5, 9, 6, 0, -5, C2638Cg0.s7, -4, C8077mf.q, 6, 7, 3, -8, C8077mf.r, -4, 9, C2638Cg0.v7, C2638Cg0.s7, -4, C8077mf.q, C8077mf.m, C2638Cg0.s7, -3, 3, -8, -6, C2638Cg0.s7, -35, 3, -8, -6, -36, C8077mf.q, C8077mf.m, 9, -8, -6, C8077mf.m, 6, 9, C8077mf.E, C3307Iz.Z, C3307Iz.X, -26, C8077mf.H, C8077mf.C, C8077mf.E, C8077mf.G, C8077mf.D, C3307Iz.Z, C3307Iz.Z, 35, -26, C8077mf.C, 28, C3307Iz.c0, -26, 31, C3307Iz.Z, C3307Iz.Z, 31, 36, C8077mf.G, -26, C8077mf.C, C3307Iz.Y, 28, 42, C3307Iz.Z, C3307Iz.V, 28, -26, C8077mf.G, 48, C3307Iz.Z, 40, 36, C8077mf.C, 49, C8077mf.G, 42, -22, -26, C8077mf.G, 48, C3307Iz.d0, -26, C8077mf.H, 36, C8077mf.C, C8077mf.E, -26, -2, 36, C8077mf.C, C8077mf.E, 4, C3307Iz.V, C8077mf.D, 42, C8077mf.C, 42, 49, 82, 92, 42, 95, 74, 82, 85, 74, 75, 85, 78};
    }

    static {
        A05();
        A0H = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
        A0F = new H5(new H4() { // from class: com.facebook.ads.redexgen.X.mw
            @Override // com.facebook.ads.redexgen.X.H4
            public final Constructor A7R() {
                Constructor A01;
                A01 = DefaultExtractorsFactory.A01();
                return A01;
            }
        });
        A0G = new H5(new H4() { // from class: com.facebook.ads.redexgen.X.mv
            @Override // com.facebook.ads.redexgen.X.H4
            public final Constructor A7R() {
                Constructor A02;
                A02 = DefaultExtractorsFactory.A02();
                return A02;
            }
        });
    }

    public static Constructor<? extends H9> A01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean isFlacNativeLibraryAvailable = Boolean.TRUE.equals(Class.forName(A00(124, 63, 62)).getMethod(A00(C10997yd1.l2, 11, 111), new Class[0]).invoke(null, new Object[0]));
        if (!isFlacNativeLibraryAvailable) {
            return null;
        }
        return Class.forName(A00(59, 65, 29)).asSubclass(H9.class).getConstructor(Integer.TYPE);
    }

    public static Constructor<? extends H9> A02() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(A00(0, 59, 109)).asSubclass(H9.class).getConstructor(new Class[0]);
    }

    @MetaExoPlayerCustomization("Removed AVI and JPEG extractors")
    private void A06(int i, List<H9> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new C1962lX());
                return;
            case 1:
                list.add(new C1959lU());
                return;
            case 2:
                int i3 = (this.A0C ? 1 : 0) | this.A00;
                String[] strArr = A0E;
                if (strArr[2].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[5] = "0JYW4ys9S4cBRo9bfKNpoispKPkvAlfn";
                strArr2[7] = "ESM27VzyBHwJIaBfhIrCniRSUGwbmbgc";
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new C1956lR(i2 | i3));
                return;
            case 3:
                int i4 = (this.A0C ? 1 : 0) | this.A01;
                boolean z = this.A0B;
                String[] strArr3 = A0E;
                if (strArr3[2].length() != strArr3[0].length()) {
                    String[] strArr4 = A0E;
                    strArr4[6] = "88SSgZrekVuE3ZpEu";
                    strArr4[1] = "yFmqseBd895DxKzOE";
                    if (!z) {
                        i2 = 0;
                    }
                    list.add(new C2026ml(i2 | i4));
                    return;
                }
                throw new RuntimeException();
            case 4:
                H9 flacExtractor = A0F.A03(Integer.valueOf(this.A02));
                if (flacExtractor != null) {
                    list.add(flacExtractor);
                    return;
                } else {
                    list.add(new C2021mg(this.A02));
                    return;
                }
            case 5:
                list.add(new C2018md());
                return;
            case 6:
                list.add(new MatroskaExtractor(this.A04));
                return;
            case 7:
                int i5 = (this.A0C ? 1 : 0) | this.A05;
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new C2007mG(i2 | i5));
                return;
            case 8:
                list.add(new C1993m2().A01(this.A03));
                list.add(new C1994m3(this.A06));
                return;
            case 9:
                list.add(new C1987lw());
                return;
            case 10:
                list.add(new C1939lA());
                return;
            case 11:
                list.add(new C1932l3(this.A08, new AnonymousClass53(0L), new C1954lP(this.A07, this.A0A), this.A09));
                return;
            case 12:
                list.add(new C1928kz());
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                H9 midiExtractor = A0G.A03(new Object[0]);
                if (midiExtractor == null) {
                    return;
                }
                list.add(midiExtractor);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.HD
    public final synchronized H9[] A5N() {
        return A5O(Uri.EMPTY, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.X.HD
    public final synchronized H9[] A5O(Uri uri, Map<String, List<String>> responseHeaders) {
        List<Extractor> extractors;
        int[] iArr;
        extractors = new ArrayList<>(A0H.length);
        int fileType = AbstractC04162k.A02(responseHeaders);
        if (fileType != -1) {
            A06(fileType, extractors);
        }
        int A00 = AbstractC04162k.A00(uri);
        if (A00 != -1 && A00 != fileType) {
            A06(A00, extractors);
        }
        for (int responseHeadersInferredFileType : A0H) {
            if (responseHeadersInferredFileType != fileType && responseHeadersInferredFileType != A00) {
                A06(responseHeadersInferredFileType, extractors);
            }
        }
        return (H9[]) extractors.toArray(new H9[extractors.size()]);
    }
}

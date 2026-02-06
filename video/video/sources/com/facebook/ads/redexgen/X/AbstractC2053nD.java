package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2053nD extends AbstractC0722Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0714Eo A00;

    public abstract Pair<C05527s[], InterfaceC2054nE[]> A0d(C0714Eo c0714Eo, int[][][] iArr, int[] iArr2, C2090no c2090no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC05497p[] interfaceC05497pArr, C2205pg c2205pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC05497pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC05497p interfaceC05497p = interfaceC05497pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC05497p.AKM(c2205pg.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AbstractC05427i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i3 > formatSupportLevel || (i3 == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = i3;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC05497p interfaceC05497p, C2205pg c2205pg) throws AD {
        int[] iArr = new int[c2205pg.A01];
        for (int i = 0; i < c2205pg.A01; i++) {
            iArr[i] = interfaceC05497p.AKM(c2205pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC05497p[] interfaceC05497pArr) throws AD {
        int[] iArr = new int[interfaceC05497pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC05497pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Ew
    public final C0723Ex A0b(InterfaceC05497p[] interfaceC05497pArr, C2072nW c2072nW, C2090no c2090no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC05497pArr.length + 1];
        C2205pg[][] c2205pgArr = new C2205pg[interfaceC05497pArr.length + 1];
        int[][][] iArr2 = new int[interfaceC05497pArr.length + 1][];
        for (int i = 0; i < c2205pgArr.length; i++) {
            c2205pgArr[i] = new C2205pg[c2072nW.A01];
            iArr2[i] = new int[c2072nW.A01];
        }
        int[] A0a = A0a(interfaceC05497pArr);
        for (int i2 = 0; i2 < c2072nW.A01; i2++) {
            C2205pg A05 = c2072nW.A05(i2);
            int groupIndex = A0Y(interfaceC05497pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC05497pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC05497pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c2205pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2072nW[] c2072nWArr = new C2072nW[interfaceC05497pArr.length];
        String[] strArr = new String[interfaceC05497pArr.length];
        int[] iArr3 = new int[interfaceC05497pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC05497pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c2072nWArr[i4] = new C2072nW((C2205pg[]) C5C.A1I(c2205pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC05497pArr[i4].getName();
                iArr3[i4] = interfaceC05497pArr[i4].A9N();
                i4++;
            } else {
                C0714Eo c0714Eo = new C0714Eo(strArr, iArr3, c2072nWArr, A0a, iArr2, new C2072nW((C2205pg[]) C5C.A1I(c2205pgArr[interfaceC05497pArr.length], iArr[interfaceC05497pArr.length])));
                Pair<C05527s[], InterfaceC2054nE[]> A0d = A0d(c0714Eo, iArr2, A0a, c2090no, timeline);
                return new C0723Ex((C05527s[]) A0d.first, (InterfaceC2054nE[]) A0d.second, AbstractC0719Et.A00(c0714Eo, (InterfaceC0716Eq[]) A0d.second), c0714Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Ew
    public final void A0c(Object obj) {
        this.A00 = (C0714Eo) obj;
    }
}

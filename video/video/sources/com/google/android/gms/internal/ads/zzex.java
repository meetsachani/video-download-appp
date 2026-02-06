package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3128Hd1;
import o.C8077mf;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzex implements zzau {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzex(String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals(C3128Hd1.Z0)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1 && c != 2) {
                if (c != 3) {
                    if (c == 4) {
                        if (i2 == 75) {
                            if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                                i2 = 75;
                                zzdc.d(r4);
                            } else {
                                i2 = 75;
                            }
                        }
                        r4 = false;
                        zzdc.d(r4);
                    }
                } else {
                    zzdc.d(i2 == 0);
                }
            } else {
                if (i2 == 78) {
                    if (bArr.length == 8) {
                        i2 = 78;
                        zzdc.d(r4);
                    } else {
                        i2 = 78;
                    }
                }
                r4 = false;
                zzdc.d(r4);
            }
        } else {
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    zzdc.d(r4);
                } else {
                    i2 = 23;
                }
            }
            r4 = false;
            zzdc.d(r4);
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final List b() {
        zzdc.g(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzex.class == obj.getClass()) {
            zzex zzexVar = (zzex) obj;
            if (this.a.equals(zzexVar.a) && Arrays.equals(this.b, zzexVar.b) && this.c == zzexVar.c && this.d == zzexVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[LOOP:0: B:24:0x0084->B:26:0x0087, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        byte[] bArr;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 23) {
                    if (i != 67) {
                        if (i != 75) {
                            if (i == 78) {
                                sb = String.valueOf(new zzek(this.b).Q());
                            }
                            bArr = this.b;
                            String str = zzeu.a;
                            int length = bArr.length;
                            StringBuilder sb2 = new StringBuilder(length + length);
                            for (int i2 = 0; i2 < bArr.length; i2++) {
                                sb2.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                                sb2.append(Character.forDigit(bArr[i2] & C8077mf.q, 16));
                            }
                            sb = sb2.toString();
                        } else {
                            sb = String.valueOf(this.b[0] & 255);
                        }
                    } else {
                        sb = String.valueOf(zzgbf.d(this.b));
                    }
                } else {
                    sb = String.valueOf(Float.intBitsToFloat(zzgbf.d(this.b)));
                }
            } else {
                sb = zzeu.b(this.b);
            }
        } else {
            if (this.a.equals("auxiliary.tracks.map")) {
                List b = b();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("track types = ");
                zzfuu.b(sb3, b, ",");
                sb = sb3.toString();
            }
            bArr = this.b;
            String str2 = zzeu.a;
            int length2 = bArr.length;
            StringBuilder sb22 = new StringBuilder(length2 + length2);
            while (i2 < bArr.length) {
            }
            sb = sb22.toString();
        }
        String str3 = this.a;
        return "mdta: key=" + str3 + ", value=" + sb;
    }
}

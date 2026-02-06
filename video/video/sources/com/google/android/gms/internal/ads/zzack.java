package com.google.android.gms.internal.ads;

import o.C9948uJ1;
import o.G;

/* loaded from: classes2.dex */
public final class zzack {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, C9948uJ1.h, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final /* synthetic */ int c = 0;

    public static zzaci a(byte[] bArr) throws zzaz {
        return b(new zzej(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
        if (r11 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaci b(zzej zzejVar, boolean z) throws zzaz {
        int c2 = c(zzejVar);
        int d = d(zzejVar);
        int d2 = zzejVar.d(4);
        String str = "mp4a.40." + c2;
        int i = 22;
        if (c2 == 5 || c2 == 29) {
            d = d(zzejVar);
            c2 = c(zzejVar);
            if (c2 == 22) {
                d2 = zzejVar.d(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4 && c2 != 6 && c2 != 7 && c2 != 17) {
                switch (c2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzaz.c("Unsupported audio object type: " + c2);
                }
            }
            if (zzejVar.p()) {
                zzdx.f(G.a, "Unexpected frameLengthFlag = 1");
            }
            if (zzejVar.p()) {
                zzejVar.n(14);
            }
            boolean p = zzejVar.p();
            if (d2 != 0) {
                if (c2 != 6) {
                    if (c2 == 20) {
                        c2 = 20;
                    }
                    if (p) {
                        if (c2 == 22) {
                            zzejVar.n(16);
                        } else {
                            i = c2;
                        }
                        if (i == 17 || i == 19 || i == 20 || i == 23) {
                            zzejVar.n(3);
                        }
                        zzejVar.n(1);
                    }
                    switch (c2) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int d3 = zzejVar.d(2);
                            if (d3 == 2) {
                                i2 = d3;
                            }
                            throw zzaz.c("Unsupported epConfig: " + i2);
                    }
                }
                zzejVar.n(3);
                if (p) {
                }
                switch (c2) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i3 = b[d2];
        if (i3 != -1) {
            return new zzaci(d, i3, str, null);
        }
        throw zzaz.a(null, null);
    }

    public static int c(zzej zzejVar) {
        int d = zzejVar.d(5);
        if (d == 31) {
            return zzejVar.d(6) + 32;
        }
        return d;
    }

    public static int d(zzej zzejVar) throws zzaz {
        int d = zzejVar.d(4);
        if (d == 15) {
            if (zzejVar.a() >= 24) {
                return zzejVar.d(24);
            }
            throw zzaz.a("AAC header insufficient data", null);
        } else if (d < 13) {
            return a[d];
        } else {
            throw zzaz.a("AAC header wrong Sampling Frequency Index", null);
        }
    }
}

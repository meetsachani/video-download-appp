package com.google.android.gms.internal.ads;

import o.C3062Gl1;
import o.C9948uJ1;
import o.S9;

/* loaded from: classes2.dex */
final class zzani {
    public static zzang a(zzej zzejVar) throws zzaz {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        char c2;
        int d = zzejVar.d(8);
        int i6 = 5;
        int d2 = zzejVar.d(5);
        if (d2 == 31) {
            i = zzejVar.d(24);
        } else {
            switch (d2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = C9948uJ1.h;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.c("Unsupported sampling rate index " + d2);
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = C3062Gl1.b;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        }
        int d3 = zzejVar.d(3);
        int i7 = 1;
        if (d3 != 0) {
            if (d3 != 1) {
                if (d3 != 2 && d3 != 3) {
                    if (d3 == 4) {
                        i2 = 4096;
                    } else {
                        throw zzaz.c("Unsupported coreSbrFrameLengthIndex " + d3);
                    }
                } else {
                    i2 = 2048;
                }
            } else {
                i2 = 1024;
            }
        } else {
            i2 = 768;
        }
        if (d3 != 0 && d3 != 1) {
            if (d3 != 2) {
                if (d3 != 3) {
                    if (d3 == 4) {
                        c = 1;
                    } else {
                        throw zzaz.c("Unsupported coreSbrFrameLengthIndex " + d3);
                    }
                } else {
                    c = 3;
                }
            } else {
                c = 2;
            }
        } else {
            c = 0;
        }
        zzejVar.n(2);
        e(zzejVar);
        int d4 = zzejVar.d(5);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 16;
            if (i8 < d4 + 1) {
                int d5 = zzejVar.d(3);
                i9 += c(zzejVar, 5, 8, 16) + 1;
                if ((d5 == 0 || d5 == 2) && zzejVar.p()) {
                    e(zzejVar);
                }
                i8++;
            } else {
                int c3 = c(zzejVar, 4, 8, 16) + 1;
                zzejVar.m();
                int i11 = 0;
                while (true) {
                    double d6 = 2.0d;
                    if (i11 < c3) {
                        int d7 = zzejVar.d(2);
                        if (d7 != 0) {
                            if (d7 != i7) {
                                if (d7 != 3) {
                                    i3 = d;
                                    i4 = i7;
                                } else {
                                    c(zzejVar, 4, 8, i10);
                                    int c4 = c(zzejVar, 4, 8, i10);
                                    i4 = i7;
                                    if (zzejVar.p()) {
                                        c(zzejVar, 8, i10, 0);
                                    }
                                    zzejVar.m();
                                    if (c4 > 0) {
                                        zzejVar.n(c4 * 8);
                                    }
                                    i3 = d;
                                }
                            } else {
                                i4 = i7;
                                if (f(zzejVar)) {
                                    zzejVar.m();
                                }
                                if (c > 0) {
                                    d(zzejVar);
                                    i5 = zzejVar.d(2);
                                    c2 = c;
                                } else {
                                    i5 = 0;
                                    c2 = 0;
                                }
                                if (i5 > 0) {
                                    zzejVar.n(6);
                                    int d8 = zzejVar.d(2);
                                    zzejVar.n(4);
                                    if (zzejVar.p()) {
                                        zzejVar.n(i6);
                                    }
                                    if (i5 == 2 || i5 == 3) {
                                        zzejVar.n(6);
                                    }
                                    if (d8 == 2) {
                                        zzejVar.m();
                                    }
                                }
                                i3 = d;
                                int floor = ((int) Math.floor(Math.log(i9 - 1) / Math.log(2.0d))) + 1;
                                int d9 = zzejVar.d(2);
                                if (d9 > 0 && zzejVar.p()) {
                                    zzejVar.n(floor);
                                }
                                if (zzejVar.p()) {
                                    zzejVar.n(floor);
                                }
                                if (c2 == 0 && d9 == 0) {
                                    zzejVar.m();
                                }
                            }
                        } else {
                            i3 = d;
                            i4 = i7;
                            f(zzejVar);
                            if (c > 0) {
                                d(zzejVar);
                            }
                        }
                        i11++;
                        d = i3;
                        i7 = i4;
                        i6 = 5;
                        i10 = 16;
                    } else {
                        int i12 = d;
                        byte[] bArr = null;
                        if (zzejVar.p()) {
                            int c5 = c(zzejVar, 2, 4, 8) + 1;
                            for (int i13 = 0; i13 < c5; i13++) {
                                int c6 = c(zzejVar, 4, 8, 16);
                                int c7 = c(zzejVar, 4, 8, 16);
                                if (c6 == 7) {
                                    int d10 = zzejVar.d(4) + 1;
                                    zzejVar.n(4);
                                    byte[] bArr2 = new byte[d10];
                                    for (int i14 = 0; i14 < d10; i14++) {
                                        bArr2[i14] = (byte) zzejVar.d(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzejVar.n(c7 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d6 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case C9948uJ1.h /* 32000 */:
                            case 58800:
                            case 64000:
                                d6 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d6 = 1.0d;
                                break;
                            default:
                                throw zzaz.c("Unsupported sampling rate " + i);
                        }
                        return new zzang(i12, (int) (i * d6), (int) (i2 * d6), bArr3, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(zzej zzejVar, zzanf zzanfVar) throws zzaz {
        boolean z;
        long e;
        zzejVar.b();
        int c = c(zzejVar, 3, 8, 8);
        zzanfVar.a = c;
        if (c == -1) {
            return false;
        }
        if (Math.max(Math.max(2, 8), 32) <= 63) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        zzgba.a(zzgba.a(3L, 255L), S9.c.M);
        if (zzejVar.a() >= 2) {
            e = zzejVar.e(2);
            if (e == 3) {
                if (zzejVar.a() >= 8) {
                    long e2 = zzejVar.e(8);
                    long j = e2 + 3;
                    if (e2 == 255) {
                        if (zzejVar.a() >= 32) {
                            e = j + zzejVar.e(32);
                        }
                    } else {
                        e = j;
                    }
                }
            }
            zzanfVar.b = e;
            if (e != -1) {
                return false;
            }
            if (e <= 16) {
                if (e == 0) {
                    int i = zzanfVar.a;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 17) {
                                throw zzaz.a("AudioTruncation packet with invalid packet label 0", null);
                            }
                        } else {
                            throw zzaz.a("Mpegh3daFrame packet with invalid packet label 0", null);
                        }
                    } else {
                        throw zzaz.a("Mpegh3daConfig packet with invalid packet label 0", null);
                    }
                }
                int c2 = c(zzejVar, 11, 24, 24);
                zzanfVar.c = c2;
                if (c2 == -1) {
                    return false;
                }
                return true;
            }
            throw zzaz.c("Contains sub-stream with an invalid packet label " + e);
        }
        e = -1;
        zzanfVar.b = e;
        if (e != -1) {
        }
    }

    public static int c(zzej zzejVar, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        zzgay.a(zzgay.a(i4, i5), 1 << i3);
        if (zzejVar.a() < i) {
            return -1;
        }
        int d = zzejVar.d(i);
        if (d == i4) {
            if (zzejVar.a() < i2) {
                return -1;
            }
            int d2 = zzejVar.d(i2);
            int i6 = d + d2;
            if (d2 == i5) {
                if (zzejVar.a() < i3) {
                    return -1;
                }
                return i6 + zzejVar.d(i3);
            }
            return i6;
        }
        return d;
    }

    public static void d(zzej zzejVar) {
        zzejVar.n(3);
        zzejVar.n(8);
        boolean p = zzejVar.p();
        boolean p2 = zzejVar.p();
        if (p) {
            zzejVar.n(5);
        }
        if (p2) {
            zzejVar.n(6);
        }
    }

    public static void e(zzej zzejVar) {
        int i;
        int d;
        int d2 = zzejVar.d(2);
        int i2 = 6;
        if (d2 == 0) {
            zzejVar.n(6);
            return;
        }
        int i3 = 5;
        int c = c(zzejVar, 5, 8, 16) + 1;
        if (d2 == 1) {
            zzejVar.n(c * 7);
        } else if (d2 == 2) {
            boolean p = zzejVar.p();
            if (true != p) {
                i = 5;
            } else {
                i = 1;
            }
            if (true == p) {
                i3 = 7;
            }
            if (true == p) {
                i2 = 8;
            }
            int i4 = 0;
            while (i4 < c) {
                if (zzejVar.p()) {
                    zzejVar.n(7);
                    d = 0;
                } else {
                    if (zzejVar.d(2) == 3 && zzejVar.d(i3) * i != 0) {
                        zzejVar.m();
                    }
                    d = zzejVar.d(i2) * i;
                    if (d != 0 && d != 180) {
                        zzejVar.m();
                    }
                    zzejVar.m();
                }
                if (d != 0 && d != 180 && zzejVar.p()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static boolean f(zzej zzejVar) {
        zzejVar.n(3);
        boolean p = zzejVar.p();
        if (p) {
            zzejVar.n(13);
        }
        return p;
    }
}

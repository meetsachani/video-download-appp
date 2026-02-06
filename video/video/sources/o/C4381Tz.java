package o;

import java.util.ArrayList;
import o.UK;

/* renamed from: o.Tz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4381Tz {
    public static final boolean a = false;
    public static final boolean b = false;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r8 == 2) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(VK vk, C9872u01 c9872u01, int i, int i2, C4478Uz c4478Uz) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        UK uk;
        ArrayList<UK> arrayList;
        int i3;
        boolean z5;
        UK uk2;
        MK mk;
        MK mk2;
        C9872u01 c9872u012;
        MK mk3;
        Q92 q92;
        Q92 q922;
        int i4;
        UK uk3;
        boolean z6;
        int i5;
        Q92 q923;
        MK mk4;
        Q92 q924;
        UK uk4;
        int i6;
        int i7;
        MK mk5;
        Q92 q925;
        MK mk6;
        Q92 q926;
        Q92 q927;
        Q92 q928;
        float f2;
        int size;
        float f3;
        int i8;
        float f4;
        ArrayList<UK> arrayList2;
        int i9;
        boolean z7;
        boolean z8;
        boolean z9;
        int i10;
        int i11;
        int i12 = i;
        UK uk5 = c4478Uz.a;
        UK uk6 = c4478Uz.c;
        UK uk7 = c4478Uz.b;
        UK uk8 = c4478Uz.d;
        UK uk9 = c4478Uz.e;
        float f5 = c4478Uz.k;
        if (vk.b0[i12] == UK.b.WRAP_CONTENT) {
            z = true;
        } else {
            z = false;
        }
        if (i12 == 0) {
            int i13 = uk9.J0;
            if (i13 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i13 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i14 = uk9.K0;
            if (i14 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i14 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        UK uk10 = uk5;
        boolean z10 = false;
        while (true) {
            f = f5;
            uk = null;
            if (z10) {
                break;
            }
            MK mk7 = uk10.Y[i2];
            if (z4) {
                i9 = 1;
            } else {
                i9 = 4;
            }
            int g = mk7.g();
            UK.b bVar = uk10.b0[i12];
            boolean z11 = z;
            UK.b bVar2 = UK.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && uk10.y[i12] == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z12 = z4;
            MK mk8 = mk7.f;
            if (mk8 != null && uk10 != uk5) {
                g += mk8.g();
            }
            int i15 = g;
            if (z12 && uk10 != uk5 && uk10 != uk7) {
                i9 = 8;
            }
            boolean z13 = z7;
            MK mk9 = mk7.f;
            if (mk9 != null) {
                if (uk10 == uk7) {
                    z8 = z10;
                    z9 = z2;
                    c9872u01.h(mk7.i, mk9.i, i15, 6);
                } else {
                    z8 = z10;
                    z9 = z2;
                    c9872u01.h(mk7.i, mk9.i, i15, 8);
                }
                if (z13 && !z12) {
                    i9 = 5;
                }
                if (uk10 == uk7 && z12 && uk10.A0(i12)) {
                    i11 = 5;
                } else {
                    i11 = i9;
                }
                c9872u01.e(mk7.i, mk7.f.i, i15, i11);
            } else {
                z8 = z10;
                z9 = z2;
            }
            if (z11) {
                if (uk10.l0() != 8 && uk10.b0[i12] == bVar2) {
                    MK[] mkArr = uk10.Y;
                    i10 = 0;
                    c9872u01.h(mkArr[i2 + 1].i, mkArr[i2].i, 0, 5);
                } else {
                    i10 = 0;
                }
                c9872u01.h(uk10.Y[i2].i, vk.Y[i2].i, i10, 8);
            }
            MK mk10 = uk10.Y[i2 + 1].f;
            if (mk10 != null) {
                UK uk11 = mk10.d;
                MK mk11 = uk11.Y[i2].f;
                if (mk11 != null && mk11.d == uk10) {
                    uk = uk11;
                }
            }
            if (uk != null) {
                uk10 = uk;
                z10 = z8;
            } else {
                z10 = true;
            }
            f5 = f;
            z = z11;
            z4 = z12;
            z2 = z9;
        }
        boolean z14 = z;
        boolean z15 = z4;
        boolean z16 = z2;
        if (uk8 != null) {
            int i16 = i2 + 1;
            if (uk6.Y[i16].f != null) {
                MK mk12 = uk8.Y[i16];
                if (uk8.b0[i12] == UK.b.MATCH_CONSTRAINT && uk8.y[i12] == 0 && !z15) {
                    MK mk13 = mk12.f;
                    if (mk13.d == vk) {
                        c9872u01.e(mk12.i, mk13.i, -mk12.g(), 5);
                        c9872u01.j(mk12.i, uk6.Y[i16].f.i, -mk12.g(), 6);
                        if (z14) {
                            int i17 = i2 + 1;
                            Q92 q929 = vk.Y[i17].i;
                            MK mk14 = uk6.Y[i17];
                            c9872u01.h(q929, mk14.i, mk14.g(), 8);
                        }
                        arrayList = c4478Uz.h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            if (!c4478Uz.r && !c4478Uz.t) {
                                f3 = c4478Uz.j;
                            } else {
                                f3 = f;
                            }
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            UK uk12 = null;
                            i8 = 0;
                            while (i8 < size) {
                                UK uk13 = arrayList.get(i8);
                                float f8 = uk13.N0[i12];
                                if (f8 < f6) {
                                    if (c4478Uz.t) {
                                        MK[] mkArr2 = uk13.Y;
                                        f4 = f6;
                                        c9872u01.e(mkArr2[i2 + 1].i, mkArr2[i2].i, 0, 4);
                                        arrayList2 = arrayList;
                                        i8++;
                                        f6 = f4;
                                        arrayList = arrayList2;
                                    } else {
                                        f4 = f6;
                                        f8 = 1.0f;
                                    }
                                } else {
                                    f4 = f6;
                                }
                                float f9 = f8;
                                if (f9 == f4) {
                                    MK[] mkArr3 = uk13.Y;
                                    c9872u01.e(mkArr3[i2 + 1].i, mkArr3[i2].i, 0, 8);
                                    arrayList2 = arrayList;
                                    i8++;
                                    f6 = f4;
                                    arrayList = arrayList2;
                                } else {
                                    if (uk12 != null) {
                                        MK[] mkArr4 = uk12.Y;
                                        Q92 q9210 = mkArr4[i2].i;
                                        int i18 = i2 + 1;
                                        Q92 q9211 = mkArr4[i18].i;
                                        MK[] mkArr5 = uk13.Y;
                                        arrayList2 = arrayList;
                                        Q92 q9212 = mkArr5[i2].i;
                                        Q92 q9213 = mkArr5[i18].i;
                                        C3130He t = c9872u01.t();
                                        t.p(f7, f3, f9, q9210, q9211, q9212, q9213);
                                        c9872u01.d(t);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    uk12 = uk13;
                                    f7 = f9;
                                    i8++;
                                    f6 = f4;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        if (uk7 == null && (uk7 == uk8 || z15)) {
                            MK mk15 = uk5.Y[i2];
                            int i19 = i2 + 1;
                            MK mk16 = uk6.Y[i19];
                            MK mk17 = mk15.f;
                            if (mk17 != null) {
                                q927 = mk17.i;
                            } else {
                                q927 = null;
                            }
                            MK mk18 = mk16.f;
                            if (mk18 != null) {
                                q928 = mk18.i;
                            } else {
                                q928 = null;
                            }
                            MK mk19 = uk7.Y[i2];
                            if (uk8 != null) {
                                mk16 = uk8.Y[i19];
                            }
                            if (q927 != null && q928 != null) {
                                if (i12 == 0) {
                                    f2 = uk9.q0;
                                } else {
                                    f2 = uk9.r0;
                                }
                                c9872u01.c(mk19.i, q927, mk19.g(), f2, q928, mk16.i, mk16.g(), 7);
                            }
                        } else if (!z16 && uk7 != null) {
                            int i20 = c4478Uz.j;
                            if (i20 > 0 && c4478Uz.i == i20) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            UK uk14 = uk7;
                            UK uk15 = uk14;
                            while (uk14 != null) {
                                UK uk16 = uk14.P0[i12];
                                while (true) {
                                    if (uk16 != null) {
                                        i5 = 8;
                                        if (uk16.l0() != 8) {
                                            break;
                                        }
                                        uk16 = uk16.P0[i12];
                                    } else {
                                        i5 = 8;
                                        break;
                                    }
                                }
                                if (uk16 == null && uk14 != uk8) {
                                    uk4 = uk16;
                                    i6 = i5;
                                } else {
                                    MK mk20 = uk14.Y[i2];
                                    Q92 q9214 = mk20.i;
                                    MK mk21 = mk20.f;
                                    if (mk21 != null) {
                                        q923 = mk21.i;
                                    } else {
                                        q923 = null;
                                    }
                                    if (uk15 != uk14) {
                                        q923 = uk15.Y[i2 + 1].i;
                                    } else if (uk14 == uk7) {
                                        MK mk22 = uk5.Y[i2].f;
                                        if (mk22 != null) {
                                            q923 = mk22.i;
                                        } else {
                                            q923 = null;
                                        }
                                    }
                                    int g2 = mk20.g();
                                    int i21 = i2 + 1;
                                    int g3 = uk14.Y[i21].g();
                                    if (uk16 != null) {
                                        mk4 = uk16.Y[i2];
                                        q924 = mk4.i;
                                    } else {
                                        mk4 = uk6.Y[i21].f;
                                        if (mk4 != null) {
                                            q924 = mk4.i;
                                        } else {
                                            q924 = null;
                                        }
                                    }
                                    Q92 q9215 = uk14.Y[i21].i;
                                    if (mk4 != null) {
                                        g3 += mk4.g();
                                    }
                                    int g4 = g2 + uk15.Y[i21].g();
                                    if (q9214 != null && q923 != null && q924 != null && q9215 != null) {
                                        if (uk14 == uk7) {
                                            g4 = uk7.Y[i2].g();
                                        }
                                        if (uk14 == uk8) {
                                            g3 = uk8.Y[i21].g();
                                        }
                                        int i22 = g3;
                                        Q92 q9216 = q924;
                                        if (z6) {
                                            i7 = 8;
                                        } else {
                                            i7 = 5;
                                        }
                                        uk4 = uk16;
                                        i6 = 8;
                                        c9872u01.c(q9214, q923, g4, 0.5f, q9216, q9215, i22, i7);
                                        if (uk14.l0() == i6) {
                                            uk15 = uk14;
                                        }
                                        i12 = i;
                                        uk14 = uk4;
                                    } else {
                                        uk4 = uk16;
                                        i6 = 8;
                                    }
                                }
                                if (uk14.l0() == i6) {
                                }
                                i12 = i;
                                uk14 = uk4;
                            }
                        } else if (z3 && uk7 != null) {
                            i3 = c4478Uz.j;
                            if (i3 <= 0 && c4478Uz.i == i3) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            uk2 = uk7;
                            UK uk17 = uk2;
                            while (uk2 != null) {
                                UK uk18 = uk2.P0[i];
                                while (uk18 != null && uk18.l0() == 8) {
                                    uk18 = uk18.P0[i];
                                }
                                if (uk2 != uk7 && uk2 != uk8 && uk18 != null) {
                                    if (uk18 == uk8) {
                                        uk18 = null;
                                    }
                                    MK mk23 = uk2.Y[i2];
                                    Q92 q9217 = mk23.i;
                                    MK mk24 = mk23.f;
                                    if (mk24 != null) {
                                        Q92 q9218 = mk24.i;
                                    }
                                    int i23 = i2 + 1;
                                    Q92 q9219 = uk17.Y[i23].i;
                                    int g5 = mk23.g();
                                    int g6 = uk2.Y[i23].g();
                                    if (uk18 != null) {
                                        mk3 = uk18.Y[i2];
                                        q92 = mk3.i;
                                        MK mk25 = mk3.f;
                                        if (mk25 != null) {
                                            q922 = mk25.i;
                                        } else {
                                            q922 = null;
                                        }
                                    } else {
                                        mk3 = uk8.Y[i2];
                                        if (mk3 != null) {
                                            q92 = mk3.i;
                                        } else {
                                            q92 = null;
                                        }
                                        q922 = uk2.Y[i23].i;
                                    }
                                    if (mk3 != null) {
                                        g6 += mk3.g();
                                    }
                                    int g7 = g5 + uk17.Y[i23].g();
                                    if (z5) {
                                        i4 = 8;
                                    } else {
                                        i4 = 4;
                                    }
                                    if (q9217 != null && q9219 != null && q92 != null && q922 != null) {
                                        uk3 = uk18;
                                        c9872u01.c(q9217, q9219, g7, 0.5f, q92, q922, g6, i4);
                                    } else {
                                        uk3 = uk18;
                                    }
                                    uk18 = uk3;
                                }
                                if (uk2.l0() != 8) {
                                    uk17 = uk2;
                                }
                                uk2 = uk18;
                            }
                            MK mk26 = uk7.Y[i2];
                            mk = uk5.Y[i2].f;
                            int i24 = i2 + 1;
                            MK mk27 = uk8.Y[i24];
                            mk2 = uk6.Y[i24].f;
                            if (mk != null) {
                                if (uk7 != uk8) {
                                    c9872u01.e(mk26.i, mk.i, mk26.g(), 5);
                                } else if (mk2 != null) {
                                    c9872u012 = c9872u01;
                                    c9872u012.c(mk26.i, mk.i, mk26.g(), 0.5f, mk27.i, mk2.i, mk27.g(), 5);
                                    if (mk2 != null && uk7 != uk8) {
                                        c9872u012.e(mk27.i, mk2.i, -mk27.g(), 5);
                                    }
                                    if ((!z16 || z3) && uk7 != null && uk7 != uk8) {
                                        MK[] mkArr6 = uk7.Y;
                                        MK mk28 = mkArr6[i2];
                                        if (uk8 == null) {
                                            uk8 = uk7;
                                        }
                                        int i25 = i2 + 1;
                                        MK mk29 = uk8.Y[i25];
                                        mk5 = mk28.f;
                                        if (mk5 == null) {
                                            q925 = mk5.i;
                                        } else {
                                            q925 = null;
                                        }
                                        mk6 = mk29.f;
                                        if (mk6 == null) {
                                            q926 = mk6.i;
                                        } else {
                                            q926 = null;
                                        }
                                        if (uk6 != uk8) {
                                            MK mk30 = uk6.Y[i25].f;
                                            if (mk30 != null) {
                                                uk = mk30.i;
                                            }
                                            q926 = uk;
                                        }
                                        if (uk7 == uk8) {
                                            mk29 = mkArr6[i25];
                                        }
                                        if (q925 == null && q926 != null) {
                                            c9872u012.c(mk28.i, q925, mk28.g(), 0.5f, q926, mk29.i, uk8.Y[i25].g(), 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            c9872u012 = c9872u01;
                            if (mk2 != null) {
                                c9872u012.e(mk27.i, mk2.i, -mk27.g(), 5);
                            }
                            if (!z16) {
                            }
                            MK[] mkArr62 = uk7.Y;
                            MK mk282 = mkArr62[i2];
                            if (uk8 == null) {
                            }
                            int i252 = i2 + 1;
                            MK mk292 = uk8.Y[i252];
                            mk5 = mk282.f;
                            if (mk5 == null) {
                            }
                            mk6 = mk292.f;
                            if (mk6 == null) {
                            }
                            if (uk6 != uk8) {
                            }
                            if (uk7 == uk8) {
                            }
                            if (q925 == null) {
                                return;
                            }
                            return;
                        }
                        c9872u012 = c9872u01;
                        if (!z16) {
                        }
                        MK[] mkArr622 = uk7.Y;
                        MK mk2822 = mkArr622[i2];
                        if (uk8 == null) {
                        }
                        int i2522 = i2 + 1;
                        MK mk2922 = uk8.Y[i2522];
                        mk5 = mk2822.f;
                        if (mk5 == null) {
                        }
                        mk6 = mk2922.f;
                        if (mk6 == null) {
                        }
                        if (uk6 != uk8) {
                        }
                        if (uk7 == uk8) {
                        }
                        if (q925 == null) {
                        }
                    }
                }
                if (z15) {
                    MK mk31 = mk12.f;
                    if (mk31.d == vk) {
                        c9872u01.e(mk12.i, mk31.i, -mk12.g(), 4);
                    }
                }
                c9872u01.j(mk12.i, uk6.Y[i16].f.i, -mk12.g(), 6);
                if (z14) {
                }
                arrayList = c4478Uz.h;
                if (arrayList != null) {
                    if (!c4478Uz.r) {
                    }
                    f3 = f;
                    float f62 = 0.0f;
                    float f72 = 0.0f;
                    UK uk122 = null;
                    i8 = 0;
                    while (i8 < size) {
                    }
                }
                if (uk7 == null) {
                }
                if (!z16) {
                }
                if (z3) {
                    i3 = c4478Uz.j;
                    if (i3 <= 0) {
                    }
                    z5 = false;
                    uk2 = uk7;
                    UK uk172 = uk2;
                    while (uk2 != null) {
                    }
                    MK mk262 = uk7.Y[i2];
                    mk = uk5.Y[i2].f;
                    int i242 = i2 + 1;
                    MK mk272 = uk8.Y[i242];
                    mk2 = uk6.Y[i242].f;
                    if (mk != null) {
                    }
                    c9872u012 = c9872u01;
                    if (mk2 != null) {
                    }
                    if (!z16) {
                    }
                    MK[] mkArr6222 = uk7.Y;
                    MK mk28222 = mkArr6222[i2];
                    if (uk8 == null) {
                    }
                    int i25222 = i2 + 1;
                    MK mk29222 = uk8.Y[i25222];
                    mk5 = mk28222.f;
                    if (mk5 == null) {
                    }
                    mk6 = mk29222.f;
                    if (mk6 == null) {
                    }
                    if (uk6 != uk8) {
                    }
                    if (uk7 == uk8) {
                    }
                    if (q925 == null) {
                    }
                }
                c9872u012 = c9872u01;
                if (!z16) {
                }
                MK[] mkArr62222 = uk7.Y;
                MK mk282222 = mkArr62222[i2];
                if (uk8 == null) {
                }
                int i252222 = i2 + 1;
                MK mk292222 = uk8.Y[i252222];
                mk5 = mk282222.f;
                if (mk5 == null) {
                }
                mk6 = mk292222.f;
                if (mk6 == null) {
                }
                if (uk6 != uk8) {
                }
                if (uk7 == uk8) {
                }
                if (q925 == null) {
                }
            }
        }
        if (z14) {
        }
        arrayList = c4478Uz.h;
        if (arrayList != null) {
        }
        if (uk7 == null) {
        }
        if (!z16) {
        }
        if (z3) {
        }
        c9872u012 = c9872u01;
        if (!z16) {
        }
        MK[] mkArr622222 = uk7.Y;
        MK mk2822222 = mkArr622222[i2];
        if (uk8 == null) {
        }
        int i2522222 = i2 + 1;
        MK mk2922222 = uk8.Y[i2522222];
        mk5 = mk2822222.f;
        if (mk5 == null) {
        }
        mk6 = mk2922222.f;
        if (mk6 == null) {
        }
        if (uk6 != uk8) {
        }
        if (uk7 == uk8) {
        }
        if (q925 == null) {
        }
    }

    public static void b(VK vk, C9872u01 c9872u01, ArrayList<UK> arrayList, int i) {
        int i2;
        C4478Uz[] c4478UzArr;
        int i3;
        if (i == 0) {
            i2 = vk.N1;
            c4478UzArr = vk.Q1;
            i3 = 0;
        } else {
            i2 = vk.O1;
            c4478UzArr = vk.P1;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C4478Uz c4478Uz = c4478UzArr[i4];
            c4478Uz.a();
            if (arrayList == null || arrayList.contains(c4478Uz.a)) {
                a(vk, c9872u01, i, i3, c4478Uz);
            }
        }
    }
}

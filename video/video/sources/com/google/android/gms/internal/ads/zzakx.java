package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import o.C10146v80;
import o.C10323vs;
import o.C7193j50;
import o.C8077mf;
import o.C8920q7;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzakx implements zzakl {
    public static final byte[] h = {0, 7, 8, C8077mf.q};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final zzakq d;
    public final zzakp e;
    public final zzakw f;
    public Bitmap g;

    public zzakx(List list) {
        zzek zzekVar = new zzek((byte[]) list.get(0));
        int K = zzekVar.K();
        int K2 = zzekVar.K();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new zzakq(C8920q7.E, 575, 0, C8920q7.E, 0, 575);
        this.e = new zzakp(0, g(), h(), i());
        this.f = new zzakw(K, K2);
    }

    public static int b(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static zzakp c(zzej zzejVar, int i2) {
        int[] iArr;
        int d;
        int i3;
        int d2;
        int d3;
        int i4 = 8;
        int d4 = zzejVar.d(8);
        zzejVar.n(8);
        int[] g = g();
        int[] h2 = h();
        int[] i5 = i();
        int i6 = i2 - 2;
        while (i6 > 0) {
            int d5 = zzejVar.d(i4);
            int d6 = zzejVar.d(i4);
            if ((d6 & 128) != 0) {
                iArr = g;
            } else if ((d6 & 64) != 0) {
                iArr = h2;
            } else {
                iArr = i5;
            }
            if ((d6 & 1) != 0) {
                d2 = zzejVar.d(i4);
                d3 = zzejVar.d(i4);
                d = zzejVar.d(i4);
                i3 = zzejVar.d(i4);
                i6 -= 6;
            } else {
                int d7 = zzejVar.d(2) << 6;
                i6 -= 4;
                d = zzejVar.d(4) << 4;
                i3 = d7;
                d2 = zzejVar.d(6) << 2;
                d3 = zzejVar.d(4) << 4;
            }
            if (d2 == 0) {
                i3 = 255;
            }
            if (d2 == 0) {
                d = 0;
            }
            if (d2 == 0) {
                d3 = 0;
            }
            double d8 = d2;
            String str = zzeu.a;
            double d9 = d3 - 128;
            double d10 = d - 128;
            iArr[d5] = b((byte) (255 - (i3 & 255)), Math.max(0, Math.min((int) (d8 + (1.402d * d9)), 255)), Math.max(0, Math.min((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d8 + (d10 * 1.772d)), 255)));
            d4 = d4;
            i4 = 8;
        }
        return new zzakp(d4, g, h2, i5);
    }

    public static zzakr d(zzej zzejVar) {
        byte[] bArr;
        int d = zzejVar.d(16);
        zzejVar.n(4);
        int d2 = zzejVar.d(2);
        boolean p = zzejVar.p();
        zzejVar.n(1);
        byte[] bArr2 = zzeu.b;
        if (d2 == 1) {
            zzejVar.n(zzejVar.d(8) * 16);
        } else if (d2 == 0) {
            int d3 = zzejVar.d(16);
            int d4 = zzejVar.d(16);
            if (d3 > 0) {
                bArr2 = new byte[d3];
                zzejVar.i(bArr2, 0, d3);
            }
            if (d4 > 0) {
                bArr = new byte[d4];
                zzejVar.i(bArr, 0, d4);
                return new zzakr(d, p, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakr(d, p, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i2, int i3, int i4, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        int d;
        char c;
        int i6;
        byte b;
        int i7;
        int d2;
        int d3;
        byte b2;
        int i8;
        byte b3;
        byte[] bArr4;
        int i9;
        boolean z;
        int d4;
        int d5;
        int i10;
        int i11;
        int i12;
        int d6;
        int i13;
        Paint paint2 = paint;
        zzej zzejVar = new zzej(bArr, bArr.length);
        int i14 = i3;
        int i15 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zzejVar.a() != 0) {
            int d7 = zzejVar.d(8);
            if (d7 != 240) {
                int i16 = 4;
                int i17 = 1;
                int i18 = 2;
                switch (d7) {
                    case 16:
                        int i19 = 1;
                        if (i2 == 3) {
                            if (bArr5 == null) {
                                bArr3 = i;
                                bArr2 = bArr3;
                                i5 = 0;
                                while (true) {
                                    d = zzejVar.d(2);
                                    if (d != 0) {
                                        i7 = i19;
                                        b3 = d;
                                    } else {
                                        if (zzejVar.p()) {
                                            d2 = zzejVar.d(3) + 3;
                                            d3 = zzejVar.d(2);
                                        } else {
                                            if (zzejVar.p()) {
                                                i7 = i19;
                                                i6 = i5;
                                                b2 = 0;
                                            } else {
                                                int d8 = zzejVar.d(2);
                                                if (d8 != 0) {
                                                    if (d8 != i19) {
                                                        if (d8 != 2) {
                                                            if (d8 != 3) {
                                                                i6 = i5;
                                                                b2 = 0;
                                                                i7 = 0;
                                                            } else {
                                                                d2 = zzejVar.d(8) + 29;
                                                                d3 = zzejVar.d(2);
                                                            }
                                                        } else {
                                                            c = 4;
                                                            i6 = i5;
                                                            i7 = zzejVar.d(4) + 12;
                                                            b = zzejVar.d(2);
                                                        }
                                                    } else {
                                                        c = 4;
                                                        i6 = i5;
                                                        i7 = 2;
                                                        b = 0;
                                                    }
                                                } else {
                                                    c = 4;
                                                    i6 = i19;
                                                    b = 0;
                                                    i7 = 0;
                                                }
                                                if (i7 == 0 && paint2 != null) {
                                                    int i20 = i15 + 1;
                                                    float f = i15;
                                                    if (bArr2 != null) {
                                                        b = bArr2[b];
                                                    }
                                                    paint2.setColor(iArr[b]);
                                                    i8 = i14;
                                                    canvas.drawRect(i14, f, i14 + i7, i20, paint2);
                                                } else {
                                                    i8 = i14;
                                                }
                                                i14 = i8 + i7;
                                                if (i6 != 0) {
                                                    zzejVar.f();
                                                    break;
                                                } else {
                                                    paint2 = paint;
                                                    i5 = i6;
                                                    i19 = 1;
                                                }
                                            }
                                            c = 4;
                                            b = b2;
                                            if (i7 == 0) {
                                            }
                                            i8 = i14;
                                            i14 = i8 + i7;
                                            if (i6 != 0) {
                                            }
                                        }
                                        i7 = d2;
                                        b3 = d3;
                                    }
                                    i6 = i5;
                                    b2 = b3;
                                    c = 4;
                                    b = b2;
                                    if (i7 == 0) {
                                    }
                                    i8 = i14;
                                    i14 = i8 + i7;
                                    if (i6 != 0) {
                                    }
                                }
                            } else {
                                bArr2 = bArr5;
                                i5 = 0;
                                while (true) {
                                    d = zzejVar.d(2);
                                    if (d != 0) {
                                    }
                                    i6 = i5;
                                    b2 = b3;
                                    c = 4;
                                    b = b2;
                                    if (i7 == 0) {
                                    }
                                    i8 = i14;
                                    i14 = i8 + i7;
                                    if (i6 != 0) {
                                    }
                                    paint2 = paint;
                                    i5 = i6;
                                    i19 = 1;
                                }
                            }
                        } else {
                            if (i2 == 2) {
                                if (bArr7 == null) {
                                    bArr3 = h;
                                    bArr2 = bArr3;
                                } else {
                                    bArr2 = bArr7;
                                }
                            } else {
                                bArr2 = null;
                            }
                            i5 = 0;
                            while (true) {
                                d = zzejVar.d(2);
                                if (d != 0) {
                                }
                                i6 = i5;
                                b2 = b3;
                                c = 4;
                                b = b2;
                                if (i7 == 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i6 != 0) {
                                }
                                paint2 = paint;
                                i5 = i6;
                                i19 = 1;
                            }
                        }
                    case 17:
                        if (i2 == 3) {
                            if (bArr6 == null) {
                                bArr4 = j;
                            } else {
                                bArr4 = bArr6;
                            }
                        } else {
                            bArr4 = null;
                        }
                        boolean z2 = false;
                        while (true) {
                            int d9 = zzejVar.d(i16);
                            if (d9 != 0) {
                                i9 = 1;
                                z = z2;
                            } else if (!zzejVar.p()) {
                                int d10 = zzejVar.d(3);
                                if (d10 != 0) {
                                    i9 = d10 + 2;
                                    z = z2;
                                    d9 = 0;
                                } else {
                                    z = true;
                                    d9 = 0;
                                    i9 = 0;
                                }
                            } else {
                                if (!zzejVar.p()) {
                                    d4 = zzejVar.d(i18) + i16;
                                    d5 = zzejVar.d(i16);
                                } else {
                                    int d11 = zzejVar.d(i18);
                                    if (d11 != 0) {
                                        if (d11 != 1) {
                                            if (d11 != i18) {
                                                if (d11 != 3) {
                                                    z = z2;
                                                    d9 = 0;
                                                    i9 = 0;
                                                } else {
                                                    d4 = zzejVar.d(8) + 25;
                                                    d5 = zzejVar.d(i16);
                                                }
                                            } else {
                                                d4 = zzejVar.d(i16) + 9;
                                                d5 = zzejVar.d(i16);
                                            }
                                        } else {
                                            z = z2;
                                            i9 = i18;
                                            d9 = 0;
                                        }
                                    } else {
                                        i9 = 1;
                                        z = z2;
                                        d9 = 0;
                                    }
                                }
                                i9 = d4;
                                z = z2;
                                d9 = d5;
                            }
                            if (i9 != 0 && paint2 != null) {
                                int i21 = i15 + 1;
                                float f2 = i15;
                                byte b4 = d9;
                                if (bArr4 != null) {
                                    b4 = bArr4[d9];
                                }
                                paint2.setColor(iArr[b4]);
                                i10 = i14;
                                i11 = 2;
                                canvas.drawRect(i14, f2, i14 + i9, i21, paint2);
                            } else {
                                i10 = i14;
                                i11 = i18;
                            }
                            i14 = i10 + i9;
                            if (z) {
                                zzejVar.f();
                                continue;
                            } else {
                                i18 = i11;
                                z2 = z;
                                i16 = 4;
                            }
                        }
                    case 18:
                        int i22 = i14;
                        int i23 = 0;
                        while (true) {
                            int d12 = zzejVar.d(8);
                            if (d12 != 0) {
                                i12 = i23;
                                d6 = i17;
                            } else if (!zzejVar.p()) {
                                int d13 = zzejVar.d(7);
                                if (d13 != 0) {
                                    i12 = i23;
                                    d6 = d13;
                                    d12 = 0;
                                } else {
                                    i12 = i17;
                                    d12 = 0;
                                    d6 = 0;
                                }
                            } else {
                                i12 = i23;
                                d6 = zzejVar.d(7);
                                d12 = zzejVar.d(8);
                            }
                            if (d6 != 0 && paint2 != null) {
                                paint2.setColor(iArr[d12]);
                                i13 = i17;
                                canvas.drawRect(i22, i15, i22 + d6, i15 + 1, paint2);
                            } else {
                                i13 = i17;
                            }
                            i22 += d6;
                            if (i12 == 0) {
                                i17 = i13;
                                i23 = i12;
                            } else {
                                i14 = i22;
                                continue;
                            }
                        }
                    default:
                        switch (d7) {
                            case 32:
                                bArr7 = f(4, 4, zzejVar);
                                continue;
                            case 33:
                                bArr5 = f(4, 8, zzejVar);
                                continue;
                            case 34:
                                bArr6 = f(16, 8, zzejVar);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i15 += 2;
                i14 = i3;
            }
            paint2 = paint;
        }
    }

    public static byte[] f(int i2, int i3, zzej zzejVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zzejVar.d(i3);
        }
        return bArr;
    }

    public static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] h() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            int i8 = i7 & 4;
            int i9 = i7 & 2;
            int i10 = i7 & 1;
            if (i7 < 8) {
                if (1 != i10) {
                    i4 = 0;
                } else {
                    i4 = 255;
                }
                if (i9 != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                if (i8 != 0) {
                    i6 = 255;
                } else {
                    i6 = 0;
                }
                iArr[i7] = b(255, i4, i5, i6);
            } else {
                int i11 = 127;
                if (1 != i10) {
                    i2 = 0;
                } else {
                    i2 = 127;
                }
                if (i9 != 0) {
                    i3 = 127;
                } else {
                    i3 = 0;
                }
                if (i8 == 0) {
                    i11 = 0;
                }
                iArr[i7] = b(255, i2, i3, i11);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i20 = 0; i20 < 256; i20++) {
            int i21 = 255;
            if (i20 < 8) {
                int i22 = i20 & 2;
                int i23 = i20 & 4;
                if (1 != (i20 & 1)) {
                    i18 = 0;
                } else {
                    i18 = 255;
                }
                if (i22 != 0) {
                    i19 = 255;
                } else {
                    i19 = 0;
                }
                if (i23 == 0) {
                    i21 = 0;
                }
                iArr[i20] = b(63, i18, i19, i21);
            } else {
                int i24 = i20 & 136;
                int i25 = C7193j50.f;
                int i26 = 85;
                if (i24 != 0) {
                    if (i24 != 8) {
                        int i27 = 43;
                        if (i24 != 128) {
                            if (i24 == 136) {
                                int i28 = i20 & 16;
                                int i29 = i20 & 32;
                                int i30 = i20 & 2;
                                int i31 = i20 & 64;
                                int i32 = i20 & 4;
                                if (1 != (i20 & 1)) {
                                    i14 = 0;
                                } else {
                                    i14 = 43;
                                }
                                if (i28 != 0) {
                                    i15 = 85;
                                } else {
                                    i15 = 0;
                                }
                                if (i30 != 0) {
                                    i16 = 43;
                                } else {
                                    i16 = 0;
                                }
                                if (i29 != 0) {
                                    i17 = 85;
                                } else {
                                    i17 = 0;
                                }
                                if (i32 == 0) {
                                    i27 = 0;
                                }
                                if (i31 == 0) {
                                    i26 = 0;
                                }
                                iArr[i20] = b(255, i14 + i15, i16 + i17, i27 + i26);
                            }
                        } else {
                            int i33 = i20 & 16;
                            int i34 = i20 & 32;
                            int i35 = i20 & 2;
                            int i36 = i20 & 64;
                            int i37 = i20 & 4;
                            if (1 != (i20 & 1)) {
                                i10 = 0;
                            } else {
                                i10 = 43;
                            }
                            int i38 = i10 + 127;
                            if (i33 != 0) {
                                i11 = 85;
                            } else {
                                i11 = 0;
                            }
                            if (i35 != 0) {
                                i12 = 43;
                            } else {
                                i12 = 0;
                            }
                            int i39 = i12 + 127;
                            if (i34 != 0) {
                                i13 = 85;
                            } else {
                                i13 = 0;
                            }
                            if (i37 == 0) {
                                i27 = 0;
                            }
                            int i40 = i27 + 127;
                            if (i36 == 0) {
                                i26 = 0;
                            }
                            iArr[i20] = b(255, i38 + i11, i39 + i13, i40 + i26);
                        }
                    } else {
                        int i41 = i20 & 16;
                        int i42 = i20 & 32;
                        int i43 = i20 & 2;
                        int i44 = i20 & 64;
                        int i45 = i20 & 4;
                        if (1 != (i20 & 1)) {
                            i6 = 0;
                        } else {
                            i6 = 85;
                        }
                        if (i41 != 0) {
                            i7 = 170;
                        } else {
                            i7 = 0;
                        }
                        if (i43 != 0) {
                            i8 = 85;
                        } else {
                            i8 = 0;
                        }
                        if (i42 != 0) {
                            i9 = 170;
                        } else {
                            i9 = 0;
                        }
                        if (i45 == 0) {
                            i26 = 0;
                        }
                        if (i44 == 0) {
                            i25 = 0;
                        }
                        iArr[i20] = b(127, i6 + i7, i8 + i9, i26 + i25);
                    }
                } else {
                    int i46 = i20 & 16;
                    int i47 = i20 & 32;
                    int i48 = i20 & 2;
                    int i49 = i20 & 64;
                    int i50 = i20 & 4;
                    if (1 != (i20 & 1)) {
                        i2 = 0;
                    } else {
                        i2 = 85;
                    }
                    if (i46 != 0) {
                        i3 = 170;
                    } else {
                        i3 = 0;
                    }
                    if (i48 != 0) {
                        i4 = 85;
                    } else {
                        i4 = 0;
                    }
                    if (i47 != 0) {
                        i5 = 170;
                    } else {
                        i5 = 0;
                    }
                    if (i50 == 0) {
                        i26 = 0;
                    }
                    if (i49 == 0) {
                        i25 = 0;
                    }
                    iArr[i20] = b(255, i2 + i3, i4 + i5, i26 + i25);
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i2, int i3, zzakk zzakkVar, zzdk zzdkVar) {
        boolean z;
        zzakd zzakdVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i4;
        zzakw zzakwVar;
        Canvas canvas2;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        zzaku zzakuVar;
        int d;
        int d2;
        int i8;
        int i9;
        int i10;
        int i11;
        zzej zzejVar = new zzej(bArr, i2 + i3);
        zzejVar.l(i2);
        while (true) {
            z = true;
            if (zzejVar.a() >= 48 && zzejVar.d(8) == 15) {
                zzakw zzakwVar2 = this.f;
                int d3 = zzejVar.d(8);
                int d4 = zzejVar.d(16);
                int d5 = zzejVar.d(16);
                int b = zzejVar.b() + d5;
                if (d5 * 8 > zzejVar.a()) {
                    zzdx.f(C10146v80.h, "Data field length exceeds limit");
                    zzejVar.n(zzejVar.a());
                } else {
                    switch (d3) {
                        case 16:
                            if (d4 == zzakwVar2.a) {
                                zzaks zzaksVar = zzakwVar2.i;
                                int d6 = zzejVar.d(8);
                                int d7 = zzejVar.d(4);
                                int d8 = zzejVar.d(2);
                                zzejVar.n(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i12 = d5 - 2; i12 > 0; i12 -= 6) {
                                    int d9 = zzejVar.d(8);
                                    zzejVar.n(8);
                                    sparseArray.put(d9, new zzakt(zzejVar.d(16), zzejVar.d(16)));
                                }
                                zzaks zzaksVar2 = new zzaks(d6, d7, d8, sparseArray);
                                if (zzaksVar2.b != 0) {
                                    zzakwVar2.i = zzaksVar2;
                                    zzakwVar2.c.clear();
                                    zzakwVar2.d.clear();
                                    zzakwVar2.e.clear();
                                    break;
                                } else if (zzaksVar != null) {
                                    if (zzaksVar.a != zzaksVar2.a) {
                                        zzakwVar2.i = zzaksVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzaks zzaksVar3 = zzakwVar2.i;
                            if (d4 == zzakwVar2.a && zzaksVar3 != null) {
                                int d10 = zzejVar.d(8);
                                zzejVar.n(4);
                                boolean p = zzejVar.p();
                                zzejVar.n(3);
                                int d11 = zzejVar.d(16);
                                int d12 = zzejVar.d(16);
                                int d13 = zzejVar.d(3);
                                int d14 = zzejVar.d(3);
                                zzejVar.n(2);
                                int d15 = zzejVar.d(8);
                                int d16 = zzejVar.d(8);
                                int d17 = zzejVar.d(4);
                                int d18 = zzejVar.d(2);
                                zzejVar.n(2);
                                int i13 = d5 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i13 > 0) {
                                    int d19 = zzejVar.d(16);
                                    int d20 = zzejVar.d(2);
                                    int d21 = zzejVar.d(2);
                                    int d22 = zzejVar.d(12);
                                    zzejVar.n(4);
                                    int d23 = zzejVar.d(12);
                                    int i14 = i13 - 6;
                                    if (d20 != 1) {
                                        if (d20 == 2) {
                                            d20 = 2;
                                        } else {
                                            i13 = i14;
                                            d = 0;
                                            d2 = 0;
                                            sparseArray2.put(d19, new zzakv(d20, d21, d22, d23, d, d2));
                                        }
                                    }
                                    i13 -= 8;
                                    d = zzejVar.d(8);
                                    d2 = zzejVar.d(8);
                                    sparseArray2.put(d19, new zzakv(d20, d21, d22, d23, d, d2));
                                }
                                zzaku zzakuVar2 = new zzaku(d10, p, d11, d12, d13, d14, d15, d16, d17, d18, sparseArray2);
                                if (zzaksVar3.b == 0 && (zzakuVar = (zzaku) zzakwVar2.c.get(zzakuVar2.a)) != null) {
                                    int i15 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzakuVar.j;
                                        if (i15 < sparseArray3.size()) {
                                            zzakuVar2.j.put(sparseArray3.keyAt(i15), (zzakv) sparseArray3.valueAt(i15));
                                            i15++;
                                        }
                                    }
                                }
                                zzakwVar2.c.put(zzakuVar2.a, zzakuVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (d4 == zzakwVar2.a) {
                                zzakp c4 = c(zzejVar, d5);
                                zzakwVar2.d.put(c4.a, c4);
                                break;
                            } else if (d4 == zzakwVar2.b) {
                                zzakp c5 = c(zzejVar, d5);
                                zzakwVar2.f.put(c5.a, c5);
                                break;
                            }
                            break;
                        case 19:
                            if (d4 == zzakwVar2.a) {
                                zzakr d24 = d(zzejVar);
                                zzakwVar2.e.put(d24.a, d24);
                                break;
                            } else if (d4 == zzakwVar2.b) {
                                zzakr d25 = d(zzejVar);
                                zzakwVar2.g.put(d25.a, d25);
                                break;
                            }
                            break;
                        case 20:
                            if (d4 == zzakwVar2.a) {
                                zzejVar.n(4);
                                boolean p2 = zzejVar.p();
                                zzejVar.n(3);
                                int d26 = zzejVar.d(16);
                                int d27 = zzejVar.d(16);
                                if (p2) {
                                    int d28 = zzejVar.d(16);
                                    i8 = zzejVar.d(16);
                                    i11 = zzejVar.d(16);
                                    i9 = zzejVar.d(16);
                                    i10 = d28;
                                } else {
                                    i8 = d26;
                                    i9 = d27;
                                    i10 = 0;
                                    i11 = 0;
                                }
                                zzakwVar2.h = new zzakq(d26, d27, i10, i8, i11, i9);
                                break;
                            }
                            break;
                    }
                    zzejVar.o(b - zzejVar.b());
                }
            }
        }
        zzakw zzakwVar3 = this.f;
        zzaks zzaksVar4 = zzakwVar3.i;
        if (zzaksVar4 == null) {
            zzakdVar = new zzakd(zzfyc.F(), C10323vs.b, C10323vs.b);
        } else {
            zzakq zzakqVar = zzakwVar3.h;
            if (zzakqVar == null) {
                zzakqVar = this.d;
            }
            Bitmap bitmap = this.g;
            if (bitmap == null || zzakqVar.a + 1 != bitmap.getWidth() || zzakqVar.b + 1 != this.g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakqVar.a + 1, zzakqVar.b + 1, Bitmap.Config.ARGB_8888);
                this.g = createBitmap;
                this.c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzaksVar4.c;
            int i16 = 0;
            while (i16 < sparseArray4.size()) {
                Canvas canvas3 = this.c;
                canvas3.save();
                zzakt zzaktVar = (zzakt) sparseArray4.valueAt(i16);
                zzaku zzakuVar3 = (zzaku) zzakwVar3.c.get(sparseArray4.keyAt(i16));
                int i17 = zzaktVar.a + zzakqVar.c;
                int i18 = zzaktVar.b + zzakqVar.e;
                int i19 = zzakuVar3.c;
                int i20 = i17 + i19;
                boolean z2 = z;
                int min = Math.min(i20, zzakqVar.d);
                int i21 = zzakuVar3.d;
                int i22 = i18 + i21;
                canvas3.clipRect(i17, i18, min, Math.min(i22, zzakqVar.f));
                int i23 = zzakuVar3.f;
                zzakp zzakpVar = (zzakp) zzakwVar3.d.get(i23);
                if (zzakpVar == null && (zzakpVar = (zzakp) zzakwVar3.f.get(i23)) == null) {
                    zzakpVar = this.e;
                }
                SparseArray sparseArray5 = zzakuVar3.j;
                SparseArray sparseArray6 = sparseArray4;
                int i24 = i16;
                int i25 = 0;
                while (i25 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i25);
                    int i26 = i25;
                    zzakv zzakvVar = (zzakv) sparseArray5.valueAt(i25);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakr zzakrVar = (zzakr) zzakwVar3.e.get(keyAt);
                    if (zzakrVar == null) {
                        zzakrVar = (zzakr) zzakwVar3.g.get(keyAt);
                    }
                    if (zzakrVar != null) {
                        Paint paint = zzakrVar.b ? null : this.a;
                        i6 = i19;
                        int i27 = zzakuVar3.e;
                        zzakwVar = zzakwVar3;
                        int i28 = zzakvVar.a + i17;
                        int i29 = i18 + zzakvVar.b;
                        if (i27 == 3) {
                            iArr = zzakpVar.d;
                        } else if (i27 == 2) {
                            iArr = zzakpVar.c;
                        } else {
                            iArr = zzakpVar.b;
                        }
                        canvas2 = canvas3;
                        i5 = i17;
                        int[] iArr2 = iArr;
                        i7 = i20;
                        e(zzakrVar.c, iArr2, i27, i28, i29, paint, canvas2);
                        e(zzakrVar.d, iArr2, i27, i28, i29 + 1, paint, canvas2);
                    } else {
                        zzakwVar = zzakwVar3;
                        canvas2 = canvas3;
                        i5 = i17;
                        i6 = i19;
                        i7 = i20;
                    }
                    i17 = i5;
                    i20 = i7;
                    i25 = i26 + 1;
                    i19 = i6;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzakwVar3 = zzakwVar;
                }
                zzakw zzakwVar4 = zzakwVar3;
                Canvas canvas4 = canvas3;
                int i30 = i17;
                int i31 = i19;
                int i32 = i20;
                float f = i18;
                float f2 = i30;
                if (zzakuVar3.b) {
                    int i33 = zzakuVar3.e;
                    if (i33 == 3) {
                        i4 = zzakpVar.d[zzakuVar3.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i33 == 2) {
                            i4 = zzakpVar.c[zzakuVar3.h];
                        } else {
                            i4 = zzakpVar.b[zzakuVar3.i];
                        }
                    }
                    Paint paint2 = this.b;
                    paint2.setColor(i4);
                    float f3 = i32;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i22, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzcs zzcsVar = new zzcs();
                zzcsVar.c(Bitmap.createBitmap(this.g, i30, i18, i31, i21));
                float f4 = zzakqVar.a;
                zzcsVar.h(f2 / f4);
                zzcsVar.i(0);
                float f5 = zzakqVar.b;
                zzcsVar.e(f / f5, 0);
                zzcsVar.f(0);
                zzcsVar.k(i31 / f4);
                zzcsVar.d(i21 / f5);
                arrayList.add(zzcsVar.p());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i16 = i24 + 1;
                z = z2;
                zzakwVar3 = zzakwVar4;
                sparseArray4 = sparseArray6;
            }
            zzakdVar = new zzakd(arrayList, C10323vs.b, C10323vs.b);
        }
        zzdkVar.b(zzakdVar);
    }
}

package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C7284jS;

@Deprecated
/* renamed from: o.v80  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10146v80 {
    public static final String h = "DvbParser";
    public static final int i = 16;
    public static final int j = 17;
    public static final int k = 18;
    public static final int l = 19;
    public static final int m = 20;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f891o = 2;
    public static final int p = 3;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 16;
    public static final int t = 17;
    public static final int u = 18;
    public static final int v = 32;
    public static final int w = 33;
    public static final int x = 34;
    public static final int y = 240;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;
    public static final byte[] z = {0, 7, 8, C8077mf.q};
    public static final byte[] A = {0, 119, -120, -1};
    public static final byte[] B = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: o.v80$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: o.v80$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: o.v80$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* renamed from: o.v80$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    /* renamed from: o.v80$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: o.v80$f */
    /* loaded from: classes2.dex */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: o.v80$g */
    /* loaded from: classes2.dex */
    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: o.v80$h */
    /* loaded from: classes2.dex */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        @InterfaceC11300zs1
        public b h;
        @InterfaceC11300zs1
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public C10146v80(int i2, int i3) {
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
        this.d = new b(C8920q7.E, 575, 0, C8920q7.E, 0, 575);
        this.e = new a(0, c(), d(), e());
        this.f = new h(i2, i3);
    }

    public static byte[] a(int i2, int i3, C2903Ey1 c2903Ey1) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) c2903Ey1.h(i3);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] d() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                if ((i7 & 1) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i7 & 2) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                if ((i7 & 4) != 0) {
                    i6 = 255;
                } else {
                    i6 = 0;
                }
                iArr[i7] = f(255, i4, i5, i6);
            } else {
                int i8 = 127;
                if ((i7 & 1) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i7 & 2) != 0) {
                    i3 = 127;
                } else {
                    i3 = 0;
                }
                if ((i7 & 4) == 0) {
                    i8 = 0;
                }
                iArr[i7] = f(255, i2, i3, i8);
            }
        }
        return iArr;
    }

    public static int[] e() {
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
                if ((i20 & 1) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i20 & 2) != 0) {
                    i19 = 255;
                } else {
                    i19 = 0;
                }
                if ((i20 & 4) == 0) {
                    i21 = 0;
                }
                iArr[i20] = f(63, i18, i19, i21);
            } else {
                int i22 = i20 & 136;
                int i23 = C7193j50.f;
                int i24 = 85;
                if (i22 != 0) {
                    if (i22 != 8) {
                        int i25 = 43;
                        if (i22 != 128) {
                            if (i22 == 136) {
                                if ((i20 & 1) != 0) {
                                    i14 = 43;
                                } else {
                                    i14 = 0;
                                }
                                if ((i20 & 16) != 0) {
                                    i15 = 85;
                                } else {
                                    i15 = 0;
                                }
                                int i26 = i14 + i15;
                                if ((i20 & 2) != 0) {
                                    i16 = 43;
                                } else {
                                    i16 = 0;
                                }
                                if ((i20 & 32) != 0) {
                                    i17 = 85;
                                } else {
                                    i17 = 0;
                                }
                                int i27 = i16 + i17;
                                if ((i20 & 4) == 0) {
                                    i25 = 0;
                                }
                                if ((i20 & 64) == 0) {
                                    i24 = 0;
                                }
                                iArr[i20] = f(255, i26, i27, i25 + i24);
                            }
                        } else {
                            if ((i20 & 1) != 0) {
                                i10 = 43;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i10 + 127;
                            if ((i20 & 16) != 0) {
                                i11 = 85;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i28 + i11;
                            if ((i20 & 2) != 0) {
                                i12 = 43;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i12 + 127;
                            if ((i20 & 32) != 0) {
                                i13 = 85;
                            } else {
                                i13 = 0;
                            }
                            int i31 = i30 + i13;
                            if ((i20 & 4) == 0) {
                                i25 = 0;
                            }
                            int i32 = i25 + 127;
                            if ((i20 & 64) == 0) {
                                i24 = 0;
                            }
                            iArr[i20] = f(255, i29, i31, i32 + i24);
                        }
                    } else {
                        if ((i20 & 1) != 0) {
                            i6 = 85;
                        } else {
                            i6 = 0;
                        }
                        if ((i20 & 16) != 0) {
                            i7 = 170;
                        } else {
                            i7 = 0;
                        }
                        int i33 = i6 + i7;
                        if ((i20 & 2) != 0) {
                            i8 = 85;
                        } else {
                            i8 = 0;
                        }
                        if ((i20 & 32) != 0) {
                            i9 = 170;
                        } else {
                            i9 = 0;
                        }
                        int i34 = i8 + i9;
                        if ((i20 & 4) == 0) {
                            i24 = 0;
                        }
                        if ((i20 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i20] = f(127, i33, i34, i24 + i23);
                    }
                } else {
                    if ((i20 & 1) != 0) {
                        i2 = 85;
                    } else {
                        i2 = 0;
                    }
                    if ((i20 & 16) != 0) {
                        i3 = 170;
                    } else {
                        i3 = 0;
                    }
                    int i35 = i2 + i3;
                    if ((i20 & 2) != 0) {
                        i4 = 85;
                    } else {
                        i4 = 0;
                    }
                    if ((i20 & 32) != 0) {
                        i5 = 170;
                    } else {
                        i5 = 0;
                    }
                    int i36 = i4 + i5;
                    if ((i20 & 4) == 0) {
                        i24 = 0;
                    }
                    if ((i20 & 64) == 0) {
                        i23 = 0;
                    }
                    iArr[i20] = f(255, i35, i36, i24 + i23);
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static int g(C2903Ey1 c2903Ey1, int[] iArr, @InterfaceC11300zs1 byte[] bArr, int i2, int i3, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int h2;
        int h3;
        boolean z3 = false;
        while (true) {
            byte h4 = c2903Ey1.h(2);
            if (h4 != 0) {
                z2 = z3;
                i4 = 1;
            } else {
                if (c2903Ey1.g()) {
                    h2 = c2903Ey1.h(3) + 3;
                    h3 = c2903Ey1.h(2);
                } else {
                    if (c2903Ey1.g()) {
                        z2 = z3;
                        i4 = 1;
                    } else {
                        int h5 = c2903Ey1.h(2);
                        if (h5 != 0) {
                            if (h5 != 1) {
                                if (h5 != 2) {
                                    if (h5 != 3) {
                                        z2 = z3;
                                    } else {
                                        h2 = c2903Ey1.h(8) + 29;
                                        h3 = c2903Ey1.h(2);
                                    }
                                } else {
                                    h2 = c2903Ey1.h(4) + 12;
                                    h3 = c2903Ey1.h(2);
                                }
                            } else {
                                z2 = z3;
                                i4 = 2;
                            }
                        } else {
                            z2 = true;
                        }
                        h4 = 0;
                        i4 = 0;
                    }
                    h4 = 0;
                }
                z2 = z3;
                i4 = h2;
                h4 = h3;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    h4 = bArr[h4];
                }
                paint.setColor(iArr[h4]);
                canvas.drawRect(i2, i3, i2 + i4, 1 + i3, paint);
            }
            i2 += i4;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    public static int h(C2903Ey1 c2903Ey1, int[] iArr, @InterfaceC11300zs1 byte[] bArr, int i2, int i3, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int h2;
        int h3;
        boolean z3 = false;
        while (true) {
            byte h4 = c2903Ey1.h(4);
            if (h4 != 0) {
                z2 = z3;
                i4 = 1;
            } else if (!c2903Ey1.g()) {
                int h5 = c2903Ey1.h(3);
                if (h5 != 0) {
                    z2 = z3;
                    i4 = h5 + 2;
                    h4 = 0;
                } else {
                    z2 = true;
                    h4 = 0;
                    i4 = 0;
                }
            } else {
                if (!c2903Ey1.g()) {
                    h2 = c2903Ey1.h(2) + 4;
                    h3 = c2903Ey1.h(4);
                } else {
                    int h6 = c2903Ey1.h(2);
                    if (h6 != 0) {
                        if (h6 != 1) {
                            if (h6 != 2) {
                                if (h6 != 3) {
                                    z2 = z3;
                                    h4 = 0;
                                    i4 = 0;
                                } else {
                                    h2 = c2903Ey1.h(8) + 25;
                                    h3 = c2903Ey1.h(4);
                                }
                            } else {
                                h2 = c2903Ey1.h(4) + 9;
                                h3 = c2903Ey1.h(4);
                            }
                        } else {
                            h4 = 0;
                            i4 = 2;
                            z2 = z3;
                        }
                    } else {
                        z2 = z3;
                        i4 = 1;
                        h4 = 0;
                    }
                }
                z2 = z3;
                i4 = h2;
                h4 = h3;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    h4 = bArr[h4];
                }
                paint.setColor(iArr[h4]);
                canvas.drawRect(i2, i3, i2 + i4, 1 + i3, paint);
            }
            i2 += i4;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    public static int i(C2903Ey1 c2903Ey1, int[] iArr, @InterfaceC11300zs1 byte[] bArr, int i2, int i3, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        boolean z2;
        int h2;
        boolean z3 = false;
        while (true) {
            byte h3 = c2903Ey1.h(8);
            if (h3 != 0) {
                z2 = z3;
                h2 = 1;
            } else if (!c2903Ey1.g()) {
                int h4 = c2903Ey1.h(7);
                if (h4 != 0) {
                    z2 = z3;
                    h2 = h4;
                    h3 = 0;
                } else {
                    z2 = true;
                    h3 = 0;
                    h2 = 0;
                }
            } else {
                z2 = z3;
                h2 = c2903Ey1.h(7);
                h3 = c2903Ey1.h(8);
            }
            if (h2 != 0 && paint != null) {
                if (bArr != null) {
                    h3 = bArr[h3];
                }
                paint.setColor(iArr[h3]);
                canvas.drawRect(i2, i3, i2 + h2, 1 + i3, paint);
            }
            i2 += h2;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        C2903Ey1 c2903Ey1 = new C2903Ey1(bArr);
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        int i5 = i3;
        int i6 = i4;
        byte[] bArr8 = null;
        while (c2903Ey1.b() != 0) {
            int h2 = c2903Ey1.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i2 == 3) {
                            if (bArr8 == null) {
                                bArr3 = A;
                            } else {
                                bArr3 = bArr8;
                            }
                        } else if (i2 == 2) {
                            if (bArr7 == null) {
                                bArr3 = z;
                            } else {
                                bArr3 = bArr7;
                            }
                        } else {
                            bArr2 = null;
                            paint2 = paint3;
                            i5 = g(c2903Ey1, iArr2, bArr2, i5, i6, paint2, canvas2);
                            c2903Ey1.c();
                            continue;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i5 = g(c2903Ey1, iArr2, bArr2, i5, i6, paint2, canvas2);
                        c2903Ey1.c();
                        continue;
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i2 == 3) {
                            if (bArr6 == null) {
                                bArr5 = B;
                            } else {
                                bArr5 = bArr6;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i5 = h(c2903Ey1, iArr2, bArr4, i5, i6, paint2, canvas2);
                        c2903Ey1.c();
                        continue;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i5 = i(c2903Ey1, iArr2, null, i5, i6, paint2, canvas2);
                        continue;
                    default:
                        switch (h2) {
                            case 32:
                                bArr7 = a(4, 4, c2903Ey1);
                                break;
                            case 33:
                                bArr8 = a(4, 8, c2903Ey1);
                                break;
                            case 34:
                                bArr6 = a(16, 8, c2903Ey1);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        continue;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i6 += 2;
                i5 = i3;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    public static void k(c cVar, a aVar, int i2, int i3, int i4, @InterfaceC11300zs1 Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        j(cVar.c, iArr2, i2, i3, i4, paint, canvas);
        j(cVar.d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    public static a l(C2903Ey1 c2903Ey1, int i2) {
        int[] iArr;
        int h2;
        int i3;
        int h3;
        int h4;
        int i4;
        int i5 = 8;
        int h5 = c2903Ey1.h(8);
        c2903Ey1.s(8);
        int i6 = 2;
        int i7 = i2 - 2;
        int[] c2 = c();
        int[] d2 = d();
        int[] e2 = e();
        while (i7 > 0) {
            int h6 = c2903Ey1.h(i5);
            int h7 = c2903Ey1.h(i5);
            if ((h7 & 128) != 0) {
                iArr = c2;
            } else if ((h7 & 64) != 0) {
                iArr = d2;
            } else {
                iArr = e2;
            }
            if ((h7 & 1) != 0) {
                h4 = c2903Ey1.h(i5);
                i4 = c2903Ey1.h(i5);
                h2 = c2903Ey1.h(i5);
                h3 = c2903Ey1.h(i5);
                i3 = i7 - 6;
            } else {
                int h8 = c2903Ey1.h(4) << 4;
                h2 = c2903Ey1.h(4) << 4;
                i3 = i7 - 4;
                h3 = c2903Ey1.h(i6) << 6;
                h4 = c2903Ey1.h(6) << i6;
                i4 = h8;
            }
            if (h4 == 0) {
                h3 = 255;
                i4 = 0;
                h2 = 0;
            }
            double d3 = h4;
            double d4 = i4 - 128;
            double d5 = h2 - 128;
            iArr[h6] = f((byte) (255 - (h3 & 255)), TD2.w((int) (d3 + (1.402d * d4)), 0, 255), TD2.w((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), TD2.w((int) (d3 + (d5 * 1.772d)), 0, 255));
            i7 = i3;
            h5 = h5;
            i5 = 8;
            i6 = 2;
        }
        return new a(h5, c2, d2, e2);
    }

    public static b m(C2903Ey1 c2903Ey1) {
        int i2;
        int i3;
        int i4;
        int i5;
        c2903Ey1.s(4);
        boolean g2 = c2903Ey1.g();
        c2903Ey1.s(3);
        int h2 = c2903Ey1.h(16);
        int h3 = c2903Ey1.h(16);
        if (g2) {
            int h4 = c2903Ey1.h(16);
            int h5 = c2903Ey1.h(16);
            int h6 = c2903Ey1.h(16);
            i5 = c2903Ey1.h(16);
            i4 = h5;
            i3 = h6;
            i2 = h4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = h2;
            i5 = h3;
        }
        return new b(h2, h3, i2, i4, i3, i5);
    }

    public static c n(C2903Ey1 c2903Ey1) {
        byte[] bArr;
        int h2 = c2903Ey1.h(16);
        c2903Ey1.s(4);
        int h3 = c2903Ey1.h(2);
        boolean g2 = c2903Ey1.g();
        c2903Ey1.s(1);
        byte[] bArr2 = TD2.f;
        if (h3 == 1) {
            c2903Ey1.s(c2903Ey1.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = c2903Ey1.h(16);
            int h5 = c2903Ey1.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                c2903Ey1.k(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                c2903Ey1.k(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    public static d o(C2903Ey1 c2903Ey1, int i2) {
        int h2 = c2903Ey1.h(8);
        int h3 = c2903Ey1.h(4);
        int h4 = c2903Ey1.h(2);
        c2903Ey1.s(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = c2903Ey1.h(8);
            c2903Ey1.s(8);
            i3 -= 6;
            sparseArray.put(h5, new e(c2903Ey1.h(16), c2903Ey1.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    public static f p(C2903Ey1 c2903Ey1, int i2) {
        int i3;
        int i4;
        int i5;
        char c2;
        int h2 = c2903Ey1.h(8);
        int i6 = 4;
        c2903Ey1.s(4);
        boolean g2 = c2903Ey1.g();
        c2903Ey1.s(3);
        int i7 = 16;
        int h3 = c2903Ey1.h(16);
        int h4 = c2903Ey1.h(16);
        int h5 = c2903Ey1.h(3);
        int h6 = c2903Ey1.h(3);
        int i8 = 2;
        c2903Ey1.s(2);
        int h7 = c2903Ey1.h(8);
        int h8 = c2903Ey1.h(8);
        int h9 = c2903Ey1.h(4);
        int h10 = c2903Ey1.h(2);
        c2903Ey1.s(2);
        int i9 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i9 > 0) {
            int h11 = c2903Ey1.h(i7);
            int h12 = c2903Ey1.h(i8);
            int h13 = c2903Ey1.h(i8);
            int h14 = c2903Ey1.h(12);
            c2903Ey1.s(i6);
            int h15 = c2903Ey1.h(12);
            int i10 = i9 - 6;
            if (h12 != 1) {
                i3 = 2;
                if (h12 != 2) {
                    i5 = 0;
                    i4 = 0;
                    i9 = i10;
                    c2 = '\b';
                    sparseArray.put(h11, new g(h12, h13, h14, h15, i5, i4));
                    i7 = 16;
                    i8 = i3;
                    i6 = 4;
                }
            } else {
                i3 = 2;
            }
            c2 = '\b';
            i9 -= 8;
            i5 = c2903Ey1.h(8);
            i4 = c2903Ey1.h(8);
            sparseArray.put(h11, new g(h12, h13, h14, h15, i5, i4));
            i7 = 16;
            i8 = i3;
            i6 = 4;
        }
        return new f(h2, g2, h3, h4, h5, h6, h7, h8, h9, h10, sparseArray);
    }

    public static void q(C2903Ey1 c2903Ey1, h hVar) {
        f fVar;
        int h2 = c2903Ey1.h(8);
        int h3 = c2903Ey1.h(16);
        int h4 = c2903Ey1.h(16);
        int d2 = c2903Ey1.d() + h4;
        if (h4 * 8 > c2903Ey1.b()) {
            I31.n(h, "Data field length exceeds limit");
            c2903Ey1.s(c2903Ey1.b());
            return;
        }
        switch (h2) {
            case 16:
                if (h3 == hVar.a) {
                    d dVar = hVar.i;
                    d o2 = o(c2903Ey1, h4);
                    if (o2.c != 0) {
                        hVar.i = o2;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    } else if (dVar != null && dVar.b != o2.b) {
                        hVar.i = o2;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (h3 == hVar.a && dVar2 != null) {
                    f p2 = p(c2903Ey1, h4);
                    if (dVar2.c == 0 && (fVar = hVar.c.get(p2.a)) != null) {
                        p2.a(fVar);
                    }
                    hVar.c.put(p2.a, p2);
                    break;
                }
                break;
            case 18:
                if (h3 == hVar.a) {
                    a l2 = l(c2903Ey1, h4);
                    hVar.d.put(l2.a, l2);
                    break;
                } else if (h3 == hVar.b) {
                    a l3 = l(c2903Ey1, h4);
                    hVar.f.put(l3.a, l3);
                    break;
                }
                break;
            case 19:
                if (h3 == hVar.a) {
                    c n2 = n(c2903Ey1);
                    hVar.e.put(n2.a, n2);
                    break;
                } else if (h3 == hVar.b) {
                    c n3 = n(c2903Ey1);
                    hVar.g.put(n3.a, n3);
                    break;
                }
                break;
            case 20:
                if (h3 == hVar.a) {
                    hVar.h = m(c2903Ey1);
                    break;
                }
                break;
        }
        c2903Ey1.t(d2 - c2903Ey1.d());
    }

    public List<C7284jS> b(byte[] bArr, int i2) {
        int i3;
        SparseArray<e> sparseArray;
        int i4;
        Paint paint;
        C2903Ey1 c2903Ey1 = new C2903Ey1(bArr, i2);
        while (c2903Ey1.b() >= 48 && c2903Ey1.h(8) == 15) {
            q(c2903Ey1, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.EMPTY_LIST;
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.d;
        int i5 = 0;
        while (i5 < sparseArray2.size()) {
            this.c.save();
            e valueAt = sparseArray2.valueAt(i5);
            f fVar = this.f.c.get(sparseArray2.keyAt(i5));
            int i6 = valueAt.a + bVar.c;
            int i7 = valueAt.b + bVar.e;
            this.c.clipRect(i6, i7, Math.min(fVar.c + i6, bVar.d), Math.min(fVar.d + i7, bVar.f));
            a aVar = this.f.d.get(fVar.g);
            if (aVar == null && (aVar = this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            a aVar2 = aVar;
            SparseArray<g> sparseArray3 = fVar.k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i8);
                g valueAt2 = sparseArray3.valueAt(i8);
                c cVar = this.f.e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f.g.get(keyAt);
                }
                if (cVar != null) {
                    if (cVar.b) {
                        paint = null;
                    } else {
                        paint = this.a;
                    }
                    sparseArray = sparseArray2;
                    i4 = i8;
                    k(cVar, aVar2, fVar.f, valueAt2.c + i6, valueAt2.d + i7, paint, this.c);
                } else {
                    sparseArray = sparseArray2;
                    i4 = i8;
                }
                i8 = i4 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<e> sparseArray4 = sparseArray2;
            if (fVar.b) {
                int i9 = fVar.f;
                if (i9 == 3) {
                    i3 = aVar2.d[fVar.h];
                } else if (i9 == 2) {
                    i3 = aVar2.c[fVar.i];
                } else {
                    i3 = aVar2.b[fVar.j];
                }
                this.b.setColor(i3);
                this.c.drawRect(i6, i7, fVar.c + i6, fVar.d + i7, this.b);
            }
            arrayList.add(new C7284jS.c().r(Bitmap.createBitmap(this.g, i6, i7, fVar.c, fVar.d)).w(i6 / bVar.a).x(0).t(i7 / bVar.b, 0).u(0).z(fVar.c / bVar.a).s(fVar.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
            i5++;
            sparseArray2 = sparseArray4;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f.a();
    }
}

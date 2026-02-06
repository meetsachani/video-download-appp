package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import o.AbstractC5091aS1;
import o.DT1;

/* renamed from: o.rN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9234rN0 extends AbstractC5091aS1<Bitmap> {
    public static final int t1 = 1000;
    public static final int u1 = 2;
    public static final float v1 = 2.0f;
    public static final Object w1 = new Object();
    public final Object n1;
    public DT1.b<Bitmap> o1;
    public final Bitmap.Config p1;
    public final int q1;
    public final int r1;
    public final ImageView.ScaleType s1;

    public C9234rN0(String str, DT1.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, DT1.a aVar) {
        super(0, str, aVar);
        this.n1 = new Object();
        U(new C8406o00(1000, 2, 2.0f));
        this.o1 = bVar;
        this.p1 = config;
        this.q1 = i;
        this.r1 = i2;
        this.s1 = scaleType;
    }

    public static int g0(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 <= min) {
                f = f2;
            } else {
                return (int) f;
            }
        }
    }

    public static int h0(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType == ImageView.ScaleType.FIT_XY) {
                if (i != 0) {
                    return i;
                }
            } else if (i == 0) {
                return (int) (i3 * (i2 / i4));
            } else if (i2 != 0) {
                double d = i4 / i3;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    if (i * d < d2) {
                        return (int) (d2 / d);
                    }
                    return i;
                }
                double d3 = i2;
                if (i * d > d3) {
                    return (int) (d3 / d);
                }
                return i;
            } else {
                return i;
            }
        }
        return i3;
    }

    @Override // o.AbstractC5091aS1
    public AbstractC5091aS1.d C() {
        return AbstractC5091aS1.d.LOW;
    }

    @Override // o.AbstractC5091aS1
    public DT1<Bitmap> P(C3470Kp1 c3470Kp1) {
        DT1<Bitmap> f0;
        synchronized (w1) {
            try {
                try {
                    f0 = f0(c3470Kp1);
                } catch (OutOfMemoryError e) {
                    C6767hJ2.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c3470Kp1.b.length), I());
                    return DT1.a(new C3306Iy1(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0;
    }

    @Override // o.AbstractC5091aS1
    /* renamed from: e0 */
    public void l(Bitmap bitmap) {
        DT1.b<Bitmap> bVar;
        synchronized (this.n1) {
            bVar = this.o1;
        }
        if (bVar != null) {
            bVar.b(bitmap);
        }
    }

    public final DT1<Bitmap> f0(C3470Kp1 c3470Kp1) {
        Bitmap decodeByteArray;
        byte[] bArr = c3470Kp1.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.q1 == 0 && this.r1 == 0) {
            options.inPreferredConfig = this.p1;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int h0 = h0(this.q1, this.r1, i, i2, this.s1);
            int h02 = h0(this.r1, this.q1, i2, i, this.s1);
            options.inJustDecodeBounds = false;
            options.inSampleSize = g0(i, i2, h0, h02);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > h0 || decodeByteArray.getHeight() > h02)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, h0, h02, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return DT1.a(new C3306Iy1(c3470Kp1));
        }
        return DT1.c(decodeByteArray, C11161zI0.e(c3470Kp1));
    }

    @Override // o.AbstractC5091aS1
    public void h() {
        super.h();
        synchronized (this.n1) {
            this.o1 = null;
        }
    }

    @Deprecated
    public C9234rN0(String str, DT1.b<Bitmap> bVar, int i, int i2, Bitmap.Config config, DT1.a aVar) {
        this(str, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}

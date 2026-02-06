package o;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* renamed from: o.Hn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3166Hn {

    /* renamed from: o.Hn$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = c.a(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        public static Bitmap b(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = c.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        public static boolean c(Bitmap bitmap) {
            ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(colorSpace)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.Hn$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* renamed from: o.Hn$c */
    /* loaded from: classes.dex */
    public static class c {
        public static Bitmap.Config a(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a4, code lost:
        if (o.C3166Hn.a.c(r4) == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Bitmap bitmap, int i, int i2, Rect rect, boolean z) {
        Bitmap bitmap2;
        int width;
        int height;
        int i3;
        int i4;
        float f;
        int i5;
        double floor;
        double floor2;
        Bitmap bitmap3;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        char c2;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        if (i > 0 && i2 > 0) {
            if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
                throw new IllegalArgumentException("srcRect must be contained by srcBm!");
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 27) {
                bitmap2 = a.a(bitmap);
            } else {
                bitmap2 = bitmap;
            }
            if (rect != null) {
                width = rect.width();
            } else {
                width = bitmap.getWidth();
            }
            if (rect != null) {
                height = rect.height();
            } else {
                height = bitmap.getHeight();
            }
            float f2 = i / width;
            float f3 = i2 / height;
            if (rect != null) {
                i3 = rect.left;
            } else {
                i3 = 0;
            }
            if (rect != null) {
                i4 = rect.top;
            } else {
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
                if (bitmap.isMutable() && bitmap == bitmap2) {
                    return bitmap.copy(bitmap.getConfig(), true);
                }
                return bitmap2;
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (i12 >= 29) {
                b.a(paint);
            } else {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            }
            if (width == i && height == i2) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, bitmap2.getConfig());
                new Canvas(createBitmap).drawBitmap(bitmap2, -i3, -i4, paint);
                return createBitmap;
            }
            double log = Math.log(2.0d);
            if (f2 > 1.0f) {
                f = 1.0f;
                i5 = i3;
                floor = Math.ceil(Math.log(f2) / log);
            } else {
                f = 1.0f;
                i5 = i3;
                floor = Math.floor(Math.log(f2) / log);
            }
            int i13 = (int) floor;
            if (f3 > f) {
                floor2 = Math.ceil(Math.log(f3) / log);
            } else {
                floor2 = Math.floor(Math.log(f3) / log);
            }
            int i14 = (int) floor2;
            if (z && i12 >= 27 && !a.c(bitmap)) {
                if (i13 > 0) {
                    i10 = e(width, i, 1, i13);
                } else {
                    i10 = width;
                }
                if (i14 > 0) {
                    i11 = e(height, i2, 1, i14);
                } else {
                    i11 = height;
                }
                Bitmap b2 = a.b(i10, i11, bitmap, true);
                new Canvas(b2).drawBitmap(bitmap2, -i5, -i4, paint);
                Bitmap bitmap4 = bitmap2;
                bitmap2 = b2;
                bitmap3 = bitmap4;
                i7 = 1;
                i4 = 0;
                i6 = 0;
            } else {
                bitmap3 = null;
                i6 = i5;
                i7 = 0;
            }
            Rect rect2 = new Rect(i6, i4, width, height);
            Rect rect3 = new Rect();
            int i15 = i13;
            int i16 = i14;
            while (true) {
                if (i15 == 0 && i16 == 0) {
                    break;
                }
                if (i15 < 0) {
                    i15++;
                } else if (i15 > 0) {
                    i15--;
                }
                if (i16 < 0) {
                    i16++;
                } else if (i16 > 0) {
                    i16--;
                }
                int i17 = i16;
                int i18 = i7;
                int i19 = i15;
                rect3.set(0, 0, e(width, i, i15, i13), e(height, i2, i17, i14));
                if (i19 == 0 && i17 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bitmap3 != null && bitmap3.getWidth() == i && bitmap3.getHeight() == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bitmap3 != null && bitmap3 != bitmap) {
                    if (z) {
                        z4 = z2;
                        if (Build.VERSION.SDK_INT >= 27) {
                        }
                    } else {
                        z4 = z2;
                    }
                    if (!z4 || (z3 && i18 == 0)) {
                        c2 = 27;
                        new Canvas(bitmap3).drawBitmap(bitmap2, rect2, rect3, paint);
                        rect2.set(rect3);
                        Bitmap bitmap5 = bitmap2;
                        bitmap2 = bitmap3;
                        bitmap3 = bitmap5;
                        i16 = i17;
                        i7 = i18;
                        i15 = i19;
                    }
                } else {
                    z4 = z2;
                }
                if (bitmap3 != bitmap && bitmap3 != null) {
                    bitmap3.recycle();
                }
                if (i19 > 0) {
                    i8 = i18;
                } else {
                    i8 = i19;
                }
                int e = e(width, i, i8, i13);
                if (i17 > 0) {
                    i9 = i18;
                } else {
                    i9 = i17;
                }
                int e2 = e(height, i2, i9, i14);
                c2 = 27;
                if (Build.VERSION.SDK_INT >= 27) {
                    if (z && !z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bitmap3 = a.b(e, e2, bitmap, z5);
                } else {
                    bitmap3 = Bitmap.createBitmap(e, e2, bitmap2.getConfig());
                }
                new Canvas(bitmap3).drawBitmap(bitmap2, rect2, rect3, paint);
                rect2.set(rect3);
                Bitmap bitmap52 = bitmap2;
                bitmap2 = bitmap3;
                bitmap3 = bitmap52;
                i16 = i17;
                i7 = i18;
                i15 = i19;
            }
            if (bitmap3 != bitmap && bitmap3 != null) {
                bitmap3.recycle();
            }
            return bitmap2;
        }
        throw new IllegalArgumentException("dstW and dstH must be > 0!");
    }

    @JR1(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int b(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @JR1(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean c(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @JR1(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void d(Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }

    public static int e(int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            return i2;
        }
        if (i3 > 0) {
            return i * (1 << (i4 - i3));
        }
        return i2 << ((-i3) - 1);
    }
}

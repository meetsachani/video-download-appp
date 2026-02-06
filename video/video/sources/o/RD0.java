package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import o.RD0;
import o.ZD0;

/* loaded from: classes.dex */
public final class RD0 {
    public static final String a = "GlideBitmapFactory";

    /* loaded from: classes.dex */
    public static final class a {
        public static final ColorMatrixColorFilter a = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

        public static Gainmap a(Gainmap gainmap) {
            Bitmap a2 = AD0.a(gainmap);
            if (a2.getConfig() != Bitmap.Config.ALPHA_8) {
                return gainmap;
            }
            Gainmap a3 = HD0.a(b(a2));
            float[] a4 = MD0.a(gainmap);
            ND0.a(a3, a4[0], a4[1], a4[2]);
            float[] a5 = OD0.a(gainmap);
            PD0.a(a3, a5[0], a5[1], a5[2]);
            float[] a6 = QD0.a(gainmap);
            DD0.a(a3, a6[0], a6[1], a6[2]);
            float[] a7 = ED0.a(gainmap);
            FD0.a(a3, a7[0], a7[1], a7[2]);
            float[] a8 = GD0.a(gainmap);
            CD0.a(a3, a8[0], a8[1], a8[2]);
            JD0.a(a3, ID0.a(gainmap));
            LD0.a(a3, KD0.a(gainmap));
            return a3;
        }

        public static Bitmap b(Bitmap bitmap) {
            boolean z;
            if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                z = true;
            } else {
                z = false;
            }
            C10175vF1.a(z);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(a);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.setBitmap(null);
            return createBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final String a = "GainmapWorkaroundCalc";
        public static final ZD0.b<Boolean> b = ZD0.a(new ZD0.b() { // from class: o.SD0
            @Override // o.ZD0.b
            public final Object get() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(RD0.b.c());
                return valueOf;
            }
        });

        public static boolean c() {
            boolean z = false;
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap copy = createBitmap.copy(V61.a(), false);
            createBitmap.recycle();
            if (copy == null) {
                z = true;
            }
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (copy != null) {
                copy.recycle();
            }
            return z;
        }

        public static boolean d(BitmapFactory.Options options) {
            if (Build.VERSION.SDK_INT != 34 || options.inPreferredConfig != V61.a()) {
                return false;
            }
            return b.get().booleanValue();
        }
    }

    public static Bitmap a(byte[] bArr, BitmapFactory.Options options, InterfaceC8012mN0 interfaceC8012mN0) {
        if (Build.VERSION.SDK_INT == 34 && b.d(options) && d(interfaceC8012mN0)) {
            return g(bArr, options);
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Bitmap b(FileDescriptor fileDescriptor, BitmapFactory.Options options, InterfaceC8012mN0 interfaceC8012mN0) {
        if (Build.VERSION.SDK_INT == 34 && b.d(options) && d(interfaceC8012mN0)) {
            return e(fileDescriptor, options);
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap c(InputStream inputStream, BitmapFactory.Options options, InterfaceC8012mN0 interfaceC8012mN0) {
        if (Build.VERSION.SDK_INT == 34 && b.d(options) && d(interfaceC8012mN0)) {
            return f(inputStream, options);
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static boolean d(InterfaceC8012mN0 interfaceC8012mN0) {
        try {
            boolean b2 = interfaceC8012mN0.b();
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "isLikelyToContainGainmap=" + b2);
                return b2;
            }
            return b2;
        } catch (IOException e) {
            if (Log.isLoggable(a, 2)) {
                Log.v(a, "isLikelyToContainGainmap failed", e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap e(FileDescriptor fileDescriptor, BitmapFactory.Options options) {
        boolean z;
        Throwable th;
        Bitmap bitmap;
        if (options.inPreferredConfig == V61.a()) {
            z = true;
        } else {
            z = false;
        }
        C10175vF1.a(z);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = null;
        try {
            bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmap != null) {
                try {
                    bitmap2 = h(bitmap);
                } catch (Throwable th2) {
                    th = th2;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    options.inPreferredConfig = V61.a();
                    throw th;
                }
            }
            bitmap.recycle();
            options.inPreferredConfig = V61.a();
            return bitmap2;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap f(InputStream inputStream, BitmapFactory.Options options) {
        boolean z;
        Throwable th;
        Bitmap bitmap;
        if (options.inPreferredConfig == V61.a()) {
            z = true;
        } else {
            z = false;
        }
        C10175vF1.a(z);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = null;
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmap != null) {
                try {
                    bitmap2 = h(bitmap);
                } catch (Throwable th2) {
                    th = th2;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    options.inPreferredConfig = V61.a();
                    throw th;
                }
            }
            bitmap.recycle();
            options.inPreferredConfig = V61.a();
            return bitmap2;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap g(byte[] bArr, BitmapFactory.Options options) {
        boolean z;
        Throwable th;
        Bitmap bitmap;
        if (options.inPreferredConfig == V61.a()) {
            z = true;
        } else {
            z = false;
        }
        C10175vF1.a(z);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap2 = null;
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null) {
                try {
                    bitmap2 = h(bitmap);
                } catch (Throwable th2) {
                    th = th2;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    options.inPreferredConfig = V61.a();
                    throw th;
                }
            }
            bitmap.recycle();
            options.inPreferredConfig = V61.a();
            return bitmap2;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }

    public static Bitmap h(Bitmap bitmap) {
        Gainmap a2 = C11141zD0.a(bitmap);
        if (a2 != null && AD0.a(a2).getConfig() == Bitmap.Config.ALPHA_8) {
            BD0.a(bitmap, a.a(a2));
        }
        return bitmap.copy(V61.a(), false);
    }
}

package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: o.eE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6006eE2 {
    public static final int a = 1000000000;
    public static final Matrix b = new Matrix();
    public static final ThreadLocal<PathMeasure> c = new a();
    public static final ThreadLocal<Path> d = new b();
    public static final ThreadLocal<Path> e = new c();
    public static final ThreadLocal<float[]> f = new d();
    public static final float g = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: o.eE2$a */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: o.eE2$b */
    /* loaded from: classes.dex */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: o.eE2$c */
    /* loaded from: classes.dex */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: o.eE2$d */
    /* loaded from: classes.dex */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f2, float f3, float f4) {
        if (ZX0.h()) {
            ZX0.b("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = c.get();
        Path path2 = d.get();
        Path path3 = e.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            if (ZX0.h()) {
                ZX0.c("applyTrimPathIfNeeded");
            }
        } else if (length >= 1.0f && Math.abs((f3 - f2) - 1.0f) >= 0.01d) {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = C4713Xj1.g(min, length);
                max = C4713Xj1.g(max, length);
            }
            if (min < 0.0f) {
                min = C4713Xj1.g(min, length);
            }
            if (max < 0.0f) {
                max = C4713Xj1.g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                if (ZX0.h()) {
                    ZX0.c("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (ZX0.h()) {
                ZX0.c("applyTrimPathIfNeeded");
            }
        } else if (ZX0.h()) {
            ZX0.c("applyTrimPathIfNeeded");
        }
    }

    public static void b(Path path, C10823xu2 c10823xu2) {
        if (c10823xu2 != null && !c10823xu2.l()) {
            a(path, ((C8629ov0) c10823xu2.j()).r() / 100.0f, ((C8629ov0) c10823xu2.d()).r() / 100.0f, ((C8629ov0) c10823xu2.i()).r() / 360.0f);
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF.x + pointF3.x, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = g;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    public static int i(float f2, float f3, float f4, float f5) {
        int i;
        if (f2 != 0.0f) {
            i = (int) (527 * f2);
        } else {
            i = 17;
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        if (f5 != 0.0f) {
            return (int) (i * 31 * f5);
        }
        return i;
    }

    public static boolean j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 <= i5 && i3 < i6) {
            return false;
        }
        return true;
    }

    public static boolean k(Throwable th) {
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            return false;
        }
        return true;
    }

    public static int l(int i, int i2) {
        return (int) ((((i / 255.0f) * i2) / 255.0f) * 255.0f);
    }

    public static Bitmap m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C5353bY0 c5353bY0 = new C5353bY0();
        c5353bY0.setAntiAlias(true);
        c5353bY0.setColor(-16776961);
        canvas.drawPath(path, c5353bY0);
        return createBitmap;
    }

    public static Bitmap n(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint) {
        p(canvas, rectF, paint, 31);
    }

    public static void p(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (ZX0.h()) {
            ZX0.b("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (ZX0.h()) {
            ZX0.c("Utils#saveLayer");
        }
    }
}

package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.b;
import java.nio.ByteBuffer;
import java.util.Locale;
import o.AN0;
import o.C10206vN0;
import o.C10907yF1;
import o.C7433k41;
import o.C7693l82;
import o.InterfaceC8499oN0;

/* loaded from: classes.dex */
public final class ImageProcessingUtil {
    public static final String a = "ImageProcessingUtil";
    public static int b;

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(g gVar, g gVar2, g gVar3) {
        if (gVar != null && gVar2 != null) {
            gVar2.close();
        }
    }

    public static /* synthetic */ void b(g gVar, g gVar2, g gVar3) {
        if (gVar != null && gVar2 != null) {
            gVar2.close();
        }
    }

    public static boolean c(g gVar) {
        if (!m(gVar)) {
            C7433k41.c(a, "Unsupported format for YUV to RGB");
            return false;
        } else if (d(gVar) == a.ERROR_CONVERSION) {
            C7433k41.c(a, "One pixel shift for YUV failure");
            return false;
        } else {
            return true;
        }
    }

    public static a d(g gVar) {
        int width = gVar.getWidth();
        int height = gVar.getHeight();
        int C = gVar.f3()[0].C();
        int C2 = gVar.f3()[1].C();
        int C3 = gVar.f3()[2].C();
        int D = gVar.f3()[0].D();
        int D2 = gVar.f3()[1].D();
        if (nativeShiftPixel(gVar.f3()[0].B(), C, gVar.f3()[1].B(), C2, gVar.f3()[2].B(), C3, D, D2, width, height, D, D2, D2) != 0) {
            return a.ERROR_CONVERSION;
        }
        return a.SUCCESS;
    }

    public static g e(InterfaceC8499oN0 interfaceC8499oN0, byte[] bArr) {
        boolean z;
        if (interfaceC8499oN0.c() == 256) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.a(z);
        C10907yF1.l(bArr);
        Surface surface = interfaceC8499oN0.getSurface();
        C10907yF1.l(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            C7433k41.c(a, "Failed to enqueue JPEG image.");
            return null;
        }
        g a2 = interfaceC8499oN0.a();
        if (a2 == null) {
            C7433k41.c(a, "Failed to get acquire JPEG image.");
        }
        return a2;
    }

    public static Bitmap f(g gVar) {
        if (gVar.getFormat() == 35) {
            int width = gVar.getWidth();
            int height = gVar.getHeight();
            int C = gVar.f3()[0].C();
            int C2 = gVar.f3()[1].C();
            int C3 = gVar.f3()[2].C();
            int D = gVar.f3()[0].D();
            int D2 = gVar.f3()[1].D();
            Bitmap createBitmap = Bitmap.createBitmap(gVar.getWidth(), gVar.getHeight(), Bitmap.Config.ARGB_8888);
            if (nativeConvertAndroid420ToBitmap(gVar.f3()[0].B(), C, gVar.f3()[1].B(), C2, gVar.f3()[2].B(), C3, D, D2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static g g(final g gVar, InterfaceC8499oN0 interfaceC8499oN0, ByteBuffer byteBuffer, int i, boolean z) {
        if (!m(gVar)) {
            C7433k41.c(a, "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!l(i)) {
            C7433k41.c(a, "Unsupported rotation degrees for rotate RGB");
            return null;
        } else if (h(gVar, interfaceC8499oN0.getSurface(), byteBuffer, i, z) == a.ERROR_CONVERSION) {
            C7433k41.c(a, "YUV to RGB conversion failure");
            return null;
        } else {
            if (Log.isLoggable("MH", 3)) {
                C7433k41.a(a, String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(b)));
                b++;
            }
            final g a2 = interfaceC8499oN0.a();
            if (a2 == null) {
                C7433k41.c(a, "YUV to RGB acquireLatestImage failure");
                return null;
            }
            C7693l82 c7693l82 = new C7693l82(a2);
            c7693l82.a(new b.a() { // from class: o.gN0
                @Override // androidx.camera.core.b.a
                public final void b(androidx.camera.core.g gVar2) {
                    ImageProcessingUtil.b(androidx.camera.core.g.this, gVar, gVar2);
                }
            });
            return c7693l82;
        }
    }

    public static a h(g gVar, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int width = gVar.getWidth();
        int height = gVar.getHeight();
        int C = gVar.f3()[0].C();
        int C2 = gVar.f3()[1].C();
        int C3 = gVar.f3()[2].C();
        int D = gVar.f3()[0].D();
        int D2 = gVar.f3()[1].D();
        if (z) {
            i2 = D;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = D2;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = D2;
        } else {
            i4 = 0;
        }
        if (nativeConvertAndroid420ToABGR(gVar.f3()[0].B(), C, gVar.f3()[1].B(), C2, gVar.f3()[2].B(), C3, D, D2, surface, byteBuffer, width, height, i2, i3, i4, i) != 0) {
            return a.ERROR_CONVERSION;
        }
        return a.SUCCESS;
    }

    public static boolean i(g gVar, int i, int i2, Surface surface) {
        try {
            return p(surface, C10206vN0.t(gVar, null, i, i2));
        } catch (C10206vN0.a e) {
            C7433k41.d(a, "Failed to encode YUV to JPEG", e);
            return false;
        }
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void k(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean l(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean m(g gVar) {
        if (gVar.getFormat() == 35 && gVar.f3().length == 3) {
            return true;
        }
        return false;
    }

    public static g n(g gVar, InterfaceC8499oN0 interfaceC8499oN0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        final g gVar2;
        a aVar;
        if (!m(gVar)) {
            C7433k41.c(a, "Unsupported format for rotate YUV");
            return null;
        } else if (!l(i)) {
            C7433k41.c(a, "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            a aVar2 = a.ERROR_CONVERSION;
            if (i > 0) {
                gVar2 = gVar;
                aVar = o(gVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i);
            } else {
                gVar2 = gVar;
                aVar = aVar2;
            }
            if (aVar == aVar2) {
                C7433k41.c(a, "rotate YUV failure");
                return null;
            }
            final g a2 = interfaceC8499oN0.a();
            if (a2 == null) {
                C7433k41.c(a, "YUV rotation acquireLatestImage failure");
                return null;
            }
            C7693l82 c7693l82 = new C7693l82(a2);
            c7693l82.a(new b.a() { // from class: o.hN0
                @Override // androidx.camera.core.b.a
                public final void b(androidx.camera.core.g gVar3) {
                    ImageProcessingUtil.a(androidx.camera.core.g.this, gVar2, gVar3);
                }
            });
            return c7693l82;
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static a o(g gVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int width = gVar.getWidth();
        int height = gVar.getHeight();
        int C = gVar.f3()[0].C();
        int C2 = gVar.f3()[1].C();
        int C3 = gVar.f3()[2].C();
        int D = gVar.f3()[1].D();
        Image b2 = AN0.b(imageWriter);
        if (b2 == null) {
            return a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(gVar.f3()[0].B(), C, gVar.f3()[1].B(), C2, gVar.f3()[2].B(), C3, D, b2.getPlanes()[0].getBuffer(), b2.getPlanes()[0].getRowStride(), b2.getPlanes()[0].getPixelStride(), b2.getPlanes()[1].getBuffer(), b2.getPlanes()[1].getRowStride(), b2.getPlanes()[1].getPixelStride(), b2.getPlanes()[2].getBuffer(), b2.getPlanes()[2].getRowStride(), b2.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
            return a.ERROR_CONVERSION;
        }
        AN0.e(imageWriter, b2);
        return a.SUCCESS;
    }

    public static boolean p(Surface surface, byte[] bArr) {
        C10907yF1.l(bArr);
        C10907yF1.l(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            C7433k41.c(a, "Failed to enqueue JPEG image.");
            return false;
        }
        return true;
    }
}

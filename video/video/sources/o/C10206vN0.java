package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.vN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10206vN0 {
    public static final String a = "ImageUtil";
    public static final int b = 4;

    public static Rect a(Size size, Rational rational) {
        int i;
        if (!k(rational)) {
            C7433k41.p(a, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f2 / denominator) * numerator);
            int i3 = (width - round2) / 2;
            width = round2;
            i = 0;
            i2 = i3;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    public static Rect b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i2 - i);
        float[] s = s(size);
        matrix.mapPoints(s);
        matrix.postTranslate(-p(s[0], s[2], s[4], s[6]), -p(s[1], s[3], s[5], s[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Bitmap c(androidx.camera.core.g gVar) {
        int format = gVar.getFormat();
        if (format != 1) {
            if (format != 35) {
                if (format == 256) {
                    return d(gVar);
                }
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + gVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            }
            return ImageProcessingUtil.f(gVar);
        }
        return f(gVar);
    }

    public static Bitmap d(androidx.camera.core.g gVar) {
        byte[] n = n(gVar);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(n, 0, n.length, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap e(g.a[] aVarArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (aVarArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Expect a single plane");
        if (aVarArr[0].D() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.b(z2, "Expect pixelStride=4");
        if (aVarArr[0].C() != i * 4) {
            z3 = false;
        }
        C10907yF1.b(z3, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        aVarArr[0].B().rewind();
        ImageProcessingUtil.k(createBitmap, aVarArr[0].B(), aVarArr[0].C());
        return createBitmap;
    }

    public static Bitmap f(androidx.camera.core.g gVar) {
        Bitmap createBitmap = Bitmap.createBitmap(gVar.getWidth(), gVar.getHeight(), Bitmap.Config.ARGB_8888);
        gVar.f3()[0].B().rewind();
        ImageProcessingUtil.k(createBitmap, gVar.f3()[0].B(), gVar.f3()[0].C());
        return createBitmap;
    }

    public static ByteBuffer g(Bitmap bitmap) {
        boolean z;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.j(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static byte[] h(byte[] bArr, Rect rect, int i) throws a {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new a("Encode bitmap failed.", a.EnumC0348a.ENCODE_FAILED);
            }
            throw new a("Decode byte array failed.", a.EnumC0348a.DECODE_FAILED);
        } catch (IOException unused) {
            throw new a("Decode byte array failed.", a.EnumC0348a.DECODE_FAILED);
        } catch (IllegalArgumentException e) {
            throw new a("Decode byte array failed with illegal argument." + e, a.EnumC0348a.DECODE_FAILED);
        }
    }

    public static Rational i(int i, Rational rational) {
        if (i != 90 && i != 270) {
            return new Rational(rational.getNumerator(), rational.getDenominator());
        }
        return j(rational);
    }

    public static Rational j(Rational rational) {
        if (rational == null) {
            return rational;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean k(Rational rational) {
        if (rational != null && rational.floatValue() > 0.0f && !rational.isNaN()) {
            return true;
        }
        return false;
    }

    public static boolean l(Size size, Rational rational) {
        if (rational != null && rational.floatValue() > 0.0f && m(size, rational) && !rational.isNaN()) {
            return true;
        }
        return false;
    }

    public static boolean m(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        if (height == Math.round((width / numerator) * denominator) && width == Math.round((height / denominator) * numerator)) {
            return false;
        }
        return true;
    }

    public static byte[] n(androidx.camera.core.g gVar) {
        if (gVar.getFormat() == 256) {
            ByteBuffer B = gVar.f3()[0].B();
            byte[] bArr = new byte[B.capacity()];
            B.rewind();
            B.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + gVar.getFormat());
    }

    public static byte[] o(androidx.camera.core.g gVar, Rect rect, int i) throws a {
        if (gVar.getFormat() == 256) {
            return h(n(gVar), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + gVar.getFormat());
    }

    public static float p(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    public static boolean q(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return false;
        }
        return true;
    }

    public static boolean r(androidx.camera.core.g gVar) {
        return q(gVar.getWidth(), gVar.getHeight(), gVar.L3().width(), gVar.L3().height());
    }

    public static float[] s(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] t(androidx.camera.core.g gVar, Rect rect, int i, int i2) throws a {
        if (gVar.getFormat() == 35) {
            YuvImage yuvImage = new YuvImage(u(gVar), 17, gVar.getWidth(), gVar.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C3041Gg0 c3041Gg0 = new C3041Gg0(byteArrayOutputStream, C2540Bg0.b(gVar, i2));
            if (rect == null) {
                rect = new Rect(0, 0, gVar.getWidth(), gVar.getHeight());
            }
            if (yuvImage.compressToJpeg(rect, i, c3041Gg0)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new a("YuvImage failed to encode jpeg.", a.EnumC0348a.ENCODE_FAILED);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + gVar.getFormat());
    }

    public static byte[] u(androidx.camera.core.g gVar) {
        g.a aVar = gVar.f3()[0];
        g.a aVar2 = gVar.f3()[1];
        g.a aVar3 = gVar.f3()[2];
        ByteBuffer B = aVar.B();
        ByteBuffer B2 = aVar2.B();
        ByteBuffer B3 = aVar3.B();
        B.rewind();
        B2.rewind();
        B3.rewind();
        int remaining = B.remaining();
        byte[] bArr = new byte[((gVar.getWidth() * gVar.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < gVar.getHeight(); i2++) {
            B.get(bArr, i, gVar.getWidth());
            i += gVar.getWidth();
            B.position(Math.min(remaining, (B.position() - gVar.getWidth()) + aVar.C()));
        }
        int height = gVar.getHeight() / 2;
        int width = gVar.getWidth() / 2;
        int C = aVar3.C();
        int C2 = aVar2.C();
        int D = aVar3.D();
        int D2 = aVar2.D();
        byte[] bArr2 = new byte[C];
        byte[] bArr3 = new byte[C2];
        for (int i3 = 0; i3 < height; i3++) {
            B3.get(bArr2, 0, Math.min(C, B3.remaining()));
            B2.get(bArr3, 0, Math.min(C2, B2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i += 2;
                bArr[i7] = bArr3[i5];
                i4 += D;
                i5 += D2;
            }
        }
        return bArr;
    }

    /* renamed from: o.vN0$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public final EnumC0348a X;

        /* renamed from: o.vN0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0348a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str) {
            super(str);
            this.X = EnumC0348a.UNKNOWN;
        }

        public EnumC0348a a() {
            return this.X;
        }

        public a(String str, EnumC0348a enumC0348a) {
            super(str);
            this.X = enumC0348a;
        }
    }
}

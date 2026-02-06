package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import o.AbstractC8674p60;
import o.InterfaceC8012mN0;

/* renamed from: o.v60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10138v60 {
    public static final String f = "Downsampler";
    public static final C4274Sv1<VV> g = C4274Sv1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", VV.Z);
    public static final C4274Sv1<EG1> h = C4274Sv1.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated
    public static final C4274Sv1<AbstractC8674p60> i = AbstractC8674p60.h;
    public static final C4274Sv1<Boolean> j;
    public static final C4274Sv1<Boolean> k;
    public static final String l = "image/vnd.wap.wbmp";
    public static final String m = "image/x-ico";
    public static final Set<String> n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f890o;
    public static final Set<ImageHeaderParser.ImageType> p;
    public static final Queue<BitmapFactory.Options> q;
    public final InterfaceC4931Zn a;
    public final DisplayMetrics b;
    public final InterfaceC2727De c;
    public final List<ImageHeaderParser> d;
    public final C5770dG0 e = C5770dG0.c();

    /* renamed from: o.v60$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        j = C4274Sv1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        k = C4274Sv1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        n = Collections.unmodifiableSet(new HashSet(Arrays.asList(l, m)));
        f890o = new a();
        p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        q = SD2.g(0);
    }

    public C10138v60(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De) {
        this.d = list;
        this.b = (DisplayMetrics) C10175vF1.e(displayMetrics);
        this.a = (InterfaceC4931Zn) C10175vF1.e(interfaceC4931Zn);
        this.c = (InterfaceC2727De) C10175vF1.e(interfaceC2727De);
    }

    public static int A(double d) {
        return (int) (d + 0.5d);
    }

    public static void B(BitmapFactory.Options options, InterfaceC4931Zn interfaceC4931Zn, int i2, int i3) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            }
            config = C9895u60.a(options);
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC4931Zn.g(i2, i3, config);
    }

    public static int a(double d) {
        int o2 = o(d);
        int A = A(o2 * d);
        return A((d / (A / o2)) * A);
    }

    public static void c(ImageHeaderParser.ImageType imageType, InterfaceC8012mN0 interfaceC8012mN0, b bVar, InterfaceC4931Zn interfaceC4931Zn, AbstractC8674p60 abstractC8674p60, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int min;
        int i9;
        int floor;
        int floor2;
        if (i3 > 0 && i4 > 0) {
            if (u(i2)) {
                i8 = i3;
                i7 = i4;
            } else {
                i7 = i3;
                i8 = i4;
            }
            float b2 = abstractC8674p60.b(i7, i8, i5, i6);
            if (b2 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + abstractC8674p60 + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + C6566gU0.g);
            }
            AbstractC8674p60.g a2 = abstractC8674p60.a(i7, i8, i5, i6);
            if (a2 != null) {
                float f2 = i7;
                float f3 = i8;
                int i10 = i7;
                int i11 = i8;
                int A = i10 / A(b2 * f2);
                int A2 = i11 / A(b2 * f3);
                AbstractC8674p60.g gVar = AbstractC8674p60.g.MEMORY;
                if (a2 == gVar) {
                    min = Math.max(A, A2);
                } else {
                    min = Math.min(A, A2);
                }
                int max = Math.max(1, Integer.highestOneBit(min));
                if (a2 == gVar && max < 1.0f / b2) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (imageType == ImageHeaderParser.ImageType.JPEG) {
                    float min2 = Math.min(max, 8);
                    i9 = 0;
                    floor = (int) Math.ceil(f2 / min2);
                    floor2 = (int) Math.ceil(f3 / min2);
                    int i12 = max / 8;
                    if (i12 > 0) {
                        floor /= i12;
                        floor2 /= i12;
                    }
                } else {
                    i9 = 0;
                    if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                        if (imageType.isWebp()) {
                            float f4 = max;
                            floor = Math.round(f2 / f4);
                            floor2 = Math.round(f3 / f4);
                        } else if (i10 % max == 0 && i11 % max == 0) {
                            floor = i10 / max;
                            floor2 = i11 / max;
                        } else {
                            int[] p2 = p(interfaceC8012mN0, options, bVar, interfaceC4931Zn);
                            floor = p2[0];
                            floor2 = p2[1];
                        }
                    } else {
                        float f5 = max;
                        floor = (int) Math.floor(f2 / f5);
                        floor2 = (int) Math.floor(f3 / f5);
                    }
                }
                double b3 = abstractC8674p60.b(floor, floor2, i5, i6);
                options.inTargetDensity = a(b3);
                options.inDensity = o(b3);
                if (v(options)) {
                    options.inScaled = true;
                } else {
                    int i13 = i9;
                    options.inTargetDensity = i13;
                    options.inDensity = i13;
                }
                if (Log.isLoggable(f, 2)) {
                    Log.v(f, "Calculate scaling, source: [" + i3 + "x" + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + "x" + i6 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b2 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b3 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        } else if (Log.isLoggable(f, 3)) {
            Log.d(f, "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + C6566gU0.g);
        }
    }

    public static Bitmap l(InterfaceC8012mN0 interfaceC8012mN0, BitmapFactory.Options options, b bVar, InterfaceC4931Zn interfaceC4931Zn) throws IOException {
        Bitmap l2;
        if (!options.inJustDecodeBounds) {
            bVar.b();
            interfaceC8012mN0.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        C6658gs2.i().lock();
        try {
            try {
                l2 = interfaceC8012mN0.a(options);
            } catch (IllegalArgumentException e) {
                IOException x = x(e, i2, i3, str, options);
                if (Log.isLoggable(f, 3)) {
                    Log.d(f, "Failed to decode with inBitmap, trying again without Bitmap re-use", x);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        interfaceC4931Zn.d(bitmap);
                        options.inBitmap = null;
                        l2 = l(interfaceC8012mN0, options, bVar, interfaceC4931Zn);
                    } catch (IOException unused) {
                        throw x;
                    }
                } else {
                    throw x;
                }
            }
            return l2;
        } finally {
            C6658gs2.i().unlock();
        }
    }

    public static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return C6566gU0.f + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + C9811tl1.d);
    }

    public static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options poll;
        synchronized (C10138v60.class) {
            Queue<BitmapFactory.Options> queue = q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                z(poll);
            }
        }
        return poll;
    }

    public static int o(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static int[] p(InterfaceC8012mN0 interfaceC8012mN0, BitmapFactory.Options options, b bVar, InterfaceC4931Zn interfaceC4931Zn) throws IOException {
        options.inJustDecodeBounds = true;
        l(interfaceC8012mN0, options, bVar, interfaceC4931Zn);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    public static boolean u(int i2) {
        if (i2 != 90 && i2 != 270) {
            return false;
        }
        return true;
    }

    public static boolean v(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        if (i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2) {
            return true;
        }
        return false;
    }

    public static void w(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v(f, "Decoded " + m(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + q(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C5965e41.a(j2));
    }

    public static IOException x(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + q(options), illegalArgumentException);
    }

    public static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            C8917q60.a(options, null);
            C9166r60.a(options, null);
            C9409s60.a(options, null);
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public final void b(InterfaceC8012mN0 interfaceC8012mN0, VV vv, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        boolean z3;
        Bitmap.Config config;
        if (!this.e.h(i2, i3, options, z, z2)) {
            if (vv != VV.PREFER_ARGB_8888) {
                try {
                    z3 = interfaceC8012mN0.e().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable(f, 3)) {
                        Log.d(f, "Cannot determine whether the image has alpha or not from header, format " + vv, e);
                    }
                    z3 = false;
                }
                if (z3) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    public InterfaceC5580cT1<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        return h(new InterfaceC8012mN0.e(parcelFileDescriptor, this.d, this.c), i2, i3, c5448bw1, f890o);
    }

    public InterfaceC5580cT1<Bitmap> e(InputStream inputStream, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        return f(inputStream, i2, i3, c5448bw1, f890o);
    }

    public InterfaceC5580cT1<Bitmap> f(InputStream inputStream, int i2, int i3, C5448bw1 c5448bw1, b bVar) throws IOException {
        return h(new InterfaceC8012mN0.d(inputStream, this.d, this.c), i2, i3, c5448bw1, bVar);
    }

    public InterfaceC5580cT1<Bitmap> g(ByteBuffer byteBuffer, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        return h(new InterfaceC8012mN0.b(byteBuffer, this.d, this.c), i2, i3, c5448bw1, f890o);
    }

    public final InterfaceC5580cT1<Bitmap> h(InterfaceC8012mN0 interfaceC8012mN0, int i2, int i3, C5448bw1 c5448bw1, b bVar) throws IOException {
        boolean z;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        BitmapFactory.Options n2 = n();
        n2.inTempStorage = bArr;
        VV vv = (VV) c5448bw1.c(g);
        EG1 eg1 = (EG1) c5448bw1.c(h);
        AbstractC8674p60 abstractC8674p60 = (AbstractC8674p60) c5448bw1.c(AbstractC8674p60.h);
        boolean booleanValue = ((Boolean) c5448bw1.c(j)).booleanValue();
        C4274Sv1<Boolean> c4274Sv1 = k;
        if (c5448bw1.c(c4274Sv1) != null && ((Boolean) c5448bw1.c(c4274Sv1)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return C6141eo.c(k(interfaceC8012mN0, n2, abstractC8674p60, vv, eg1, z, i2, i3, booleanValue, bVar), this.a);
        } finally {
            y(n2);
            this.c.put(bArr);
        }
    }

    public void i(File file, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        h(new InterfaceC8012mN0.c(file, this.d, this.c), i2, i3, c5448bw1, f890o);
    }

    public void j(byte[] bArr, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        h(new InterfaceC8012mN0.a(bArr, this.d, this.c), i2, i3, c5448bw1, f890o);
    }

    public final Bitmap k(InterfaceC8012mN0 interfaceC8012mN0, BitmapFactory.Options options, AbstractC8674p60 abstractC8674p60, VV vv, EG1 eg1, boolean z, int i2, int i3, boolean z2, b bVar) throws IOException {
        boolean z3;
        int i4;
        String str;
        ColorSpace colorSpace;
        ColorSpace.Named a2;
        ColorSpace colorSpace2;
        float f2;
        int i5;
        long b2 = C5965e41.b();
        int[] p2 = p(interfaceC8012mN0, options, bVar, this.a);
        int i6 = p2[0];
        int i7 = p2[1];
        String str2 = options.outMimeType;
        if (i6 != -1 && i7 != -1) {
            z3 = z;
        } else {
            z3 = false;
        }
        int d = interfaceC8012mN0.d();
        int j2 = C6658gs2.j(d);
        boolean m2 = C6658gs2.m(d);
        int i8 = i2;
        if (i8 == Integer.MIN_VALUE) {
            if (u(j2)) {
                i4 = i3;
                i8 = i7;
            } else {
                i4 = i3;
                i8 = i6;
            }
        } else {
            i4 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            if (u(j2)) {
                i4 = i6;
            } else {
                i4 = i7;
            }
        }
        ImageHeaderParser.ImageType e = interfaceC8012mN0.e();
        c(e, interfaceC8012mN0, bVar, this.a, abstractC8674p60, j2, i6, i7, i8, i4, options);
        int i9 = i8;
        int i10 = i4;
        b(interfaceC8012mN0, vv, z3, m2, options, i9, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (C(e)) {
            if (i6 >= 0 && i7 >= 0 && z2) {
                str = f;
            } else {
                if (v(options)) {
                    f2 = options.inTargetDensity / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                int i12 = options.inSampleSize;
                float f3 = i12;
                int round = Math.round(((int) Math.ceil(i6 / f3)) * f2);
                int round2 = Math.round(((int) Math.ceil(i7 / f3)) * f2);
                str = f;
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round);
                    sb.append("x");
                    sb.append(round2);
                    i5 = round;
                    sb.append("] for source [");
                    sb.append(i6);
                    sb.append("x");
                    sb.append(i7);
                    sb.append("], sampleSize: ");
                    sb.append(i12);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f2);
                    Log.v(str, sb.toString());
                } else {
                    i5 = round;
                }
                i9 = i5;
                i10 = round2;
            }
            if (i9 > 0 && i10 > 0) {
                B(options, this.a, i9, i10);
            }
        } else {
            str = f;
        }
        if (eg1 != null) {
            if (i11 >= 28) {
                if (eg1 == EG1.DISPLAY_P3 && C9652t60.a(options) != null && C5706d00.a(C9652t60.a(options))) {
                    a2 = C5948e00.a();
                } else {
                    a2 = C4533Vn.a();
                }
                colorSpace2 = ColorSpace.get(a2);
                C8917q60.a(options, colorSpace2);
            } else if (i11 >= 26) {
                colorSpace = ColorSpace.get(C4533Vn.a());
                C8917q60.a(options, colorSpace);
            }
        }
        Bitmap l2 = l(interfaceC8012mN0, options, bVar, this.a);
        bVar.a(this.a, l2);
        if (Log.isLoggable(str, 2)) {
            w(i6, i7, str2, options, l2, i2, i3, b2);
        }
        if (l2 != null) {
            l2.setDensity(this.b.densityDpi);
            Bitmap o2 = C6658gs2.o(this.a, l2, d);
            if (!l2.equals(o2)) {
                this.a.d(l2);
            }
            return o2;
        }
        return null;
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.a();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: o.v60$a */
    /* loaded from: classes.dex */
    public class a implements b {
        @Override // o.C10138v60.b
        public void b() {
        }

        @Override // o.C10138v60.b
        public void a(InterfaceC4931Zn interfaceC4931Zn, Bitmap bitmap) {
        }
    }
}

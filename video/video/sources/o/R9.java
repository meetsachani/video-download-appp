package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class R9 {
    public final List<ImageHeaderParser> a;
    public final InterfaceC2727De b;

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5580cT1<Drawable> {
        public static final int Y = 2;
        public final AnimatedImageDrawable X;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.X = animatedImageDrawable;
        }

        @Override // o.InterfaceC5580cT1
        public void a() {
            this.X.stop();
            this.X.clearAnimationCallbacks();
        }

        @Override // o.InterfaceC5580cT1
        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.X;
        }

        @Override // o.InterfaceC5580cT1
        public int h0() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.X.getIntrinsicWidth();
            intrinsicHeight = this.X.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * SD2.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // o.InterfaceC5580cT1
        public Class<Drawable> i0() {
            return Drawable.class;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC7290jT1<ByteBuffer, Drawable> {
        public final R9 a;

        public b(R9 r9) {
            this.a = r9;
        }

        @Override // o.InterfaceC7290jT1
        /* renamed from: c */
        public InterfaceC5580cT1<Drawable> b(ByteBuffer byteBuffer, int i, int i2, C5448bw1 c5448bw1) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.a.b(createSource, i, i2, c5448bw1);
        }

        @Override // o.InterfaceC7290jT1
        /* renamed from: d */
        public boolean a(ByteBuffer byteBuffer, C5448bw1 c5448bw1) throws IOException {
            return this.a.d(byteBuffer);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements InterfaceC7290jT1<InputStream, Drawable> {
        public final R9 a;

        public c(R9 r9) {
            this.a = r9;
        }

        @Override // o.InterfaceC7290jT1
        /* renamed from: c */
        public InterfaceC5580cT1<Drawable> b(InputStream inputStream, int i, int i2, C5448bw1 c5448bw1) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(C4452Ur.b(inputStream));
            return this.a.b(createSource, i, i2, c5448bw1);
        }

        @Override // o.InterfaceC7290jT1
        /* renamed from: d */
        public boolean a(InputStream inputStream, C5448bw1 c5448bw1) throws IOException {
            return this.a.c(inputStream);
        }
    }

    public R9(List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
        this.a = list;
        this.b = interfaceC2727De;
    }

    public static InterfaceC7290jT1<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
        return new b(new R9(list, interfaceC2727De));
    }

    public static InterfaceC7290jT1<InputStream, Drawable> f(List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
        return new c(new R9(list, interfaceC2727De));
    }

    public InterfaceC5580cT1<Drawable> b(ImageDecoder.Source source, int i, int i2, C5448bw1 c5448bw1) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C6191f00(i, i2, c5448bw1));
        if (L9.a(decodeDrawable)) {
            return new a(M9.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.a, inputStream, this.b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            if (Build.VERSION.SDK_INT < 31 || imageType != ImageHeaderParser.ImageType.ANIMATED_AVIF) {
                return false;
            }
            return true;
        }
        return true;
    }
}

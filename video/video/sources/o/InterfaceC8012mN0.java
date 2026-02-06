package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: o.mN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8012mN0 {

    /* renamed from: o.mN0$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC8012mN0 {
        public final com.bumptech.glide.load.data.c a;
        public final InterfaceC2727De b;
        public final List<ImageHeaderParser> c;

        public d(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
            this.b = (InterfaceC2727De) C10175vF1.e(interfaceC2727De);
            this.c = (List) C10175vF1.e(list);
            this.a = new com.bumptech.glide.load.data.c(inputStream, interfaceC2727De);
        }

        @Override // o.InterfaceC8012mN0
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return RD0.c(this.a.c(), options, this);
        }

        @Override // o.InterfaceC8012mN0
        public boolean b() throws IOException {
            return com.bumptech.glide.load.a.j(this.c, this.a.c(), this.b);
        }

        @Override // o.InterfaceC8012mN0
        public void c() {
            this.a.a();
        }

        @Override // o.InterfaceC8012mN0
        public int d() throws IOException {
            return com.bumptech.glide.load.a.b(this.c, this.a.c(), this.b);
        }

        @Override // o.InterfaceC8012mN0
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.f(this.c, this.a.c(), this.b);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    boolean b() throws IOException;

    void c();

    int d() throws IOException;

    ImageHeaderParser.ImageType e() throws IOException;

    /* renamed from: o.mN0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC8012mN0 {
        public final byte[] a;
        public final List<ImageHeaderParser> b;
        public final InterfaceC2727De c;

        public a(byte[] bArr, List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
            this.a = bArr;
            this.b = list;
            this.c = interfaceC2727De;
        }

        @Override // o.InterfaceC8012mN0
        public Bitmap a(BitmapFactory.Options options) {
            return RD0.a(this.a, options, this);
        }

        @Override // o.InterfaceC8012mN0
        public boolean b() throws IOException {
            return com.bumptech.glide.load.a.k(this.b, ByteBuffer.wrap(this.a), this.c);
        }

        @Override // o.InterfaceC8012mN0
        public int d() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, ByteBuffer.wrap(this.a), this.c);
        }

        @Override // o.InterfaceC8012mN0
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.g(this.b, ByteBuffer.wrap(this.a));
        }

        @Override // o.InterfaceC8012mN0
        public void c() {
        }
    }

    /* renamed from: o.mN0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC8012mN0 {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final InterfaceC2727De c;

        public b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
            this.a = byteBuffer;
            this.b = list;
            this.c = interfaceC2727De;
        }

        @Override // o.InterfaceC8012mN0
        public Bitmap a(BitmapFactory.Options options) {
            return RD0.c(f(), options, this);
        }

        @Override // o.InterfaceC8012mN0
        public boolean b() throws IOException {
            return com.bumptech.glide.load.a.k(this.b, C4452Ur.d(this.a), this.c);
        }

        @Override // o.InterfaceC8012mN0
        public int d() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, C4452Ur.d(this.a), this.c);
        }

        @Override // o.InterfaceC8012mN0
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.g(this.b, C4452Ur.d(this.a));
        }

        public final InputStream f() {
            return C4452Ur.g(C4452Ur.d(this.a));
        }

        @Override // o.InterfaceC8012mN0
        public void c() {
        }
    }

    /* renamed from: o.mN0$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC8012mN0 {
        public final File a;
        public final List<ImageHeaderParser> b;
        public final InterfaceC2727De c;

        public c(File file, List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
            this.a = file;
            this.b = list;
            this.c = interfaceC2727De;
        }

        @Override // o.InterfaceC8012mN0
        public Bitmap a(BitmapFactory.Options options) throws FileNotFoundException {
            GP1 gp1;
            GP1 gp12 = null;
            try {
                gp1 = new GP1(new FileInputStream(this.a), this.c);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Bitmap c = RD0.c(gp1, options, this);
                try {
                    gp1.close();
                } catch (IOException unused) {
                }
                return c;
            } catch (Throwable th2) {
                th = th2;
                gp12 = gp1;
                if (gp12 != null) {
                    try {
                        gp12.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // o.InterfaceC8012mN0
        public boolean b() throws IOException {
            FileInputStream fileInputStream;
            Throwable th;
            try {
                fileInputStream = new FileInputStream(this.a);
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                boolean j = com.bumptech.glide.load.a.j(this.b, fileInputStream, this.c);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return j;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // o.InterfaceC8012mN0
        public int d() throws IOException {
            GP1 gp1;
            Throwable th;
            try {
                gp1 = new GP1(new FileInputStream(this.a), this.c);
            } catch (Throwable th2) {
                gp1 = null;
                th = th2;
            }
            try {
                int b = com.bumptech.glide.load.a.b(this.b, gp1, this.c);
                try {
                    gp1.close();
                } catch (IOException unused) {
                }
                return b;
            } catch (Throwable th3) {
                th = th3;
                if (gp1 != null) {
                    try {
                        gp1.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // o.InterfaceC8012mN0
        public ImageHeaderParser.ImageType e() throws IOException {
            GP1 gp1;
            Throwable th;
            try {
                gp1 = new GP1(new FileInputStream(this.a), this.c);
            } catch (Throwable th2) {
                gp1 = null;
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType f = com.bumptech.glide.load.a.f(this.b, gp1, this.c);
                try {
                    gp1.close();
                } catch (IOException unused) {
                }
                return f;
            } catch (Throwable th3) {
                th = th3;
                if (gp1 != null) {
                    try {
                        gp1.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // o.InterfaceC8012mN0
        public void c() {
        }
    }

    /* renamed from: o.mN0$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC8012mN0 {
        public final InterfaceC2727De a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC2727De interfaceC2727De) {
            this.a = (InterfaceC2727De) C10175vF1.e(interfaceC2727De);
            this.b = (List) C10175vF1.e(list);
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.InterfaceC8012mN0
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return RD0.b(this.c.c().getFileDescriptor(), options, this);
        }

        @Override // o.InterfaceC8012mN0
        public boolean b() throws IOException {
            return com.bumptech.glide.load.a.i(this.b, this.c, this.a);
        }

        @Override // o.InterfaceC8012mN0
        public int d() throws IOException {
            return com.bumptech.glide.load.a.a(this.b, this.c, this.a);
        }

        @Override // o.InterfaceC8012mN0
        public ImageHeaderParser.ImageType e() throws IOException {
            return com.bumptech.glide.load.a.e(this.b, this.c, this.a);
        }

        @Override // o.InterfaceC8012mN0
        public void c() {
        }
    }
}

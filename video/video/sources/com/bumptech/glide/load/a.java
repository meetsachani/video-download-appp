package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.C4452Ur;
import o.GP1;
import o.InterfaceC2727De;

/* loaded from: classes.dex */
public final class a {
    public static final int a = 5242880;

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062a implements l {
        public final /* synthetic */ InputStream a;

        public C0062a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.e(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements l {
        public final /* synthetic */ ByteBuffer a;

        public b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a);
            } finally {
                C4452Ur.d(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements l {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ InterfaceC2727De b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) {
            this.a = parcelFileDescriptorRewinder;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            GP1 gp1;
            GP1 gp12 = null;
            try {
                gp1 = new GP1(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType e = imageHeaderParser.e(gp1);
                gp1.g();
                this.a.c();
                return e;
            } catch (Throwable th2) {
                th = th2;
                gp12 = gp1;
                if (gp12 != null) {
                    gp12.g();
                }
                this.a.c();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements k {
        public final /* synthetic */ ByteBuffer a;
        public final /* synthetic */ InterfaceC2727De b;

        public d(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) {
            this.a = byteBuffer;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a, this.b);
            } finally {
                C4452Ur.d(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements k {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ InterfaceC2727De b;

        public e(InputStream inputStream, InterfaceC2727De interfaceC2727De) {
            this.a = inputStream;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements k {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ InterfaceC2727De b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) {
            this.a = parcelFileDescriptorRewinder;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            GP1 gp1;
            GP1 gp12 = null;
            try {
                gp1 = new GP1(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int d = imageHeaderParser.d(gp1, this.b);
                gp1.g();
                this.a.c();
                return d;
            } catch (Throwable th2) {
                th = th2;
                gp12 = gp1;
                if (gp12 != null) {
                    gp12.g();
                }
                this.a.c();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements j {
        public final /* synthetic */ ByteBuffer a;
        public final /* synthetic */ InterfaceC2727De b;

        public g(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) {
            this.a = byteBuffer;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.a, this.b);
            } finally {
                C4452Ur.d(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements j {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ InterfaceC2727De b;

        public h(InputStream inputStream, InterfaceC2727De interfaceC2727De) {
            this.a = inputStream;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.f(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements j {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ InterfaceC2727De b;

        public i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) {
            this.a = parcelFileDescriptorRewinder;
            this.b = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            GP1 gp1;
            GP1 gp12 = null;
            try {
                gp1 = new GP1(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean f = imageHeaderParser.f(gp1, this.b);
                gp1.g();
                this.a.c();
                return f;
            } catch (Throwable th2) {
                th = th2;
                gp12 = gp1;
                if (gp12 != null) {
                    gp12.g();
                }
                this.a.c();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        boolean a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* loaded from: classes.dex */
    public interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, interfaceC2727De));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new GP1(inputStream, interfaceC2727De);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, interfaceC2727De));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, interfaceC2727De));
    }

    public static int d(List<ImageHeaderParser> list, k kVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = kVar.a(list.get(i2));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, interfaceC2727De));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new GP1(inputStream, interfaceC2727De);
        }
        inputStream.mark(5242880);
        return h(list, new C0062a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return h(list, new b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, l lVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a2 = lVar.a(list.get(i2));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean i(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC2727De interfaceC2727De) throws IOException {
        return l(list, new i(parcelFileDescriptorRewinder, interfaceC2727De));
    }

    public static boolean j(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new GP1(inputStream, interfaceC2727De);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, interfaceC2727De));
    }

    public static boolean k(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, interfaceC2727De));
    }

    public static boolean l(List<ImageHeaderParser> list, j jVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (jVar.a(list.get(i2))) {
                return true;
            }
        }
        return false;
    }
}

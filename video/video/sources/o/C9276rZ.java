package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: o.rZ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9276rZ implements ImageHeaderParser {
    public static final int A = 16;
    public static final int B = 8;
    public static final int C = 1718909296;
    public static final int D = 1635150182;
    public static final int E = 1635150195;
    public static final String b = "DfltImageHeaderParser";
    public static final int c = 4671814;
    public static final int d = -1991225785;
    public static final int e = 65496;
    public static final int f = 19789;
    public static final int g = 18761;
    public static final int l = 218;
    public static final int m = 217;
    public static final int n = 255;

    /* renamed from: o  reason: collision with root package name */
    public static final int f849o = 225;
    public static final int p = 226;
    public static final int q = 274;
    public static final int s = 1380533830;
    public static final int t = 1464156752;
    public static final int u = 1448097792;
    public static final int v = -256;
    public static final int w = 255;
    public static final int x = 88;
    public static final int y = 76;
    public static final int z = 2;
    public static final String h = "Exif\u0000\u0000";
    public static final byte[] i = h.getBytes(Charset.forName("UTF-8"));
    public static final String j = "MPF";
    public static final byte[] k = j.getBytes(Charset.forName("UTF-8"));
    public static final int[] r = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: o.rZ$a */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o.C9276rZ.c
        public int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // o.C9276rZ.c
        public int b(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // o.C9276rZ.c
        public short c() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }

        @Override // o.C9276rZ.c
        public long skip(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: o.rZ$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        public int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        public final boolean c(int i, int i2) {
            if (this.a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        public int d() {
            return this.a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* renamed from: o.rZ$c */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: o.rZ$c$a */
        /* loaded from: classes.dex */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i) throws IOException;

        short c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: o.rZ$d */
    /* loaded from: classes.dex */
    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // o.C9276rZ.c
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // o.C9276rZ.c
        public int b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // o.C9276rZ.c
        public short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // o.C9276rZ.c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public static int g(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    public static boolean j(int i2) {
        if ((i2 & 65496) != 65496 && i2 != 19789 && i2 != 18761) {
            return false;
        }
        return true;
    }

    public static int r(b bVar) {
        ByteOrder byteOrder;
        short a2 = bVar.a(6);
        if (a2 != 18761) {
            if (a2 != 19789) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Unknown endianness = " + ((int) a2));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i2 = 0; i2 < a3; i2++) {
            int g2 = g(b2, i2);
            short a4 = bVar.a(g2);
            if (a4 == 274) {
                short a5 = bVar.a(g2 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b3 = bVar.b(g2 + 4);
                    if (b3 < 0) {
                        if (Log.isLoggable(b, 3)) {
                            Log.d(b, "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable(b, 3)) {
                            Log.d(b, "Got tagIndex=" + i2 + " tagType=" + ((int) a4) + " formatCode=" + ((int) a5) + " componentCount=" + b3);
                        }
                        int i3 = b3 + r[a5];
                        if (i3 > 4) {
                            if (Log.isLoggable(b, 3)) {
                                Log.d(b, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a5));
                            }
                        } else {
                            int i4 = g2 + 8;
                            if (i4 >= 0 && i4 <= bVar.d()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.d()) {
                                    return bVar.a(i4);
                                }
                                if (Log.isLoggable(b, 3)) {
                                    Log.d(b, "Illegal number of bytes for TI tag data tagType=" + ((int) a4));
                                }
                            } else if (Log.isLoggable(b, 3)) {
                                Log.d(b, "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) a4));
                            }
                        }
                    }
                } else if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Got invalid format code = " + ((int) a5));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        return l(new a((ByteBuffer) C10175vF1.e(byteBuffer)), (InterfaceC2727De) C10175vF1.e(interfaceC2727De));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, InterfaceC2727De interfaceC2727De) throws IOException {
        return h(new a((ByteBuffer) C10175vF1.e(byteBuffer)), (InterfaceC2727De) C10175vF1.e(interfaceC2727De));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) throws IOException {
        return i(new a((ByteBuffer) C10175vF1.e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        return h(new d((InputStream) C10175vF1.e(inputStream)), (InterfaceC2727De) C10175vF1.e(interfaceC2727De));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType e(InputStream inputStream) throws IOException {
        return i(new d((InputStream) C10175vF1.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean f(InputStream inputStream, InterfaceC2727De interfaceC2727De) throws IOException {
        return l(new d((InputStream) C10175vF1.e(inputStream)), (InterfaceC2727De) C10175vF1.e(interfaceC2727De));
    }

    public final int h(c cVar, InterfaceC2727De interfaceC2727De) throws IOException {
        try {
            int a2 = cVar.a();
            if (!j(a2)) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Parser doesn't handle magic number: " + a2);
                }
                return -1;
            }
            int p2 = p(cVar);
            if (p2 == -1) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC2727De.c(p2, byte[].class);
            int s2 = s(cVar, bArr, p2);
            interfaceC2727De.put(bArr);
            return s2;
        } catch (c.a unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType i(c cVar) throws IOException {
        try {
            int a2 = cVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c2 = (a2 << 8) | cVar.c();
            if (c2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c3 = (c2 << 8) | cVar.c();
            if (c3 == -1991225785) {
                cVar.skip(21L);
                try {
                    if (cVar.c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c3 != 1380533830) {
                return t(cVar, c3);
            } else {
                cVar.skip(4L);
                if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (cVar.a() << 16) | cVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i2 = a3 & 255;
                if (i2 == 88) {
                    cVar.skip(4L);
                    short c4 = cVar.c();
                    if ((c4 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((c4 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i2 == 76) {
                    cVar.skip(4L);
                    if ((cVar.c() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean k(byte[] bArr, int i2) {
        return n(bArr, i2, i);
    }

    public final boolean l(c cVar, InterfaceC2727De interfaceC2727De) throws IOException {
        if (i(cVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int o2 = o(cVar);
        while (o2 > 0) {
            byte[] bArr = (byte[]) interfaceC2727De.c(o2, byte[].class);
            try {
                if (m(cVar, bArr, o2)) {
                    interfaceC2727De.put(bArr);
                    return true;
                }
                interfaceC2727De.put(bArr);
                o2 = o(cVar);
            } catch (Throwable th) {
                interfaceC2727De.put(bArr);
                throw th;
            }
        }
        if (Log.isLoggable(b, 2)) {
            Log.v(b, "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        }
        return false;
    }

    public final boolean m(c cVar, byte[] bArr, int i2) throws IOException {
        int b2 = cVar.b(bArr, i2);
        if (b2 != i2) {
            if (Log.isLoggable(b, 3)) {
                Log.d(b, "Unable to read APP2 segment data, length: " + i2 + ", actually read: " + b2);
                return false;
            }
            return false;
        }
        return n(bArr, i2, k);
    }

    public final boolean n(byte[] bArr, int i2, byte[] bArr2) {
        boolean z2;
        if (bArr != null && bArr2 != null && i2 > bArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
            }
        }
        return z2;
    }

    public final int o(c cVar) throws IOException {
        return q(cVar, p);
    }

    public final int p(c cVar) throws IOException {
        return q(cVar, 225);
    }

    public final int q(c cVar, int i2) throws IOException {
        short c2;
        short c3;
        int a2;
        long j2;
        long skip;
        do {
            if (cVar.c() != 255) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Unknown segmentId=" + ((int) c2));
                }
                return -1;
            }
            c3 = cVar.c();
            if (c3 == 218) {
                return -1;
            }
            if (c3 == 217) {
                if (Log.isLoggable(b, 3)) {
                    Log.d(b, "Found MARKER_EOI in " + i2 + " segment");
                }
                return -1;
            }
            a2 = cVar.a() - 2;
            if (c3 != i2) {
                j2 = a2;
                skip = cVar.skip(j2);
            } else {
                return a2;
            }
        } while (skip == j2);
        if (Log.isLoggable(b, 3)) {
            Log.d(b, "Unable to skip enough data, type: " + ((int) c3) + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int s(c cVar, byte[] bArr, int i2) throws IOException {
        int b2 = cVar.b(bArr, i2);
        if (b2 != i2) {
            if (Log.isLoggable(b, 3)) {
                Log.d(b, "Unable to read exif segment data, length: " + i2 + ", actually read: " + b2);
            }
            return -1;
        } else if (k(bArr, i2)) {
            return r(new b(bArr, i2));
        } else {
            if (Log.isLoggable(b, 3)) {
                Log.d(b, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType t(c cVar, int i2) throws IOException {
        boolean z2;
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a2 = (cVar.a() << 16) | cVar.a();
        if (a2 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i3 = 0;
        if (a2 == 1635150182) {
            z2 = true;
        } else {
            z2 = false;
        }
        cVar.skip(4L);
        int i4 = i2 - 16;
        if (i4 % 4 == 0) {
            while (i3 < 5 && i4 > 0) {
                int a3 = (cVar.a() << 16) | cVar.a();
                if (a3 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a3 == 1635150182) {
                    z2 = true;
                }
                i3++;
                i4 -= 4;
            }
        }
        if (z2) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

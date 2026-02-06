package o;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C4274Sv1;

/* renamed from: o.zF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11151zF2<T> implements InterfaceC7290jT1<T, Bitmap> {
    public static final String d = "VideoDecoder";
    public static final long e = -1;
    public static final int f = 2;
    public static final C4274Sv1<Long> g = C4274Sv1.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final C4274Sv1<Integer> h = C4274Sv1.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f i = new f();
    public static final List<String> j = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public static final String k = "video/webm";
    public final e<T> a;
    public final InterfaceC4931Zn b;
    public final f c;

    /* renamed from: o.zF2$a */
    /* loaded from: classes.dex */
    public class a implements C4274Sv1.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // o.C4274Sv1.b
        /* renamed from: b */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: o.zF2$b */
    /* loaded from: classes.dex */
    public class b implements C4274Sv1.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // o.C4274Sv1.b
        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: o.zF2$c */
    /* loaded from: classes.dex */
    public static final class c implements e<AssetFileDescriptor> {
        public c() {
        }

        @Override // o.C11151zF2.e
        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // o.C11151zF2.e
        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: o.zF2$e */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: o.zF2$f */
    /* loaded from: classes.dex */
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: o.zF2$g */
    /* loaded from: classes.dex */
    public static final class g implements e<ParcelFileDescriptor> {
        @Override // o.C11151zF2.e
        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // o.C11151zF2.e
        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: o.zF2$h */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public C11151zF2(InterfaceC4931Zn interfaceC4931Zn, e<T> eVar) {
        this(interfaceC4931Zn, eVar, i);
    }

    public static InterfaceC7290jT1<AssetFileDescriptor, Bitmap> c(InterfaceC4931Zn interfaceC4931Zn) {
        return new C11151zF2(interfaceC4931Zn, new c(null));
    }

    public static InterfaceC7290jT1<ByteBuffer, Bitmap> d(InterfaceC4931Zn interfaceC4931Zn) {
        return new C11151zF2(interfaceC4931Zn, new d());
    }

    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable(d, 3)) {
                            Log.d(d, "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                    return bitmap;
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable(d, 3)) {
                    return bitmap;
                }
                Log.d(d, "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
        return mediaMetadataRetriever.getFrameAtTime(j2, i2);
    }

    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC8674p60 abstractC8674p60) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b2 = abstractC8674p60.b(parseInt, parseInt2, i3, i4);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, Math.round(parseInt * b2), Math.round(b2 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (Log.isLoggable(d, 3)) {
                Log.d(d, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        for (String str : j) {
            if (Build.ID.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC7290jT1<ParcelFileDescriptor, Bitmap> m(InterfaceC4931Zn interfaceC4931Zn) {
        return new C11151zF2(interfaceC4931Zn, new g());
    }

    @Override // o.InterfaceC7290jT1
    public boolean a(T t, C5448bw1 c5448bw1) {
        return true;
    }

    @Override // o.InterfaceC7290jT1
    public InterfaceC5580cT1<Bitmap> b(T t, int i2, int i3, C5448bw1 c5448bw1) throws IOException {
        long longValue = ((Long) c5448bw1.c(g)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c5448bw1.c(h);
        if (num == null) {
            num = 2;
        }
        AbstractC8674p60 abstractC8674p60 = (AbstractC8674p60) c5448bw1.c(AbstractC8674p60.h);
        if (abstractC8674p60 == null) {
            abstractC8674p60 = AbstractC8674p60.g;
        }
        AbstractC8674p60 abstractC8674p602 = abstractC8674p60;
        MediaMetadataRetriever a2 = this.c.a();
        try {
            this.a.b(a2, t);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap f2 = f(t, a2, longValue, num.intValue(), i2, i3, abstractC8674p602);
            if (Build.VERSION.SDK_INT >= 29) {
                C2597Bu1.a(a2);
            } else {
                a2.release();
            }
            return C6141eo.c(f2, this.b);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (Build.VERSION.SDK_INT >= 29) {
                C2597Bu1.a(a2);
            } else {
                a2.release();
            }
            throw th3;
        }
    }

    public final Bitmap f(T t, MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC8674p60 abstractC8674p60) {
        Bitmap bitmap;
        if (!l(t, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT >= 27 && i3 != Integer.MIN_VALUE && i4 != Integer.MIN_VALUE && abstractC8674p60 != AbstractC8674p60.f) {
                bitmap = h(mediaMetadataRetriever, j2, i2, i3, i4, abstractC8674p60);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = g(mediaMetadataRetriever, j2, i2);
            }
            Bitmap e2 = e(mediaMetadataRetriever, bitmap);
            if (e2 != null) {
                return e2;
            }
            throw new h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    public final boolean l(T t, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(com.facebook.internal.l0.u)) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.a.a(mediaExtractor2, t);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i2).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable(d, 3)) {
                    Log.d(d, "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public C11151zF2(InterfaceC4931Zn interfaceC4931Zn, e<T> eVar, f fVar) {
        this.b = interfaceC4931Zn;
        this.a = eVar;
        this.c = fVar;
    }

    /* renamed from: o.zF2$d */
    /* loaded from: classes.dex */
    public static final class d implements e<ByteBuffer> {
        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // o.C11151zF2.e
        /* renamed from: d */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // o.C11151zF2.e
        /* renamed from: e */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* renamed from: o.zF2$d$a */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer X;

            public a(ByteBuffer byteBuffer) {
                this.X = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.X.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.X.limit()) {
                    return -1;
                }
                this.X.position((int) j);
                int min = Math.min(i2, this.X.remaining());
                this.X.get(bArr, i, min);
                return min;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}

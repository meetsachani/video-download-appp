package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o.InterfaceC7225jD0;

/* renamed from: o.Qr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4061Qr implements InterfaceC7290jT1<ByteBuffer, C7468kD0> {
    public static final String f = "BufferGifDecoder";
    public static final a g = new a();
    public static final b h = new b();
    public final Context a;
    public final List<ImageHeaderParser> b;
    public final b c;
    public final a d;
    public final C6984iD0 e;

    /* renamed from: o.Qr$a */
    /* loaded from: classes.dex */
    public static class a {
        public InterfaceC7225jD0 a(InterfaceC7225jD0.a aVar, C9437sD0 c9437sD0, ByteBuffer byteBuffer, int i) {
            return new C3415Kb2(aVar, c9437sD0, byteBuffer, i);
        }
    }

    /* renamed from: o.Qr$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Queue<C9680tD0> a = SD2.g(0);

        public synchronized C9680tD0 a(ByteBuffer byteBuffer) {
            C9680tD0 poll;
            try {
                poll = this.a.poll();
                if (poll == null) {
                    poll = new C9680tD0();
                }
            } catch (Throwable th) {
                throw th;
            }
            return poll.q(byteBuffer);
        }

        public synchronized void b(C9680tD0 c9680tD0) {
            c9680tD0.a();
            this.a.offer(c9680tD0);
        }
    }

    public C4061Qr(Context context) {
        this(context, com.bumptech.glide.a.e(context).n().g(), com.bumptech.glide.a.e(context).h(), com.bumptech.glide.a.e(context).g());
    }

    public static int e(C9437sD0 c9437sD0, int i, int i2) {
        int highestOneBit;
        int min = Math.min(c9437sD0.a() / i2, c9437sD0.d() / i);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable(f, 2) && max > 1) {
            Log.v(f, "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c9437sD0.d() + "x" + c9437sD0.a() + C6566gU0.g);
        }
        return max;
    }

    public final C8215nD0 c(ByteBuffer byteBuffer, int i, int i2, C9680tD0 c9680tD0, C5448bw1 c5448bw1) {
        StringBuilder sb;
        Bitmap.Config config;
        long b2 = C5965e41.b();
        try {
            C9437sD0 d = c9680tD0.d();
            if (d.b() > 0 && d.c() == 0) {
                if (c5448bw1.c(C9923uD0.a) == VV.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                InterfaceC7225jD0 a2 = this.d.a(this.e, d, byteBuffer, e(d, i, i2));
                a2.e(config);
                a2.c();
                Bitmap b3 = a2.b();
                if (b3 == null) {
                    if (Log.isLoggable(f, 2)) {
                        sb = new StringBuilder();
                        sb.append("Decoded GIF from stream in ");
                        sb.append(C5965e41.a(b2));
                        Log.v(f, sb.toString());
                    }
                    return null;
                }
                C8215nD0 c8215nD0 = new C8215nD0(new C7468kD0(this.a, a2, C8692pA2.c(), i, i2, b3));
                if (Log.isLoggable(f, 2)) {
                    Log.v(f, "Decoded GIF from stream in " + C5965e41.a(b2));
                }
                return c8215nD0;
            }
            if (!Log.isLoggable(f, 2)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("Decoded GIF from stream in ");
            sb.append(C5965e41.a(b2));
            Log.v(f, sb.toString());
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable(f, 2)) {
                Log.v(f, "Decoded GIF from stream in " + C5965e41.a(b2));
            }
            throw th;
        }
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: d */
    public C8215nD0 b(ByteBuffer byteBuffer, int i, int i2, C5448bw1 c5448bw1) {
        C9680tD0 a2 = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, a2, c5448bw1);
        } finally {
            this.c.b(a2);
        }
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, C5448bw1 c5448bw1) throws IOException {
        if (!((Boolean) c5448bw1.c(C9923uD0.b)).booleanValue() && com.bumptech.glide.load.a.g(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public C4061Qr(Context context, List<ImageHeaderParser> list, InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De) {
        this(context, list, interfaceC4931Zn, interfaceC2727De, h, g);
    }

    public C4061Qr(Context context, List<ImageHeaderParser> list, InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new C6984iD0(interfaceC4931Zn, interfaceC2727De);
        this.c = bVar;
    }
}

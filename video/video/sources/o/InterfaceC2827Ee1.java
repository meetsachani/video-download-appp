package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.Ee1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2827Ee1 {

    /* renamed from: o.Ee1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final C3621Me1 a;
        public final MediaFormat b;
        public final C10833xx0 c;
        @InterfaceC11300zs1
        public final Surface d;
        @InterfaceC11300zs1
        public final MediaCrypto e;
        public final int f;

        public a(C3621Me1 c3621Me1, MediaFormat mediaFormat, C10833xx0 c10833xx0, @InterfaceC11300zs1 Surface surface, @InterfaceC11300zs1 MediaCrypto mediaCrypto, int i) {
            this.a = c3621Me1;
            this.b = mediaFormat;
            this.c = c10833xx0;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
        }

        public static a a(C3621Me1 c3621Me1, MediaFormat mediaFormat, C10833xx0 c10833xx0, @InterfaceC11300zs1 MediaCrypto mediaCrypto) {
            return new a(c3621Me1, mediaFormat, c10833xx0, null, mediaCrypto, 0);
        }

        public static a b(C3621Me1 c3621Me1, MediaFormat mediaFormat, C10833xx0 c10833xx0, @InterfaceC11300zs1 Surface surface, @InterfaceC11300zs1 MediaCrypto mediaCrypto) {
            return new a(c3621Me1, mediaFormat, c10833xx0, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: o.Ee1$b */
    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new HZ();

        InterfaceC2827Ee1 a(a aVar) throws IOException;
    }

    /* renamed from: o.Ee1$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(InterfaceC2827Ee1 interfaceC2827Ee1, long j, long j2);
    }

    MediaFormat a();

    @ES1(26)
    PersistableBundle b();

    @ES1(23)
    void c(c cVar, Handler handler);

    @InterfaceC11300zs1
    ByteBuffer d(int i);

    void e(int i);

    @ES1(23)
    void f(Surface surface);

    void flush();

    void g();

    void h(int i, int i2, int i3, long j, int i4);

    boolean i();

    @ES1(19)
    void j(Bundle bundle);

    @ES1(21)
    void k(int i, long j);

    int l();

    int m(MediaCodec.BufferInfo bufferInfo);

    void n(int i, boolean z);

    void o(int i, int i2, C7766lR c7766lR, long j, int i3);

    @InterfaceC11300zs1
    ByteBuffer p(int i);
}

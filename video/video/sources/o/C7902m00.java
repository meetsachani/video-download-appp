package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import o.C5594cY;
import o.InterfaceC2827Ee1;

@Deprecated
/* renamed from: o.m00  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7902m00 implements InterfaceC11198zR1 {
    public static final long j = 5000;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 50;

    /* renamed from: o  reason: collision with root package name */
    public static final String f801o = "DefaultRenderersFactory";
    public final Context a;
    public boolean e;
    public boolean g;
    public boolean h;
    public boolean i;
    public final HZ b = new HZ();
    public int c = 0;
    public long d = 5000;
    public InterfaceC4108Re1 f = InterfaceC4108Re1.a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.m00$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C7902m00(Context context) {
        this.a = context;
    }

    @Override // o.InterfaceC11198zR1
    public InterfaceC10469wR1[] a(Handler handler, NG2 ng2, InterfaceC8085mh interfaceC8085mh, InterfaceC3850Om2 interfaceC3850Om2, InterfaceC6864hj1 interfaceC6864hj1) {
        Handler handler2;
        ArrayList<InterfaceC10469wR1> arrayList = new ArrayList<>();
        h(this.a, this.c, this.f, this.e, handler, ng2, this.d, arrayList);
        InterfaceC9058qh c = c(this.a, this.g, this.h, this.i);
        if (c != null) {
            handler2 = handler;
            b(this.a, this.c, this.f, this.e, c, handler2, interfaceC8085mh, arrayList);
        } else {
            handler2 = handler;
        }
        g(this.a, interfaceC3850Om2, handler2.getLooper(), this.c, arrayList);
        e(this.a, interfaceC6864hj1, handler2.getLooper(), this.c, arrayList);
        d(this.a, this.c, arrayList);
        f(this.a, handler2, this.c, arrayList);
        return (InterfaceC10469wR1[]) arrayList.toArray(new InterfaceC10469wR1[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:49|50|(3:11|12|13)|(2:14|15)|16|17|18|19|20|22|23) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:49|50|11|12|13|(2:14|15)|16|17|18|19|20|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, int i, InterfaceC4108Re1 interfaceC4108Re1, boolean z, InterfaceC9058qh interfaceC9058qh, Handler handler, InterfaceC8085mh interfaceC8085mh, ArrayList<InterfaceC10469wR1> arrayList) {
        int i2;
        int i3;
        arrayList.add(new C2936Fe1(context, l(), interfaceC4108Re1, z, handler, interfaceC8085mh, interfaceC9058qh));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        I31.h(f801o, "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                        try {
                            i3 = i2 + 1;
                        } catch (ClassNotFoundException unused2) {
                        }
                        try {
                            try {
                                arrayList.add(i2, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                                I31.h(f801o, "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused3) {
                                i2 = i3;
                                i3 = i2;
                                int i4 = i3 + 1;
                                arrayList.add(i3, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                                I31.h(f801o, "Loaded LibflacAudioRenderer.");
                                arrayList.add(i4, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                                I31.h(f801o, "Loaded FfmpegAudioRenderer.");
                            }
                            arrayList.add(i4, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                            I31.h(f801o, "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            return;
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FFmpeg extension", e);
                        }
                        int i42 = i3 + 1;
                        arrayList.add(i3, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                        I31.h(f801o, "Loaded LibflacAudioRenderer.");
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating MIDI extension", e2);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                i3 = i2 + 1;
                arrayList.add(i2, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                I31.h(f801o, "Loaded LibopusAudioRenderer.");
                try {
                    int i422 = i3 + 1;
                    arrayList.add(i3, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                    I31.h(f801o, "Loaded LibflacAudioRenderer.");
                    arrayList.add(i422, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC8085mh.class, InterfaceC9058qh.class).newInstance(handler, interfaceC8085mh, interfaceC9058qh));
                    I31.h(f801o, "Loaded FfmpegAudioRenderer.");
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating FLAC extension", e3);
                }
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating Opus extension", e4);
            }
        }
    }

    @InterfaceC11300zs1
    public InterfaceC9058qh c(Context context, boolean z, boolean z2, boolean z3) {
        return new C5594cY.g(context).m(z).l(z2).o(z3 ? 1 : 0).g();
    }

    public void d(Context context, int i, ArrayList<InterfaceC10469wR1> arrayList) {
        arrayList.add(new C10100ux());
    }

    public void e(Context context, InterfaceC6864hj1 interfaceC6864hj1, Looper looper, int i, ArrayList<InterfaceC10469wR1> arrayList) {
        arrayList.add(new C7106ij1(interfaceC6864hj1, looper));
    }

    public void g(Context context, InterfaceC3850Om2 interfaceC3850Om2, Looper looper, int i, ArrayList<InterfaceC10469wR1> arrayList) {
        arrayList.add(new C4241Sm2(interfaceC3850Om2, looper));
    }

    public void h(Context context, int i, InterfaceC4108Re1 interfaceC4108Re1, boolean z, Handler handler, NG2 ng2, long j2, ArrayList<InterfaceC10469wR1> arrayList) {
        String str;
        Integer num;
        int i2;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new C5865df1(context, l(), interfaceC4108Re1, j2, z, handler, ng2, 50));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, NG2.class, cls);
                    num = 50;
                    try {
                        i2 = size + 1;
                        try {
                            arrayList.add(size, (InterfaceC10469wR1) constructor.newInstance(Long.valueOf(j2), handler, ng2, 50));
                            str = f801o;
                            try {
                                I31.h(str, "Loaded LibvpxVideoRenderer.");
                            } catch (ClassNotFoundException unused) {
                                size = i2;
                                i2 = size;
                                arrayList.add(i2, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, NG2.class, cls).newInstance(Long.valueOf(j2), handler, ng2, num));
                                I31.h(str, "Loaded Libgav1VideoRenderer.");
                            }
                        } catch (ClassNotFoundException unused2) {
                            str = f801o;
                        }
                    } catch (ClassNotFoundException unused3) {
                        str = f801o;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating VP9 extension", e);
                }
            } catch (ClassNotFoundException unused4) {
                str = f801o;
                num = 50;
            }
            try {
                arrayList.add(i2, (InterfaceC10469wR1) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, NG2.class, cls).newInstance(Long.valueOf(j2), handler, ng2, num));
                I31.h(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        }
    }

    @InterfaceC6181ey
    public C7902m00 i(boolean z) {
        this.b.b(z);
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 j() {
        this.b.c();
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 k() {
        this.b.d();
        return this;
    }

    public InterfaceC2827Ee1.b l() {
        return this.b;
    }

    @InterfaceC6181ey
    public C7902m00 m(long j2) {
        this.d = j2;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 n(boolean z) {
        this.g = z;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 o(boolean z) {
        this.i = z;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 p(boolean z) {
        this.h = z;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 q(boolean z) {
        this.e = z;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 r(int i) {
        this.c = i;
        return this;
    }

    @InterfaceC6181ey
    public C7902m00 s(InterfaceC4108Re1 interfaceC4108Re1) {
        this.f = interfaceC4108Re1;
        return this;
    }

    public void f(Context context, Handler handler, int i, ArrayList<InterfaceC10469wR1> arrayList) {
    }
}

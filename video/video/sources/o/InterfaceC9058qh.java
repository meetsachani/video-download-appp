package o;

import android.media.AudioDeviceInfo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@Deprecated
/* renamed from: o.qh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9058qh {
    public static final int a = 2;
    public static final int b = 1;
    public static final int c = 0;
    public static final long d = Long.MIN_VALUE;

    /* renamed from: o.qh$b */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public final int X;
        public final boolean Y;
        public final C10833xx0 Z;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i, int i2, int i3, int i4, C10833xx0 c10833xx0, boolean z, @InterfaceC11300zs1 Exception exc) {
            super(r0.toString(), exc);
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(C4500Ve2.b);
            sb.append("Config(");
            sb.append(i2);
            sb.append(C6566gU0.h);
            sb.append(i3);
            sb.append(C6566gU0.h);
            sb.append(i4);
            sb.append(C9811tl1.d);
            sb.append(C4500Ve2.b);
            sb.append(c10833xx0);
            if (z) {
                str = " (recoverable)";
            } else {
                str = "";
            }
            sb.append(str);
            this.X = i;
            this.Y = z;
            this.Z = c10833xx0;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.qh$d */
    /* loaded from: classes2.dex */
    public @interface d {
    }

    /* renamed from: o.qh$e */
    /* loaded from: classes2.dex */
    public static final class e extends Exception {
        public final long X;
        public final long Y;

        public e(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.X = j;
            this.Y = j2;
        }
    }

    /* renamed from: o.qh$f */
    /* loaded from: classes2.dex */
    public static final class f extends Exception {
        public final int X;
        public final boolean Y;
        public final C10833xx0 Z;

        public f(int i, C10833xx0 c10833xx0, boolean z) {
            super("AudioTrack write failed: " + i);
            this.Y = z;
            this.X = i;
            this.Z = c10833xx0;
        }
    }

    boolean a(C10833xx0 c10833xx0);

    @InterfaceC11300zs1
    C9546sg b();

    boolean c();

    void d(int i);

    void f(DD1 dd1);

    void flush();

    DD1 h();

    void i(C3737Nj c3737Nj);

    boolean j();

    void k(boolean z);

    boolean m();

    void n(C9546sg c9546sg);

    void o();

    void p(c cVar);

    void pause();

    boolean q(ByteBuffer byteBuffer, long j, int i) throws b, f;

    void r();

    void reset();

    int s(C10833xx0 c10833xx0);

    void setVolume(float f2);

    void t() throws f;

    void t0();

    void u(C10833xx0 c10833xx0, int i, @InterfaceC11300zs1 int[] iArr) throws a;

    long v(boolean z);

    void x();

    void y();

    /* renamed from: o.qh$a */
    /* loaded from: classes2.dex */
    public static final class a extends Exception {
        public final C10833xx0 X;

        public a(Throwable th, C10833xx0 c10833xx0) {
            super(th);
            this.X = c10833xx0;
        }

        public a(String str, C10833xx0 c10833xx0) {
            super(str);
            this.X = c10833xx0;
        }
    }

    /* renamed from: o.qh$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(boolean z);

        void e(int i, long j, long j2);

        void g();

        default void d() {
        }

        default void f() {
        }

        default void h() {
        }

        default void b(Exception exc) {
        }

        default void c(long j) {
        }
    }

    default void g() {
    }

    default void l(@InterfaceC11300zs1 ND1 nd1) {
    }

    @ES1(23)
    default void setPreferredDevice(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
    }

    default void w(long j) {
    }
}

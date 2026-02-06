package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: o.eG2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6014eG2 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final long d = -1;
    public static final long e = -2;

    /* renamed from: o.eG2$a */
    /* loaded from: classes2.dex */
    public interface a {
        InterfaceC6014eG2 a(Context context, List<P90> list, SV sv, IF r4, IF r5, boolean z, Executor executor, c cVar) throws C5772dG2;
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.eG2$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.eG2$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b(long j);

        void c(int i, int i2);

        void d(C5772dG2 c5772dG2);
    }

    void a();

    void b(@InterfaceC11300zs1 C6861hi2 c6861hi2);

    Surface c();

    void d(C4088Qz0 c4088Qz0);

    void e(int i, long j);

    void f(Bitmap bitmap, long j, float f);

    void flush();

    void g();

    void h(long j);

    void i(int i);

    void j();

    int k();

    void l(InterfaceC4853Yu1 interfaceC4853Yu1);
}

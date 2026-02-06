package o;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: o.zb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC11231zb0 {
    public static final long a = -1;

    /* renamed from: o.zb0$a */
    /* loaded from: classes.dex */
    public interface a extends b, InterfaceC7617kq<ZP0> {
    }

    /* renamed from: o.zb0$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: o.zb0$c */
    /* loaded from: classes.dex */
    public interface c extends b {

        /* renamed from: o.zb0$c$a */
        /* loaded from: classes.dex */
        public interface a {
            void a(Surface surface);
        }

        void e(Executor executor, a aVar);
    }

    b a();

    void b(long j);

    void c(InterfaceC2814Eb0 interfaceC2814Eb0, Executor executor);

    InterfaceC10506wc0 d();

    InterfaceFutureC8411o11<Void> e();

    void f();

    void g();

    int h();

    void pause();

    void start();

    void stop();
}

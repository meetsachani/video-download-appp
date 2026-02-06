package o;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC10290vj2;

/* renamed from: o.Hj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3153Hj2 {
    public final b a;

    /* renamed from: o.Hj2$a */
    /* loaded from: classes.dex */
    public static class a {
        public final Executor a;
        public final ScheduledExecutorService b;
        public final Handler c;
        public final C5700cz d;
        public final C10931yL1 e;
        public final C10931yL1 f;
        public final boolean g;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C5700cz c5700cz, C10931yL1 c10931yL1, C10931yL1 c10931yL12) {
            boolean z;
            this.a = executor;
            this.b = scheduledExecutorService;
            this.c = handler;
            this.d = c5700cz;
            this.e = c10931yL1;
            this.f = c10931yL12;
            if (!new C7646kx0(c10931yL1, c10931yL12).b() && !new C8971qJ2(c10931yL1).g() && !new C7403jx0(c10931yL12).d()) {
                z = false;
            } else {
                z = true;
            }
            this.g = z;
        }

        public C3153Hj2 a() {
            b c2554Bj2;
            if (this.g) {
                c2554Bj2 = new C3055Gj2(this.e, this.f, this.d, this.a, this.b, this.c);
            } else {
                c2554Bj2 = new C2554Bj2(this.d, this.a, this.b, this.c);
            }
            return new C3153Hj2(c2554Bj2);
        }
    }

    /* renamed from: o.Hj2$b */
    /* loaded from: classes.dex */
    public interface b {
        Executor d();

        InterfaceFutureC8411o11<List<Surface>> n(List<D10> list, long j);

        U12 o(int i, List<C3006Fw1> list, InterfaceC10290vj2.a aVar);

        InterfaceFutureC8411o11<Void> r(CameraDevice cameraDevice, U12 u12, List<D10> list);

        boolean stop();
    }

    public C3153Hj2(b bVar) {
        this.a = bVar;
    }

    public U12 a(int i, List<C3006Fw1> list, InterfaceC10290vj2.a aVar) {
        return this.a.o(i, list, aVar);
    }

    public Executor b() {
        return this.a.d();
    }

    public InterfaceFutureC8411o11<Void> c(CameraDevice cameraDevice, U12 u12, List<D10> list) {
        return this.a.r(cameraDevice, u12, list);
    }

    public InterfaceFutureC8411o11<List<Surface>> d(List<D10> list, long j) {
        return this.a.n(list, j);
    }

    public boolean e() {
        return this.a.stop();
    }
}

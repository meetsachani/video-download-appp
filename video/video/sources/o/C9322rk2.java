package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC5285bG0;

@Deprecated
/* renamed from: o.rk2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9322rk2 implements InterfaceC5285bG0 {
    public static final int b = 50;
    @InterfaceC8710pF0("messagePool")
    public static final List<b> c = new ArrayList(50);
    public final Handler a;

    /* renamed from: o.rk2$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC5285bG0.a {
        @InterfaceC11300zs1
        public Message a;
        @InterfaceC11300zs1
        public C9322rk2 b;

        public b() {
        }

        @Override // o.InterfaceC5285bG0.a
        public void a() {
            ((Message) C9542sf.g(this.a)).sendToTarget();
            b();
        }

        public final void b() {
            this.a = null;
            this.b = null;
            C9322rk2.r(this);
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C9542sf.g(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        @InterfaceC6181ey
        public b d(Message message, C9322rk2 c9322rk2) {
            this.a = message;
            this.b = c9322rk2;
            return this;
        }

        @Override // o.InterfaceC5285bG0.a
        public InterfaceC5285bG0 getTarget() {
            return (InterfaceC5285bG0) C9542sf.g(this.b);
        }
    }

    public C9322rk2(Handler handler) {
        this.a = handler;
    }

    public static b q() {
        b remove;
        List<b> list = c;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    remove = new b();
                } else {
                    remove = list.remove(list.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public static void r(b bVar) {
        List<b> list = c;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC5285bG0
    public boolean a(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // o.InterfaceC5285bG0
    public boolean b(Runnable runnable) {
        return this.a.postAtFrontOfQueue(runnable);
    }

    @Override // o.InterfaceC5285bG0
    public InterfaceC5285bG0.a c(int i) {
        return q().d(this.a.obtainMessage(i), this);
    }

    @Override // o.InterfaceC5285bG0
    public boolean d(int i) {
        return this.a.hasMessages(i);
    }

    @Override // o.InterfaceC5285bG0
    public InterfaceC5285bG0.a e(int i, int i2, int i3, @InterfaceC11300zs1 Object obj) {
        return q().d(this.a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // o.InterfaceC5285bG0
    public InterfaceC5285bG0.a f(int i, @InterfaceC11300zs1 Object obj) {
        return q().d(this.a.obtainMessage(i, obj), this);
    }

    @Override // o.InterfaceC5285bG0
    public void g(@InterfaceC11300zs1 Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // o.InterfaceC5285bG0
    public Looper h() {
        return this.a.getLooper();
    }

    @Override // o.InterfaceC5285bG0
    public InterfaceC5285bG0.a i(int i, int i2, int i3) {
        return q().d(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // o.InterfaceC5285bG0
    public boolean j(InterfaceC5285bG0.a aVar) {
        return ((b) aVar).c(this.a);
    }

    @Override // o.InterfaceC5285bG0
    public boolean k(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // o.InterfaceC5285bG0
    public boolean l(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }

    @Override // o.InterfaceC5285bG0
    public boolean m(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // o.InterfaceC5285bG0
    public boolean n(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // o.InterfaceC5285bG0
    public void o(int i) {
        this.a.removeMessages(i);
    }
}

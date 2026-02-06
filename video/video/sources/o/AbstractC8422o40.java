package o;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@InterfaceC6827ha0
/* renamed from: o.o40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8422o40 {

    /* renamed from: o.o40$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC8422o40 {
        public static final b a = new b();

        @Override // o.AbstractC8422o40
        public void a(Object obj, Iterator<C2945Fg2> it) {
            C10664xF1.E(obj);
            while (it.hasNext()) {
                it.next().d(obj);
            }
        }
    }

    /* renamed from: o.o40$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC8422o40 {
        public final ConcurrentLinkedQueue<a> a;

        /* renamed from: o.o40$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            public final Object a;
            public final C2945Fg2 b;

            public a(Object obj, C2945Fg2 c2945Fg2) {
                this.a = obj;
                this.b = c2945Fg2;
            }
        }

        public c() {
            this.a = C10445wL1.f();
        }

        @Override // o.AbstractC8422o40
        public void a(Object obj, Iterator<C2945Fg2> it) {
            C10664xF1.E(obj);
            while (it.hasNext()) {
                this.a.add(new a(obj, it.next()));
            }
            while (true) {
                a poll = this.a.poll();
                if (poll != null) {
                    poll.b.d(poll.a);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o.o40$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC8422o40 {
        public final ThreadLocal<Queue<c>> a;
        public final ThreadLocal<Boolean> b;

        /* renamed from: o.o40$d$a */
        /* loaded from: classes3.dex */
        public class a extends ThreadLocal<Queue<c>> {
            public a(d dVar) {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public Queue<c> initialValue() {
                return C10445wL1.d();
            }
        }

        /* renamed from: o.o40$d$b */
        /* loaded from: classes3.dex */
        public class b extends ThreadLocal<Boolean> {
            public b(d dVar) {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* renamed from: o.o40$d$c */
        /* loaded from: classes3.dex */
        public static final class c {
            public final Object a;
            public final Iterator<C2945Fg2> b;

            public c(Object obj, Iterator<C2945Fg2> it) {
                this.a = obj;
                this.b = it;
            }
        }

        public d() {
            this.a = new a(this);
            this.b = new b(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0034 A[Catch: all -> 0x0050, LOOP:1: B:7:0x0034->B:9:0x003e, LOOP_START, TryCatch #0 {all -> 0x0050, blocks: (B:5:0x002c, B:7:0x0034, B:9:0x003e), top: B:18:0x002c }] */
        @Override // o.AbstractC8422o40
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(Object obj, Iterator<C2945Fg2> it) {
            C10664xF1.E(obj);
            C10664xF1.E(it);
            Queue<c> queue = this.a.get();
            queue.offer(new c(obj, it));
            if (!this.b.get().booleanValue()) {
                this.b.set(Boolean.TRUE);
                while (true) {
                    try {
                        c poll = queue.poll();
                        if (poll == null) {
                            while (true) {
                                if (poll.b.hasNext()) {
                                    ((C2945Fg2) poll.b.next()).d(poll.a);
                                }
                            }
                            c poll2 = queue.poll();
                            if (poll2 == null) {
                                return;
                            }
                        }
                    } finally {
                        this.b.remove();
                        this.a.remove();
                    }
                }
            }
        }
    }

    public static AbstractC8422o40 b() {
        return b.a;
    }

    public static AbstractC8422o40 c() {
        return new c();
    }

    public static AbstractC8422o40 d() {
        return new d();
    }

    public abstract void a(Object obj, Iterator<C2945Fg2> it);
}

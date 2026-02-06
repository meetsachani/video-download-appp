package o;

import java.util.concurrent.atomic.AtomicLong;

@InterfaceC7311ja0
/* renamed from: o.w41  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10377w41 {
    public static final InterfaceC8331nh2<InterfaceC9645t41> a;

    /* renamed from: o.w41$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8331nh2<InterfaceC9645t41> {
        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public InterfaceC9645t41 get() {
            return new C10620x41();
        }
    }

    /* renamed from: o.w41$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC8331nh2<InterfaceC9645t41> {
        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public InterfaceC9645t41 get() {
            return new c(null);
        }
    }

    /* renamed from: o.w41$c */
    /* loaded from: classes3.dex */
    public static final class c extends AtomicLong implements InterfaceC9645t41 {
        public c() {
        }

        @Override // o.InterfaceC9645t41
        public void a() {
            getAndIncrement();
        }

        @Override // o.InterfaceC9645t41
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // o.InterfaceC9645t41
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        InterfaceC8331nh2<InterfaceC9645t41> bVar;
        try {
            new C10620x41();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        a = bVar;
    }

    public static InterfaceC9645t41 a() {
        return a.get();
    }
}

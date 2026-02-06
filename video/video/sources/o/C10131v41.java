package o;

import java.util.concurrent.atomic.AtomicLong;

@InterfaceC6086ea0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.v41  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10131v41 {
    public static final InterfaceC8331nh2<InterfaceC9888u41> a;

    /* renamed from: o.v41$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8331nh2<InterfaceC9888u41> {
        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public InterfaceC9888u41 get() {
            return new C10863y41();
        }
    }

    /* renamed from: o.v41$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC8331nh2<InterfaceC9888u41> {
        @Override // o.InterfaceC8331nh2
        /* renamed from: a */
        public InterfaceC9888u41 get() {
            return new c(null);
        }
    }

    /* renamed from: o.v41$c */
    /* loaded from: classes3.dex */
    public static final class c extends AtomicLong implements InterfaceC9888u41 {
        public c() {
        }

        @Override // o.InterfaceC9888u41
        public void a() {
            getAndIncrement();
        }

        @Override // o.InterfaceC9888u41
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // o.InterfaceC9888u41
        public long sum() {
            return get();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        InterfaceC8331nh2<InterfaceC9888u41> bVar;
        try {
            new C10863y41();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        a = bVar;
    }

    public static InterfaceC9888u41 a() {
        return a.get();
    }
}

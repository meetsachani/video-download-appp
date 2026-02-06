package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.g60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6470g60 {
    public static C6470g60 c;
    public final Map<Integer, C5730d60> a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger();

    public static C6470g60 g() {
        if (c == null) {
            synchronized (C6470g60.class) {
                try {
                    if (c == null) {
                        c = new C6470g60();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static void j() {
        g();
    }

    public void a(C5730d60 c5730d60) {
        this.a.put(Integer.valueOf(c5730d60.r()), c5730d60);
        c5730d60.T(EnumC4101Rc2.QUEUED);
        c5730d60.S(h());
        c5730d60.L(SP.b().a().a().submit(new RunnableC6713h60(c5730d60)));
    }

    public void b(int i) {
        e(this.a.get(Integer.valueOf(i)));
    }

    public void c(Object obj) {
        for (Map.Entry<Integer, C5730d60> entry : this.a.entrySet()) {
            C5730d60 value = entry.getValue();
            if ((value.C() instanceof String) && (obj instanceof String)) {
                if (((String) value.C()).equals((String) obj)) {
                    e(value);
                }
            } else if (value.C().equals(obj)) {
                e(value);
            }
        }
    }

    public void d() {
        for (Map.Entry<Integer, C5730d60> entry : this.a.entrySet()) {
            e(entry.getValue());
        }
    }

    public final void e(C5730d60 c5730d60) {
        if (c5730d60 != null) {
            c5730d60.f();
            this.a.remove(Integer.valueOf(c5730d60.r()));
        }
    }

    public void f(C5730d60 c5730d60) {
        this.a.remove(Integer.valueOf(c5730d60.r()));
    }

    public final int h() {
        return this.b.incrementAndGet();
    }

    public EnumC4101Rc2 i(int i) {
        C5730d60 c5730d60 = this.a.get(Integer.valueOf(i));
        if (c5730d60 != null) {
            return c5730d60.B();
        }
        return EnumC4101Rc2.UNKNOWN;
    }

    public void k(int i) {
        C5730d60 c5730d60 = this.a.get(Integer.valueOf(i));
        if (c5730d60 != null) {
            c5730d60.T(EnumC4101Rc2.PAUSED);
        }
    }

    public void l(int i) {
        C5730d60 c5730d60 = this.a.get(Integer.valueOf(i));
        if (c5730d60 != null) {
            c5730d60.T(EnumC4101Rc2.QUEUED);
            c5730d60.L(SP.b().a().a().submit(new RunnableC6713h60(c5730d60)));
        }
    }
}

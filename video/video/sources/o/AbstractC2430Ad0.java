package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.Ad0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2430Ad0<T> extends AbstractC6950i42 {
    public AbstractC2430Ad0(VU1 vu1) {
        super(vu1);
    }

    public abstract void g(InterfaceC2546Bh2 interfaceC2546Bh2, T t);

    public final void h(Iterable<? extends T> iterable) {
        InterfaceC2546Bh2 a = a();
        try {
            for (T t : iterable) {
                g(a, t);
                a.U2();
            }
        } finally {
            f(a);
        }
    }

    public final void i(T t) {
        InterfaceC2546Bh2 a = a();
        try {
            g(a, t);
            a.U2();
        } finally {
            f(a);
        }
    }

    public final void j(T[] tArr) {
        InterfaceC2546Bh2 a = a();
        try {
            for (T t : tArr) {
                g(a, t);
                a.U2();
            }
        } finally {
            f(a);
        }
    }

    public final long k(T t) {
        InterfaceC2546Bh2 a = a();
        try {
            g(a, t);
            return a.U2();
        } finally {
            f(a);
        }
    }

    public final long[] l(Collection<? extends T> collection) {
        InterfaceC2546Bh2 a = a();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                g(a, t);
                jArr[i] = a.U2();
                i++;
            }
            return jArr;
        } finally {
            f(a);
        }
    }

    public final long[] m(T[] tArr) {
        InterfaceC2546Bh2 a = a();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                jArr[i] = a.U2();
                i++;
            }
            return jArr;
        } finally {
            f(a);
        }
    }

    public final Long[] n(Collection<? extends T> collection) {
        InterfaceC2546Bh2 a = a();
        try {
            Long[] lArr = new Long[collection.size()];
            int i = 0;
            for (T t : collection) {
                g(a, t);
                lArr[i] = Long.valueOf(a.U2());
                i++;
            }
            return lArr;
        } finally {
            f(a);
        }
    }

    public final Long[] o(T[] tArr) {
        InterfaceC2546Bh2 a = a();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                lArr[i] = Long.valueOf(a.U2());
                i++;
            }
            return lArr;
        } finally {
            f(a);
        }
    }

    public final List<Long> p(Collection<? extends T> collection) {
        InterfaceC2546Bh2 a = a();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            for (T t : collection) {
                g(a, t);
                arrayList.add(i, Long.valueOf(a.U2()));
                i++;
            }
            return arrayList;
        } finally {
            f(a);
        }
    }

    public final List<Long> q(T[] tArr) {
        InterfaceC2546Bh2 a = a();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                arrayList.add(i, Long.valueOf(a.U2()));
                i++;
            }
            return arrayList;
        } finally {
            f(a);
        }
    }
}

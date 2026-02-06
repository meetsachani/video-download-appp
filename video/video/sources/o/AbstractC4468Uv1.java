package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

@L40("Use Optional.of(value) or Optional.absent()")
@InterfaceC10420wF0(serializable = true)
@InterfaceC8301na0
/* renamed from: o.Uv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4468Uv1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o.Uv1$a */
    /* loaded from: classes3.dex */
    public class a implements Iterable<T> {
        public final /* synthetic */ Iterable X;

        /* renamed from: o.Uv1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0231a extends AbstractC6194f1<T> {
            public final Iterator<? extends AbstractC4468Uv1<? extends T>> Z;

            public C0231a() {
                this.Z = (Iterator) C10664xF1.E(a.this.X.iterator());
            }

            @Override // o.AbstractC6194f1
            @MB
            public T b() {
                while (this.Z.hasNext()) {
                    AbstractC4468Uv1<? extends T> next = this.Z.next();
                    if (next.e()) {
                        return next.d();
                    }
                }
                return c();
            }
        }

        public a(Iterable iterable) {
            this.X = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0231a();
        }
    }

    public static <T> AbstractC4468Uv1<T> a() {
        return K.m();
    }

    public static <T> AbstractC4468Uv1<T> c(@MB T t) {
        if (t == null) {
            return a();
        }
        return new OG1(t);
    }

    public static <T> AbstractC4468Uv1<T> f(T t) {
        return new OG1(C10664xF1.E(t));
    }

    @InterfaceC4238Sm
    public static <T> Iterable<T> k(Iterable<? extends AbstractC4468Uv1<? extends T>> iterable) {
        C10664xF1.E(iterable);
        return new a(iterable);
    }

    public abstract Set<T> b();

    public abstract T d();

    public abstract boolean e();

    public abstract boolean equals(@MB Object obj);

    public abstract T g(T t);

    @InterfaceC4238Sm
    public abstract T h(InterfaceC8331nh2<? extends T> interfaceC8331nh2);

    public abstract int hashCode();

    public abstract AbstractC4468Uv1<T> i(AbstractC4468Uv1<? extends T> abstractC4468Uv1);

    @MB
    public abstract T j();

    public abstract <V> AbstractC4468Uv1<V> l(YA0<? super T, V> ya0);

    public abstract String toString();
}

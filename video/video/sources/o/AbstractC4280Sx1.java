package o;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.Sx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4280Sx1<L, R> implements Map.Entry<L, R>, Comparable<AbstractC4280Sx1<L, R>>, Serializable {
    public static final AbstractC4280Sx1<?, ?>[] X = new a[0];
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: o.Sx1$a */
    /* loaded from: classes4.dex */
    public static final class a<L, R> extends AbstractC4280Sx1<L, R> {
        private static final long serialVersionUID = 1;

        @Override // o.AbstractC4280Sx1, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((AbstractC4280Sx1) obj);
        }

        @Override // o.AbstractC4280Sx1
        public L h() {
            return null;
        }

        @Override // o.AbstractC4280Sx1
        public R i() {
            return null;
        }

        @Override // java.util.Map.Entry
        public R setValue(R r) {
            return null;
        }
    }

    public static <L, R> AbstractC4280Sx1<L, R>[] g() {
        return (AbstractC4280Sx1<L, R>[]) X;
    }

    public static <L, R> AbstractC4280Sx1<L, R> j(L l, R r) {
        return C8746pO0.q(l, r);
    }

    public static <L, R> AbstractC4280Sx1<L, R> l(Map.Entry<L, R> entry) {
        return C8746pO0.r(entry);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(AbstractC4280Sx1<L, R> abstractC4280Sx1) {
        return new C8717pH().g(h(), abstractC4280Sx1.h()).g(i(), abstractC4280Sx1.i()).D();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return h();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return i();
    }

    public abstract L h();

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    public abstract R i();

    public String m(String str) {
        return String.format(str, h(), i());
    }

    public String toString() {
        return C9811tl1.c + h() + ',' + i() + ')';
    }
}

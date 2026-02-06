package o;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: o.zu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC11309zu2<L, M, R> implements Comparable<AbstractC11309zu2<L, M, R>>, Serializable {
    public static final AbstractC11309zu2<?, ?, ?>[] X = new a[0];
    private static final long serialVersionUID = 1;

    /* renamed from: o.zu2$a */
    /* loaded from: classes4.dex */
    public static final class a<L, M, R> extends AbstractC11309zu2<L, M, R> {
        private static final long serialVersionUID = 1;

        @Override // o.AbstractC11309zu2, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((AbstractC11309zu2) obj);
        }

        @Override // o.AbstractC11309zu2
        public L h() {
            return null;
        }

        @Override // o.AbstractC11309zu2
        public M i() {
            return null;
        }

        @Override // o.AbstractC11309zu2
        public R j() {
            return null;
        }
    }

    public static <L, M, R> AbstractC11309zu2<L, M, R>[] g() {
        return (AbstractC11309zu2<L, M, R>[]) X;
    }

    public static <L, M, R> AbstractC11309zu2<L, M, R> l(L l, M m, R r) {
        return new CO0(l, m, r);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(AbstractC11309zu2<L, M, R> abstractC11309zu2) {
        return new C8717pH().g(h(), abstractC11309zu2.h()).g(i(), abstractC11309zu2.i()).g(j(), abstractC11309zu2.j()).D();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11309zu2) {
            AbstractC11309zu2 abstractC11309zu2 = (AbstractC11309zu2) obj;
            if (Objects.equals(h(), abstractC11309zu2.h()) && Objects.equals(i(), abstractC11309zu2.i()) && Objects.equals(j(), abstractC11309zu2.j())) {
                return true;
            }
        }
        return false;
    }

    public abstract L h();

    public int hashCode() {
        return (Objects.hashCode(h()) ^ Objects.hashCode(i())) ^ Objects.hashCode(j());
    }

    public abstract M i();

    public abstract R j();

    public String m(String str) {
        return String.format(str, h(), i(), j());
    }

    public String toString() {
        return C9811tl1.c + h() + "," + i() + "," + j() + C9811tl1.d;
    }
}

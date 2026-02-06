package o;

import android.util.Range;
import o.InterfaceC6987iE;

/* loaded from: classes.dex */
public final class TN1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements InterfaceC6987iE<T> {
        public final /* synthetic */ Range<T> X;

        public a(Range<T> range) {
            this.X = range;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
        @Override // o.InterfaceC6987iE
        public Comparable d() {
            return this.X.getLower();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // o.InterfaceC6987iE
        public boolean e(Comparable comparable) {
            return InterfaceC6987iE.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
        @Override // o.InterfaceC6987iE
        public Comparable h() {
            return this.X.getUpper();
        }

        @Override // o.InterfaceC6987iE
        public boolean isEmpty() {
            return InterfaceC6987iE.a.b(this);
        }
    }

    public static final <T extends Comparable<? super T>> Range<T> a(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> b(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> c(Range<T> range, T t) {
        return range.extend((Range<T>) t);
    }

    public static final <T extends Comparable<? super T>> Range<T> d(T t, T t2) {
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> InterfaceC6987iE<T> e(Range<T> range) {
        return new a(range);
    }

    public static final <T extends Comparable<? super T>> Range<T> f(InterfaceC6987iE<T> interfaceC6987iE) {
        return new Range<>(interfaceC6987iE.d(), interfaceC6987iE.h());
    }
}

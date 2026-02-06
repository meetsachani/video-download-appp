package o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.m22  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7912m22<E> extends AbstractC8170n2<E> implements Set<E>, Serializable, RW0 {
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public static final C7912m22 Z = new C7912m22(H71.i1.e());
    @NotNull
    public final H71<E, ?> X;

    /* renamed from: o.m22$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C7912m22(@NotNull H71<E, ?> h71) {
        C6562gT0.p(h71, "backing");
        this.X = h71;
    }

    private final Object writeReplace() {
        if (this.X.H()) {
            return new C10609x12(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // o.AbstractC8170n2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.X.j(e) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // o.AbstractC8170n2
    public int d() {
        return this.X.size();
    }

    @NotNull
    public final Set<E> e() {
        this.X.l();
        if (size() > 0) {
            return this;
        }
        return Z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.X.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.X.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "elements");
        this.X.n();
        return super.retainAll(collection);
    }

    public C7912m22() {
        this(new H71());
    }

    public C7912m22(int i) {
        this(new H71(i));
    }
}

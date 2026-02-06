package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Node;

/* loaded from: classes4.dex */
public class Nodes<T extends Node> extends ArrayList<T> {
    public Nodes() {
    }

    public Nodes<T> B() {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Node) it.next()).X0();
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: D */
    public T set(int i, T t) {
        Validate.q(t);
        T t2 = (T) super.set(i, t);
        t2.d1(t);
        return t2;
    }

    public Nodes<T> F(String str) {
        Validate.n(str);
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Node) it.next()).q1(str);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        B();
        super.clear();
    }

    public Nodes<T> d(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Node) it.next()).i(str);
        }
        return this;
    }

    public ArrayList<T> e() {
        return new ArrayList<>(this);
    }

    public Nodes<T> f(String str) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((Node) it.next()).B(str);
        }
        return this;
    }

    @Override // java.util.ArrayList
    /* renamed from: h */
    public Nodes<T> clone() {
        Nodes<T> nodes = new Nodes<>(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            nodes.add(((Node) it.next()).clone());
        }
        return nodes;
    }

    public T i(int i) {
        return (T) super.remove(i);
    }

    public boolean j(Object obj) {
        return super.remove(obj);
    }

    public void k() {
        super.clear();
    }

    public T l() {
        if (isEmpty()) {
            return null;
        }
        return (T) get(0);
    }

    public T p() {
        if (isEmpty()) {
            return null;
        }
        return (T) get(size() - 1);
    }

    public String r() {
        return (String) stream().map(new Function() { // from class: o.Uq1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Node) obj).F0();
            }
        }).collect(StringUtil.t("\n"));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate<? super T> predicate) {
        Iterator<T> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((Node) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        for (int i = 0; i < size(); i++) {
            set(i, (Node) unaryOperator.apply((Node) get(i)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<T> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((Node) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return r();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public T remove(int i) {
        T t = (T) super.remove(i);
        t.X0();
        return t;
    }

    public Nodes(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = super.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Nodes(Collection<T> collection) {
        super(collection);
    }

    public Nodes(List<T> list) {
        super(list);
    }

    @SafeVarargs
    public Nodes(T... tArr) {
        super(Arrays.asList(tArr));
    }
}

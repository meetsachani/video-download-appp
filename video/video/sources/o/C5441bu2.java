package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.bu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5441bu2 extends CZ implements V92 {
    public C5441bu2() {
        super(new TreeMap());
    }

    @Override // o.V92
    public Comparator comparator() {
        return ((SortedMap) i()).comparator();
    }

    @Override // o.V92
    public Object first() {
        return ((SortedMap) i()).firstKey();
    }

    @Override // o.V92
    public Object last() {
        return ((SortedMap) i()).lastKey();
    }

    public C5441bu2(Comparator comparator) {
        super(new TreeMap(comparator));
    }

    public C5441bu2(Collection collection) {
        this();
        addAll(collection);
    }
}
